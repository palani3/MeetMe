package com.example.meetme;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

public class Account extends AppCompatActivity {
        private Button button;
        private EditText editname;
        private EditText editmobile;
        FirebaseFirestore db=FirebaseFirestore.getInstance();
        private FirebaseAuth mauth;
        private static final String TAG="account";

        //date and Dob
    private EditText eText;
    private DatePickerDialog picker;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        //Date of birth

        eText=(EditText)findViewById(R.id.editText1);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker=new DatePickerDialog(Account.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                        eText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                    }
                },year,month,day);
                picker.show();

                    }
                });






        //name and phone number
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NextButton();

            }
        });









    }
    public void NextButton()
    {
        Intent intent=new Intent(this,Photo.class);
        startActivity(intent);
    }

}
