/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        // executar um deposito
        // Imprimir o saldo apos o deposito
        // executar um saque cujo valor seja menor que o saldo
        // Imprimir o saldo apos o deposito
        // executar uma retirada cujo valor seja maior que o saldo
        // Imprimir o saldo apos o deposito
    	
    	Conta a = new Conta();
    	a.inicializaConta(2000, "50413", "Anderson Lobo", 551, 1);
    	a.deposito(100);
    	a.imprimeDados();
    	a.saque(100);
    	a.imprimeDados();
    	a.saque(3000);
    	a.imprimeDados();
    }
}
