package com.example.photographerbooking.authentication;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.photographerbooking.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SignUpFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SignUpFragment extends Fragment implements View.OnClickListener{

    private View view;
    private EditText etEmail;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private Button btnSignUp;
    private final String REQUIRE = "Require";
    private final String NOT_MATCH = "Confirm password not match";

    public SignUpFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SignUpFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SignUpFragment newInstance(String param1, String param2) {
        SignUpFragment fragment = new SignUpFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        etEmail = view.findViewById(R.id.etEmail);
        etPassword = view.findViewById(R.id.etPassword);
        etConfirmPassword = view.findViewById(R.id.etConfirmPassword);
        btnSignUp = view.findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(this);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private boolean checkSignUp() {
        if (TextUtils.isEmpty(etEmail.getText().toString())) {
            etEmail.setError(REQUIRE);
            return false;
        }
        if (TextUtils.isEmpty(etPassword.getText().toString())) {
            etPassword.setError(REQUIRE);
            return false;
        }
        if (TextUtils.isEmpty(etConfirmPassword.getText().toString())) {
            etConfirmPassword.setError(REQUIRE);
            return false;
        }
        if (!TextUtils.equals(etPassword.getText().toString(),
                etConfirmPassword.getText().toString())) {
            etConfirmPassword.setError(NOT_MATCH);
            return false;
        }
        return true;
    }

    private void signUp() {
        if (!checkSignUp()) return;

        TabLayout tabs = getActivity().findViewById(R.id.authentication_tab_layout);
        tabs.getTabAt(0).select();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSignUp) signUp();
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("SIGN UP FRAGMENT", "STOPPED");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("SIGN UP FRAGMENT", "DESTROYED");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("SIGN UP FRAGMENT", "RESUMED");
    }
}