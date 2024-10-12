import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("введите число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//       int day = n / 86400;
//        int hour = (n - day * 86400 ) / 3600 ;
//        int  min = (n - day * 86400 - hour * 3600 ) / 60  ;
//        int sec = (n -  day * 86400 - hour * 3600 - min * 60)  ;

        int day =  n / 86400;
        int hour = n % 86400 / 3600;
        int  min = n % 3600 / 60;
        int sec =  n % 60;



        System.out.printf("а) Часы: %1$d \n", hour);
        System.out.printf("б) Минуты: %1$d \n", min);
        System.out.printf("в) Секунды: %1$d \n",  sec);


        }
    }
