package com.codemybackend.facility;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

public class ResultActivity extends AppCompatActivity {

    private String url = new UriBuilder().getURL();
    public String my_json_response ;
    public TextView textView;
    com.codemybackend.facility.Response responseobj;
    public CustomAdapter customAdapter;
    ListView listView;
    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        listView = (ListView) findViewById(R.id.result_list_view);

        //Volley Request
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(final String response) {
                        //textView.setText(response);


                        my_json_response = response;
                        gson = new Gson();
                        responseobj = gson.fromJson(my_json_response, com.codemybackend.facility.Response.class);
                        customAdapter = new CustomAdapter(ResultActivity.this, responseobj.getRecords());
                        listView.setAdapter(customAdapter);
                        listView.setOnItemClickListener(
                                new AdapterView.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                        Intent intent = new Intent(ResultActivity.this, MapsActivity.class);

                                        /*String[] newActivityData = {responseobj.getRecords().get(i).getAddress(),
                                                responseobj.getRecords().get(i).getContact(),
                                                responseobj.getRecords().get(i).getEmail(),
                                                responseobj.getRecords().get(i).getH_name(),
                                                responseobj.getRecords().get(i).getId(),
                                                responseobj.getRecords().get(i).getState(),
                                                responseobj.getRecords().get(i).getLatitude(),
                                                responseobj.getRecords().get(i).getLongitude()};
                                        intent.putExtra("BloodBankData", newActivityData);*/

                                        intent.putExtra("latitude",responseobj.getRecords().get(i).getLatitude());
                                        intent.putExtra("longitude", responseobj.getRecords().get(i).getLongitude());
                                        intent.putExtra("h_name", responseobj.getRecords().get(i).getH_name());

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

    }
}
