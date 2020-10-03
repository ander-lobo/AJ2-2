/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
        // Inicializacao da conta
        // Impressao dos dados da conta
        // Saque da conta
        // Impressao dos dados da conta
        // Deposito em conta
        // Impressao dos dados da conta
    	
    	Conta a = new Conta();
    	a.inicializaConta(2000, "50413", "Anderson Lobo", 0551, 1);
    	a.imprimeDados();
    	a.saque(1000);
    	a.imprimeDados();
    	a.deposito(1000);
    	a.imprimeDados();
    }
}
