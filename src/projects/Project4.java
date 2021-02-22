package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static projects.Project3.isPrime;

public class Project4 {

    public static List<Integer> firstPrimes(int x){

        List<Integer> primes = new ArrayList<Integer>();

        for(int i=0; i<=x; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero y se mostraran todos los primos menores que este: ");
        int number = scanner.nextInt();

        List<Integer> primes = firstPrimes(number);

        for(int i=0; i<primes.size(); i++){
            System.out.println(primes.get(i));
        }
    }
}
