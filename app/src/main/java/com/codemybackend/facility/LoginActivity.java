package com.codemybackend.facility;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListner;
    private EditText email, password;
    private Button Login_button;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Firebase.setAndroidContext(this);

        mAuth = FirebaseAuth.getInstance();

        mAuthListner = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                user = firebaseAuth.getCurrentUser();

                if (user == null){


                }else {
                    Intent dashboard_Intent = new Intent(getApplicationContext(), DashboardActivity.class);
                    startActivity(dashboard_Intent);

                }
            }

        };

        email = (EditText) findViewById(R.id.email_edittext);
        password = (EditText) findViewById(R.id.password_edittext);


        Login_button = (Button) findViewById(R.id.login_button);

        Login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        logIn(email.getText().toString(), password.getText().toString());
                    }
                }
        );

    }

    private void logIn(String emailS, String passS) {

        mAuth.signInWithEmailAndPassword(emailS, passS)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){

                            Intent dashboard_Intent = new Intent(getApplicationContext(), DashboardActivity.class);
                            startActivity(dashboard_Intent);

                        }else {
                            Toast.makeText(getApplicationContext()
                                    ,"Email or Password does'nt match", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

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
