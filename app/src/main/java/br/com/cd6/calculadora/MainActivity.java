package br.com.cd6.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adicionarNumero(View view) {
        String numero = ((Button) view).getText().toString();
        TextView resultado = ((TextView) findViewById(R.id.resultado));
        resultado.setText(resultado.getText() + numero);
    }
    private double total;
    private String operacao;

    public void operacao(View view) {
        operacao = ((TextView) view).getText().toString();
        total = Double.valueOf(((TextView) findViewById(R.id.resultado)).getText().toString().trim()); // trim() remove os espaços no início e final de uma string
        ((TextView) findViewById(R.id.resultado)).setText("");
    }

    public void calcular(View view) {
        double valor = Double.valueOf(((TextView) findViewById(R.id.resultado)).getText().toString().trim());

            if("+".equals(operacao)) {
                total += valor; // total = total + valor

            } else if("-".equals(operacao)) {
                total += valor; // total = total + valor

            } else if("/".equals(operacao)) {
                total += valor; // total = total + valor

            } else if("*".equals(operacao)) {
                total *= valor; // total = total + valor
            }
            ((TextView) findViewById(R.id.resultado)).setText(String.valueOf(total));


    }

    public void limpar(View view) {
        total = 0;
        operacao = null;
        ((TextView) findViewById(R.id.resultado)).setText("");
    }
}