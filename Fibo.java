import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the term you'd like:");
        int n = sc.nextInt();
        int output = sequence(n);
        System.out.println("The " + n + " term of the Fibonacci sequence is "+ output +".");
    }

    static int sequence(int n) {
        /**
        *Generates terms of the Fibonacci sequence, essentially
        *the previous two terms together until it reaches the number of the 
        *term provided by the parameter.  Any parameter below 3 will output as 1
        *@param n the term of the sequence being searched for
        *@return the number at the nth term
        */
        int x = 1;
        int y = 1;
        int z = 1;
        while (n>2) {
            z = x + y;
            x = y;
            y = z;
            n--;
        }
        return z;
    }
}
