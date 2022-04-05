/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author leticia 
 */
public class Poupanca extends Conta {
    
    private double juros = 0.05;
    private String conta = getNumConta();
    private double saldo = getSaldo();
    
    public Poupanca (String numero){ 
            super(numero);
    }
    public void renderJuros(){
        
        setSaldo(this.saldo = getSaldo()+getSaldo()*this.juros);
       
    }
}
