package nyc.c4q.alizinha;

import java.util.Scanner;

/**
 * Created by c4q-Allison on 3/16/15.
 */



public class Fibonacci {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("put the number : ");

        int userAsk = input.nextInt();
        System.out.println(fibonacci(userAsk));

    }



    public static int fibonacci(int answer) {

        if (answer == 1) {
            return 0;
        }
        else if (answer==2) {
            return 1;
        }


        return (fibonacci(answer-1)+fibonacci(answer-2));

    }

}
