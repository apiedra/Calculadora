package gmalv.cr.fi.ejercicio2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, botonMas, botonIgual, botonLimpiar;
    EditText editText;
    String numero = "";
    int resultado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        /*botones*/
        boton0 = (Button) findViewById(R.id.button0);
        boton1 = (Button) findViewById(R.id.button1);
        boton2 = (Button) findViewById(R.id.button2);
        boton3 = (Button) findViewById(R.id.button3);
        boton4 = (Button) findViewById(R.id.button4);
        boton5 = (Button) findViewById(R.id.button5);
        boton6 = (Button) findViewById(R.id.button6);
        boton7 = (Button) findViewById(R.id.button7);
        boton8 = (Button) findViewById(R.id.button8);
        boton9 = (Button) findViewById(R.id.button9);
        botonMas = (Button) findViewById(R.id.buttonMas);
        botonIgual = (Button) findViewById(R.id.buttonIgual);
        botonLimpiar = (Button) findViewById(R.id.buttonLimpiar);

        /*campos de texto*/
        editText = (EditText) findViewById(R.id.editText);
    }

    public void Onlcik(View view) {
        if (editText.getText().toString().equals("0"))
            editText.setText("");
        switch (view.getId()) {
            case R.id.button0:
                editText.setText(editText.getText() + "0");
                // numero=numero+"0";
                break;
            case R.id.button1:
                editText.setText(editText.getText() + "1");
                //  numero=numero+"1";
                break;
            case R.id.button2:
                editText.setText(editText.getText() + "2");
                //  numero=numero+"2";
                break;
            case R.id.button3:
                editText.setText(editText.getText() + "3");
                //  numero=numero+"3";
                break;
            case R.id.button4:
                editText.setText(editText.getText() + "4");
                //  numero=numero+"4";
                break;
            case R.id.button5:
                editText.setText(editText.getText() + "5");
                //  numero=numero+"5";
                break;
            case R.id.button6:
                editText.setText(editText.getText() + "6");
                // numero=numero+"6";
                break;
            case R.id.button7:
                editText.setText(editText.getText() + "7");
                //  numero=numero+"7";
                break;
            case R.id.button8:
                editText.setText(editText.getText() + "8");
                //  numero=numero+"8";
                break;
            case R.id.button9:
                editText.setText(editText.getText() + "9");
               // numero=numero+"9";
                break;
            case R.id.buttonMas:
                resultado = Integer.parseInt(editText.getText().toString())+resultado;
                editText.setText("0");
                // numero="";
                break;
            case R.id.buttonIgual:
                resultado = Integer.parseInt(editText.getText().toString())+ resultado ;
                editText.setText(resultado+"");
                resultado=0;
                break;
            case R.id.buttonLimpiar:
                resultado=0;
                editText.setText("0");
                break;
        }
    }
}
