/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter");
                int a = scan.nextInt();
        System.out.println("Result");
        System.out.println(a+a*.15);
         }
}
