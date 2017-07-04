package com.example.sam.rockpaperscissors;

import com.example.sam.rockpaperscissors.behaviours.Move;

import static com.example.sam.rockpaperscissors.behaviours.Move.PAPER;
import static com.example.sam.rockpaperscissors.behaviours.Move.ROCK;
import static com.example.sam.rockpaperscissors.behaviours.Move.SCISSORS;

/**
 * Created by Sam on 04/07/2017.
 */

public class Game {

    private Computer computer;

    public Game(){
        computer = new Computer();
    }

    public Computer getComputer() {
        return computer;
    }

    public String playGame(String playerMove, String computerMove){
        int winner = compareMoves(playerMove, computerMove);
        return displayWinner(winner);
    }

    public int compareMoves(String playerMove, String computerMove){
        if (playerMove == computerMove){
            return 0;
        }

        switch (playerMove){
            case "Rock" :
                return (computerMove == "Scissors" ? 1 : -1);
            case "Paper" :
                return (computerMove == "Rock" ? 1 : -1);
            case "Scissors":
                return (computerMove == "Paper" ? 1 : -1);
            default:
                return 0;
        }
    }

    public String displayWinner(int result){
        String outcome = null;
        switch (result){
            case 0:
                outcome =  "It's a draw";
                break;
            case 1:
                outcome = "Player wins";
                break;
            case -1:
                outcome = "Computer wins";
        }
        return outcome;
    }
}
