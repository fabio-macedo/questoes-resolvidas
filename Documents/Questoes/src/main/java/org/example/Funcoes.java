package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes {
        Scanner sc = new Scanner(System.in);

    public void questao1(){
        System.out.println("Digite um número para verificar se faz parte da sequência Fibonacci: ");
        int num = sc.nextInt();

        //gerando a sequencia baseada no número passado
        List<Integer> fibo = gerarFibonacci(num);

        if (fibo.contains(num)){
            System.out.println("Este número pertence à sequência de Fibonnaci!");
        }else{
            System.out.println("Este número não faz parte da sequência!");
        }

    }

    public void questao2(){
        System.out.println("Digite algo para testarmos!");
        String teste = sc.nextLine().toLowerCase();

        if(teste.contains("a")){
            System.out.println("Esse texto possui a letra 'a' que se repete: " +
                    contarRepeticoes(teste) + " vezes!");

        }else{
            System.out.println("A String passada não possui a letra 'a'! ");
        };
    }

    public void questao3(){
        //código passado
        int indice = 12, soma = 0, k = 1;

        while(k < indice){
            k += 1;
            soma += k;
        }
        System.out.println("A variável soma conta com o número: " + soma);

    }


//  ----    FUNÇÕES AUXILIARES   -----


    public static List<Integer> gerarFibonacci(int num){

        ArrayList<Integer> fibo = new ArrayList<>();
        int a=0, b=1;

        fibo.add(a);
        if (num > 0){
            fibo.add(b);
        }

        while(b <= num){
            int c = a + b;
            fibo.add(c);
            a = b;
            b = c;
        }

        return fibo;
    }

    private static long contarRepeticoes(String teste) {
        return teste.chars()
                .filter(letra -> letra == 'a')
                .count();
    }
}
