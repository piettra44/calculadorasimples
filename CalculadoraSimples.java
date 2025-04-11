import java.util.Scanner;

public class CalculadoraSimples{

        public static void main(String[] args){
        //Declaração de variáveis
        int n1, n2, total, op;

        //Criação e inscrição do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");

        //Menu
        System.out.println("1.Soma");
        System.out.println("2.Subtração");
        System.out.println("3.Sair");
        
        //Opção do Usuário
        System.out.println("Opção:");
        op = entrada.nextInt();
        if(op ==1){
        
        //Entradas
        System.out.println("Soma Simples: ");
        System.out.print("Informe N1: ");
        n1 = entrada.nextInt();
        System.out.print("Informe N2: ");
        n2 = entrada.nextInt();
            
        
        //Processamento
        total = n1 + n2;

        //Saída
        System.out.println(n1 + " + " + n2 + " = " + total);
        }else if (op == 2){
        System.out.println("Subtração...");

        //Entrada
        System.out.print("Informe N1:");
        n1 = entrada.nextInt();
        System.out.print("Informe N2:");
        n2 = entrada.nextInt();

        //Processamento
        total = n1 - n2;

        //Saída
        System.out.println(n1 + "-" + n2 + "=" + total);
       }  else if(op == 3){
         System.out.println("\n\n Forte abraço!");
    } else{}    
    System.out.println("Opção "+ op + "Incorreta!");
    } 
}