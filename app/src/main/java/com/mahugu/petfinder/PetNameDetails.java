package com.mahugu.petfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PetNameDetails extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.find)
    Button mfind;
    @BindView(R.id.locationEditText)
    EditText mLocationEditText;
    @BindView(R.id.appNameTextView)
    TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mfind.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == mfind){
            String location = mLocationEditText.getText().toString();
            Intent intent = new Intent(PetNameDetails.this, PetsInfo.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}
