package com.example.shinelon.callphone;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText e_number;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        //        Button call1=(Button) this.findViewById(R.id.call);
//        call1.setOnClickListener(this);
    }

    @SuppressLint("WrongViewCast")
    public void start_call(View v){
            e_number = this.findViewById( R.id.call_number );
            String number =e_number.getText().toString().trim();
            if(TextUtils.isEmpty(number)){
                //界面友好提示
                Toast toast =Toast.makeText(MainActivity.this,"请输入号码！",Toast.LENGTH_SHORT);
                toast.show();//执行显示
                return;
            }
            Intent intent =new Intent();
            intent.setAction(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+number));
            startActivity(intent);//开启动作
    }

}
