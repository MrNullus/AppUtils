package etec.com.gustavo.henrique.utilities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

import etec.com.gustavo.henrique.utilities.Calculadora;
import etec.com.gustavo.henrique.utilities.Valida;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import etec.com.gustavo.henrique.utilities.ConversorTemperatura;
import etec.com.gustavo.henrique.appUtils.R;


public class CalculadoraActivity extends AppCompatActivity {

    Calculadora calc = new etec.com.gustavo.henrique.utilities.Calculadora();

    TextView txtResultado;
    Button btnSoma, btnSubtrair, btnMult, btnDividir;
    EditText edtValorUm, edtValorDois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    edtValorUm   = findViewById(R.id.edtValor1);
    edtValorDois = findViewById(R.id.edtValor2);
    
    btnSoma      = findViewById(R.id.btnSoma);
    btnSubtrair  = findViewById(R.id.btnSubtrair);
    btnMult      = findViewById(R.id.btnMult);
    btnDividir   = findViewById(R.id.btnDividir);


    btnSoma.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) 
        {
            float valor1, valor2, resultado;

            valor1 = Float.parseFloat(edtValorUm.getText().toString());
            valor2 = Float.parseFloat(edtValorDois.getText().toString());

                if (Valida.camposObrigatorios(valor1, valor2))
            {
                resultado = calc.realizarOperacao(
                    valor1,
                    valor2,
                    "+"
                );
            
                txtResultado.setText("A soma é: " + resultado);
            }
        }
    });


    btnSubtrair.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) 
        {
            float valor1, valor2, resultado;

            valor1 = Float.parseFloat(edtValorUm.getText().toString());
            valor2 = Float.parseFloat(edtValorDois.getText().toString());

                if (Valida.camposObrigatorios(valor1, valor2)) 
            {
                resultado = calc.realizarOperacao(
                    valor1,
                    valor2,
                    "-"
                );
            
                txtResultado.setText("A subtração é: " + resultado);
            }
        }
    });


    btnMult.setOnClickListener(new View.OnClickListener() {
    
        @Override
        public void onClick(View view) 
        {
            float valor1, valor2, resultado;

            valor1 = Float.parseFloat(edtValorUm.getText().toString());
            valor2 = Float.parseFloat(edtValorDois.getText().toString());

                if (Valida.camposObrigatorios(valor1, valor2)) 
            {
                resultado = calc.realizarOperacao(
                    valor1,
                    valor2,
                    "*"
                );
            
                txtResultado.setText("A multiplicação é: " + resultado);
            }
        }
    });
    

    btnDividir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) 
        {
            float valor1, valor2, resultado;

            valor1 = Float.parseFloat(edtValorUm.getText().toString());
            valor2 = Float.parseFloat(edtValorDois.getText().toString());

            if (Valida.camposObrigatorios(valor1, valor2)) 
            {
                resultado = calc.realizarOperacao(
                    valor1,
                    valor2,
                    "/"
                );
            
                txtResultado.setText("A divisão é: " + resultado);
            }
        }
    });

}