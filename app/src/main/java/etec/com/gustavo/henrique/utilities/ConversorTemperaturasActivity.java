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
    float result = 0.0;
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
                double celsius;
                celsius = Float.parseFloat(edTemp.getText().toString());

                if (Valida.camposObrigatorios(celsius)) 
                {
                    // Calculo
                    result = ConversorTemperatura.CelsiusToKelvin(celsius);

                    mensagem = "A temperatura é de "+ result +"K";
                    txtResultado.setText(mensagem);
                } 
            }
        });

        //------****
        btKelvinCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float kelvin;
                kelvin = Float.parseFloat(edTemp.getText().toString());

                if (Valida.camposObrigatorios(kelvin)) 
                {
                    // Calculo
                    result = ConversorTemperatura.KelvinToCelsius(kelvin);

                    mensagem = "A temperatura é de "+ result +"C";
                    txtResultado.setText(mensagem);
                }
            }
        });

        //------****
        btCelsiusFahre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float celsius;
                celsius = Float.parseFloat(edTemp.getText().toString());

                if (Valida.camposObrigatorios(celsius)) 
                {
                    // Calculo
                    result = ConversorTemperatura.CelsiusToFahre(celsius);

                    mensagem = "A temperatura é de "+ result +"F";
                    txtResultado.setText(mensagem);
                }
            }
        });

        //------****
        btFahreCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float fahre;
                fahre = Float.parseFloat(edTemp.getText().toString());

                if (Valida.camposObrigatorios(fahre)) 
                {
                    // Calculo
                    result = ConversorTemperatura.FahreToCelsius(fahre);

                    mensagem = "A temperatura é de "+ result +"C";
                    txtResultado.setText(mensagem);
                }
            }
        });

        //------****
        btKelvinFahre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float kelvin;
                kelvin = Float.parseFloat(edTemp.getText().toString());

                if (Valida.camposObrigatorios(kelvin)) 
                {
                    // Calculo
                    result = ConversorTemperatura.KelvinToFahre(kelvin);

                    mensagem = "A temperatura é de "+ result +"F";
                    txtResultado.setText(mensagem);
                }
            }
        });

        //------****
        btFahreKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // variaveis auxiliares
                float fahre;
                fahre = Float.parseFloat(edTemp.getText().toString());

                if (Valida.camposObrigatorios(fahre)) 
                {
                    // Calculo
                    result = ConversorTemperatura.FahreToKelvin(fahre);

                    mensagem = "A temperatura é de "+ result +"K";
                    txtResultado.setText(mensagem);
                }
            }
        });
    }
}