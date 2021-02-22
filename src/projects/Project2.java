package projects;

import java.util.Scanner;

public class Project2 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero a multiplicar: ");
        int start = scanner.nextInt();

        System.out.println("ingrese el limite: ");
        int limit = scanner.nextInt();

        for(int i=1; ; i++){
            int number = start*i;
            if(number > limit){
                break;
            }else{
                System.out.println(start*i);
            }
        }
    }
}
