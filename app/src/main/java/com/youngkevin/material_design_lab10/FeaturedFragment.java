package com.youngkevin.material_design_lab10;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FeaturedFragment extends Fragment {
    public FeaturedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_featured,container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //populate arrays from dataset
        String[] locationNames = new String[FeaturedItems.item.length];
        int[] imageIds = new int[FeaturedItems.item.length];
        for(int i = 0; i < FeaturedItems.item.length; i++)
        {
            locationNames[i] = FeaturedItems.item[i].getName();
            imageIds[i] = FeaturedItems.item[i].getImageResourceId();
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(locationNames, imageIds);
        recyclerView.setAdapter(adapter);
        return view;




    }
}
