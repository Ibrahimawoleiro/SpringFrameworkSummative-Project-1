package com.company.Summative1AwoleiroIbrahim.model;

public class Quote {
    public int idCountOfQuote=0;
    String author;
    String quote;

    public Quote() {
    }

    public Quote(String author, String quote,int idCountOfQuote) {
        this.idCountOfQuote=idCountOfQuote;
        this.author = author;
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }


}








