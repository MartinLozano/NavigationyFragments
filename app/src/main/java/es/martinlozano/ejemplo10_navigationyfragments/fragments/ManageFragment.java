package es.martinlozano.ejemplo10_navigationyfragments.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.ref.PhantomReference;

import es.martinlozano.ejemplo10_navigationyfragments.R;

public class ManageFragment extends Fragment {

    private ImageView ivImagen;
    private Button btnManage;
    private TextView txtManage;
    private Context contexto;

    public ManageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        contexto = getActivity();

        View rootView = inflater.inflate(R.layout.fragment_manage, container, false);

        // CÓDIGO NECESARIO PARA QUE LE FRAME FUNCIONE

        txtManage = rootView.findViewById(R.id.txtManage);
        btnManage = rootView.findViewById(R.id.btnManage);
        ivImagen = rootView.findViewById(R.id.ivImagen);

        btnManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(contexto, "HOLA MUNDO", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

}
