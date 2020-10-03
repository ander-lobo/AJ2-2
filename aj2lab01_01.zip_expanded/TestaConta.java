/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
    	
    	Conta a = new Conta();
    	
    	a.agencia = 1;
    	a.banco = 234;
    	a.numero = "01945";
    	a.titular = "Globalcode";
    	a.saldo = 10000;
    	
    	System.out.println("Agencia: " + a.agencia + " \tBanco: " + a.banco);
    	System.out.println("Numero: " + a.numero);
    	System.out.println("Titular: " + a.titular);
    	System.out.println("Saldo: " + a.saldo);
    }
}
