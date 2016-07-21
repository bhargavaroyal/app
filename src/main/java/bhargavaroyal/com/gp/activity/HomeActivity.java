package bhargavaroyal.com.gp.activity;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

import bhargavaroyal.com.gp.R;

/**
 * Created by hp on 20-07-2016.
 */
public class HomeActivity extends FragmentActivity {

    int fragmentCount = 0;
    TextView txtCount;
    TextView mUsername;
    TextView mPassword;
    Context mcontext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_home);
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        String desiredUsername =  pref.getString("username", "username");
        String desiredPassword =  pref.getString("key_name", "password");

        mUsername = (TextView) findViewById(R.id.username_tv);
        mUsername.setText(desiredUsername);
        mPassword = (TextView) findViewById(R.id.password_tv);
        mPassword.setText(desiredPassword);

        super.onCreate(savedInstanceState);

    }




}
