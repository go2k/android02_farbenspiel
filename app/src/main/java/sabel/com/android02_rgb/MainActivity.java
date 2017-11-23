package sabel.com.android02_rgb;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tvHerzlichWillkommen;
    private Button btnRot;
    private Button btnBeenden;
    private Button btnGelb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        tvHerzlichWillkommen = findViewById(R.id.tv_herzlichwillkommen);
        btnRot = findViewById(R.id.btn_rot);
        btnBeenden = findViewById(R.id.btn_beenden);
        btnGelb = findViewById(R.id.btn_gelb);

        btnBeenden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnGelb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnBeenden.getRootView().setBackgroundColor(Color.YELLOW);
            }
        });


        btnRot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnBeenden.getRootView().setBackgroundColor(Color.RED);
            }
        });

    }

}
