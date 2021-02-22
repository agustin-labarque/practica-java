package projects;

import java.util.Scanner;

public class project1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese cuantos numeros pares quiere mostrar: ");
        int limit = scanner.nextInt();

        for(int i=1; i<=limit; i++){
            System.out.println(i*2);
        }
    }
}
