package id.web.iqbalseptyan.utsakb;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import id.web.iqbalseptyan.utsakb.Adapter.ViewPagerAdapter;
import id.web.iqbalseptyan.utsakb.model.ScreenItem;

/*
    NIM : 10116120
    NAMA : MOCHAMAD IQBAL SEPTYAN
    TGL : 20-05-2019
 */
public class ViewPager extends AppCompatActivity {

    private android.support.v4.view.ViewPager screenPager;
    ViewPagerAdapter viewPagerAdapter;
    TabLayout tabIndicator;
    Button btnNext, btnMulai;
    Animation btnAnim;

    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);

        if (restorePrefsData()) {
            Intent mIntent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(mIntent);
            finish();
        }


        btnNext = findViewById(R.id.btn_next);
        btnMulai = findViewById(R.id.btn_mulai);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_animasi);
        tabIndicator = findViewById(R.id.tabLayout);


        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Menampilkan Detail Profil", "", R.drawable.img1));
        mList.add(new ScreenItem("Menampilkan Kontak Profil", "", R.drawable.img2));
        mList.add(new ScreenItem("Menampilkan List Teman-Teman", "", R.drawable.img3));

        screenPager = findViewById(R.id.screen_vp);
        viewPagerAdapter = new ViewPagerAdapter(this, mList);
        screenPager.setAdapter(viewPagerAdapter);

        tabIndicator.setupWithViewPager(screenPager);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = screenPager.getCurrentItem();
                if (position < mList.size()){
                    position++;
                    screenPager.setCurrentItem(position);
                }

                if (position == mList.size()-1){
                    loadLastScreen();
                }
            }
        });

        tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == mList.size()-1){
                    loadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mIntent);

                savePrefsData();
                finish();
            }
        });
    }

    private boolean restorePrefsData(){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs", MODE_PRIVATE);
        Boolean viewPagerTerbukaSebelumnya = pref.getBoolean("VPTerbuka", false);
        return viewPagerTerbukaSebelumnya;
    }

    private void savePrefsData(){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("VPTerbuka",true);
        editor.commit();
    }

    private void loadLastScreen(){
        btnNext.setVisibility(View.INVISIBLE);
        btnMulai.setVisibility(View.VISIBLE);
        tabIndicator.setVisibility(View.INVISIBLE);
        btnMulai.setAnimation(btnAnim);
    }
}
