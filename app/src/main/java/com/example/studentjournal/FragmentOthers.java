package com.example.studentjournal;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class FragmentOthers extends Fragment implements View.OnClickListener {
    CardView tipsCardView, opinionCardView, higherStudiesCardView, mojoCardView, funCardView,
            featherCardView, travelCardView, islamCardView, literatureCardView, lifeCardView,
            knowledgeCardView, editorialCardView, videoCardView, advertisementCardView,
            arcaideCardView;
    Bundle bundle;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_others, container, false);

        tipsCardView = v.findViewById(R.id.tipsCardId);
        opinionCardView = v.findViewById(R.id.opinionCardId);
        higherStudiesCardView = v.findViewById(R.id.higherStudiesCardId);
        mojoCardView = v.findViewById(R.id.mojoCardId);
        funCardView = v.findViewById(R.id.funCardId);
        featherCardView = v.findViewById(R.id.featherCardId);
        travelCardView = v.findViewById(R.id.travelCardId);
        islamCardView = v.findViewById(R.id.islamCardId);
        literatureCardView = v.findViewById(R.id.literatureCardId);
        lifeCardView = v.findViewById(R.id.lifeCardId);
        knowledgeCardView = v.findViewById(R.id.knowledgeCardId);
        editorialCardView = v.findViewById(R.id.editorialCardId);
        videoCardView = v.findViewById(R.id.videoCardId);
        advertisementCardView = v.findViewById(R.id.advertisementCardId);
        arcaideCardView = v.findViewById(R.id.arcaideCardId);

        tipsCardView.setOnClickListener(this);
        opinionCardView.setOnClickListener(this);
        higherStudiesCardView.setOnClickListener(this);
        mojoCardView.setOnClickListener(this);
        funCardView.setOnClickListener(this);
        featherCardView.setOnClickListener(this);
        travelCardView.setOnClickListener(this);
        islamCardView.setOnClickListener(this);
        literatureCardView.setOnClickListener(this);
        lifeCardView.setOnClickListener(this);
        knowledgeCardView.setOnClickListener(this);
        editorialCardView.setOnClickListener(this);
        videoCardView.setOnClickListener(this);
        advertisementCardView.setOnClickListener(this);
        arcaideCardView.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tipsCardId:
                String tipsWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%9f%e0%a6%bf%e0%a6%aa%e0%a6%b8-%e0%a6%93-%e0%a6%9f%e0%a6%bf%e0%a6%89%e0%a6%9f%e0%a7%8b%e0%a6%b0%e0%a6%bf%e0%a7%9f%e0%a6%be%e0%a6%b2%e0%a6%b8/";
                bundle = new Bundle();
                bundle.putString("key", tipsWeb);
                FragmentWebView fr1 = new FragmentWebView();
                fr1.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr1).addToBackStack(null).commit();
                break;

            case R.id.opinionCardId:
                String opinionWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%ae%e0%a6%a4%e0%a6%be%e0%a6%ae%e0%a6%a4/";
                bundle = new Bundle();
                bundle.putString("key", opinionWeb);
                FragmentWebView fr2 = new FragmentWebView();
                fr2.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr2).addToBackStack(null).commit();
                break;

            case R.id.higherStudiesCardId:
                String higherStudiesWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%ac%e0%a6%bf%e0%a6%a6%e0%a7%87%e0%a6%b6%e0%a7%87-%e0%a6%89%e0%a6%9a%e0%a7%8d%e0%a6%9a%e0%a6%b6%e0%a6%bf%e0%a6%95%e0%a7%8d%e0%a6%b7%e0%a6%be/";
                bundle = new Bundle();
                bundle.putString("key", higherStudiesWeb);
                FragmentWebView fr3 = new FragmentWebView();
                fr3.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr3).addToBackStack(null).commit();
                break;

            case R.id.mojoCardId:
                String mojoWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%ae%e0%a7%8b%e0%a6%9c%e0%a7%8b/";
                bundle = new Bundle();
                bundle.putString("key", mojoWeb);
                FragmentWebView fr4 = new FragmentWebView();
                fr4.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr4).addToBackStack(null).commit();
                break;

            case R.id.funCardId:
                String funWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%ac%e0%a6%bf%e0%a6%a8%e0%a7%8b%e0%a6%a6%e0%a6%a8/";
                bundle = new Bundle();
                bundle.putString("key", funWeb);
                FragmentWebView fr5 = new FragmentWebView();
                fr5.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr5).addToBackStack(null).commit();
                break;

            case R.id.featherCardId:
                String featherWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%ab%e0%a6%bf%e0%a6%9a%e0%a6%be%e0%a6%b0/";
                bundle = new Bundle();
                bundle.putString("key", featherWeb);
                FragmentWebView fr6 = new FragmentWebView();
                fr6.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr6).addToBackStack(null).commit();
                break;

            case R.id.travelCardId:
                String travelWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%ad%e0%a7%8d%e0%a6%b0%e0%a6%ae%e0%a6%a3/";
                bundle = new Bundle();
                bundle.putString("key", travelWeb);
                FragmentWebView fr7 = new FragmentWebView();
                fr7.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr7).addToBackStack(null).commit();
                break;

            case R.id.islamCardId:
                String islamWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%87%e0%a6%b8%e0%a6%b2%e0%a6%be%e0%a6%ae/";
                bundle = new Bundle();
                bundle.putString("key", islamWeb);
                FragmentWebView fr8 = new FragmentWebView();
                fr8.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr8).addToBackStack(null).commit();
                break;

            case R.id.literatureCardId:
                String literatureWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%b8%e0%a6%be%e0%a6%b9%e0%a6%bf%e0%a6%a4%e0%a7%8d%e0%a6%af-%e0%a6%93-%e0%a6%b8%e0%a6%82%e0%a6%b8%e0%a7%8d%e0%a6%95%e0%a7%83%e0%a6%a4%e0%a6%bf/";
                bundle = new Bundle();
                bundle.putString("key", literatureWeb);
                FragmentWebView fr9 = new FragmentWebView();
                fr9.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr9).addToBackStack(null).commit();
                break;

            case R.id.lifeCardId:
                String lifeWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%b2%e0%a6%be%e0%a6%87%e0%a6%ab/";
                bundle = new Bundle();
                bundle.putString("key", lifeWeb);
                FragmentWebView fr10 = new FragmentWebView();
                fr10.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr10).addToBackStack(null).commit();
                break;

            case R.id.knowledgeCardId:
                String knowledgeWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%9c%e0%a6%be%e0%a6%a8%e0%a7%87%e0%a6%a8-%e0%a6%95%e0%a6%bf/";
                bundle = new Bundle();
                bundle.putString("key", knowledgeWeb);
                FragmentWebView fr11 = new FragmentWebView();
                fr11.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr11).addToBackStack(null).commit();
                break;

            case R.id.editorialCardId:
                String editorialWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%b8%e0%a6%ae%e0%a7%8d%e0%a6%aa%e0%a6%be%e0%a6%a6%e0%a6%95%e0%a7%80%e0%a7%9f/";
                bundle = new Bundle();
                bundle.putString("key", editorialWeb);
                FragmentWebView fr12 = new FragmentWebView();
                fr12.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr12).addToBackStack(null).commit();
                break;

            case R.id.videoCardId:
                String videolWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/%e0%a6%ad%e0%a6%bf%e0%a6%a1%e0%a6%bf%e0%a6%93/";
                bundle = new Bundle();
                bundle.putString("key", videolWeb);
                FragmentWebView fr13 = new FragmentWebView();
                fr13.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr13).addToBackStack(null).commit();
                break;

            case R.id.advertisementCardId:
                String advertisementWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/category/%e0%a6%ac%e0%a6%bf%e0%a6%9c%e0%a7%8d%e0%a6%9e%e0%a6%be%e0%a6%aa%e0%a6%a8/";
                bundle = new Bundle();
                bundle.putString("key", advertisementWeb);
                FragmentWebView fr14 = new FragmentWebView();
                fr14.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr14).addToBackStack(null).commit();
                break;

            case R.id.arcaideCardId:
                String arcaideWeb = "https://googleweblight.com/i?u=https://studentjournalbd.com/%e0%a6%86%e0%a6%b0%e0%a7%8d%e0%a6%95%e0%a6%be%e0%a6%87%e0%a6%ad/";
                bundle = new Bundle();
                bundle.putString("key", arcaideWeb);
                FragmentWebView fr15 = new FragmentWebView();
                fr15.setArguments(bundle);
                getFragmentManager().beginTransaction().add(R.id.fragment_container, fr15).addToBackStack(null).commit();
                break;
        }
    }
}
