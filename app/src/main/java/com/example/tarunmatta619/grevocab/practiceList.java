package com.example.tarunmatta619.grevocab;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class practiceList extends AppCompatActivity {

    GridLayout setGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_list);
        setGrid=(GridLayout) findViewById(R.id.setgrid);
        for(int i=0;i<setGrid.getChildCount();i++){

            final CardView cv=(CardView)setGrid.getChildAt(i);
            final int finalI = i;

            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i1=new Intent(practiceList.this,PracticeScreen.class);
                    i1.putExtra("setvalue",finalI);
                    startActivity(i1);
                    //Toast.makeText(PracticeScreen.this, "yooo!!", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
