package com.example.tourofheroes;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeroesActivityHeroListFragment extends ListFragment {


    public HeroesActivityHeroListFragment() {
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

        // TODO: replace this dummy Hero data with a db utility call.
        String[] values = new String[]{"Spiderman", "Barman", "Superman", "Mr. Satan"};
        // TODO: customize this adapter to use Hero data.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    /** Called when the user clicks a Hero from the list of heroes */
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }


}
