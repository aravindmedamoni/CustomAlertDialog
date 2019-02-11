package com.aravind.customalertdialog;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("can we wish you?")
                        .setTitle(Html.fromHtml("<font color='#FF7F27'>Alert Dialog</font>"))
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // HomeActivity.this.finish();
                                //
                                //finish();
                                Toast.makeText(MainActivity.this, "hii", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
                TextView nText = alert.getButton(DialogInterface.BUTTON_NEGATIVE);
                nText.setTextColor(Color.parseColor("#43BE31"));
                nText.setTextSize(18);
                TextView pText = alert.getButton(DialogInterface.BUTTON_POSITIVE);
                pText.setTextColor(Color.parseColor("#E8290B"));
                pText.setTextSize(18);
            }
        });


    }
}
