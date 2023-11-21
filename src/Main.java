import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       double z = Math.pow(x,y);
       if (x%2==0 || y %3 ==0){
           System.out.println(x == y );
       }
       else if  (z > Integer.MAX_VALUE || z < Integer.MIN_VALUE){
            System.out.println("Результат слишком большой");
        }
        else if (x%2==0 && x%3==0) {
       System.out.println(z);
       }

    }
}