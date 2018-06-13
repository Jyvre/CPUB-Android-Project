package com.nogstudio.cpu_b.Controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.nogstudio.cpu_b.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_start );
    }

    public void runBenchmark(View view) {
        Toast.makeText( this,"Run benchmark",Toast.LENGTH_SHORT ).show();
    }
}
