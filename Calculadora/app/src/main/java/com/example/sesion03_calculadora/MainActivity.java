package com.example.sesion03_calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText pantalla;
    public double operador1, operador2, res;
    int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla =(EditText)findViewById(R.id.caja);
    }
    //Botones
    public void btn0(View v){
        String cap= pantalla.getText().toString(); //Recoger todo lo que contiene la caja en forma de texto
        cap= cap +"0";
        pantalla.setText(cap);
    }

    public void btn1(View v){
        String cap= pantalla.getText().toString(); //Recoger todo lo que contiene la caja en forma de texto
        cap= cap +"1";
        pantalla.setText(cap);
    }

    public void btn2(View v){
        String cap= pantalla.getText().toString(); //Recoger todo lo que contiene la caja en forma de texto
        cap= cap +"2";
        pantalla.setText(cap);
    }

    public void btn3(View v){
        String cap= pantalla.getText().toString();
        cap= cap +"3";
        pantalla.setText(cap);
    }

    public void btn4(View v){
        String cap= pantalla.getText().toString();
        cap= cap +"4";
        pantalla.setText(cap);
    }

    public void btn5(View v){
        String cap= pantalla.getText().toString();
        cap= cap +"5";
        pantalla.setText(cap);
    }

    public void btn6(View v){
        String cap= pantalla.getText().toString();
        cap= cap +"6";
        pantalla.setText(cap);
    }

    public void btn7(View v){
        String cap= pantalla.getText().toString();
        cap= cap +"7";
        pantalla.setText(cap);
    }

    public void btn8(View v){
        String cap= pantalla.getText().toString();
        cap= cap +"8";
        pantalla.setText(cap);
    }

    public void btn9(View v){
        String cap= pantalla.getText().toString();
        cap= cap +"9";
        pantalla.setText(cap);
    }

    public void btnpunto(View v){
        String cap= pantalla.getText().toString(); //Recoger todo lo que contiene la caja en forma de texto
        cap= cap +".";
        pantalla.setText(cap);
    }
    //Operaciones

    public void suma (View v){
        try {
            String aux1 = pantalla.getText().toString();
            operador1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("");
        operacion=1;

    }

    public void resta (View v){
        try {
            String aux1 = pantalla.getText().toString();
            operador1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("");
        operacion=2;

    }

    public void multiplicacion (View v){
        try {
            String aux1 = pantalla.getText().toString();
            operador1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("");
        operacion=3;

    }

    public void division (View v){
        try {
            String aux1 = pantalla.getText().toString();
            operador1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("");
        operacion=4;

    }

    public void potencia (View v){
        try {
            String aux1 = pantalla.getText().toString();
            operador1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("");
        operacion=5;

    }

    public void porcentaje (View v){
        try {
            String aux1 = pantalla.getText().toString();
            operador1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("");
        operacion=6;

    }

    public void raiz (View v){
        try {
            String aux1 = pantalla.getText().toString();
            operador1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}
        pantalla.setText("√ ("+operador1+")");
        operacion=7;

    }

    public void igual (View v) {
        try {
            String aux2 = pantalla.getText().toString();
            operador2 = Double.parseDouble(aux2);
        } catch (NumberFormatException nfe) {
        }
        pantalla.setText("");


        if (operacion == 1) {
            res = operador1 + operador2;
            pantalla.setText("" + res);
        }else if (operacion==2){
            res=operador1-operador2;
            pantalla.setText("" + res);
        }else if(operacion==3){
            res=operador1*operador2;
            pantalla.setText("" + res);
        }else if (operacion==4) {
            if (operador2 == 0) {
                pantalla.setText("Error");
            } else {
                res = operador1 / operador2;
                pantalla.setText("" + res);
                operador1 = res;
            }

        }else if(operacion ==5){
            res=Math.pow(operador1, operador2);
            pantalla.setText("" + res);
        }else if (operacion==6){
            res=operador2*(operador1/100.0);
            pantalla.setText("" + res);
        }else if(operacion==7){
            res=Math.sqrt(operador1);
            pantalla.setText("" + res);
        }
        pantalla.setText(""+res);
        operador1=res;
    }
    public void limpiar (View v){
        pantalla.setText("");
        operador1=0.0;
        operador2=0.0;
        res=0.0;
    }

    public void borrar(View V){
        if(!pantalla.getText().toString().equals("")){
            pantalla.setText(pantalla.getText().subSequence(0,pantalla.getText().length()-1)+"");
        }
    }

}
