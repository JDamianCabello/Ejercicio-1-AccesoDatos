package com.example.usuario.basicconversor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @BindView(R.id.button) Button btnConvertir;
    @BindView(R.id.tvEuros) TextView tvEuros;
    @BindView(R.id.tvDolares) TextView tvDolares;
    @BindView(R.id.rbt_euros) RadioButton rtb_euros;
    @BindView(R.id.rbt_dolares) RadioButton rbt_dolares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    private String Conversor(RadioGroup grupo){

    }
}
