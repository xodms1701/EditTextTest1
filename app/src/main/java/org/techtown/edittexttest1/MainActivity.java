package org.techtown.edittexttest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static org.techtown.edittexttest1.R.id.edit1;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText)findViewById(R.id.edit1);
        Button but0k=(Button)findViewById(R.id.but_ok);
        textResult=(TextView)findViewById(R.id.text_result);

        but0k.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name=edit1.getText().toString();
                textResult.setText("입력한 성명은 "+name+"입니다.");

            }
        });

    }
}
