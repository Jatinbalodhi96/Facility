package com.codemybackend.facility;

import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private float latitude;
    private float longitude;
    private String h_name;
    private Double my_latitude;
    private Double my_longitude;
    private GoogleApiClient googleApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Bundle bundle = getIntent().getExtras();


        try {
            latitude = Float.parseFloat(bundle.getString("latitude"));
            longitude = Float.parseFloat(bundle.getString("longitude"));
        } catch (Exception e){

            Toast.makeText(getApplicationContext()
                    , "Sorry! location is not available for this Blood Bank"
                    , Toast.LENGTH_LONG).show();
        }




        h_name = bundle.getString("h_name");
        my_latitude = bundle.getDouble("my_latitude");
        my_longitude = bundle.getDouble("my_longitude");

        TextView textView = (TextView) findViewById(R.id.hname_heading);
        textView.setText("Hospital Name : " + h_name + "\n");

        Location myLocation = new Location("My Location");
            myLocation.setLatitude(my_latitude);
            myLocation.setLongitude(my_longitude);

        Location h_location = new Location(h_name);
            h_location.setLatitude(latitude);
            h_location.setLongitude(longitude);

            float distance = myLocation.distanceTo(h_location)/1000;

        TextView distanceText = (TextView) findViewById(R.id.distance);

            distanceText.findViewById(R.id.distance);
            distanceText.setText("Distance from Your Location : " + String.valueOf(distance)+"Km" );
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        Bundle bundle = getIntent().getExtras();

        try {
            latitude = Float.parseFloat(bundle.getString("latitude"));
            longitude = Float.parseFloat(bundle.getString("longitude"));

            //Adding Blood bank marker on map
            LatLng requiredLocation = new LatLng(latitude, longitude);
            mMap.addMarker(new MarkerOptions().position(requiredLocation)).setTitle(h_name);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(requiredLocation));

            LatLng myLocation = new LatLng(my_latitude, my_longitude);
            mMap.addMarker(new MarkerOptions().position(myLocation)).setTitle("My Location");

        } catch (Exception e){

            Toast.makeText(getApplicationContext()
                    , "Sorry! location is not available for this Blood Bank"
                    , Toast.LENGTH_LONG).show();

            LatLng myLocation = new LatLng(my_latitude, my_longitude);
            mMap.addMarker(new MarkerOptions().position(myLocation)).setTitle("My Location");
            mMap.moveCamera(CameraUpdateFactory.newLatLng(myLocation));

        }

    }

}
