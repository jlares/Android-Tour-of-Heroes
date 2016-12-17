package com.example.tourofheroes;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeroDetailFragment extends Fragment {


    public HeroDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Grab reference to the layout file
        View fragmentLayout = inflater
                .inflate(R.layout.fragment_hero_view, container, false);

        TextView heroName = (TextView) fragmentLayout.findViewById(R.id.tv_hero_name);
        TextView heroCity = (TextView) fragmentLayout.findViewById(R.id.tv_hero_city);
        TextView heroPowerLvl = (TextView) fragmentLayout.findViewById(R.id.tv_hero_power_lvl);
        ImageView heroEmployerImg = (ImageView) fragmentLayout.findViewById(R.id.iv_hero_employer_img);

        Intent intent = getActivity().getIntent();

        heroName.setText(intent.getExtras().getString(HeroActivity.HERO_NAME_EXTRA));
        double powerLvl = (double) intent.getSerializableExtra(HeroActivity.HERO_POWER_LVL_EXTRA);
        //TODO: use a string resouece instead of concatenating Strings.
        heroPowerLvl.setText("Power Level: " + String.format("%s", powerLvl));
        heroCity.setText("City: " + intent.getExtras().getString(HeroActivity.HERO_CITY_EXTRA));
        Hero.Employer heroEmployer = (Hero.Employer) intent.getSerializableExtra(HeroActivity.HERO_EMPLOYER_EXTRA);
        heroEmployerImg.setImageResource(Hero.employerToDrawable(heroEmployer));

        // Inflate the layout for this fragment
        return fragmentLayout;
    }

}
