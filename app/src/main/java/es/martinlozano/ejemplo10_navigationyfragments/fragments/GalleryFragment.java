package es.martinlozano.ejemplo10_navigationyfragments.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.martinlozano.ejemplo10_navigationyfragments.R;

public class GalleryFragment extends Fragment {

    private Context contexto;

    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        contexto = getActivity();

        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);



        return rootView;
    }
}
