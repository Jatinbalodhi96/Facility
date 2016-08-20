package com.codemybackend.facility;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class DashboardActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListner;
    private FloatingActionButton logOutButton;
    private TextView hospitalnametext;
    private EditText ap, an, bp, bn, abp, abn, op, on;
    private FirebaseUser user;
    private String userId;
    private DatabaseReference reference;
    //private User blood_data;
    private Button update;
    private String a_p,a_n,b_p,b_n,ab_p,ab_n,o_p,o_n;
    private HashMap<String, Object> blood_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Firebase.setAndroidContext(this);

        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        reference = database.getReference("h_users");

        update = (Button) findViewById(R.id.update_button);

        hospitalnametext = (TextView) findViewById(R.id.h_name);

        mAuth = FirebaseAuth.getInstance();

        mAuthListner = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                user = firebaseAuth.getCurrentUser();

                if (user != null){

                    hospitalnametext.setText(user.getEmail());

                    update.setOnClickListener(
                            new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {

                                    updateData(a_p,a_n,b_p,b_n,ab_p,ab_n,o_p,o_n);
                                }
                            }
                    );

                }else {
                    Toast.makeText(getApplicationContext(), "Signed Out", Toast.LENGTH_SHORT).show();
                    Intent signout = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(signout);
                }

            }
        };


        logOutButton = (FloatingActionButton) findViewById(R.id.logout);

        logOutButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        FirebaseAuth.getInstance().signOut();

                    }
                }
        );

    }

    private void updateData(String a_p, String a_n, String b_p, String b_n, String ab_p, String ab_n, String o_p, String o_n) {

        ap = (EditText) findViewById(R.id.a_p);
        an = (EditText) findViewById(R.id.a_n);
        bp = (EditText) findViewById(R.id.b_p);
        bn = (EditText) findViewById(R.id.b_n);
        abp = (EditText) findViewById(R.id.ab_p);
        abn = (EditText) findViewById(R.id.ab_n);
        op = (EditText) findViewById(R.id.o_p);
        on = (EditText) findViewById(R.id.o_n);

        a_p = ap.getText().toString();
        a_n = an.getText().toString();
        b_p = bp.getText().toString();
        b_n = bn.getText().toString();
        ab_p = abp.getText().toString();
        ab_n = abn.getText().toString();
        o_p = op.getText().toString();
        o_n = on.getText().toString();

        blood_data = new HashMap<String, Object>();

        blood_data.put("a_p", a_p);
        blood_data.put("a_n", a_n);
        blood_data.put("ab_p", ab_p);
        blood_data.put("ab_n", ab_n);
        blood_data.put("b_p", b_p);
        blood_data.put("b_n", b_n);
        blood_data.put("o_p", o_p);
        blood_data.put("o_n", o_n);

        HashMap<String, Object> uid = new HashMap<>();
        uid.put("blood_data", blood_data);

        reference.child(user.getUid()).setValue(uid);

    }
    private void signOut() {

        FirebaseAuth.getInstance().signOut();
        Toast.makeText(getApplicationContext(),"Signed Out", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListner);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mAuthListner != null){
            mAuth.removeAuthStateListener(mAuthListner);
        }
    }
}