package com.mahugu.petfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;

public class PetsInfo extends AppCompatActivity {
    private TextView mLocationTextView;
    private ListView mListView;


    private String[] pet = new String[]{"Dodge - Domestic Short Hair Mix(CAT)",
            "Salvation - Domestic Short hair (CAT)",
            "Affenpinscher - compact, sturdy, with medium bone(DOG)",
            "Boston Terrier - compactly built, square-proportioned, clean-cut (DOG)"};

    private String[] description = new String[]{"*Young *Male *Fredericton *Tabby",
            "*Adult *Female *Small", "*delicate *active *tough *agile to catch rodents",
            "*determination *strength *sturdiness *liveliness"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets_info);

        mListView = (ListView) findViewById(R.id.listView);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        MyPetsInfoArrayAdapter adapter = new MyPetsInfoArrayAdapter(this, android.R.layout.simple_list_item_1, pet, description);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String restaurant = ((TextView) view).getText().toString();
                Toast.makeText(PetsInfo.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });

        mLocationTextView.setText("Pet " + location + "...\n Here are the list of pets with their respective descriptions:");



    }
}
