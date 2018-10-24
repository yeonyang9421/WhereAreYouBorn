package kr.co.woobi.imyeon.whereareyouborn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    Button seoul, beijing, paris, vencouver, cebu, guam;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        seoul=(Button)findViewById(R.id.seoul);
        beijing=(Button)findViewById(R.id.beijing);
        paris=(Button)findViewById(R.id.paris);
        cebu=(Button)findViewById(R.id.cebu);
        vencouver=(Button)findViewById(R.id.vencouver);
        guam=(Button)findViewById(R.id.guam);
        checkBox=(CheckBox)findViewById(R.id.checkBox);
    }

    public  void onClickSelectCity(View view){
        int id=view.getId();

        String text="You were born in  "+ ((Button)view).getText().toString();

        switch (id){
            case R.id.seoul:
              textView2.setText(text);
              break;
            case R.id.beijing:
                textView2.setText(text);
                break;
            case R.id.vencouver:
                textView2.setText(text);
                break;
            case R.id.paris:
                textView2.setText(text);
                break;
            case R.id.cebu:
                textView2.setText(text);
                break;
            case R.id.guam:
                textView2.setText(text);
                break;
        }
        //Toast.makeText(view.getContext(),text, Toast.LENGTH_SHORT).show();
    }
    public  void onIsChecked(View view){
        int id=view.getId();
        if(((CheckBox)view).isChecked()) {
            textView2.setText("YOU WERE BORN......");
        }
        else{
            textView2.setText("What city do you want to live?");
         }
    }

}
