package dn.akkudativ;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startWithAkku(View view) {
        startExam("akku");
    }

    public void startWithDativ(View view) {
        startExam("dativ");
    }

    public void startWithAkkuDativ(View view) {
        startExam("akkuDativ");
    }

    private void startExam(String examKind) {
        Intent startsExam = new Intent(this, ExamActivity.class);
        startsExam.putExtra("examKind", examKind);
        startActivity(startsExam);
    }

}
