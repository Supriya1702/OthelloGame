package com.supriya.othellogame;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends Activity implements View.OnClickListener {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        iv=findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.othello);
        Button start_game = (Button)findViewById(R.id.home_start_game);
        start_game.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i= new Intent(view.getContext(), GameActivity.class);
        startActivity(i);

    }
}