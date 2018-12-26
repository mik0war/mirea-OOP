import java.util.Scanner;

public class Task13 {

    public static  void recursion()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a != 0)
        {
            System.out.print(a + " ");
            sc.nextInt();
            recursion();
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}
