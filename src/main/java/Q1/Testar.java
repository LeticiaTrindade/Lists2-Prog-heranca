/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author letic
 */
public class Testar {
    
    public static void main(String[] args) {
    
        System.out.println("\nContas existentes: ");
        Conta c1 = new Conta("1234-1");
        Poupanca c2 = new Poupanca("1234-2");
        ContaEspecial c3 = new ContaEspecial("1234-3", 800); //A conta especial se inicia com um valor para o limite.
        ContaEspecial c4 = new ContaEspecial("1234-4"); // Esta segunda conta especial não tem o limite pre-definido.
        
        c1.creditar(1000);
        c2.creditar(200);
        c3.creditar(500);
        c4.creditar(20);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        System.out.println("\nSaldo da poupança creditado o juros: ");       
        c2.renderJuros();
        System.out.println(c2);
        
        System.out.println("\nDebitando das 10 de cada conta: ");
        c1.debitar(10);
        c2.debitar(10);
        c3.debitar(10);
        c4.debitar(10);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
        System.out.println("\nDebitando um valor maior que o saldo na conta especial: \nA conta '1234-4' não tem limite, devemos considerar apenas o seu saldo.");
        
        c3.debitar(700);
        c4.debitar(30);
        
        System.out.println(c3);
        System.out.println(c4);
        
        System.out.println("\nVamos definir um limite de R$50,00 para a conta especial '1234-4' e tentar sacar um valor dentro de seu limite: ");
        
        c4.setLimite(50);
        c4.debitar(50);
        
        System.out.println(c4);
        
        System.out.println("\nTransferindo 10 da conta 1234-1 para a conta 1234-2");
        c1.transferir(10, c2);
        System.out.println(c1);
        System.out.println(c2);
        
        
    }
    
    
}
