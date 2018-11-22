package dn.akkudativ.gen;

import java.util.List;

public class Word {
	
	public String w = "";
	public List<Word> nextList;
	
	public Word(String w, List<Word> nextList) {
		this.w = w;
		this.nextList = nextList;
	}

}
