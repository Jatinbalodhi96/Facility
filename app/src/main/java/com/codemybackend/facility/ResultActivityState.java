package com.codemybackend.facility;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.gson.Gson;

public class ResultActivityState extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private String stateandUt;
    private String condition;
    private int pincode;
    private String url;
    public String my_json_response;
    public TextView textView;
    private com.codemybackend.facility.Response responseobj;
    public CustomAdapter customAdapter;
    private ListView listView;
    private Gson gson;
    private android.widget.ShareActionProvider mShareActionProvider;

    public GoogleApiClient googleApiClient;
    public Double my_latitude;
    public Double my_longitude;
    public String state;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        listView = (ListView) findViewById(R.id.result_list_view);


        //putting State name
        Bundle bundle = getIntent().getExtras();

        stateandUt = bundle.getString("stateandUt");
        url = new UriBuilder().getURL(stateandUt);

        //Volley Request
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(final String response) {

                        my_json_response = response;
                        gson = new Gson();
                        responseobj = gson.fromJson(my_json_response, com.codemybackend.facility.Response.class);
                        customAdapter = new CustomAdapter(ResultActivityState.this, responseobj.getRecords());
                        listView.setAdapter(customAdapter);
                        listView.setOnItemClickListener(
                                new AdapterView.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                        Intent intent = new Intent(ResultActivityState.this, ResultDetails.class);

                                        //Condition for unavailable coordinates..
                                        intent.putExtra("latitude", responseobj.getRecords().get(i).getLatitude());
                                        intent.putExtra("longitude", responseobj.getRecords().get(i).getLongitude());
                                        intent.putExtra("h_name", responseobj.getRecords().get(i).getH_name());
                                        intent.putExtra("address", responseobj.getRecords().get(i).getAddress());
                                        intent.putExtra("district", responseobj.getRecords().get(i).getDistrict());
                                        intent.putExtra("contact", responseobj.getRecords().get(i).getContact());
                                        intent.putExtra("email", responseobj.getRecords().get(i).getEmail());
                                        intent.putExtra("helpline", responseobj.getRecords().get(i).getHelpline());
                                        intent.putExtra("website", responseobj.getRecords().get(i).getWebsite());

                                        intent.putExtra("my_latitude", my_latitude);
                                        intent.putExtra("my_longitude", my_longitude);

                                        startActivity(intent);
                                    }
                                }
                        );


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        VolleyHelper.getInstance(getApplicationContext()).addToRequestQueue(stringRequest);

        //Getting Location Data
        if (googleApiClient == null) {
            googleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
        }

    }

    @Override
    protected void onStart() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo == null){
            Toast.makeText(getApplicationContext(), "No Internet Connection!", Toast.LENGTH_SHORT).show();
        }

        googleApiClient.connect();

        LocationManager locationManager = (LocationManager)getApplicationContext().getSystemService(Context.LOCATION_SERVICE);

        boolean gps_enabled = false;
        boolean network_enabled = false;

        try {
            gps_enabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
            network_enabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        }catch (Exception e){

        }

        if (!gps_enabled && !network_enabled){
            Toast.makeText(getApplicationContext(), "GPS not working might give you wrong distance", Toast.LENGTH_SHORT).show();
        }
        super.onStart();
    }

    @Override
    protected void onStop() {
        googleApiClient.disconnect();
        super.onStop();
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Location lastlocation = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);

        my_latitude = lastlocation.getLatitude();
        my_longitude = lastlocation.getLongitude();

        Log.d("mylat", my_latitude.toString());
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

}
