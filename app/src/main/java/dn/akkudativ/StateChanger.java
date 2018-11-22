package dn.akkudativ;

import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import dn.akkudativ.gen.Sentence;
import dn.akkudativ.gen.SentenceGenerator;

public class StateChanger {

    private int index = 0;
    private int examLength;
    private String examKind = "";
    private SentenceGenerator sentenceGenerator = new SentenceGenerator();
    private Sentence currentSentence;

    public void startNewExam(String examKind) {
        this.examKind = examKind;
        examLength = 20;
    }

    public List<State> checkAnswer(String answer) {

        State correctAkkuDativ = State.create("textView_correctAkkuDativ", TextView.class)
                .with("setText", currentSentence.akkuDativ.w);

        int color = 0;
        if (currentSentence.akkuDativ.w.equals(answer.trim())) {
            color = Color.GREEN;
        } else {
            color = Color.RED;
        }
        State answerColor = State.create("editText_akkuDativ", EditText.class)
                .with("setTextColor", color);

        State buttonCheck = State.create("button_check", Button.class)
                .with("setEnabled", false);
        State buttonNext = State.create("button_next", Button.class)
                .with("setEnabled", true);

        return list(correctAkkuDativ, answerColor, buttonCheck, buttonNext);
    }

    public List<State> getNextSentence() {

        if (index >= examLength) {
            return new ArrayList<>();
        }
        index++;

        if ("akku".equals(examKind)) {
            currentSentence = sentenceGenerator.getAkkuSentence();
        } else if ("dativ".equals(examKind)) {
            currentSentence = sentenceGenerator.getDativSentence();
        } else {
            currentSentence = sentenceGenerator.getSentence();
        }

        State correctAkkuDativ = State.create("textView_correctAkkuDativ", TextView.class)
                .with("setText", "");
        State emptyAnswer = State.create("editText_akkuDativ", EditText.class)
                .with("setText", "")
                .with("setTextColor", Color.BLACK);

        State hint = State.create("textView_hint", TextView.class)
                .with("setText", "(" + index + "/" + examLength + ")  " + currentSentence.akkuDativ.hint);
        State begin = State.create("textView_sentenceBegin", TextView.class)
                .with("setText", currentSentence.beginning);
        State end = State.create("textView_sentenceEnd", TextView.class)
                .with("setText", currentSentence.ending);
        State buttonCheck = State.create("button_check", Button.class)
                .with("setEnabled", true);
        State buttonNext = State.create("button_next", Button.class)
                .with("setEnabled", false);

        return list(hint, begin, end, correctAkkuDativ, emptyAnswer, buttonCheck, buttonNext);
    }

    public List<State> showResults(int correctAnswers, int allAnswers) {
        State textView = State.create("textView_correctAnswers", TextView.class)
                .with("setText", correctAnswers + " von " + allAnswers);

        String grade = cumputeGrade((float) correctAnswers / (float) allAnswers * 100);
        State gradeState = State.create("textView_grade", TextView.class)
                .with("setText", grade);
        return list(textView, gradeState);
    }

    private String cumputeGrade(float percent) {
        if (percent == 100)
            return "1+";
        else if (percent >= 95 && percent < 100)
            return "1";
        else if (percent >= 90 && percent < 95)
            return "1-";
        else if (percent >= 85 && percent < 90)
            return "2+";
        else if (percent >= 80 && percent < 85)
            return "2";
        else if (percent >= 75 && percent < 80)
            return "2-";
        else if (percent >= 70 && percent < 75)
            return "3+";
        else if (percent >= 65 && percent < 70)
            return "3";
        else if (percent >= 60 && percent < 65)
            return "3-";
        else if (percent >= 55 && percent < 60)
            return "4+";
        else if (percent >= 50 && percent < 55)
            return "4";
        else if (percent >= 20 && percent < 50)
            return "5";
        else
            return "6";
    }

    private List<State> list(State... states) {
        return new ArrayList<>(Arrays.asList(states));
    }

    public int getNumberOfQuestions() {
        return examLength;
    }
}
