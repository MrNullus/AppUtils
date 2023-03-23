package etec.com.gustavo.henrique.utilities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ConversorTemperaturasActivity extends AppCompatActivity {

    TextView txtResultado;
    EditText edTemp;
    Button btCelsiusKelvin, btKelvinCelsius, btCelsiusFahre, btFahreCelsius, btKelvinFahre, btFahreKelvin;
    String mensagem = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_temperaturas);

        // Referenciar objetos JAVA com XML
        txtResultado = findViewById(R.id.txtResultado);
        edTemp = findViewById(R.id.edtTemp);

        btCelsiusKelvin = findViewById(R.id.btnCelsiusKelvin);
        btCelsiusFahre  = findViewById(R.id.btnCelsiusFahre);

        btKelvinCelsius = findViewById(R.id.btnKelvinCelsius);
        btKelvinFahre   = findViewById(R.id.btnKelvinFahre);

        btFahreCelsius = findViewById(R.id.btnFahreCelsius);
        btFahreKelvin  = findViewById(R.id.btnFahreKelvin);

        //------****
        btCelsiusKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                double K;
                double C;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    C = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    K = C + 273.15;

                    mensagem = "A temperatura é de "+K+"K";
                    txtResultado.setText(mensagem);
                }
            }
        });

        //------****
        btKelvinCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                double C;
                float K;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    K = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    C = K - 273.15;

                    mensagem = "A temperatura é de " + C + "C";
                    txtResultado.setText(mensagem);
                }
            }
        });

        //------****
        btCelsiusFahre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float C;
                double F;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    C = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    F = ( C * 1.8 ) + 32;

                    mensagem = "A temperatura é de " + F + "F";
                    txtResultado.setText(mensagem);
                }
            }
        });

        //------****
        btFahreCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                double C;
                Float F;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    F = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    C = ( F - 32 ) * 0.55555;

                    mensagem = "A temperatura é de " + C + "C";
                    txtResultado.setText(mensagem);
                }
            }
        });

        //------****
        btKelvinFahre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float K;
                double F;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    K = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    F = (( K - 273.15 ) * 1.8 ) + 32;

                    mensagem = "A temperatura é de " + F + "F";
                    txtResultado.setText(mensagem);
                }
            }
        });

        //------****
        btFahreKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float F;
                double K;

                if (edTemp.getText().toString().isEmpty()) {
                    edTemp.setError("Informe uma temperatura!");
                    edTemp.requestFocus();
                } else {
                    // Pegando Valor
                    F = Float.parseFloat(edTemp.getText().toString());

                    // Calculo
                    K = ((F - 32) * 0.55555) + 273.15;

                    mensagem = "A temperatura é de " + K + "K";
                    txtResultado.setText(mensagem);
                }
            }
        });
    }
}