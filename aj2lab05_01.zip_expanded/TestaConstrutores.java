/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
    	Conta a1 = new Conta(1000, "50413", "Anderson Lobo", "0551", 1);
    	a1.imprimeDados();
    	Conta a2 = new Conta("50413", "Anderson Lobo", "0551", 1);
    	a2.imprimeDados();
    	Cliente b = new Cliente("Anderson Lobo", "042.063.001-51");
    	b.imprimeDados();
    }
}
