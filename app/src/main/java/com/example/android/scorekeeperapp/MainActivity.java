package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int foulTeamA = 0;
    int cornerTeamA = 0;
    int freekickTeamA = 0;
    int yellowcardTeamA = 0;
    int redcardTeamA = 0;


    int scoreTeamB = 0;
    int foulTeamB = 0;
    int cornerTeamB = 0;
    int freekickTeamB = 0;
    int yellowcardTeamB = 0;
    int redcardTeamB = 0;

    TextView scoreView;
    TextView scoreView2;
    TextView scoreView3;
    TextView scoreView4;
    TextView scoreView5;
    TextView scoreView6;
    TextView scoreView7;
    TextView scoreView8;
    TextView scoreView9;
    TextView scoreView10;
    TextView scoreView11;
    TextView scoreView12;

    // References to GUI components.
    private Spinner teamA_spinner;
    private ImageView teamA_image;

    private Spinner teamB_spinner;
    private ImageView teamB_image;
    // Team names
    private final String[] teamA = {"Bayern Munchen", "Monaco", "Real Madrid", "Barcelona", "Atletico Madrid", "Leicester City", "Borussia Dortmund", "Juventus"};
    // Team image teamAIds
    // Both names and image teamAIds are in the same order
    private final int[] teamAIDs = {R.drawable.bayern, R.drawable.monaco,
            R.drawable.realmadridi, R.drawable.barcelona, R.drawable.atletico, R.drawable.leicester, R.drawable.bvb, R.drawable.juventus};

    // Team names
    private final String[] teamB = {"Bayern Munchen", "Monaco", "Real Madrid", "Barcelona", "Atletico Madrid", "Leicester City", "Borussia Dortmund", "Juventus"};
    // Team image teamAIds
    // Both names and image teamAIds are in the same order
    private final int[] teamBIDs = {R.drawable.bayern, R.drawable.monaco,
            R.drawable.realmadridi, R.drawable.barcelona, R.drawable.atletico, R.drawable.leicester, R.drawable.bvb, R.drawable.juventus};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the GUI components.
        this.teamA_spinner = (Spinner) findViewById(R.id.teamA_spinner);
        this.teamA_image = (ImageView) findViewById(R.id.teamA_image);

        this.teamB_spinner = (Spinner) findViewById(R.id.teamB_spinner);
        this.teamB_image = (ImageView) findViewById(R.id.teamB_image);

        // Create an array adapter and set it to the Spinner.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, teamA);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.teamA_spinner.setAdapter(adapter);

        // Set the message to default.
        this.teamA_spinner.setSelection(0);

        // Set item selected listener.
        this.teamA_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                teamA_image.setImageResource(teamAIDs[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, teamB);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.teamB_spinner.setAdapter(adapter2);

        // Set the message to default.
        this.teamB_spinner.setSelection(0);

        // Set itm selected listener.
        this.teamB_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                teamB_image.setImageResource(teamBIDs[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });
        scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView2 = (TextView) findViewById(R.id.team_a_foul);
        scoreView3 = (TextView) findViewById(R.id.team_Afreekick);
        scoreView4 = (TextView) findViewById(R.id.team_a_corner);
        scoreView5 = (TextView) findViewById(R.id.team_a_yellowcard);
        scoreView6 = (TextView) findViewById(R.id.team_a_redcard);
        scoreView7 = (TextView) findViewById(R.id.team_b_score);
        scoreView8 = (TextView) findViewById(R.id.team_b_foul);
        scoreView9 = (TextView) findViewById(R.id.team_Bfreekick);
        scoreView10 = (TextView) findViewById(R.id.team_b_corner);
        scoreView11 = (TextView) findViewById(R.id.team_b_yellowcard);
        scoreView12 = (TextView) findViewById(R.id.team_b_redcard);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int score) {
        scoreView2.setText(String.valueOf(score));
    }

    public void displayfreekickForTeamA(int score) {
        scoreView3.setText(String.valueOf(score));

    }

    public void displayCornerForTeamA(int score) {
        scoreView4.setText(String.valueOf(score));
    }

    public void displayyellowcardTeamA(int score) {
        scoreView5.setText(String.valueOf(score));
    }

    public void displayredcardTeamA(int score) {
        scoreView6.setText(String.valueOf(score));
    }

    public void displayGoalForTeamB(int score) {
        scoreView7.setText(String.valueOf(score));
    }

    public void displayFoulForTeamB(int score) {
        scoreView8.setText(String.valueOf(score));
    }

    public void displayfreekickTeamB(int score) {
        scoreView9.setText(String.valueOf(score));
    }

    public void displayCornerForTeamB(int score) {
        scoreView10.setText(String.valueOf(score));
    }

    public void displayyelowcardteamB(int score) {
        scoreView11.setText(String.valueOf(score));
    }

    public void displayredcardTeamB(int score) {
        scoreView12.setText(String.valueOf(score));
    }

    public void goalAdd_TeamA(View view) {
        scoreTeamA += 1;
        displayGoalForTeamA(scoreTeamA);
    }

    public void foulAdd_TeamA(View view) {
        foulTeamA += 1;
        displayFoulForTeamA(foulTeamA);
    }

    public void freekickAdd_TeamA(View view) {
        freekickTeamA += 1;
        displayfreekickForTeamA(freekickTeamA);
    }

    public void cornerAdd_TeamA(View view) {
        cornerTeamA += 1;
        displayCornerForTeamA(cornerTeamA);
    }

    public void yellowcardAdd_TeamA(View view) {
        yellowcardTeamA += 1;
        displayyellowcardTeamA(yellowcardTeamA);
    }

    public void redcardAdd_TeamA(View view) {
        redcardTeamA += 1;
        displayredcardTeamA(redcardTeamA);
    }


    public void goalMinus_TeamA(View view) {
        if (scoreTeamA == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA -= 1;
        displayGoalForTeamA(scoreTeamA);
    }

    public void foulMinus_TeamA(View view) {
        if (foulTeamA == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        foulTeamA -= 1;
        displayFoulForTeamA(foulTeamA);
    }

    public void freekickMinus_TeamA(View view) {
        if (freekickTeamA == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        freekickTeamA -= 1;
        displayfreekickForTeamA(freekickTeamA);
    }

    public void cornerMinus_TeamA(View view) {
        if (cornerTeamA == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        cornerTeamA -= 1;
        displayCornerForTeamA(cornerTeamA);
    }

    public void yellowcardMinus_TeamA(View view) {
        if (yellowcardTeamA == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        yellowcardTeamA -= 1;
        displayyellowcardTeamA(yellowcardTeamA);
    }

    public void redcardMinus_TeamA(View view) {
        if (redcardTeamA == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        redcardTeamA -= 1;
        displayredcardTeamA(redcardTeamA);
    }
    /*For Team B*/
    public void goalAdd_TeamB(View view) {
        scoreTeamB += 1;
        displayGoalForTeamB(scoreTeamB);
    }

    public void foulAdd_TeamB(View view) {
        foulTeamB += 1;
        displayFoulForTeamB(foulTeamB);
    }

    public void cornerAdd_TeamB(View view) {
        cornerTeamB += 1;
        displayCornerForTeamB(cornerTeamB);
    }

    public void freekickAdd_TeamB(View view) {
        freekickTeamB += 1;
        displayfreekickTeamB(freekickTeamB);
    }

    public void yellowcardAdd_TeamB(View view) {
        yellowcardTeamB += 1;
        displayyelowcardteamB(yellowcardTeamB);
    }

    public void redcardAdd_TeamB(View view) {
        redcardTeamB+= 1;
        displayredcardTeamB(redcardTeamB);
    }

    public void goalMinus_TeamB(View view) {
        if (scoreTeamB == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB -= 1;
        displayGoalForTeamB(scoreTeamB);
    }

    public void foulMinus_TeamB(View view) {
        if (foulTeamB == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        foulTeamB -= 1;
        displayFoulForTeamB(foulTeamB);
    }

    public void freekickMinus_TeamB(View view) {
        if (freekickTeamB == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        freekickTeamB -= 1;
        displayfreekickTeamB(freekickTeamB);
    }
    public void cornerMinus_TeamB(View view) {
        if (cornerTeamB == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        cornerTeamB -= 1;
        displayCornerForTeamB(cornerTeamB);
    }

    public void yellowcardMinus_TeamB(View view) {
        if (yellowcardTeamB == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        yellowcardTeamB -= 1;
        displayyelowcardteamB(yellowcardTeamB);
    }

    public void redcardMinus_TeamB(View view) {
        if (redcardTeamB == 0) {
            Toast.makeText(this, "It cannot be less than 0", Toast.LENGTH_SHORT).show();
            return;
        }
        redcardTeamB -= 1;
        displayredcardTeamB(redcardTeamB);
    }

    public void reset(View v) {
        scoreTeamA = 0;
        foulTeamA = 0;
        cornerTeamA = 0;
        freekickTeamA = 0;
        yellowcardTeamA = 0;
        redcardTeamA = 0;
        displayGoalForTeamA(scoreTeamA);
        displayFoulForTeamA(foulTeamA);
        displayfreekickForTeamA(freekickTeamA);
        displayCornerForTeamA(cornerTeamA);
        displayyellowcardTeamA(yellowcardTeamA);
        displayredcardTeamA(redcardTeamA);


        scoreTeamB = 0;
        foulTeamB = 0;
        cornerTeamB = 0;
        freekickTeamB = 0;
        yellowcardTeamB = 0;
        redcardTeamB = 0;
        displayGoalForTeamB(scoreTeamB);
        displayFoulForTeamB(foulTeamB);
        displayfreekickTeamB(freekickTeamB);
        displayCornerForTeamB(cornerTeamB);
        displayyelowcardteamB(yellowcardTeamB);
        displayredcardTeamB(redcardTeamB);


    }
}