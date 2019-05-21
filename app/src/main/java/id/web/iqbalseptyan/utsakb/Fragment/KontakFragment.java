package id.web.iqbalseptyan.utsakb.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import id.web.iqbalseptyan.utsakb.R;
/*
    NIM : 10116120
    NAMA : MOCHAMAD IQBAL SEPTYAN
    TGL : 20-05-2019
 */
public class KontakFragment extends Fragment {
    ImageView imgCall, imgSm, imgEmail, imgFb;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.f_kontak, container, false);
        imgCall = (ImageView) view.findViewById(R.id.gmbrTelp);
        imgEmail = (ImageView) view.findViewById(R.id.gmbrEmail);
        imgSm = (ImageView) view.findViewById(R.id.gmbrIg);
        imgFb = (ImageView) view.findViewById(R.id.gmbrFb);

        imgCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String NomerHp = getString(R.string.NomorQu);
                Intent intentpanggil = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+NomerHp));
                startActivity(intentpanggil);
            }
        });
        imgEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"iqbalseptyan16@gmail.com"});
                try {
                    startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
                } catch (android.content.ActivityNotFoundException ex) {
                    //do something else
                }
            }
        });
        imgSm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String Instagram = "https://www.instagram.com/miiqbals/";
                Intent bukaIg = new Intent(Intent.ACTION_VIEW);
                bukaIg.setData(Uri.parse(Instagram));
                startActivity(bukaIg);
            }
        });
        imgFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String facebook = "https://www.facebook.com/iqbal.septyan";
                Intent bukaFb = new Intent(Intent.ACTION_VIEW);
                bukaFb.setData(Uri.parse(facebook));
                startActivity(bukaFb);
            }
        });
        return view;
    }
}
