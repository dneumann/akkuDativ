package dn.akkudativ.gen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SentenceGenerator {

	private List<Word> firstWords = new ArrayList<>();
	private List<Word> nounsMasc = new ArrayList<>();
	private List<Word> nounsFem = new ArrayList<>();
	private List<Word> nounsIt = new ArrayList<>();
	private List<Word> verbs = new ArrayList<>();
	private List<Word> akkus = new ArrayList<>();
	private List<Word> dativs = new ArrayList<>();
	private List<Word> lastWordsMasc = new ArrayList<>();
	private List<Word> lastWordsFem = new ArrayList<>();
	private List<Word> lastWordsIt = new ArrayList<>();

	public SentenceGenerator() {
		firstWords.add(new Word("Der", nounsMasc));
		firstWords.add(new Word("Ein", nounsMasc));
//		firstWords.add(new Word("Mein", nounsMasc));
//		firstWords.add(new Word("Dein", nounsMasc));
//		firstWords.add(new Word("Sein", nounsMasc));

		firstWords.add(new Word("Die", nounsFem));
		firstWords.add(new Word("Eine", nounsFem));
//		firstWords.add(new Word("Meine", nounsFem));
//		firstWords.add(new Word("Deine", nounsFem));
//		firstWords.add(new Word("Seine", nounsFem));

		firstWords.add(new Word("Das", nounsIt));
		firstWords.add(new Word("Ein", nounsIt));
//		firstWords.add(new Word("Mein", nounsIt));
//		firstWords.add(new Word("Dein", nounsIt));
//		firstWords.add(new Word("Sein", nounsIt));

		nounsMasc.add(new Word("Junge", verbs));
		nounsMasc.add(new Word("Hund", verbs));
        nounsMasc.add(new Word("Elefant", verbs));
        nounsMasc.add(new Word("Alligator", verbs));
        nounsMasc.add(new Word("Englischlehrer", verbs));

		nounsFem.add(new Word("Frau", verbs));
		nounsFem.add(new Word("Katze", verbs));
        nounsFem.add(new Word("Schlange", verbs));
        nounsFem.add(new Word("Kuh", verbs));
        nounsFem.add(new Word("Biene", verbs));

		nounsIt.add(new Word("Mädchen", verbs));
		nounsIt.add(new Word("Erdferkel", verbs));
		nounsIt.add(new Word("Meerschweinchen", verbs));
        nounsIt.add(new Word("Alien", verbs));
        nounsIt.add(new Word("Schaf", verbs));

		addAkkus();
		addDativs();

		lastWordsMasc.add(new Word("Opa", null));
		lastWordsMasc.add(new Word("Hund", null));
		lastWordsMasc.add(new Word("Tiger", null));
		lastWordsMasc.add(new Word("Löwen", null));
		lastWordsMasc.add(new Word("Elefanten", null));

        lastWordsFem.add(new Word("Maus", null));
        lastWordsFem.add(new Word("Kuh", null));
        lastWordsFem.add(new Word("Ratte", null));
		lastWordsFem.add(new Word("Katze", null));
		lastWordsFem.add(new Word("Ente", null));
		lastWordsFem.add(new Word("Engländerin", null));
		lastWordsFem.add(new Word("Schlange", null));

		lastWordsIt.add(new Word("Schwein", null));
		lastWordsIt.add(new Word("Meerschweinchen", null));
		lastWordsIt.add(new Word("Mädchen", null));
		lastWordsIt.add(new Word("Huhn", null));
		lastWordsIt.add(new Word("Hündchen", null));
		lastWordsIt.add(new Word("Krokodil", null));
        lastWordsIt.add(new Word("Seeungeheuer", null));
        lastWordsIt.add(new Word("Schaf", null));

	}

	private void addAkkus() {
		verbs.add(new Verb("sah", akkus));
		verbs.add(new Verb("traf", akkus));
		verbs.add(new Verb("hörte", akkus));
		verbs.add(new Verb("fragte", akkus));
		verbs.add(new Verb("beleidigte", akkus));
		verbs.add(new Verb("beschimpfte", akkus));
		verbs.add(new Verb("zeigte auf", akkus));
		verbs.add(new Verb("überholte", akkus));
		verbs.add(new Verb("erzählte über", akkus));
		verbs.add(new Verb("kletterte auf", akkus));
		verbs.add(new Verb("sprang über", akkus));
		verbs.add(new Verb("sprang auf", akkus));
		verbs.add(new Verb("flog über", akkus));
		verbs.add(new Verb("schaute auf", akkus));
		verbs.add(new Verb("freute sich über", akkus));
		verbs.add(new Verb("belog", akkus));
		verbs.add(new Verb("verarschte", akkus));
		verbs.add(new Verb("lachte über", akkus));
		verbs.add(new Verb("überlistete", akkus));
        verbs.add(new Verb("verfolgte", akkus));
        verbs.add(new Verb("beneidete", akkus));
        verbs.add(new Verb("stolperte über", akkus));
        verbs.add(new Verb("lief um", "herum", akkus));
        verbs.add(new Verb("hielt", "fest", akkus));
        verbs.add(new Verb("log", "an", akkus));
        verbs.add(new Verb("ließ", "tanzen", akkus));
        verbs.add(new Verb("bat", "um Rat", akkus));
        verbs.add(new Verb("besiegte", "im Armdrücken", akkus));
        verbs.add(new Verb("brachte", "zum Lachen", akkus));
        verbs.add(new Verb("brüllte", "an", akkus));

		akkus.add(new Akku("den", lastWordsMasc, "Bestimmter Artikel"));
		akkus.add(new Akku("einen", lastWordsMasc, "Unbestimmter Artikel"));
//		akkus.add(new Akku("meinen", lastWordsMasc, "Possessivpronomen von 'ich'"));
//		akkus.add(new Akku("deinen", lastWordsMasc, "Possessivpronomen von 'du'"));
//		akkus.add(new Akku("ihren", lastWordsMasc, "Possessivpronomen von 'sie'"));
//		akkus.add(new Akku("seinen", lastWordsMasc, "Possessivpronomen von 'er'"));
//		akkus.add(new Akku("unseren", lastWordsMasc, "Possessivpronomen von 'wir'"));
//		akkus.add(new Akku("euren", lastWordsMasc, "Possessivpronomen von 'ihr'"));

		akkus.add(new Akku("die", lastWordsFem, "Bestimmter Artikel"));
		akkus.add(new Akku("eine", lastWordsFem, "Unbestimmter Artikel"));
//		akkus.add(new Akku("meine", lastWordsFem, "Possessivpronomen von 'ich'"));
//		akkus.add(new Akku("deine", lastWordsFem, "Possessivpronomen von 'du'"));
//		akkus.add(new Akku("ihre", lastWordsFem, "Possessivpronomen von 'sie'"));
//		akkus.add(new Akku("seine", lastWordsFem, "Possessivpronomen von 'er'"));
//		akkus.add(new Akku("unsere", lastWordsFem, "Possessivpronomen von 'wir'"));
//		akkus.add(new Akku("eure", lastWordsFem, "Possessivpronomen von 'ihr'"));

		akkus.add(new Akku("das", lastWordsIt, "Bestimmter Artikel"));
		akkus.add(new Akku("ein", lastWordsIt, "Unbestimmter Artikel"));
//		akkus.add(new Akku("mein", lastWordsIt, "Possessivpronomen von 'ich'"));
//		akkus.add(new Akku("dein", lastWordsIt, "Possessivpronomen von 'du'"));
//		akkus.add(new Akku("ihr", lastWordsIt, "Possessivpronomen von 'sie'"));
//		akkus.add(new Akku("sein", lastWordsIt, "Possessivpronomen von 'er'"));
//		akkus.add(new Akku("unser", lastWordsIt, "Possessivpronomen von 'wir'"));
//		akkus.add(new Akku("euer", lastWordsIt, "Possessivpronomen von 'ihr'"));

        akkus.add(new Akku("ihn", null, "Akku oder Dat von 'er'"));
        akkus.add(new Akku("ihn", null, "Akku oder Dat von 'er'"));
        akkus.add(new Akku("ihn", null, "Akku oder Dat von 'er'"));
        akkus.add(new Akku("ihn", null, "Akku oder Dat von 'er'"));
		akkus.add(new Akku("sie", null, "Akku oder Dat von 'sie'"));
		akkus.add(new Akku("mich", null, "Akku oder Dat von 'ich'"));
		akkus.add(new Akku("dich", null, "Akku oder Dat von 'du'"));

	}

	private void addDativs() {
        verbs.add(new Verb("bedankte sich bei", dativs));
        verbs.add(new Verb("gehorchte", dativs));
        verbs.add(new Verb("hatte Angst vor", dativs));
        verbs.add(new Verb("gratulierte", dativs));
        verbs.add(new Verb("gefiel", dativs));
        verbs.add(new Verb("gefiel", dativs));
        verbs.add(new Verb("lag auf", dativs));
        verbs.add(new Verb("saß auf", dativs));
        verbs.add(new Verb("schwebte über", dativs));
        verbs.add(new Verb("ruhte sich auf", "aus", dativs));
        verbs.add(new Verb("spielte mit", dativs));
		verbs.add(new Verb("lief mit", "weg", dativs));
        verbs.add(new Verb("lief", "hinterher", dativs));
        verbs.add(new Verb("gab", "ein Geschenk", dativs));
        verbs.add(new Verb("schenkte", "einen Computer", dativs));
        verbs.add(new Verb("schrieb", "einen Brief", dativs));
        verbs.add(new Verb("warf", "einen Ball zu", dativs));
        verbs.add(new Verb("nahm", "eine Blume weg", dativs));
        verbs.add(new Verb("spielte", "den Ball zu", dativs));
        verbs.add(new Verb("hörte", "nie zu", dativs));
        verbs.add(new Verb("traute", "nicht", dativs));
        verbs.add(new Verb("befahl", "zu singen", dativs));
        verbs.add(new Verb("machte", "einen Heiratsantrag", dativs));
        verbs.add(new Verb("erfüllte", "einen Wunsch", dativs));
        verbs.add(new Verb("erzählte", "einen Witz", dativs));
        verbs.add(new Verb("zeigte", "die Zunge", dativs));
        verbs.add(new Verb("brachte", "nur Blödsinn bei", dativs));
        verbs.add(new Verb("sagte", "alles vor", dativs));
        verbs.add(new Verb("half", "beim Spicken", dativs));
        verbs.add(new Verb("las", "aus einem Buch vor", dativs));
        verbs.add(new Verb("flüsterte", "etwas zu", dativs));
        verbs.add(new Verb("versteckte sich hinter", dativs));
        verbs.add(new Verb("ging zu", dativs));
        verbs.add(new Verb("stand vor", dativs));
        verbs.add(new Verb("stand neben", dativs));
        verbs.add(new Verb("sagte zu", ": \"Buh!\"", dativs));

		dativs.add(new Dativ("dem", lastWordsMasc, "Bestimmter Artikel"));
		dativs.add(new Dativ("einem", lastWordsMasc, "Unbestimmter Artikel"));
		//dativs.add(new Dativ("meinem", lastWordsMasc, "Possessivpronomen von 'ich'"));

		dativs.add(new Dativ("der", lastWordsFem, "Bestimmter Artikel"));
		dativs.add(new Dativ("einer", lastWordsFem, "Unbestimmter Artikel"));
		//dativs.add(new Dativ("meiner", lastWordsFem, "Possessivpronomen von 'ich'"));

        dativs.add(new Dativ("dem", lastWordsIt, "Bestimmter Artikel"));
        dativs.add(new Dativ("einem", lastWordsIt, "Unbestimmter Artikel"));
        //dativs.add(new Dativ("meinem", lastWordsIt, "Possessivpronomen von 'ich'"));

        dativs.add(new Dativ("ihm", null, "Akku oder Dat von 'er'"));
        dativs.add(new Dativ("ihm", null, "Akku oder Dat von 'er'"));
        dativs.add(new Dativ("ihm", null, "Akku oder Dat von 'er'"));
        dativs.add(new Dativ("ihm", null, "Akku oder Dat von 'er'"));
        dativs.add(new Dativ("ihr", null, "Akku oder Dat von 'sie'"));
        dativs.add(new Dativ("mir", null, "Akku oder Dat von 'ich'"));
        dativs.add(new Dativ("dir", null, "Akku oder Dat von 'du'"));

	}

	public Sentence getSentence() {
		randomize();
		List<Word> wordList = new ArrayList<>();
		addWord(firstWords.get(0), wordList);
		return new Sentence(wordList);
	}

	public Sentence getAkkuSentence() {
		while (true) {
			Sentence s = getSentence();
			if (s.akkuDativ instanceof Akku) {
				return s;
			}
		}
	}
	
	public Sentence getDativSentence() {
		while (true) {
			Sentence s = getSentence();
			if (s.akkuDativ instanceof Dativ) {
				return s;
			}
		}
	}

	private void randomize() {
		Collections.shuffle(firstWords);
		Collections.shuffle(nounsMasc);
		Collections.shuffle(nounsFem);
		Collections.shuffle(nounsIt);
		Collections.shuffle(verbs);
		Collections.shuffle(akkus);
		Collections.shuffle(dativs);
		Collections.shuffle(lastWordsMasc);
		Collections.shuffle(lastWordsFem);
		Collections.shuffle(lastWordsIt);
	}

	private void addWord(Word word, List<Word> sentence) {
		sentence.add(word);
		if (word.nextList != null) {
			addWord(word.nextList.get(0), sentence);
		}
	}

}
