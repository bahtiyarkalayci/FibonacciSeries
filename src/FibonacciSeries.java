import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the fibonacci's number");
        number=scanner.nextInt();
        int total=0;
        int n1=0,n2=1,n3;
        for (int i=0 ;i<=number;i++){

            n3=n1+n2;
            System.out.print(n1+" ");
            n1=n2;
            n2=n3;

        }
    }
}
