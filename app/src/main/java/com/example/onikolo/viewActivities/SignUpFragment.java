package com.example.onikolo.viewActivities;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onikolo.R;
import com.example.onikolo.databinding.FragmentSignupBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {


    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentSignupBinding fragmentSignUpBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_signup,container,false);
        return fragmentSignUpBinding.getRoot();
    }

}
