package com.youngkevin.material_design_lab10;

import androidx.annotation.NonNull;

public class FeaturedItems {
    private String name;
    private int imageResourceId;

    public static final FeaturedItems[] item = {
            new FeaturedItems("Zimu", R.drawable.zimu),
            new FeaturedItems("Huang hou", R.drawable.huanghou),
            new FeaturedItems("Spicy chicken soup", R.drawable.soups),
            new FeaturedItems("Seafood with shrimp entries", R.drawable.shrimp),
            new FeaturedItems("Succulent pork rolls", R.drawable.pork),
            new FeaturedItems("Delicious tea", R.drawable.herbaltea),
            new FeaturedItems("Mandarin duck", R.drawable.mandarinduck),
            new FeaturedItems("Mooli", R.drawable.mooli),
    };

    public FeaturedItems(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @NonNull
    @Override
    public String toString() {
        return getName();
    }
}
