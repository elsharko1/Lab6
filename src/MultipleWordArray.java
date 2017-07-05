import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mark on 7/3/2017.
 */
public class MultipleWordArray {
    static ArrayList<String> words = new ArrayList<String>();

    public static void evalWords(){
        System.out.println("Please enter a few words");
        Scanner scan2 = new Scanner(System.in);
        String a = "";
        a = scan2.nextLine();
        char b = ' ';
        int start = 0;
        for(int i = 0;i< a.length();i++){

            if(a.charAt(i)== b){
                words.add(a.substring(start,i));
                start = i;
            }
            if(i==a.length()-1){
                words.add(a.substring(start));
            }
        }
        System.out.println(words);
        System.out.println(words.get(1));
    }

    public static void main(String[] args){
        evalWords();
    }

}
