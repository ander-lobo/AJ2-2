/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
        // Inicializacao do cliente usando o metodo inicializaCliente
        // Impressao dos dados do cliente
    	Cliente a = new Cliente();
    	a.inicializaCliente("Anderson Lobo", "042.063.001-51");
    	a.imprimeDados();
    }
}
