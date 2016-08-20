package com.codemybackend.facility;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class BloodUnitActivity extends AppCompatActivity {

    private DatabaseReference ref;
    private Button h_1, h_2, h_3;
    private TextView dataText;
    private DataSnapshot dataSnapshotVar;
    private String ap_text,an_text,abp_text,abn_text,bp_text,bn_text,op_text,on_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_unit);
        Firebase.setAndroidContext(this);


        h_1 = (Button) findViewById(R.id.h_1);
        h_2 = (Button) findViewById(R.id.h_2);
        h_3 = (Button) findViewById(R.id.h_3);
        dataText = (TextView) findViewById(R.id.database_text);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        ref = database.getReference("h_users");

        h_1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        ref.addValueEventListener(
                                new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        ap_text = dataSnapshot.child("u4f99tn59oNRgHCgJLzaAZHJh9i2")
                                                .child("blood_data").child("a_p").getValue().toString();

                                        an_text = dataSnapshot.child("u4f99tn59oNRgHCgJLzaAZHJh9i2")
                                                .child("blood_data").child("a_n").getValue().toString();

                                        abp_text = dataSnapshot.child("u4f99tn59oNRgHCgJLzaAZHJh9i2")
                                                .child("blood_data").child("ab_p").getValue().toString();

                                        abn_text = dataSnapshot.child("u4f99tn59oNRgHCgJLzaAZHJh9i2")
                                                .child("blood_data").child("ab_n").getValue().toString();

                                        bp_text = dataSnapshot.child("u4f99tn59oNRgHCgJLzaAZHJh9i2")
                                                .child("blood_data").child("b_p").getValue().toString();

                                        bn_text = dataSnapshot.child("u4f99tn59oNRgHCgJLzaAZHJh9i2")
                                                .child("blood_data").child("b_n").getValue().toString();

                                        op_text = dataSnapshot.child("u4f99tn59oNRgHCgJLzaAZHJh9i2")
                                                .child("blood_data").child("o_p").getValue().toString();

                                        on_text = dataSnapshot.child("u4f99tn59oNRgHCgJLzaAZHJh9i2")
                                                .child("blood_data").child("o_n").getValue().toString();

                                        dataText.setText("A+ : " +ap_text +
                                        "\nA- : " +an_text+ "\nB+ : " + bp_text+
                                        "\nB- : " + bn_text+ "\nAB+ : "+abp_text+"\nAB- : "+abn_text+
                                        "\nO+ : "+op_text+ "\nO- : "+on_text);
                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        Toast.makeText(getApplicationContext(), "Check Internet", Toast.LENGTH_SHORT).show();
                                    }
                                }
                        );

                    }
                }
        );
        h_2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        ref.addValueEventListener(
                                new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        ap_text = dataSnapshot.child("yfBBhg0lmMZDNW7Ma7h0yX8nfwo1")
                                                .child("blood_data").child("a_p").getValue().toString();

                                        an_text = dataSnapshot.child("yfBBhg0lmMZDNW7Ma7h0yX8nfwo1")
                                                .child("blood_data").child("a_n").getValue().toString();

                                        abp_text = dataSnapshot.child("yfBBhg0lmMZDNW7Ma7h0yX8nfwo1")
                                                .child("blood_data").child("ab_p").getValue().toString();

                                        abn_text = dataSnapshot.child("yfBBhg0lmMZDNW7Ma7h0yX8nfwo1")
                                                .child("blood_data").child("ab_n").getValue().toString();

                                        bp_text = dataSnapshot.child("yfBBhg0lmMZDNW7Ma7h0yX8nfwo1")
                                                .child("blood_data").child("b_p").getValue().toString();

                                        bn_text = dataSnapshot.child("yfBBhg0lmMZDNW7Ma7h0yX8nfwo1")
                                                .child("blood_data").child("b_n").getValue().toString();

                                        op_text = dataSnapshot.child("yfBBhg0lmMZDNW7Ma7h0yX8nfwo1")
                                                .child("blood_data").child("o_p").getValue().toString();

                                        on_text = dataSnapshot.child("yfBBhg0lmMZDNW7Ma7h0yX8nfwo1")
                                                .child("blood_data").child("o_n").getValue().toString();


                                        dataText.setText("A+ : " +ap_text +
                                                "\nA- : " +an_text+ "\nB+ : " + bp_text+
                                                "\nB- : " + bn_text+ "\nAB+ : "+abp_text+"\nAB- : "+abn_text+
                                                "\nO+ : "+op_text+ "\nO- : "+on_text);

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        Toast.makeText(getApplicationContext(), "Check Internet", Toast.LENGTH_SHORT).show();
                                    }
                                }
                        );

                    }
                }
        );
        h_3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        ref.addValueEventListener(
                                new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot dataSnapshot) {

                                        ap_text = dataSnapshot.child("G8czAx0LQVfOJ3kftjhu0w5uwxC3")
                                                .child("blood_data").child("a_p").getValue().toString();

                                        an_text = dataSnapshot.child("G8czAx0LQVfOJ3kftjhu0w5uwxC3")
                                                .child("blood_data").child("a_n").getValue().toString();

                                        abp_text = dataSnapshot.child("G8czAx0LQVfOJ3kftjhu0w5uwxC3")
                                                .child("blood_data").child("ab_p").getValue().toString();

                                        abn_text = dataSnapshot.child("G8czAx0LQVfOJ3kftjhu0w5uwxC3")
                                                .child("blood_data").child("ab_n").getValue().toString();

                                        bp_text = dataSnapshot.child("G8czAx0LQVfOJ3kftjhu0w5uwxC3")
                                                .child("blood_data").child("b_p").getValue().toString();

                                        bn_text = dataSnapshot.child("G8czAx0LQVfOJ3kftjhu0w5uwxC3")
                                                .child("blood_data").child("b_n").getValue().toString();

                                        op_text = dataSnapshot.child("G8czAx0LQVfOJ3kftjhu0w5uwxC3")
                                                .child("blood_data").child("o_p").getValue().toString();

                                        on_text = dataSnapshot.child("G8czAx0LQVfOJ3kftjhu0w5uwxC3")
                                                .child("blood_data").child("o_n").getValue().toString();

                                        dataText.setText("A+ : " +ap_text +
                                                "\nA- : " +an_text+ "\nB+ : " + bp_text+
                                                "\nB- : " + bn_text+ "\nAB+ : "+abp_text+"\nAB- : "+abn_text+
                                                "\nO+ : "+op_text+ "\nO- : "+on_text);

                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                        Toast.makeText(getApplicationContext(), "Check Internet", Toast.LENGTH_SHORT).show();
                                    }
                                }
                        );

                    }
                }
        );
    }
 }



