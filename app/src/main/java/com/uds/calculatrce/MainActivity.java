package com.uds.calculatrce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button un, deux, trois, quatre, cinq , six , sept, huit, neuf, zero, virgule,plus, moins,
            multiplication, division, reset, egal;
    private TextView result;
    private double temp=1.0;
    private int k=0, j=0;
    private String operateur;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recupération des boutons en fonction de leurs Ids

        un= (Button) findViewById(R.id.btn1);
        deux=(Button) findViewById(R.id.btn2);
        trois=(Button) findViewById(R.id.btn3);
        quatre=(Button) findViewById(R.id.btn4);
        cinq=(Button) findViewById(R.id.btn5);
        six=(Button) findViewById(R.id.btn6);
        sept=(Button) findViewById(R.id.btn7);
        huit=(Button) findViewById(R.id.btn8);
        neuf=(Button) findViewById(R.id.btn9);
        zero=(Button) findViewById(R.id.btn0);
        virgule=(Button) findViewById(R.id.btnVir);
        plus=(Button) findViewById(R.id.btnPlus);
        moins=(Button) findViewById(R.id.btnMoins);
        multiplication=(Button) findViewById(R.id.btnMul);
        division=(Button) findViewById(R.id.btnDiv);
        reset=(Button) findViewById(R.id.btnC);
        egal=(Button) findViewById(R.id.btnEgal);
        result= (TextView) findViewById(R.id.txtResult);

        //Defnition de l'action à exécuter  si on clique sur les boutons
        //bouton 1
        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((result.getText().toString().equals("0"))|| (result.getText().toString().equals("0.0"))) {
                    result.setText("1");
                } else result.append("1");
            }
        });
        // bouton 2
        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((result.getText().toString().equals("0"))|| (result.getText().toString().equals("0.0"))) {
                    result.setText("2");
                } else result.append("2");
            }
        });

        //bouton 3
        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((result.getText().toString().equals("0"))|| (result.getText().toString().equals("0.0"))) {
                    result.setText("3");
                } else result.append("3");
            }
        });

        //bouton 4
        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((result.getText().toString().equals("0"))|| (result.getText().toString().equals("0.0"))) {
                    result.setText("4");
                } else result.append("4");
            }
        });

        //bouton 5
        cinq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((result.getText().toString().equals("0"))|| (result.getText().toString().equals("0.0"))) {
                    result.setText("5");
                } else result.append("5");
            }
        });

        //bouton 6
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((result.getText().toString().equals("0"))|| (result.getText().toString().equals("0.0"))) {
                    result.setText("6");
                } else result.append("6");
            }
        });

        //bouton 7
        sept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((result.getText().toString().equals("0"))|| (result.getText().toString().equals("0.0"))) {
                    result.setText("7");
                } else result.append("7");
            }
        });

        //bouton 8
        huit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((result.getText().toString().equals("0"))|| (result.getText().toString().equals("0.0"))){
                    result.setText("8");
                } else result.append("8");
            }
        });

        //bouton 9
        neuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((result.getText().toString().equals("0"))|| (result.getText().toString().equals("0.0"))) {
                    result.setText("9");
                } else result.append("9");
            }
        });

        //bouton 0
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((result.getText().toString().equals("0"))|| (result.getText().toString().equals("0.0"))) {
                    result.setText("0");
                } else result.append("0");
            }
        });

        //bouton +
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char valDer;
                if (result.getText().toString().length() > 1) {
                    valDer = result.getText().toString().charAt(result.getText().length() - 2);
                    if ((valDer == '/') || (valDer == '*') || (valDer == '+') || (valDer == '-')) {
                        result.setText(result.getText().toString().substring(0, result.getText().toString().length() - 3));

                    }
                }
                result.append(" + ");
            }
        });

        // bouton -
        moins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char valDer;
                if (result.getText().toString().length() > 1) {
                    valDer = result.getText().toString().charAt(result.getText().length() - 2);
                    if ((valDer == '/') || (valDer == '*') || (valDer == '+') || (valDer == '-')) {
                        result.setText(result.getText().toString().substring(0, result.getText().toString().length() - 3));

                    }
                }
                result.append(" - ");
            }
        });

        //bouton *
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char valDer;
                if (result.getText().toString().length() > 1) {
                    valDer = result.getText().toString().charAt(result.getText().length() - 2);
                    if ((valDer == '/') || (valDer == '*') || (valDer == '+') || (valDer == '-')) {
                        result.setText(result.getText().toString().substring(0, result.getText().toString().length() - 3));

                    }
                }
                result.append(" * ");
            }
        });

        //bouton /
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char valDer;
                if (result.getText().toString().length() > 1) {
                    valDer = result.getText().toString().charAt(result.getText().length() - 2);
                    if ((valDer == '/') || (valDer == '*') || (valDer == '+') || (valDer == '-')) {
                        result.setText(result.getText().toString().substring(0, result.getText().toString().length() - 3));

                    }
                }
                    result.append(" / ");



            }
        });

       // bouton . (symbole decimal)
        virgule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(".");
            }
        });

        // bouton de reinitialisation de la zonne du resultat (C)
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
                temp=1.0;
            }
        });

        //Bouton Egale
        egal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculResultat();
            }
        });
    }

    //Calcul du resultat
    public void calculResultat(){
        String chaine = result.getText().toString();
        String tab[]=chaine.split(" ");
        int compteur = 0;

        double valeur=Double.parseDouble(tab[0]);

        for (int i=1; i<chaine.length();i++){
            char operateur = chaine.charAt(i);

            switch(operateur){
                // addition
                case '+':
                    compteur=compteur+2;
                    valeur+=Double.parseDouble(tab[compteur]);
                    break;
                  // soustraction
                case '-':
                    compteur=compteur+2;
                    valeur-=Double.parseDouble(tab[compteur]);
                    break;
                    //multiplication
                case '*':
                    compteur=compteur+2;
                    valeur*=Double.parseDouble(tab[compteur]);
                    break;

                    //division
                case'/':
                    compteur=compteur+2;
                    temp=Double.parseDouble(tab[compteur]);
                    if(temp!=0.0)
                    valeur/=Double.parseDouble(tab[compteur]);
                    else
                        result.setText("Error!");
                    break;
                default:
                    result.setText("Error!");

            }
            if (temp != 0.0) {
                result.setText(Double.toString(valeur));
            } else {
                // erreur à retourner en cas de division par 0
                result.setText("ERROR!: DIV BY 0");
            }
        }



    }

}