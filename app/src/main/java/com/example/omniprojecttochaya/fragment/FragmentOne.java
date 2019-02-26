package com.example.omniprojecttochaya.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.omniprojecttochaya.MainActivity;
import com.example.omniprojecttochaya.R;
import com.example.omniprojecttochaya.activitylifecycle.OneActivity;
import com.example.omniprojecttochaya.activitylifecycle.SecondActivity;

public class FragmentOne extends Fragment {

    @Override
     public void onAttach(Context context){
        super.onAttach(context);
        Log.e("FragmentOne onAttach", "In FragmentOne onAttach");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne onAttach", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("FragmentOne onCreate", "In FragmentOne onCreate");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne onCreate", Toast.LENGTH_LONG).show();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_one, container, false);
        Log.e("FragmentOne CreateView", "In FragmentOne CreateView");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne CreateView", Toast.LENGTH_LONG).show();
        return v;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("FragmentOne ActvtyCreat", "In FragmentOne ActvtyCreated");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne ActvtyCreated", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("FragmentOne onStart", "In FragmentOne onStart");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("FragmentOne onResume", "In FragmentOne onResume");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("FragmentOne onPause", "In FragmentOne onPause");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("FragmentOne onStop", "In FragmentOne onStop");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("FragmentOne DestroyView", "In FragmentOne DestroyView");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne DestroyView", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("FragmentOne onDestroy", "In FragmentOne onDestroy");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("FragmentOne onDetach", "In FragmentOne onDetach");
        Toast.makeText(getActivity().getApplicationContext(), "In FragmentOne onDetach", Toast.LENGTH_LONG).show();
    }
}
