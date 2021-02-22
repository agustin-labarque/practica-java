package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project5 {

    public static boolean checkNumberDigits(int i, int repetitions, int number){
        int count = 0;
        int division = 10;
        int aux = i;
        while(true){
            int result = aux%division;
            if(aux < division && aux == 0){
                return false;
            }else {
                if (result == number) {
                    count++;
                    if (repetitions == count) {
                        return true;
                    }
                }
                aux = aux / 10;
            }
        }
    }

    public static List<Integer> firstNumbers(int quantity, int repetitions, int number){

        List<Integer> numbers = new ArrayList<Integer>();
        int i = 1;

        while(numbers.size() < quantity){

            if(checkNumberDigits(i, repetitions, number)){
                numbers.add(i);
            }

            i++;
        }

        return numbers;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que quiere mostrar: ");
        int quantity = scanner.nextInt();

        System.out.println("Ingrese la cantidad de numeros que quiere que se repita el numero a elegir: ");
        int repetitions = scanner.nextInt();

        System.out.println("Ingrese el numero: ");
        int number = scanner.nextInt();

        if(number > 9){
            System.out.println("el numero debe estar entre 0 y 9");
            return;
        }

        List<Integer> numbers = firstNumbers(quantity, repetitions, number);

        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}
