package com.idlehex66gmail.blackout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int grid[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    int gridx = 0; // left to right
    int gridy = 0; // top to bottom

    // build global objects
    private Button oneone;
    private Button onetwo;
    private Button onethree;
    private Button onefour;

    private Button twoone;
    private Button twotwo;
    private Button twothree;
    private Button twofour;

    private Button threeone;
    private Button threetwo;
    private Button threethree;
    private Button threefour;

    private Button fourone;
    private Button fourtwo;
    private Button fourthree;
    private Button fourfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign global objects
        oneone =  findViewById(R.id.grid11);
        onetwo =  findViewById(R.id.grid12);
        onethree =  findViewById(R.id.grid13);
        onefour =  findViewById(R.id.grid14);

        twoone =  findViewById(R.id.grid21);
        twotwo =  findViewById(R.id.grid22);
        twothree =  findViewById(R.id.grid23);
        twofour =  findViewById(R.id.grid24);

        threeone =  findViewById(R.id.grid31);
        threetwo =  findViewById(R.id.grid32);
        threethree =  findViewById(R.id.grid33);
        threefour =  findViewById(R.id.grid34);

        fourone =  findViewById(R.id.grid41);
        fourtwo =  findViewById(R.id.grid42);
        fourthree =  findViewById(R.id.grid43);
        fourfour =  findViewById(R.id.grid44);

    }

    public void winCondition (){
        /** for next loop checking the grid for any red blocks.
         * if a red block is found turn boolean to false
         * if no red blocks are found boolean stays true
         * on true boolean player wins.
         *
         * boolean win = true;
         * for (int y = 0; y>3; y++) {
         *  for (int x = 0; x>3; x++) {
         *      if grid[gridy][gridx] == 1 {win = false}
         *  }
         * }
         *
         * if win == true then {toast "you win", play again?}
         *  ---------------- copy code
         *  //Put up the Yes/No message box
         *AlertDialog.Builder builder = new AlertDialog.Builder(this);
         *builder
         *.setTitle("Erase hard drive")
         *.setMessage("Are you sure?")
         *.setIcon(android.R.drawable.ic_dialog_alert)
         *.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
         *--public void onClick(DialogInterface dialog, int which) {
         *Yes button clicked, do something *Toast.makeText(YesNoSampleActivity.this, "Yes button pressed",
         *Toast.LENGTH_SHORT).show();
         *}
         *})
         *.setNegativeButton("No", null)						//Do nothing on no
         *.show();
         *-- Continue code after the Yes/No dialog
         *-- ....
         * ------------------------
         * play again true setboard ();
         * play again false exit app.
         *
         */
    }

    public void flipTiles() {
        //flip clicked tile
        if (grid[gridy][gridx] == 0) {

            // match the grid to the xml object
            if (gridy == 0 && gridx == 0) {
                oneone.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 0 && gridx == 1) {
                onetwo.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 0 && gridx == 2) {
                onethree.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 0 && gridx == 3) {
                onefour.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 1 && gridx == 0) {
                twoone.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 1 && gridx == 1) {
                twotwo.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 1 && gridx == 2) {
                twothree.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 1 && gridx == 3) {
                twofour.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 2 && gridx == 0) {
                threeone.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 2 && gridx == 1) {
                threetwo.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 2 && gridx == 2) {
                threethree.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 2 && gridx == 3) {
                threefour.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 3 && gridx == 0) {
                fourone.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 3 && gridx == 1) {
                fourtwo.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 3 && gridx == 2) {
                fourthree.setBackgroundColor(Color.parseColor("#ff0000"));
            } else if (gridy == 3 && gridx == 3) {
                fourfour.setBackgroundColor(Color.parseColor("#ff0000"));
            }
        } else {

            // match the grid to the xml object
            if (gridy == 0 && gridx == 0) {
                oneone.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 0 && gridx == 1) {
                onetwo.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 0 && gridx == 2) {
                onethree.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 0 && gridx == 3) {
                onefour.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 1 && gridx == 0) {
                twoone.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 1 && gridx == 1) {
                twotwo.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 1 && gridx == 2) {
                twothree.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 1 && gridx == 3) {
                twofour.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 2 && gridx == 0) {
                threeone.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 2 && gridx == 1) {
                threetwo.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 2 && gridx == 2) {
                threethree.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 2 && gridx == 3) {
                threefour.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 3 && gridx == 0) {
                fourone.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 3 && gridx == 1) {
                fourtwo.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 3 && gridx == 2) {
                fourthree.setBackgroundColor(Color.parseColor("#D6D7D7"));
            } else if (gridy == 3 && gridx == 3) {
                fourfour.setBackgroundColor(Color.parseColor("#D6D7D7"));
            }
        }
    }

    public void changeTile () {
        if (grid[gridy][gridx] == 1) {
            grid[gridy][gridx] = 0;
        } else {
            grid[gridy][gridx] = 1;
        }
    }

    public void flipRight(){
        gridx++;
        changeTile ();
        flipTiles();
        gridx--;
    }
    public void flipLeft(){
        gridx--;
        changeTile ();
        flipTiles();
        gridx++;
    }
    public void flipTop(){
        gridy--;
        changeTile ();
        flipTiles();
        gridy++;

    }
    public void flipBottom(){
        gridy++;
        changeTile ();
        flipTiles();
        gridy--;

    }


    /** button reaction for the grid */
    public void clickMe11(View view) {
        gridx = 0;
        gridy = 0;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipBottom();

        winCondition();

    }

    public void clickMe12(View view) {
        gridx = 1;
        gridy = 0;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipLeft();
        flipBottom();

        winCondition();
    }

    public void clickMe13(View view) {
        gridx = 2;
        gridy = 0;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipLeft();
        flipBottom();

        winCondition();
    }

    public void clickMe14(View view) {
        gridx = 3;
        gridy = 0;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipLeft();
        flipBottom();

        winCondition();
    }

    public void clickMe21(View view) {
        gridx = 0;
        gridy = 1;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipBottom();
        flipTop();

        winCondition();
    }

    public void clickMe22(View view) {
        gridx = 1;
        gridy = 1;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipLeft();
        flipBottom();
        flipTop();

        winCondition();
    }

    public void clickMe23(View view) {
        gridx = 2;
        gridy = 1;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipLeft();
        flipBottom();
        flipTop();

        winCondition();
    }

    public void clickMe24(View view) {
        gridx = 3;
        gridy = 1;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipLeft();
        flipBottom();
        flipTop();

        winCondition();
    }

    public void clickMe31(View view) {
        gridx = 0;
        gridy = 2;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipBottom();
        flipTop();

        winCondition();
    }

    public void clickMe32(View view) {
        gridx = 1;
        gridy = 2;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipLeft();
        flipBottom();
        flipTop();

        winCondition();
    }

    public void clickMe33(View view) {
        gridx = 2;
        gridy = 2;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipLeft();
        flipBottom();
        flipTop();

        winCondition();
    }

    public void clickMe34(View view) {
        gridx = 3;
        gridy = 2;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipLeft();
        flipBottom();
        flipTop();

        winCondition();
    }

    public void clickMe41(View view) {
        gridx = 0;
        gridy = 3;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipTop();

        winCondition();
    }

    public void clickMe42(View view) {
        gridx = 1;
        gridy = 3;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipLeft();
        flipTop();

        winCondition();
    }

    public void clickMe43(View view) {
        gridx = 2;
        gridy = 3;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipRight();
        flipLeft();
        flipTop();

        winCondition();
    }

    public void clickMe44(View view) {
        gridx = 3;
        gridy = 3;
        changeTile ();
        flipTiles();
        // flip adjacent blocks.
        flipLeft();
        flipTop();

        winCondition();
    }

}
