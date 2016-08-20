package com.codemybackend.facility;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultDetails extends AppCompatActivity {

    private Bundle bundle;
    private TextView hospitalDetails;
    private Double latitude;
    private Double longitude;
    private float distance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_details);


        bundle = getIntent().getExtras();

        Double my_latitude = bundle.getDouble("my_latitude");
        Double my_longitude = bundle.getDouble("my_longitude");

        try {

            latitude = Double.parseDouble(bundle.getString("latitude"));
            longitude = Double.parseDouble(bundle.getString("longitude"));


            Location myLocation = new Location("My Location");
            myLocation.setLatitude(my_latitude);
            myLocation.setLongitude(my_longitude);

            Location h_location = new Location("blood_bank_location");
            h_location.setLatitude(latitude);
            h_location.setLongitude(longitude);

            distance = myLocation.distanceTo(h_location)/1000;

                hospitalDetails = (TextView) findViewById(R.id.distance);
                hospitalDetails.setText("Distance : " + String.valueOf(distance) + "Km\n (From your last Location)");



        } catch (Exception e){

            hospitalDetails = (TextView) findViewById(R.id.distance);
            hospitalDetails.setText("Distance : Sorry! Distance not available");


        }

        hospitalDetails = (TextView) findViewById(R.id.h_name);
        hospitalDetails.setText("Hospital Name : " + bundle.getString("h_name"));


        hospitalDetails = (TextView) findViewById(R.id.h_address);
        hospitalDetails.setText("Address : " + bundle.getString("address"));


        hospitalDetails = (TextView) findViewById(R.id.district);
        hospitalDetails.setText("District : " + bundle.getString("district"));

        hospitalDetails = (TextView) findViewById(R.id.email);
        hospitalDetails.setText("Email : " + bundle.getString("email"));


        hospitalDetails = (TextView) findViewById(R.id.contact);
        hospitalDetails.setText("Contact : " + bundle.getString("contact"));

        hospitalDetails = (TextView) findViewById(R.id.helpline);
        hospitalDetails.setText("Helpline : " + bundle.getString("helpline"));

        hospitalDetails = (TextView) findViewById(R.id.website);
        hospitalDetails.setText("Website : " + bundle.getString("website"));


        final Button button = (Button) findViewById(R.id.map_button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (bundle.getString("latitude").length() <= 2){
                            Toast.makeText(getApplicationContext()
                                    ,"Sorry Location coordinates not available"
                                    ,Toast.LENGTH_SHORT).show();
                        } else {

                            Intent intent = new Intent(ResultDetails.this, MapsActivity.class);
                            intent.putExtra("h_name", bundle.getString("h_name"));
                            intent.putExtra("latitude", bundle.getString("latitude"));
                            intent.putExtra("longitude", bundle.getString("longitude"));
                            intent.putExtra("my_latitude", bundle.getDouble("my_latitude"));
                            intent.putExtra("my_longitude", bundle.getDouble("my_longitude"));

                            startActivity(intent);

                        }
                    }
                }
        );

        final String shareIntentData = bundle.getString("h_name") +"\n"
                + bundle.getString("address") +"\n" + bundle.getString("contact") +"\n"
                + bundle.getString("helpline") + "\n";

        final Button shareButton = (Button) findViewById(R.id.share_button);
        shareButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent shareIntent = new Intent();
                        shareIntent.setAction(Intent.ACTION_SEND);
                        shareIntent.putExtra(Intent.EXTRA_TEXT,shareIntentData);
                        shareIntent.setType("text/plain");
                        startActivity(shareIntent);
                    }
                }
        );

    }
}
