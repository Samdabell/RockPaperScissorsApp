package com.example.sam.rockpaperscissors;

import com.example.sam.rockpaperscissors.behaviours.Move;

import java.util.Random;

/**
 * Created by Sam on 04/07/2017.
 */

public class Computer {
    public String getMove(){
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index].getType();
    }
}
