package com.jesseniah.wishtodolist;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends Activity {

    Button b1,b2;
    EditText e1;
    String text,u;
    String un[]={"","","","","","","","","","","","","","",""};
    String pas;
    Cursor c;
    int i=0;
    String s,sqlquery;
    static LinkedList<String> exampleList = new LinkedList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        e1 = (EditText) findViewById(R.id.editText1);




        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                text = e1.getText().toString();

                // todo is our database name AND
//                SQLiteDatabase db = openOrCreateDatabase("todo", Context.MODE_WORLD_WRITEABLE, null);

                text = "'" + text + "'";

//                s = "CREATE TABLE if not exists TODOLIST" + " (" + "list" + " VARCHAR(100)" + ");";
//                db.execSQL(s);
//
//                // QUERY TO INSERT THE DATA INTO TABLE
//                sqlquery = "INSERT INTO TODOLIST" + " VALUES" + "(" + text + ");";
//                db.execSQL(sqlquery);
                e1.setText("");

                Toast.makeText(getApplicationContext(), "TASK ADDED IN LIST", Toast.LENGTH_SHORT).show();

                exampleList.add(text);
            }
        });


        b2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                // 04-14 13:37:33.559 3600-3606/? I/AndroidRuntime: VM exiting with result code 1, cleanup skipped.


                startActivity(new Intent(getApplicationContext(), second_activity.class));
            }

        });



    }
}