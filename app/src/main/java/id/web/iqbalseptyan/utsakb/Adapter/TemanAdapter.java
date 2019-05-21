package id.web.iqbalseptyan.utsakb.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.web.iqbalseptyan.utsakb.R;
import id.web.iqbalseptyan.utsakb.model.Teman;

/*
    NIM : 10116120
    NAMA : MOCHAMAD IQBAL SEPTYAN
    TGL : 21-05-2019
 */
public class TemanAdapter extends RecyclerView.Adapter<TemanAdapter.ViewHolder> {

    private ArrayList<Teman> temanList;

    public TemanAdapter(ArrayList<Teman> temanList) {
        this.temanList = temanList;
    }

    @NonNull
    @Override
    public TemanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TemanAdapter.ViewHolder viewHolder, int i) {
        viewHolder.gmbr_Profil.setImageResource(temanList.get(i).getGambar());
        viewHolder.txt_NIM.setText(temanList.get(i).getNim());
        viewHolder.txt_NL.setText(temanList.get(i).getNama());
        viewHolder.txt_KLS.setText(temanList.get(i).getKelas());
        viewHolder.txt_TLP.setText(temanList.get(i).getTelepon());
        viewHolder.txt_EML.setText(temanList.get(i).getEmail());
        viewHolder.txt_SM.setText(temanList.get(i).getSosmed());
    }

    @Override
    public int getItemCount() {
        return (temanList != null) ? temanList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_NIM, txt_NL, txt_KLS, txt_TLP, txt_EML, txt_SM;
        private ImageView gmbr_Profil;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gmbr_Profil = (ImageView) itemView.findViewById(R.id.gmbrProfil);
            txt_NIM = (TextView) itemView.findViewById(R.id.txtNIM);
            txt_NL = (TextView) itemView.findViewById(R.id.txtNL);
            txt_KLS = (TextView) itemView.findViewById(R.id.txtKLS);
            txt_TLP = (TextView) itemView.findViewById(R.id.txtTLP);
            txt_EML = (TextView) itemView.findViewById(R.id.txtEML);
            txt_SM = (TextView) itemView.findViewById(R.id.txtSM);
        }
    }
}
