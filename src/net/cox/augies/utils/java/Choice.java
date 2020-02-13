package net.cox.augies.utils.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Choice {
    static final Scanner sc = new Scanner(System.in);
    private String question;
    public int response;
    public String responseAsString;
    private ArrayList<String> options = new ArrayList<>();

    //Yes/No Question
    public Choice(String question){
        this.question = question;
        this.options.add("Yes");
        this.options.add("No");
        promptChoice();
    }

    public Choice(String question, String option1, String option2){
        this.question = question;
        this.options.add(option1);
        this.options.add(option2);
        promptChoice();
    }

    public Choice(String question, ArrayList<String>options){
        this.question = question;
        this.options = options;
        promptChoice();
    }

    public void promptChoice(){
        printOptions();
        response = Integer.parseInt(sc.nextLine())-1;
        responseAsString = options.get(response);
    }

    public void printOptions(){
        System.out.println(question);
        for(int i = 0; i < options.size(); i++){
            System.out.println((i+1) + ") " + options.get(i));
        }
    }
}
