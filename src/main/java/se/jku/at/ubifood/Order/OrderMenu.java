package se.jku.at.ubifood.Order;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import se.jku.at.ubifood.MainMenu;
import se.jku.at.ubifood.R;

/**
 * Created by Thomas on 04.11.2016.
 */

public class OrderMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_menu);
        initButtonActions();
    }

    private void initButtonActions() {
        findViewById(R.id.bPrint).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(OrderMenu.this)
                        .setTitle("Shopping list printed.")
                        .setPositiveButton("Ok?", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                                /* User clicked OK so do some stuff */
                            }
                        })
                        .setNegativeButton("Ok!", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                                /* User clicked Cancel so do some stuff */
                            }
                        })
                        .show();
            }
        });

        (findViewById(R.id.bAll)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OrderMenu.this, OrderWeek.class));
            }
        });
    }
}