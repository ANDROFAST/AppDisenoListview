package com.androidmorefast.pc.appdiseniolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by pc on 27/03/2017.
 */

public class GestionarAdapter extends BaseAdapter {
    String[] resultado;
    int[] imgId;
    Context contexto;

    private static LayoutInflater inflater= null;
    public GestionarAdapter (MainActivity mainActivity,String[]progNombreLista,int[]progImg) {
        resultado = progNombreLista;
        contexto = mainActivity;
        imgId = progImg;
        inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

          }
    @Override
        public int getCount(){
           return resultado.length;
        }
    @Override
        public  Object getItem(int posicion) {
            return posicion;
        }
    @Override
       public  long  getItemId(int posicion) {
        return posicion;
        }
    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int posicion, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View fila;
        fila = inflater.inflate(R.layout.lista_frutas, null);
        holder.tv=(TextView) fila.findViewById(R.id.textView);
        holder.img=(ImageView) fila.findViewById(R.id.imgFrutas);
        holder.tv.setText(resultado[posicion]);
        holder.img.setImageResource(imgId[posicion]);
        fila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(contexto, "Seleccionaste "+resultado[posicion], Toast.LENGTH_LONG).show();
            }
        });
        return fila;
    }

}
