import java.util.Scanner;

public class entradaDeDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        //char x;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        //x = sc.next() .charAt(0);

        System.out.println("Você digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
        
    }
}
