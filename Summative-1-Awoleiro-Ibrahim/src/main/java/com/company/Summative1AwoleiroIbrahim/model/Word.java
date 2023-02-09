package com.company.Summative1AwoleiroIbrahim.model;

public class Word {
    public static int idcount=0;

    public int id;
    public String word;
    public String definition;

    public Word() {
    }

    public Word(String word, String definition) {
        this.id = idcount++;
        this.word = word;
        this.definition = definition;
    }

    public int getIdWord() {
        return id;
    }

    public void setIdWord(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}