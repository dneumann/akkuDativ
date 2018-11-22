package dn.akkudativ.gen;

import java.util.List;

public class Verb extends Word {
	
	public String secondPartOfVerb = "";

	public Verb(String w, List<Word> nextList) {
		super(w, nextList);
	}
	
	public Verb(String w, String secondPartOfVerb, List<Word> nextList) {
		super(w, nextList);
		this.secondPartOfVerb = secondPartOfVerb;
	}
}
