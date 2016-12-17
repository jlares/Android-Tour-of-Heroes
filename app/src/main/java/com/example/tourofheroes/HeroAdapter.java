package com.example.tourofheroes;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HeroAdapter extends ArrayAdapter<Hero> {

    public static class ViewHolder {
        TextView heroName;
        TextView heroCity;
        ImageView heroEmployerImg;
    }

    public HeroAdapter(Context context, ArrayList<Hero> heroes) {
        super(context, 0, heroes);
    }

    // This method allows for display of each hero row-item in the way we want to display it.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the hero for this position.
        Hero hero = getItem(position);

        ViewHolder viewHolder;

        // Check if existing view is being reused, otherwise inflate new view from hero_row layout.
        if (convertView == null) {

            // Create a ViewHolder to save view references to.
            viewHolder = new ViewHolder();

            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.hero_row, parent, false);

            viewHolder.heroEmployerImg = (ImageView) convertView.findViewById(R.id.iv_hero_employer_img);
            viewHolder.heroName = (TextView) convertView.findViewById(R.id.tv_hero_name);
            viewHolder.heroCity = (TextView) convertView.findViewById(R.id.tv_hero_city);

            // Use setTag to remember ViewHolder, which stores our references to the proper widgets.
            convertView.setTag(viewHolder);

        } else {
            // Grab the existent view (with the proper widgets) stored in the viewHolder
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.heroEmployerImg.setImageResource(hero.getAssociatedDrawable());
        viewHolder.heroName.setText(hero.getName());
        viewHolder.heroCity.setText("City: " + hero.getCity());

        return convertView;
    }
}
