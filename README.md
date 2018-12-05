# Proyecto3
El siguiente proyecto fue desarrollado con Android Studio, se puede usar la versión 3.0 o una más reciente.
Se desarrollo en base a las API's de Android 6.0, ya que es una de las versiones que predominan el mercado actual de dispositivos móviles que cuentan con este sistema operativo.
Al ser desarrollado en Android Studio, usa mucho el lenguaje de Java con lo que es un proyecto que puede ser entendido por gran parte de los programadores, siendo Java uno de los lenguajes más usados en la actualidad.

## Propósito
El propósito de este proyecto es aprender los fundamento de la programación para dispositivos móviles.
Este proyecto en concreto implementa cosas como Campos de Texto, Respuestas múltiples y Botones; Text Views, Relative Layout y Linear Layout para la parte de la interfaz de la aplicación.
También como parte del Front End, se hacen uso de diversos eventos, tales como link y eventos en los botones; se hace uso de lo que se conoce como aplicación multiventana, para mostrar más contenido en una sola aplicación.
En cuanto al Back end, podemos ver cosas cómo llamadas a aplicaciones externas, tales como la aplicación para el correo electrónico o el explorador web; se hace uso de la llamada de datos desde Internet en el formato JSON.

![Una imagen cualquiera](https://github.com/FranciscoMan/Proyecto2/blob/master/preview.png "Muestra")

## Archivo de diseño XML
~~~
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <ImageView
                android:id="@+id/imageView"
                android:layout_width="match_parent"
                android:layout_height="150dp"
                android:contentDescription="TODO" app:srcCompat="@drawable/logo"/>

            <TextView
                android:id="@+id/pregunta1"
                style="@style/CategoryStyle"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#000000"/>

            <RelativeLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">

                <RadioGroup
                    android:id="@+id/rdgGrupoP1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_column="0"
                    android:layout_span="3"
                    android:checkedButton="@+id/rdbOne"
                    android:orientation="horizontal">
                    <RadioButton
                        android:id="@+id/rdbOne"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Nada" />

                    <RadioButton
                        android:id="@+id/rdbTwo"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Poco" />

                    <RadioButton
                        android:id="@+id/rdbThree"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Un porron" />
                </RadioGroup>
            </RelativeLayout>

            <TextView
                android:id="@+id/pregunta2"
                style="@style/CategoryStyle"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#000000"
                 />

            <RelativeLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">

                <RadioGroup
                    android:id="@+id/rdgGrupoP2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_column="0"
                    android:layout_span="3"
                    android:checkedButton="@+id/rdbOne"
                    android:orientation="horizontal">

                    <RadioButton
                        android:id="@+id/rdbOneP2"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Si" />

                    <RadioButton
                        android:id="@+id/rdbTwoP2"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="No" />
                </RadioGroup>
            </RelativeLayout>

            <TextView
                android:id="@+id/pregunta3"
                style="@style/CategoryStyle"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#000000"
                 />

            <RelativeLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">

                <RadioGroup
                    android:id="@+id/rdgGrupoP3"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_column="0"
                    android:layout_span="3"
                    android:checkedButton="@+id/rdbOne"
                    android:orientation="horizontal">

                    <RadioButton
                        android:id="@+id/rdbOneP3"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Si"
                        android:focusedByDefault="true"/>

                    <RadioButton
                        android:id="@+id/rdbTwoP3"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="No" />
                </RadioGroup>
            </RelativeLayout>

            <TextView
                android:id="@+id/pregunta4"
                style="@style/CategoryStyle"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#000000"
                 />

            <RelativeLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">

                <EditText
                    android:id="@+id/p4Text"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:ems="20"
                    android:inputType="textPersonName"
                    android:text="$$"
                    android:focusedByDefault="false"/>

            </RelativeLayout>

            <TextView
                android:id="@+id/pregunta5"
                style="@style/CategoryStyle"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#000000"
                 />

            <RelativeLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">

                <RadioGroup
                    android:id="@+id/rdgGrupoP5"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_column="0"
                    android:layout_span="3"
                    android:checkedButton="@+id/rdbOne"
                    android:orientation="horizontal">

                    <RadioButton
                        android:id="@+id/rdbOneP5"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Si" />

                    <RadioButton
                        android:id="@+id/rdbTwoP5"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="No" />
                </RadioGroup>
            </RelativeLayout>

            <TextView
                android:id="@+id/pregunta6"
                style="@style/CategoryStyle"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#000000"
                 />

            <RelativeLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">

                <RadioGroup
                    android:id="@+id/rdgGrupoP6"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_column="0"
                    android:layout_span="3"
                    android:checkedButton="@+id/rdbOne"
                    android:orientation="horizontal">

                    <RadioButton
                        android:id="@+id/rdbOneP6"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Poca" />

                    <RadioButton
                        android:id="@+id/rdbTwoP6"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Indescriptible" />

                    <RadioButton
                        android:id="@+id/rdbThreeP6"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="Un orgasmo tantrico" />
                </RadioGroup>
            </RelativeLayout>

            <TextView
                android:id="@+id/pregunta7"
                style="@style/CategoryStyle"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#000000"
                 />

            <RelativeLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">

                <EditText
                    android:id="@+id/p7Text"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:ems="20"
                    android:inputType="textPersonName"
                    android:text="..."
                    android:focusedByDefault="false"/>
            </RelativeLayout>

            <TextView
                android:id="@+id/pregunta8"
                style="@style/CategoryStyle"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#000000"
                 />

            <CheckBox
                android:id="@+id/ps4"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Play Station 4" />

            <CheckBox
                android:id="@+id/xbox"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Xbox One" />

            <CheckBox
                android:id="@+id/Pc"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="PC" />

            <TextView
                style="@style/CategoryStyle"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="#000000"
                android:text="Gracias por contestar!!" />

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:onClick="enviar_Encuesta"
                android:text="Enviar Encuesta"
                android:textSize="20sp" />
        </LinearLayout>
    </ScrollView>

</android.support.constraint.ConstraintLayout>
~~~

## Archivo de ejecucion Java
~~~
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


~~~


# Recurso de valores
***
## Colors.xml
~~~
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="colorPrimary">#008577</color>
    <color name="colorPrimaryDark">#00574B</color>
    <color name="colorAccent">#D81B60</color>
</resources>
~~~
***
## Dimen.xml
~~~
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <dimen name="list_item_height">88dp</dimen>
    <!-- Default screen margins, per the Android Design guidelines. -->
    <dimen name="activity_horizontal_margin">16dp</dimen>
    <dimen name="activity_vertical_margin">16dp</dimen>

</resources>
~~~
***
## Strings.xml
~~~
<resources>
    <string name="app_name">Feedback</string>
    <string name="p1">¿Qué tan interesado se siente en el nuevo Ciberpunk 2077? </string>
    <string name="p2">¿Tiene conocimiento de su fecha de salida?</string>
    <string name="p3">¿Planea comprar el videojuego?</string>
    <string name="p4">¿Cuándo gasta al año en videojuegos?</string>
    <string name="p5">¿Asistió a la conferencia E3 de este año?</string>
    <string name="p6">¿Qué tanta es su emoción por el nuevo Ciberpunk 2077?</string>
    <string name="p7">Personalmente, ¿qué espera del título?</string>
    <string name="p8">¿Qué Plataformas usted tiene?</string>
</resources>
~~~
***
## Styles.xml
~~~
<resources>

    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>

    <style name="MyTheme" parent="Base.Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">#009688</item>
        <item name="colorPrimaryDark">#00796B</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>

    <style name="CategoryStyle">
        <item name="android:layout_width">match_parent</item>
        <item name="android:layout_height">@dimen/list_item_height</item>
        <item name="android:gravity">center_vertical</item>
        <item name="android:padding">16dp</item>
        <item name="android:textColor">@android:color/white</item>
        <item name="android:textStyle">bold</item>
        <item name="android:textAppearance">?android:textAppearanceMedium</item>
    </style>
</resources>
~~~


***
## preguntas.json
~~~

Las preguntas para esta práctica las obtenemos de la siguiente liga: https://api.myjson.com/bins/oozqi, ahí están hospedadas las preguntas para poder usarlas en cualquier momento

{"Preguntas":[{"Pregunta":1,"Texto":"¿Que tan interesado se siente en el nuevo Ciberpunk 2077?"},{"Pregunta":2,"Texto":"¿Tiene conocimiento de su fecha de salida?"},{"Pregunta":3,"Texto":"¿Planea comprar el videojuego?"},{"Pregunta":4,"Texto":"¿Cuanto gasta al año en videojuegos?"},{"Pregunta":5,"Texto":"¿Asistio a la conferencia E3 de este año?"},{"Pregunta":6,"Texto":"¿Que tanta es su emocion por el nuevo Ciberpunk 2077?"},{"Pregunta":7,"Texto":"Personalmente, ¿Que espera del titulo?"},{"Pregunta":8,"Texto":"¿Que plataformas usted tiene?"}]}
~~~


