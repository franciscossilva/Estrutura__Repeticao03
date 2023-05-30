import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int menor =Integer.MAX_VALUE;
        int maior =Integer.MIN_VALUE;
        for ((int = 0; i <10;+i++){
            System.out.print("digite o "+ (i + 1) +"o numero: ");
            int numero = input.nextInt();
            if (numero < menor) menor = numero;
            if (numero > maior) maior = numero;
        }
        System.out.println("0 menor numero digitado foi : " +menor);
        System.out.println(" o maior numero digitado foi : "+maior );




    }}