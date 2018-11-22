package dn.akkudativ.gen;

import java.util.List;

public class Sentence {

	public String beginning = "";
	public AkkuDativ akkuDativ;
	public String ending = "";
	
	public Sentence(List<Word> wordList) {
		boolean passedAkkuDativ = false;
		String lastPart = "";
		for (Word word : wordList) {
			if (word instanceof Verb) {
				lastPart = ((Verb)word).secondPartOfVerb;
			}
			if (word instanceof AkkuDativ) {
				akkuDativ = (AkkuDativ) word;
				passedAkkuDativ = true;
			} else if (!passedAkkuDativ) {
				beginning += word.w + " ";
			} else if (passedAkkuDativ) {
				ending += word.w + " ";
			}
		}
		ending = (ending + lastPart).trim() + ".";
	}
}
