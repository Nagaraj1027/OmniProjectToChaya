package com.example.omniprojecttochaya.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.omniprojecttochaya.R;

public class FragmentTwo extends Fragment {

    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("FragmentTwo onAttach", "In FragmentTwo onAttach");
        Toast.makeText(getActivity(), "In FragmentTwo onAttach", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("FragmentTwo onCreate", "In FragmentTwo onCreate");
        Toast.makeText(getActivity(), "In FragmentTwo onCreate", Toast.LENGTH_LONG).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_two, container, false);
        Log.e("FragmentTwo CreateView", "In FragmentTwo CreateView");
        Toast.makeText(getActivity(), "In FragmentTwo onCreateView", Toast.LENGTH_LONG).show();
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("FragmentTwo ActvtyCreat", "In FragmentTwo ActvtyCreat");
        Toast.makeText(getActivity(), "In FragmentTwo ActvtyCreat", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("FragmentTwo onStart", "In FragmentTwo onStart");
        Toast.makeText(getActivity(), "In FragmentTwo onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("FragmentTwo onResume", "In FragmentTwo onResume");
        Toast.makeText(getActivity(), "In FragmentTwo onResume", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.e("FragmentTwo onPause", "In FragmentTwo onPause");
        Toast.makeText(getActivity(), "In FragmentTwo onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("FragmentTwo onStop", "In FragmentTwo onStop");
        Toast.makeText(getActivity(), "In FragmentTwo onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("FragmentTwo DestroyView", "In FragmentTwo onDestroyView");
        Toast.makeText(getActivity(), "In FragmentTwo onDestroyView", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("FragmentTwo onDestroy", "In FragmentTwo onDestroy");
        Toast.makeText(getActivity(), "In FragmentTwo onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("FragmentTwo onDetach", "In FragmentTwo onDetach");
        Toast.makeText(getActivity(), "In FragmentTwo onDetach", Toast.LENGTH_LONG).show();
    }
}
