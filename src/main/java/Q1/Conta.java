/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Q1;

/**
 *
 * @author leticia ♥
 */
public class Conta {

    private double saldo;
    private String numConta;

    public Conta(double valorSaldo, String outraNumConta){
        
        this.saldo = valorSaldo;
        this.numConta = outraNumConta;
        
    }
    
    public Conta(String outraNumConta){
        this.numConta = outraNumConta;
    }
    
    public void debitar(double valor){
    
        if (valor < this.saldo){
            
            this.saldo -= valor; 
            
        }
    
    }
    
    public void transferir(double valor, Conta objeto){
        this.debitar(valor);
        objeto.creditar(valor);
       
    }
    public void creditar(double valor){
        
        this.saldo += valor;
    }
    
    public double getSaldo(){
        
        return this.saldo;
        
    }
    
    public String getNumConta(){
        
        return this.numConta;
        
    }
    
    public String setNumConta(String novoNumConta){
        
        return this.numConta = novoNumConta;
        
    }
    
    public double setSaldo(double valor){
        return this.saldo = valor;
    }
    
    @Override
    public String toString(){
        
        return "------------------------- \n"
                + "Conta: "+this.numConta+"\n"
                + "Saldo: "+this.saldo;
    }
    
}
