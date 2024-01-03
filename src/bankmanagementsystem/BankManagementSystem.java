
package bankmanagementsystem;

import java.util.Random;
import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
           Scanner select = new Scanner(System.in);
        Random random = new Random();
        corrente c1 = new corrente();
        
        
        System.out.println("Bem vindo(a) ao Bank Management");
        System.out.println("O que cê gostaria?");
        System.out.println("");
        
        System.out.println("1 - Abrir uma conta");
        System.out.println("2 - Consultar conta");
        System.out.println("3 - Solicitar emprestimo");
        System.out.println("4 - Fechar conta");
        
        System.out.print("Digite aqui: ");
        
        
        
        int s1 = select.nextInt();
        
        
        
        if (s1 == 1){
            System.out.println("");
            System.out.println("Vamos criar a sua conta");
            System.out.print("Digite seu nome: ");
            String nameAccount = select.next();
            c1.setNome(nameAccount);
            
            System.out.print("Digite seu CPF: ");
            String CPF = select.next();
            c1.setCpf(CPF);
            
            int number = random.nextInt(20);
            System.out.print(number);
            
        } 
        }
        
    }
    
}
