package src.main;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số:");
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (n>0){
            sum = sum+n;
            n--;
        }
        System.out.println(sum);
    }
}
