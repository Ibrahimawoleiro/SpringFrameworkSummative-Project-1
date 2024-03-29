package com.company.Summative1AwoleiroIbrahim.controller;
import com.company.Summative1AwoleiroIbrahim.model.Quote;
import com.company.Summative1AwoleiroIbrahim.model.Word;
import com.company.Summative1AwoleiroIbrahim.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.*;
@RestController
public class apiController {
    List<Quote> quoteList = new ArrayList<>();
    List<Answer> answerList = new ArrayList<>();
    List<Word> wordList;
    private static int  idCounterOfAnswer=0;
    public apiController() {
        int idCounterOfQuote=0;

        wordList = new ArrayList<>();
        Word word1 = new Word("Homework", "schoolwork that a student is required to do at home.");
        Word word2 = new Word("Student", "a person who is studying at a school or college.");
        Word word3 = new Word("Musician", "a person who plays a musical instrument, especially as a profession, or is musically talented.");
        Word word4 = new Word("Running", "the action or movement of a runner.");
        Word word5 = new Word("Table", "a piece of furniture with a flat top and one or more legs, providing a level surface on which objects may be placed, and that can be used for such purposes as eating, writing, working, or playing games.");
        Word word6 = new Word("Boy", "a male child or adolescent.");
        Word word7 = new Word("Girl", "a female child or adolescent.");
        Word word8 = new Word("Book", "a written or printed work consisting of pages glued or sewn together along one side and bound in covers.");
        Word word9 = new Word("Chair", "a separate seat for one person, typically with a back and four legs.");
        Word word10 = new Word("Biology", "the study of living organisms, divided into many specialized fields that cover their morphology, physiology, anatomy, behavior, origin, and distribution.");

        wordList.add(word1);
        wordList.add(word2);
        wordList.add(word3);
        wordList.add(word4);
        wordList.add(word5);
        wordList.add(word6);
        wordList.add(word7);
        wordList.add(word8);
        wordList.add(word9);
        wordList.add(word10);

        quoteList.add(new Quote("Nelson Mandela", "The greatest glory in living lies not in never falling, but in rising every time we fall.", idCounterOfQuote++));
        quoteList.add(new Quote("Walt Disney", "The way to get started is to quit talking and begin doing.", idCounterOfQuote++));
        quoteList.add(new Quote("Steve Jobs", "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking.", idCounterOfQuote++));
        quoteList.add(new Quote("Eleanor Roosevelt", "If life were predictable it would cease to be life, and be without flavor.", idCounterOfQuote++));
        quoteList.add(new Quote("Oprah Winfrey", "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough.", idCounterOfQuote++));
        quoteList.add(new Quote("James Cameron", "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success.", idCounterOfQuote++));
        quoteList.add(new Quote("John Lennon", "Life is what happens when you're busy making other plans.", idCounterOfQuote++));
        quoteList.add(new Quote("Mother Teresa", "Spread love everywhere you go. Let no one ever come to you without leaving happier.", idCounterOfQuote++));
        quoteList.add(new Quote("Franklin D. Roosevelt", "When you reach the end of your rope, tie a knot in it and hang on.", idCounterOfQuote++));
        quoteList.add(new Quote("Margaret Mead", "Always remember that you are absolutely unique. Just like everyone else.", idCounterOfQuote++));
        quoteList.add(new Quote("Robert Louis Stevenson", "Don't judge each day by the harvest you reap but by the seeds that you plant.", idCounterOfQuote++));

        answerList.add(new Answer("What are two things you can never eat for breakfast?", "Lunch and Dinner", idCounterOfAnswer++));
        answerList.add(new Answer("What is always coming but never arrives? ", "Tomorrow", idCounterOfAnswer++));
        answerList.add(new Answer("What gets wetter the more it dries? ", "A towel", idCounterOfAnswer++));
        answerList.add(new Answer("What can be broken but never held?", "A promise", idCounterOfAnswer++));
        answerList.add(new Answer("What word is spelled incorrectly in every single dictionary?", "Incorrectly", idCounterOfAnswer++));
        answerList.add(new Answer("What is it that lives if it is fed, and dies if you give it a drink?", "Fire", idCounterOfAnswer++));
        answerList.add(new Answer("What never asks a question but gets answered all the time?", "Your cellphone", idCounterOfAnswer++));
        answerList.add(new Answer("What word would you use to describe a man who does not have all his fingers on one hand?", "Normal, because people usually have half their fingers on one hand.", idCounterOfAnswer++));
        answerList.add(new Answer("What goes up but never ever comes down?", "Your age", idCounterOfAnswer++));
        answerList.add(new Answer("What can one catch that is not thrown?", "A cold", idCounterOfAnswer++));


    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote() {
        return quoteList.get(new Random().nextInt(quoteList.size()));
    }

    @RequestMapping(value ="/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getWord () {
        return wordList.get(new Random().nextInt(wordList.size()));
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer postAnswer(@RequestBody Answer answer) {
        answer.setId(idCounterOfAnswer++);
        answerList.add(answer);
        return answer;
    }
}
