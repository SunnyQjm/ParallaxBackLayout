package com.github.anzewei.sample;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.github.anzewei.parallaxbacklayout.ParallaxBack;
import com.github.anzewei.parallaxbacklayout.ParallaxHelper;
import com.github.anzewei.sample.basic.BackExtendsBaseActivity;

@ParallaxBack
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        ((TextView) findViewById(R.id.txt_content)).setText("This activity extends activity and has Parallax annotation");
        ((ToggleButton) findViewById(R.id.toggle)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    ParallaxHelper.enableParallaxBack(DetailActivity.this);
                else
                    ParallaxHelper.disableParallaxBack(DetailActivity.this);
            }
        });
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, NormalActivity.class);
        startActivity(intent);
    }
}
