package com.example.onikolo.viewActivities;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.navigation.Navigation;

import com.example.onikolo.R;
import com.example.onikolo.databinding.FragmentLoginBinding;
import com.example.onikolo.model.LogIn;
import com.example.onikolo.retrofit.GetDataService;
import com.example.onikolo.retrofit.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final FragmentLoginBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login,container,false);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                if (binding.username.getText().toString().isEmpty() && binding.password.getText().toString().isEmpty() ){
                    binding.username.setError("Please Enter a Valid Username and Password");
                }
                else{
                    GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                    Call<LogIn> call = service.login(binding.username.getText().toString(),binding.password.getText().toString());
                    call.enqueue(new Callback<LogIn>() {
                        @Override
                        public void onResponse(Call<LogIn> call, Response<LogIn> response) {
                        Navigation.findNavController(view).navigate(R.id.action_logInFragment_to_loginSucess);
                        }

                        @Override
                        public void onFailure(Call<LogIn> call, Throwable t) {
                            Toast.makeText(getContext(), "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
        return binding.getRoot();
    }

}
