package dn.akkudativ;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResultsActivity extends AppCompatActivity {

    private StateChanger stateChanger = new StateChanger();
    private ViewChanger viewChanger = new ViewChanger();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Bundle extras = getIntent().getExtras();
        int correctAnswers = extras.getInt("correctAnswers");
        int allAnswers = extras.getInt("allAnswers");

        viewChanger.applyNewStates(stateChanger.showResults(correctAnswers, allAnswers), this);

    }

}
