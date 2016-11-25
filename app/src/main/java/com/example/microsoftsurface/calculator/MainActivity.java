package com.example.microsoftsurface.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Boolean Newvalue=true;
    Boolean BPlus=false,BDivision=false,BNeagtive=false,BMultipiled=false;
    Double Numone,NumTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        FindUI();
    }

    public void FindUI() {

        Button Zero = (Button) findViewById(R.id.Zero);
        Zero.setOnClickListener(this);

        Button one = (Button) findViewById(R.id.one);
        one.setOnClickListener(this);


        Button Two = (Button) findViewById(R.id.Two);
        Two.setOnClickListener(this);

        Button Three = (Button) findViewById(R.id.Three);
        Three.setOnClickListener(this);

        Button Four = (Button) findViewById(R.id.Four);
        Four.setOnClickListener(this);

        Button Five = (Button) findViewById(R.id.Five);
        Five.setOnClickListener(this);

        Button Six = (Button) findViewById(R.id.Six);
        Six.setOnClickListener(this);

        Button Seven = (Button) findViewById(R.id.Seven);
        Seven.setOnClickListener(this);

        Button Eight = (Button) findViewById(R.id.Eight);
        Eight.setOnClickListener(this);

        Button Nine = (Button) findViewById(R.id.Nine);
        Nine.setOnClickListener(this);

        Button Plus = (Button) findViewById(R.id.Plus);
        Plus.setOnClickListener(this);

        Button Negative = (Button) findViewById(R.id.Negative);
        Negative.setOnClickListener(this);

        Button Division = (Button) findViewById(R.id.Division);
        Division.setOnClickListener(this);

        Button Multiplied = (Button) findViewById(R.id.Multiplied);
        Multiplied.setOnClickListener(this);

        Button Equal = (Button) findViewById(R.id.Equal);
        Equal.setOnClickListener(this);

        Button Reset = (Button) findViewById(R.id.Reset);
        Reset.setOnClickListener(this);

    }


    public void Dispaly_Number(String Num) {


        TextView Disp = (TextView) findViewById(R.id.Display);

        if (Disp.getText().toString().equals("0"))
            Disp.setText(Num);
        else
            Disp.append(Num);


    }

    public void Plus()
    {
        TextView Disp = (TextView) findViewById(R.id.Display);
        Numone=Double.parseDouble(Disp.getText().toString());
        BPlus=true;
        Disp.setText("");
        Dispaly_Number("0");

    }

    public void Negative()
    {
        TextView Disp = (TextView) findViewById(R.id.Display);
        Numone=Double.parseDouble(Disp.getText().toString());
        BNeagtive=true;
        Disp.setText("");
        Dispaly_Number("0");

    }

    public void Division()
    {
        TextView Disp = (TextView) findViewById(R.id.Display);
        Numone=Double.parseDouble(Disp.getText().toString());
        BDivision=true;
        Disp.setText("");
        Dispaly_Number("0");

    }

    public void Multiplied()
    {
        TextView Disp = (TextView) findViewById(R.id.Display);
        Numone=Double.parseDouble(Disp.getText().toString());
        BMultipiled=true;
        Disp.setText("");
        Dispaly_Number("0");

    }


    public  void Equal()
    {
        if(BPlus==true)
        {
            TextView Disp = (TextView) findViewById(R.id.Display);
            NumTwo=Double.parseDouble(Disp.getText().toString());
            double Equal=Numone+NumTwo;
            Disp.setText("");
            Disp.setText(String.valueOf(Equal));
            BPlus=false;
        }
        else if(BNeagtive==true)
        {
            TextView Disp = (TextView) findViewById(R.id.Display);
            NumTwo=Double.parseDouble(Disp.getText().toString());
            double Equal=Numone-NumTwo;
            Disp.setText("");
            Disp.setText(String.valueOf(Equal));
            BNeagtive=false;
        }
        else if(BDivision==true)
        {
            TextView Disp = (TextView) findViewById(R.id.Display);
            NumTwo=Double.parseDouble(Disp.getText().toString());
            double Equal=Numone/NumTwo;
            Disp.setText("");
            Disp.setText(String.valueOf(Equal));
            BDivision=false;
        }
        else if(BMultipiled==true)
        {
            TextView Disp = (TextView) findViewById(R.id.Display);
            NumTwo=Double.parseDouble(Disp.getText().toString());
            double Equal=Numone*NumTwo;
            Disp.setText("");
            Disp.setText(String.valueOf(Equal));
            BMultipiled=false;
        }


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.Zero:
                Dispaly_Number("0");
                break;

            case R.id.one:
                Dispaly_Number("1");
                break;

            case R.id.Two:
                Dispaly_Number("2");
                break;

            case R.id.Three:
                Dispaly_Number("3");
                break;

            case R.id.Four:
                Dispaly_Number("4");
                break;

            case R.id.Five:
                Dispaly_Number("5");
                break;

            case R.id.Six:
                Dispaly_Number("6");
                break;

            case R.id.Seven:
                Dispaly_Number("7");
                break;

            case R.id.Eight:
                Dispaly_Number("8");
                break;

            case R.id.Nine:
                Dispaly_Number("9");
                break;

            case R.id.Plus:
                Plus();
                break;

            case R.id.Division:
                Division();
                break;

            case R.id.Negative:
                Negative();
                break;

            case R.id.Multiplied:
                Multiplied();
                break;

            case R.id.Equal:
                Equal();
                break;

            case R.id.Reset:
            {
                TextView Disp= (TextView) findViewById(R.id.Display);
                Disp.setText("0");
                Newvalue=true;
                BPlus=false;
                BDivision=false;
                BNeagtive=false;
                BMultipiled=false;
                Numone=0.0;
                NumTwo=0.0;

            }


        }

        }

    }

