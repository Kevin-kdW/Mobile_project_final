package com.youngkevin.material_design_lab10;

import android.os.Bundle;

import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class VegetarianDishesFragment extends ListFragment {
    public VegetarianDishesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.vegetarian_dishes));
        this.setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_vegetarian_dishes, container, false);
    }
}