package com.example.usuario.basicconversor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity implements View.OnClickListener {

    private final double CAMBIO = 0.85;

    private EditText tvDolar;
    private EditText tvEuro;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvEuro = findViewById(R.id.tvEuros);
        tvDolar = findViewById(R.id.tvDolares);
        btnConvert = findViewById(R.id.button);
    }


    private String DolarEuro(final double CAMBIO, double cantidad) {
        return String.format("%.2f", cantidad * CAMBIO);
    }

    private String EuroDolar(final double CAMBIO, double cantidad) {
        return String.format("%.2f", cantidad / CAMBIO);
    }

    @Override
    public void onClick(View v) {
        if (((RadioButton) findViewById(R.id.rbt_euros)).isChecked()) {
            tvDolar.setText(EuroDolar(CAMBIO, Conversion(tvEuro.getText().toString())));
        } else if (((RadioButton) findViewById(R.id.rbt_dolares)).isChecked()) {
            tvEuro.setText(DolarEuro(CAMBIO, Conversion(tvDolar.getText().toString())));
        }
    }
    private double Conversion(String valor)
    {
        try {
            return Double.parseDouble(valor);
        }
        catch (Exception e){
            return 0;
        }
    }

}
