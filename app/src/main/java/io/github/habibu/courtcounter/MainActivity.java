package io.github.habibu.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //int score constants = 0;
    public static int SCORE_TEAM_A = 0;
    public static int SCORE_TEAM_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        /*
         Methods to add icon to ActionBar
         */
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.icon_basketball);

        setContentView(R.layout.activity_main);
    }
    public void addThreeForTeamA(View view)
    {
         SCORE_TEAM_A = SCORE_TEAM_A + 3;
        displayForTeamA(SCORE_TEAM_A);
    }
    public void addTwoForTeamA(View view)
    {
        SCORE_TEAM_A = SCORE_TEAM_A + 2;
        displayForTeamA(SCORE_TEAM_A);
    }
    public void addOneForTeamA(View view)
    {
        SCORE_TEAM_A = SCORE_TEAM_A + 1;
        displayForTeamA(SCORE_TEAM_A);
    }

    protected void displayForTeamA(int SCORE_TEAM_A)
    {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(SCORE_TEAM_A));
    }
    public void addThreeForTeamB(View view)
    {
        SCORE_TEAM_B = SCORE_TEAM_B + 3;
        displayForTeamB(SCORE_TEAM_B);
    }
    public void addTwoForTeamB(View view)
    {
        SCORE_TEAM_B = SCORE_TEAM_B + 2;
        displayForTeamB(SCORE_TEAM_B);
    }
    public void addOneForTeamB(View view)
    {
        SCORE_TEAM_B = SCORE_TEAM_B + 1;
        displayForTeamB(SCORE_TEAM_B);
    }

    protected void displayForTeamB(int SCORE_TEAM_B)
    {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        textView.setText(String.valueOf(SCORE_TEAM_B));
    }
    //Button to reset the scores to zero
    public void resetScores(View view)
    {
        SCORE_TEAM_A = 0;
        SCORE_TEAM_B = 0;
        displayForTeamA(SCORE_TEAM_A);
        displayForTeamB(SCORE_TEAM_B);
    }


}
