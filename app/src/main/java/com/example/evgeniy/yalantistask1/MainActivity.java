package com.example.evgeniy.yalantistask1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViev1;
    TextView textViev2;
    TextView textViev3;
    TextView textViev4;
    TextView textViev5;
    TextView textViev6;
    TextView textViev7;
    TextView textViev8;
    TextView textViev9;
    TextView textViev10;
    TextView textViev11;
    ImageView imageViewRecycler;


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViev1 = (TextView) findViewById(R.id.textView1);
        textViev2 = (TextView) findViewById(R.id.textView2);
        textViev3 = (TextView) findViewById(R.id.textView3);
        textViev4 = (TextView) findViewById(R.id.textView4);
        textViev5 = (TextView) findViewById(R.id.textView5);
        textViev6 = (TextView) findViewById(R.id.textView6);
        textViev7 = (TextView) findViewById(R.id.textView7);
        textViev8 = (TextView) findViewById(R.id.textView8);
        textViev9 = (TextView) findViewById(R.id.textView9);
        textViev10 = (TextView) findViewById(R.id.textView10);
        textViev11 = (TextView) findViewById(R.id.textView11);
        imageViewRecycler = (ImageView) findViewById(R.id.imageViewRecycle);

        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(MainActivity.this, view.getClass().getSimpleName(), Toast.LENGTH_LONG);
                toast.show();
            }

        };

        textViev1.setOnClickListener(onClickListener);
        textViev2.setOnClickListener(onClickListener);
        textViev3.setOnClickListener(onClickListener);
        textViev4.setOnClickListener(onClickListener);
        textViev5.setOnClickListener(onClickListener);
        textViev6.setOnClickListener(onClickListener);
        textViev7.setOnClickListener(onClickListener);
        textViev7.setOnClickListener(onClickListener);
        textViev8.setOnClickListener(onClickListener);
        textViev9.setOnClickListener(onClickListener);
        textViev10.setOnClickListener(onClickListener);
        textViev11.setOnClickListener(onClickListener);
       // imageViewRecycler.setOnClickListener(onClickListener);





        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        String[] myDataset = {"http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png", "http://i.imgur.com/DvpvklR.png"};

      //  mRecyclerView.setHasFixedSize(true);



        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

      //  int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.view_margin);
       // mRecyclerView.addItemDecoration(new SpacesItemDecoration(spacingInPixels));

        mAdapter = new MyRecyclerAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);


    }


}
