package com.androidmorefast.pc.appdiseniolistview;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ListView lista;
    Context context;

    ArrayList prgmNombre;
    public static int [] prgmImages={R.drawable.banana,R.drawable.coco,R.drawable.manzana,R.drawable.pera,R.drawable.sandia,R.drawable.uva};
    public static String [] progNombreLista={"BANANA","COCO","MANZANA","PERA","SANDIA","UVA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;

        lista=(ListView) findViewById(R.id.lvListado);
        lista.setAdapter(new GestionarAdapter(this, progNombreLista,prgmImages));

    }

}