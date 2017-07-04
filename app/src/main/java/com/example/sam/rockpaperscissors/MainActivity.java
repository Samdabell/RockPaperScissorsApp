package com.example.sam.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sam.rockpaperscissors.behaviours.Move;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    Button rock;
    Button paper;
    Button scissors;
    TextView computerMove;
    TextView winner;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rock = (Button)findViewById(R.id.rock_button);
        paper = (Button)findViewById(R.id.paper_button);
        scissors = (Button)findViewById(R.id.scissors_button);
        computerMove = (TextView)findViewById(R.id.computerMove);
        winner = (TextView)findViewById(R.id.winner);


    }

    public void onButtonClick(View button){
        Game game = new Game();
        String playerMove = null;
        if (button == rock){
            playerMove = Move.ROCK.getType();
        }
        if (button == paper){
            playerMove = Move.PAPER.getType();
        }
        if (button == scissors){
            playerMove = Move.SCISSORS.getType();
        }
        String cMove = game.getComputer().getMove();
        computerMove.setText("Computer played " + cMove);
        winner.setText(game.playGame(playerMove, cMove));

    }
}
