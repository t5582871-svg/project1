package ru.qaguru;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf(get_massage());
        System.out.printf("What is your name? %n");
    }
    private static String get_massage() {
        return "Hello QA GURU!!!!";
    }
}