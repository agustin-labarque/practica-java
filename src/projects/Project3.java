package projects;

import java.util.Scanner;

public class Project3 {
    public static boolean isPrime(int x) {

        //chequeo si el primo es 0 o 1
        if (x < 2) {
            return false;
        } else {
            int half = x / 2;
            for (int i = 2; i <= half; i++) { //reviso todos los numeros hasta la mitad
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero y se determinara si este es primo: ");
        int number = scanner.nextInt();

        boolean prime = isPrime(number);
        if(prime){
            System.out.println("el numero " + number + " es primo");
        }else{
            System.out.println("el numero " + number + " no es primo");
        }
    }
}
