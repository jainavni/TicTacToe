package com.example.avnijain.tictactoe;

import android.content.Context;
import android.widget.Button;



/**
 * Created by manishakhattar on 15/06/17.
 */

public class MyButton  extends android.support.v7.widget.AppCompatButton
{
    int player;

    public MyButton(Context context) {
        super(context);
        player = MainActivity.NO_PLAYER;
    }


    int getPlayer(){
        return  player;
    }

}
