//import java.lang.*;
//import java.util.Scanner;

public class StringDemo {
    public  static  void main(String[] args){

        String sentence = "this is hard ";
        int position = sentence.indexOf("hard");
        System.out.println("The word \"hard\" starts at index" + position);

        sentence = sentence.substring(0,position) + "easy!";
        sentence = sentence.toUpperCase();
        System.out.println( "The changed string :");
        System.out.println(sentence);

    }

}
