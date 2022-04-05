/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author letic
 */
public class ContaEspecial extends Conta {
    
    private double limite;
    private String numConta = getNumConta();
    
    public ContaEspecial (String numero, double limite){ 
            super(numero);
            this.limite = limite;
    }
    
    public ContaEspecial (String numero){ 
            super(numero);
    }
  
    public double getLimite(){
        
        return this.limite;
        
    }
    public double setLimite(double valor){
        
        return this.limite = valor;
              
    }

    @Override
    public void debitar(double valor){
        
            if ((getSaldo()-valor)*-1 <= getLimite()){
            setSaldo(getSaldo()-valor);
        }
            else{System.out.println("\nEste valor ultrapassa o limite de crédito da conta '"+this.numConta+"', não poderemos debitar.");
    
        }
    }
   
}
