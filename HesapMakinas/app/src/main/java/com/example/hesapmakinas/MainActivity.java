package com.example.hesapmakinas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    String eskisayi="";
    String op ="+";
    boolean yeniop=true;
    EditText editText;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.ekran);


    }
    public void numberEvent(View view){
        if(yeniop)
            editText.setText("");
        yeniop=false;
        String number= editText.getText().toString();

        switch (view.getId()){
            case R.id.b1:
                number+="1";
                break;

            case R.id.b2:
                number+="2";
                break;

            case R.id.b3:
                number+="3";

                break;
                case R.id.b4:
                number+="4";


            case R.id.b5:
                number+="5";
                break;


             case R.id.b6:
                number+="6";
                break;

            case R.id.b7:
                number+="7";
                break;
            case R.id.b8:
                number+="8";
                break;
            case R.id.b9:
                number+="9";
                break;

             case R.id.b0:
                number+="0";
                break;


             case R.id.bnokta:
                number+=".";
                break;

            case R.id.beksi:
                number+="-";
                break;


        }
        editText.setText(number);

}
public void operatorEvent (View view ) {
    yeniop = true;
    eskisayi = editText.getText().toString();
    switch (view.getId()) {
        case R.id.bbolme:
            op = "/";
            break;
        case R.id.bcarpma:
            op = "*";
            break;
        case R.id.barti:
            op = "+";
            break;
        case R.id.beksi:
            op = "-";
            break;
        case R.id.bsin:
            op = "sin";
            break;
        case R.id.bcos:
            op = "cos";
            break;
        case R.id.btan:
            op = "tan";
            break;
        case R.id.bfactorial:
            op = "!";
            break;


    }

}

public void equalEvent (View view ){
    String yenisayi =editText.getText().toString();
    double sonuc =0.0;
switch (op){
    case "+":
        sonuc=Double.parseDouble(eskisayi)+Double.parseDouble(yenisayi);
        break;
    case "-":
        sonuc=Double.parseDouble(eskisayi)-Double.parseDouble(yenisayi);
        break;
    case "*":
        sonuc=Double.parseDouble(eskisayi)*Double.parseDouble(yenisayi);
        break;
    case "/":
        sonuc=Double.parseDouble(eskisayi)/Double.parseDouble(yenisayi);
        break;

    case "sin":
        sonuc=Math.sin(Double.parseDouble(eskisayi));
        break;
    case "cos":
        sonuc=Math.cos(Double.parseDouble(eskisayi));
        break;
    case "tan":
        sonuc=Math.tan(Double.parseDouble(eskisayi));
        break;


}
editText.setText(sonuc+"");

    }
    int factorial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }
    public void acEvent (View view ){
        editText.setText("0");
        yeniop=true;
    }
    public void percentEvent(View view){
        double no= Double.parseDouble(editText.getText().toString())/100;
        editText.setText(no+"");
        yeniop=true;
    }

}