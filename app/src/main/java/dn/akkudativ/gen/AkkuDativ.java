package dn.akkudativ.gen;

import java.util.List;

public class AkkuDativ extends Word {

	public String hint;

	public AkkuDativ(String w, List<Word> nextList, String helpingHint) {
		super(w, nextList);
		this.hint = helpingHint;
	}

}
