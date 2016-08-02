package com.codemybackend.facility;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class FindNearByBloodBanks extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String stateandUt;
    private String pincode;
    private String condition; //for checking the search conditions( maybe picode or state)
    private Spinner stateSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_near_by_blood_banks);

        // state selection spinner
        stateSpinner = (Spinner) findViewById(R.id.state_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this
                ,R.array.state_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stateSpinner.setAdapter(adapter);

        stateSpinner.setOnItemSelectedListener(this);

        //state search button
        final Button statebutton = (Button) findViewById(R.id.search_with_state);
        statebutton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        condition = "statebutton";
                        Intent intent = new Intent(getApplicationContext(), ResultActivityState.class);
                        intent.putExtra("stateandUt", stateandUt);
                        intent.putExtra("condition", condition);
                        startActivity(intent);
                    }
                }
        );


        //pincode search button

        final EditText[] editText = new EditText[1];

        Button pincodebutton = (Button) findViewById(R.id.search_with_pincode);
        pincodebutton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        condition = "pincodebutton";
                        editText[0] = (EditText) findViewById(R.id.pincode_no);
                        if (editText[0].getText().length() < 6){
                            Toast.makeText(getApplicationContext(), "Please enter valid pincode", Toast.LENGTH_SHORT).show();
                        }else {
                            pincode = String.valueOf(editText[0].getText());

                            Intent intent = new Intent(getApplicationContext(), ResultActivityPincode.class);
                            intent.putExtra("pincode", pincode);
                            intent.putExtra("condition", condition);
                            startActivity(intent);
                        }

                    }
                }
        );

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        stateandUt = adapterView.getItemAtPosition(i).toString();
        
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}