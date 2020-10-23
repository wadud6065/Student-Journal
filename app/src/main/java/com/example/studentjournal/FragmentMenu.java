package com.example.studentjournal;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class FragmentMenu extends Fragment implements View.OnClickListener{
    CardView bangladeshCardView, internationalCardView, campusCardView,
            educationCardView, sportsCardView, jobCardView, scienceCardView, viralCardView,
            othersCardView;
    Bundle bundle;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_menu,container,false);

        bangladeshCardView = v.findViewById(R.id.bangldeshCardId);
        internationalCardView = v.findViewById(R.id.internationalCardId);
        campusCardView = v.findViewById(R.id.campusCardId);
        educationCardView = v.findViewById(R.id.educationCardId);
        sportsCardView = v.findViewById(R.id.sportsCardId);
        jobCardView = v.findViewById(R.id.jobCardId);
        scienceCardView = v.findViewById(R.id.scienceCardId);
        viralCardView = v.findViewById(R.id.viralCardId);
        othersCardView = v.findViewById(R.id.othersCardId);
        //facebookCardView = v.findViewById(R.id.facebookLiveId);

        bangladeshCardView.setOnClickListener(this);
        internationalCardView.setOnClickListener(this);
        campusCardView.setOnClickListener(this);
        educationCardView.setOnClickListener(this);
        sportsCardView.setOnClickListener(this);
        jobCardView.setOnClickListener(this);
        scienceCardView.setOnClickListener(this);
        viralCardView.setOnClickListener(this);
        othersCardView.setOnClickListener(this);
        //facebookCardView.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bangldeshCardId:
                bundle = new Bundle();
                bundle.putString("key", "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%ac%e0%a6%be%e0%a6%82%e0%a6%b2%e0%a6%be%e0%a6%a6%e0%a7%87%e0%a6%b6/");
                FragmentWebView fr = new FragmentWebView();
                fr.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fr).addToBackStack(null).commit();
                break;

            case R.id.internationalCardId:
                bundle = new Bundle();
                bundle.putString("key", "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%86%e0%a6%a8%e0%a7%8d%e0%a6%a4%e0%a6%b0%e0%a7%8d%e0%a6%9c%e0%a6%be%e0%a6%a4%e0%a6%bf%e0%a6%95/");
                FragmentWebView fr1 = new FragmentWebView();
                fr1.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fr1).addToBackStack(null).commit();
                break;

            case R.id.campusCardId:
                String campusWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%95%e0%a7%8d%e0%a6%af%e0%a6%be%e0%a6%ae%e0%a7%8d%e0%a6%aa%e0%a6%be%e0%a6%b8/";
                bundle = new Bundle();
                bundle.putString("key", campusWeb);
                FragmentWebView fr2 = new FragmentWebView();
                fr2.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fr2).addToBackStack(null).commit();
                break;

            case R.id.educationCardId:
                String educationWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%b6%e0%a6%bf%e0%a6%95%e0%a7%8d%e0%a6%b7%e0%a6%be/";
                bundle = new Bundle();
                bundle.putString("key", educationWeb);
                FragmentWebView fr3 = new FragmentWebView();
                fr3.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fr3).addToBackStack(null).commit();
                break;

            case R.id.sportsCardId:
                String sportsWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%96%e0%a7%87%e0%a6%b2%e0%a6%be/";
                bundle = new Bundle();
                bundle.putString("key", sportsWeb);
                FragmentWebView fr4 = new FragmentWebView();
                fr4.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fr4).addToBackStack(null).commit();
                break;

            case R.id.jobCardId:
                String jobWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%9a%e0%a6%be%e0%a6%95%e0%a6%b0%e0%a6%bf/";
                bundle = new Bundle();
                bundle.putString("key", jobWeb);
                FragmentWebView fr5 = new FragmentWebView();
                fr5.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fr5).addToBackStack(null).commit();
                break;

            case R.id.scienceCardId:
                String scienceWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%ac%e0%a6%bf%e0%a6%9c%e0%a7%8d%e0%a6%9e%e0%a6%be%e0%a6%a8-%e0%a6%aa%e0%a7%8d%e0%a6%b0%e0%a6%af%e0%a7%81%e0%a6%95%e0%a7%8d%e0%a6%a4%e0%a6%bf/";
                bundle = new Bundle();
                bundle.putString("key", scienceWeb);
                FragmentWebView fr6 = new FragmentWebView();
                fr6.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fr6).addToBackStack(null).commit();
                break;

            case R.id.viralCardId:
                String viralWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%ad%e0%a6%be%e0%a6%87%e0%a6%b0%e0%a6%be%e0%a6%b2/";
                bundle = new Bundle();
                bundle.putString("key", viralWeb);
                FragmentWebView fr7 = new FragmentWebView();
                fr7.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fr7).addToBackStack(null).commit();
                break;

            case R.id.othersCardId:
                FragmentOthers fr8 = new FragmentOthers();
                fr8.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fr8).addToBackStack(null).commit();
                break;
        }
    }
}
