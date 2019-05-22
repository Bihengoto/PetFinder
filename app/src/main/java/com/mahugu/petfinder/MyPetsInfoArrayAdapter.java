package com.mahugu.petfinder;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyPetsInfoArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mPet;
    private String[] mDescription;

    public MyPetsInfoArrayAdapter(Context mContext, int resource, String[] pet, String[] description) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mPet = pet;
        this.mDescription = description;
    }

    @Override
    public Object getItem(int position) {
        String pet = mPet[position];
        String desc = mDescription[position];
        return String.format("PET: %s \nWith the following descriptions: %s", pet, desc);
    }

    @Override
    public int getCount() {
        return mPet.length;
    }

}
