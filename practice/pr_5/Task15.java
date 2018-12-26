import java.util.Scanner;

public class Task15 {

    public static  void recursion(int n)
    {
        if (n != 0)
        {
            System.out.print(n % 10 + " ");
            recursion(n / 10);

        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        recursion(n);
    }
}