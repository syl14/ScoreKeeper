package com.example.jakab.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.jakab.scorekeeper.R;


public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    int penaltyFradi=0;
    int penaltyGyor=0;
    int redCardFradi=0;
    int redCardGyor=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayPenaltyFradi(0);
        displayRedCardFradi(0);
        displayPenaltyGyor(0);
        displayRedCardGyor(0);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void goal(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }

    public void displayPenaltyFradi(int pen) {
        TextView scoreView = (TextView) findViewById(R.id.penalty_fradi);
        scoreView.setText(String.valueOf(pen));
    }
    public void pen(View view){
        penaltyFradi=penaltyFradi+1;
        displayPenaltyFradi(penaltyFradi);
    }

    public void displayRedCardFradi(int redCardFradi) {
        TextView scoreView = (TextView) findViewById(R.id.red_fradi);
        scoreView.setText(String.valueOf(redCardFradi));
    }
    public void redfradi(View view){
        redCardFradi=redCardFradi+1;
        displayRedCardFradi(redCardFradi);
    }

    public void displayPenaltyGyor(int penb) {
        TextView scoreView = (TextView) findViewById(R.id.penalty_gyor);
        scoreView.setText(String.valueOf(penb));
    }
    public void penb(View view){
        penaltyGyor=penaltyGyor+1;
        displayPenaltyGyor(penaltyGyor);
    }
    public void goalb(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }

    public void displayRedCardGyor(int redgyor){
        TextView scoreView = (TextView) findViewById(R.id.red_gyor);
        scoreView.setText(String.valueOf(redgyor));
    }

    public void redgyor(View view){
        redCardGyor=redCardGyor+1;
        displayRedCardGyor(redCardGyor);
    }
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        penaltyFradi=0;
        penaltyGyor=0;
        redCardGyor=0;
        redCardFradi=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        displayRedCardGyor(redCardGyor);
        displayRedCardFradi(redCardFradi);
        displayPenaltyFradi(penaltyFradi);
        displayPenaltyGyor(penaltyGyor);
    }
}
