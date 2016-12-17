package com.example.tourofheroes;


import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeroActivityHeroesListFragment extends ListFragment {

    private ArrayList<Hero> heroes;
    private HeroAdapter heroAdapter;

    public HeroActivityHeroesListFragment() {
        // Required empty public constructor
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_heroes_activity_hero_list, container, false);
//    }

    /**
     * This method is called after the fragment's onCreate() and onCreateView() have
     * completed. Its used for final initialisations such as modifying UI elements.
     * @param savedInstanceState state of the Activity.
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // TODO: replace this dummy Hero data with real one obtained through a db utility call.
        heroes = new ArrayList<>();
        heroes.add(new Hero("Spiderman", 8, Hero.Employer.MARVEL, "New York"));
        heroes.add(new Hero("Batman", 9, Hero.Employer.DC, "Gotham"));
        heroes.add(new Hero("Superman", 9, Hero.Employer.DC, "Metropolis"));
        heroes.add(new Hero("Thor", 9, Hero.Employer.MARVEL, "Asgard"));
        heroes.add(new Hero("Goku", 10, Hero.Employer.TOEI, "Japan"));
        heroes.add(new Hero("Flash", 8, Hero.Employer.DC, "Keystone City"));
        heroes.add(new Hero("Captain America", 9, Hero.Employer.MARVEL, "New York"));
        heroes.add(new Hero("The Hulk", 9, Hero.Employer.MARVEL, "New York"));
        heroes.add(new Hero("Mario", 7, Hero.Employer.NINTENDO, "Mushroom Kingdom"));
        heroes.add(new Hero("Luigi", 7, Hero.Employer.NINTENDO, "Mushroom Kingdom"));
        heroes.add(new Hero("Link", 6, Hero.Employer.NINTENDO, "Hyrule"));
        heroes.add(new Hero("DonkeyKong", 8, Hero.Employer.NINTENDO, "Congo Jungle"));


        heroAdapter = new HeroAdapter(getActivity(), heroes);
        setListAdapter(heroAdapter);
    }

    /** Called when the user clicks a Hero from the list of heroes */
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        launchHeroDetailActivity(position);
    }

    private void launchHeroDetailActivity(int position) {

        // Retrieve data associated with the clicked hero.
        Hero hero = (Hero) getListAdapter().getItem(position);

        // Create an intent that launches HeroDetailActivity.
        Intent intent = new Intent(getActivity(), HeroDetailActivity.class);

        // Pass this info along the data associated with clicked hero.
        intent.putExtra(HeroActivity.HERO_NAME_EXTRA, hero.getName());
        intent.putExtra(HeroActivity.HERO_POWER_LVL_EXTRA, hero.getPowerLvl());
        intent.putExtra(HeroActivity.HERO_EMPLOYER_EXTRA, hero.getEmployer());
        intent.putExtra(HeroActivity.HERO_CITY_EXTRA, hero.getCity());

        startActivity(intent);
    }

}
