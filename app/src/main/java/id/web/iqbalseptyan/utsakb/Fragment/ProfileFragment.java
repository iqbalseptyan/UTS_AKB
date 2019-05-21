package id.web.iqbalseptyan.utsakb.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.web.iqbalseptyan.utsakb.R;

/*
    NIM : 10116120
    NAMA : MOCHAMAD IQBAL SEPTYAN
    TGL : 20-05-2019
 */
public class ProfileFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.f_profil, container, false);
    }
}
