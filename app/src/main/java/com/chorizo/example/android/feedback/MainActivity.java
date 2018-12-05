package com.chorizo.example.android.feedback;


import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RadioGroup p1;
    private RadioGroup p2;
    private RadioGroup p3;
    private RadioGroup p5;
    private RadioGroup p6;
    private String pR1="";
    private String pR2="";
    private String pR3="";
    private String pR5="";
    private String pR6="";


    private String[] preguntas = new String[8];
    private static final String USGS_REQUEST_URL =
            "https://api.myjson.com/bins/oozqi";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FeedbackAsyncTask task = new FeedbackAsyncTask();
        task.execute(USGS_REQUEST_URL);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = (RadioGroup) findViewById(R.id.rdgGrupoP1);
        p2 = (RadioGroup) findViewById(R.id.rdgGrupoP2);
        p3 = (RadioGroup) findViewById(R.id.rdgGrupoP3);
        p5 = (RadioGroup) findViewById(R.id.rdgGrupoP5);
        p6 = (RadioGroup) findViewById(R.id.rdgGrupoP6);
        //grupo 1
        p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                if (checkedId == R.id.rdbOne){
                    pR1 ="Nada";
                }else if (checkedId == R.id.rdbTwo){
                    pR1 ="Poco";
                }else if (checkedId == R.id.rdbThree){
                    pR1 ="Un Porron";
                }
            }

        });
        //grupo 2
        p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                if (checkedId == R.id.rdbOneP2){
                    pR2 ="Si";
                }else if (checkedId == R.id.rdbTwoP2){
                    pR2 ="No";
                }
            }

        });
        //grupo 3
        p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                if (checkedId == R.id.rdbOneP3){
                    pR3 ="Si";
                }else if (checkedId == R.id.rdbTwoP3){
                    pR3 ="No";
                }
            }

        });

        //grupo 5
        p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                if (checkedId == R.id.rdbOneP5){
                    pR5 ="Si";
                }else if (checkedId == R.id.rdbTwoP5){
                    pR5 ="No";
                }
            }

        });

        //grupo 6
        p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                if (checkedId == R.id.rdbOneP6){
                    pR6 ="Poco";
                }else if (checkedId == R.id.rdbTwoP6){
                    pR6 ="Indescriptible";
                }else if (checkedId == R.id.rdbThreeP6){
                    pR6 ="Un orgasmo tantrico";
                }
            }

        });
    }



    void enviar_Encuesta(View v) throws IOException {
        String correo ="Gracias por contestar! :)";
        correo=correo+"\n";

        CheckBox ps4 = findViewById(R.id.ps4);
        CheckBox xbox = findViewById(R.id.xbox);
        CheckBox Pc = findViewById(R.id.Pc);
        //P1
        correo = correo +getResources().getString(R.string.p1)+"\n";
        correo = correo +pR1+"\n";
        //P2
        correo = correo +getResources().getString(R.string.p2)+"\n";
        correo = correo +pR2+"\n";
        //P3
        correo = correo +getResources().getString(R.string.p3)+"\n";
        correo = correo +pR3+"\n";
        //P4
        correo = correo +getResources().getString(R.string.p4)+"\n";
        correo = correo +getP4()+"\n";
        //p5
        correo = correo +getResources().getString(R.string.p5)+"\n";
        correo = correo +pR5+"\n";
        //p6
        correo = correo +getResources().getString(R.string.p6)+"\n";
        correo = correo +pR6+"\n";
        //p7
        correo = correo +getResources().getString(R.string.p7)+"\n";
        correo = correo +getP7()+"\n";
        //p8
        correo = correo +getResources().getString(R.string.p8)+"\n";

        if(ps4.isChecked()){
            correo = correo +"Play Station 4"+"\n";
        }
        if(xbox.isChecked()){
            correo = correo +"Xbox One"+"\n";
        }
        if(Pc.isChecked()){
            correo = correo +"Pc"+"\n";
        }

        File internalStorageDir = getFilesDir();

        File enc = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "Encueesta.txt");


        // Create file output stream
        FileOutputStream fos = new FileOutputStream(enc,false);
        // Write a line to the file
        fos.write(correo.getBytes());
        // Close the file output stream
        fos.close();

        Uri path = Uri.fromFile(enc);
        mail(path);

    }

    private void mail(Uri b){
        Intent intent = new Intent(Intent.ACTION_SEND);
        //intent.setData(Uri.parse("mailto:"));
        intent.setType("vnd.android.cursor.dir/email");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Encuesta Ciberpunk 2077");
        intent.putExtra(Intent.EXTRA_STREAM, b);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(intent , "Send email..."));
        }else{
            alerta("No se ha podido acceder a las aplicaciones de calendario");
        }
    }

    public void alerta(String cadena) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setMessage(cadena);
        dialogBuilder.setCancelable(true).setTitle("Error");
        dialogBuilder.create().show();
    }

    @NonNull
    private String getP7(){
        EditText ed = findViewById(R.id.p7Text);
        return ed.getText().toString();
    }

    @NonNull
    private String getP4(){
        EditText ed = findViewById(R.id.p4Text);
        return ed.getText().toString();
    }


    private void updateUi(ArrayList<String> quakes){
        // Find a reference to the {@link ListView} in the layout

        TextView aux = findViewById(R.id.pregunta1);
        aux.setText(quakes.get(0));

        aux = findViewById(R.id.pregunta2);
        aux.setText(quakes.get(1));

        aux = findViewById(R.id.pregunta3);
        aux.setText(quakes.get(2));

        aux = findViewById(R.id.pregunta4);
        aux.setText(quakes.get(3));

        aux = findViewById(R.id.pregunta5);
        aux.setText(quakes.get(4));

        aux = findViewById(R.id.pregunta6);
        aux.setText(quakes.get(5));

        aux = findViewById(R.id.pregunta7);
        aux.setText(quakes.get(6));

        aux = findViewById(R.id.pregunta8);
        aux.setText(quakes.get(7));



    }

    private class FeedbackAsyncTask extends AsyncTask<String, Void, ArrayList<String> > {

        protected ArrayList<String> doInBackground(String... urls) {
            // Don't perform the request if there are no URLs, or the first URL is null.
            if (urls.length < 1 || urls[0] == null) {
                return null;
            }

            //aqui se hace el merequetengue
            // Create a fake list of earthquake locations.
            ArrayList<String> preguntas = QueryUtils.extractPreguntas(urls[0]);

            return preguntas;
        }

        protected void onPostExecute(ArrayList<String> result) {
            // If there is no result, do nothing.
            if (result == null) {
                return;
            }

            updateUi(result);
        }


    }


}
