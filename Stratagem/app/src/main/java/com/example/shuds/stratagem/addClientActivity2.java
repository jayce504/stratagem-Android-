package com.example.shuds.stratagem;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class addClientActivity2 extends AppCompatActivity {

    Button createClientButton = (Button)findViewById(R.id.createClientButton);

    Settings.Global TextView nameTextField = (TextView)findViewById(R.id.nameTextField);

    TextView addressTextField = (TextView)findViewById(R.id.addressTextField);

    TextView phoneNumberTextField = (TextView)findViewById(R.id.phoneNumberTextField);

    RadioButton retainedRadioButton = (RadioButton)findViewById(R.id.retainedRadioButton);

    RadioButton appointedRadioButton = (RadioButton)findViewById(R.id.appointedRadioButton);

    public class client {

        String name;
        String address;
        String phoneNumber;
        String appointedRetained;

    }

    Intent i = new Intent(addClientActivity2.this, addClientActivity2.class);
    Bundle b = new Bundle();
    b.putString("name", nameTextField.getText().toString());
    b.putString("address", addressTextField.getText().toString);
    b.putString("phoneNumber", phoneNumberTextField.getText().toString());

    startActivity(i);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_client2);
    }
}
