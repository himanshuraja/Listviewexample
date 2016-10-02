package com.himanshusharmahs974gmail.listviewexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button mascbutton,mdescbutton;
    private ListView mNameListView;
    private List<String> stringList;
    private ArrayAdapter stringAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sort_list);
        mascbutton=(Button)findViewById(R.id.asc_button);
        mdescbutton=(Button)findViewById(R.id.desc_button);
        mNameListView=(ListView)findViewById(R.id.name_list);

        stringList=new ArrayList<String>();
        stringList.add("POKEMON");
        stringList.add("Pikachu");
        stringList.add("rhychu");
        stringList.add("charmendous");
        stringList.add("bulbasore");
        stringList.add("jiglipuff");
        stringList.add("squaltle");
        stringList.add("Ash");
        stringAdapter=new ArrayAdapter<String>(this,R.layout.sort_list_item,stringList);
        mNameListView.setAdapter(stringAdapter);
        mascbutton.setOnClickListener(this);
        mdescbutton.setOnClickListener(this);




    }

public static Comparator<String> StringAscComparator=new Comparator<String>() {
    @Override
    public int compare(String t1, String t2) {
       String stringName1=t1;
        String stringName2=t2;


        return stringName1.compareToIgnoreCase(stringName2);
    }
};
public static Comparator<String> StringDescComparator=new Comparator<String>() {
    @Override
    public int compare(String s, String t1) {
        String stringName1=s;
        String stringName2=t1;
        return stringName2.compareToIgnoreCase(stringName1);


    }
};
private class StringAdapter extends ArrayAdapter<String>{
    private List<String> strModel;
    public StringAdapter(Context context,int textViewResourceId,    List<String> strModel){


      super(context,textViewResourceId,strModel);
        this.strModel=strModel;

    }
    public View getView(int position , View converView, ViewGroup parent){
        View view=converView;
        SurfaceHolder holder=null;
        if ( view==null){
            view=View.inflate(MainActivity.this,R.layout.sort_list_item,null);
            holder=new SurfaceHolder() {
                @Override
                public void addCallback(Callback callback) {

                }

                @Override
                public void removeCallback(Callback callback) {

                }

                @Override
                public boolean isCreating() {
                    return false;
                }

                @Override
                public void setType(int i) {

                }

                @Override
                public void setFixedSize(int i, int i1) {

                }

                @Override
                public void setSizeFromLayout() {

                }

                @Override
                public void setFormat(int i) {

                }

                @Override
                public void setKeepScreenOn(boolean b) {

                }

                @Override
                public Canvas lockCanvas() {
                    return null;
                }

                @Override
                public Canvas lockCanvas(Rect rect) {
                    return null;
                }

                @Override
                public void unlockCanvasAndPost(Canvas canvas) {

                }

                @Override
                public Rect getSurfaceFrame() {
                    return null;
                }

                @Override
                public Surface getSurface() {
                    return null;
                }
            }


        }


    }


}




}
