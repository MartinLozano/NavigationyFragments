package es.martinlozano.ejemplo10_navigationyfragments.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.martinlozano.ejemplo10_navigationyfragments.R;

public class SlideshowFragment extends Fragment {

    private EditText etCorreo, etPassword;
    private Button btnLogin;
    private Context contexto;


    public SlideshowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        contexto = getActivity();

        View rootView =  inflater.inflate(R.layout.fragment_slideshow, container, false);

        etCorreo = rootView.findViewById(R.id.etCorreo);
        etPassword = rootView.findViewById(R.id.etPassword);
        btnLogin = rootView.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etCorreo.equals("") && !etPassword.equals(""))
                    Toast.makeText(contexto, "ENTRASTE", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(contexto, "RELLENA LOS CAMPOS", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
