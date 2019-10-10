package com.muntiqa.graduationproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Searchpage extends AppCompatActivity {
    ListView listView;

    String[] fruitNames = {"Title: Android Programming","Title: Operating System Concepts"};
    int[] fruitImages = {R.drawable.operating,R.drawable.android,};
    String[] Author ={"Authors: O'Reilly","Authors: Abraham Silbershatz,Peter B.Galvin,Greg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchpage);

        //finding listview
        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


    }

    private class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return fruitImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.customlayout,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.fruits);
            TextView name2=view1.findViewById(R.id.hello);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(fruitNames[i]);
            image.setImageResource(fruitImages[i]);
            name2.setText(Author[i]);
            return view1;



        }
    }
}






