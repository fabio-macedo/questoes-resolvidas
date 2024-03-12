import java.util.ArrayList;
import java.util.Scanner;

public class Questões {
    public static void main(String[] args) {

    // Questão 1
        questao1();

    // Questão 2
        questao2();

    // Questão 3
        questao3();

    //Questão 4
        questao4();

    //Questão 5
        questao5();

    }




    public static void questao1(){
        System.out.println("Questão 1:");
        int indice = 13, soma =0, k =0;

        while(k < indice){
            k = k+1;
            soma = soma +k;
        }
        System.out.println("O valor da variável é: " + soma);
        System.out.println();
    }

    public static void questao2(){
        System.out.println("Questão 2:");
        System.out.println("Digite um número para verificar se pertence à sequência Fibonacci:");
        int number = new Scanner(System.in).nextInt();

        if(testeFibonacci(number)){
            System.out.println(number + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonnaci!");
        }
    }

    public static void questao3(){
        //letra a : incremento de 2 em 2
        System.out.println();
        System.out.println("--------   QUESTÃO 3 --------");
        System.out.println("Letra A:");
            letraA();
        System.out.println();

        // cada número da sequência é o dobro do anterior
        System.out.println("Letra B:");
            letraB();
        System.out.println();

        //quadrado dos números até o numeral 7
        System.out.println("Letra C:");
            letraC();
        System.out.println();

        //quadrado dos números pares até o numeral 10
        System.out.println("Letra D:");
            letraD();
        System.out.println();

        //sequência de Fibonacci
        System.out.println("Letra E:");
            letraE();
        System.out.println();

        //Demorou demais, mas a única forma em que vi uma lógica é que esses números começam com a letra 'd'
        System.out.println("Letra F:");
            //sequer fiz uma função para isso, então colocarei a resposta de pronto
        System.out.println("O próximo número da sequência é 200, pois é o próximo que inicia-se, por extenso, com a letra 'd'");
        System.out.println();
    }

    public static void questao4(){
        // questão puramente lúdica, foi respondida no próprio espaço do questionário
        System.out.println();
    }

    public static void questao5(){
        System.out.println("Questão 5: ");
        System.out.println();
        System.out.println("Digite uma palavra qualquer: ");
        String text = new Scanner(System.in).nextLine();

       inverter(text);

    }



    //              -------------   FUNÇÕES AUXILIARES    ---------------

    //Função auxiliar questão 2
    public static boolean testeFibonacci(int num){
        int a = 0, b = 1, soma;

            while(a <= num){
                if(a == num){
                    return true;
            }else{
                    soma = a + b;
                    a = b;
                    b = soma;
                }

        }
            return false;
    }

    //Função auxiliar questão 3) a-
    public static void letraA(){
        int aux = 1;
        // i foi igual a 5 pelo tamanho prestabelecido no quesito em relação a quantidade de termos
        for(int i = 0; i < 5; i++){
            System.out.print(aux + ", ");
            aux += 2;
        }
        System.out.println();
    }

    //Função auxiliar questão 3) b-
    public static void letraB() {
        int aux = 2;

        while(aux <= 128){
            System.out.print(aux + ", ");
            aux *= 2;
        }
        System.out.println();
    }

    //Função auxiliar questão 3) c-
    public static void letraC() {
       //aproveitando a variável i para os cálculos
       for(int i = 0; i <= 7; i++){
           System.out.print(i * i + ", ");
       }
        System.out.println();
    }

    //Função auxiliar questão 3) d-
    public static void letraD() {
         int aux = 2;
         while(aux <= 10){
             System.out.print(aux * aux + ", ");
             aux += 2;
         }
        System.out.println();
    }

    //Função auxiliar questão 3) e-
    public static void letraE() {
        int a = 0, b = 1, aux;
        //até o número 13, em vista de ser o próximo da sequência no quesito
        while(a <= 13){
            System.out.print(a + ", ");
           aux = a + b;
           a = b;
           b = aux;
        }
        System.out.println();
    }

    //Função para a questão 5)
    public static void inverter(String texto){
        char[] caracteres = texto.toCharArray();

        for(int i = texto.length() - 1; i >= 0; i--){
            System.out.print(caracteres[i]);
        }
        System.out.println();

    }




}
















