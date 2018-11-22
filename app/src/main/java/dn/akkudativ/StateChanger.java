package dn.akkudativ;

import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StateChanger {

    private int index = 0;



    private List<State> list(State... states) {
        return new ArrayList<>(Arrays.asList(states));
    }


}
