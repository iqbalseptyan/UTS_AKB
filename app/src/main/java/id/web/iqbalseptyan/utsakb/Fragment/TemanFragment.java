package id.web.iqbalseptyan.utsakb.Fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.ListIterator;

import id.web.iqbalseptyan.utsakb.Adapter.TemanAdapter;
import id.web.iqbalseptyan.utsakb.R;
import id.web.iqbalseptyan.utsakb.model.Teman;
/*
    NIM : 10116120
    NAMA : MOCHAMAD IQBAL SEPTYAN
    TGL : 21-05-2019
 */
public class TemanFragment extends Fragment {
    private RecyclerView recyclerView;
    private TemanAdapter temanAdapter;
    private ArrayList<Teman> temanArrayList;
    private EditText eNim, eNama, eKelas, eTelp, eMail, eSosmed;
    private String sNim, sNama, sKelas, sTelp, sMail, sSosmed;
    private int iGambar;

    Button btnTmbh, btnUbh;
    FloatingActionButton iFab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.f_teman, container, false);
        iFab = (FloatingActionButton) view.findViewById(R.id.floatingActionButton);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        temanArrayList = new ArrayList<>();
        temanAdapter = new TemanAdapter(temanArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        temanArrayList.add(new Teman("10116596", "Salma Fauziyyah", "IF-3",
                "083112646979","salmafauziyyah1@gmail.com","@salmafyh",R.drawable.salmafauziyyah));
        temanArrayList.add(new Teman("10116130", "Siti Ayu Melinda", "IF-3",
                "083112646979","sitiayumelinda@gmail.com","@melinda",R.drawable.melinda));
        temanArrayList.add(new Teman("10116596", "Aghnia Niamillah Nurhilman", "IF-3",
                "083112646979","salmafauziyyah1@gmail.com","@salmafyh",R.drawable.aghni));
        temanArrayList.add(new Teman("10116596", "Aini Izza", "IF-3",
                "083112646979","salmafauziyyah1@gmail.com","@salmafyh",R.drawable.aini));


        iFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog sDialog = new Dialog(getActivity());
                sDialog.setContentView(R.layout.layout_dialog);
                sDialog.show();
                eNim = sDialog.findViewById(R.id.editTextNIM);
                eNama = sDialog.findViewById(R.id.editTextNL);
                eKelas = sDialog.findViewById(R.id.editTextKLS);
                eTelp = sDialog.findViewById(R.id.editTextTLP);
                eMail = sDialog.findViewById(R.id.editTextEML);
                eSosmed = sDialog.findViewById(R.id.editTextSM);


                btnTmbh = (Button) sDialog.findViewById(R.id.btn_Tmbh);
                btnTmbh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sNim = eNim.getText().toString();
                        sNama = eNama.getText().toString();
                        sKelas = eKelas.getText().toString();
                        sTelp = eTelp.getText().toString();
                        sMail = eMail.getText().toString();
                        sSosmed = eSosmed.getText().toString();
                        temanArrayList.add(new Teman(sNim, sNama, sKelas, sTelp, sMail, sSosmed,R.drawable.ic_person_24dp));
                        temanAdapter.notifyDataSetChanged();

                    }
                });

                btnUbh = (Button) sDialog.findViewById(R.id.btn_Ubh);
                btnUbh.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int indexVal = 0;
                    }
                });

                recyclerView.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {

                        return false;
                    }
                });

            }
        });
        recyclerView.setAdapter(temanAdapter);

        return view;
    }

    void addData(){
        temanArrayList = new ArrayList<>();
        sNim = eNim.getText().toString();
        sNama = eNama.getText().toString();
        sKelas = eKelas.getText().toString();
        sTelp = eTelp.getText().toString();
        sMail = eMail.getText().toString();
        sSosmed = eSosmed.getText().toString();



    }

}
