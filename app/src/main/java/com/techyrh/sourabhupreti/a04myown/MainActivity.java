package com.techyrh.sourabhupreti.a04myown;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast (View view){
        switch (view.getId()){

            case R.id.error:
                Toasty.error(this,"error",Toast.LENGTH_SHORT).show();
                break;
                case R.id.success:
                Toasty.success(this,"Success",Toast.LENGTH_SHORT).show();
                break;
            case R.id.hardwork:
                Toasty.info(this,"hardwork",Toast.LENGTH_SHORT).show();
                break;
            case R.id.easydo:
                Toasty.warning(this,"error",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imagework:
                Toasty.normal(this,"error",Toast.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_cast)).show();
                break;
        }
    }
}
