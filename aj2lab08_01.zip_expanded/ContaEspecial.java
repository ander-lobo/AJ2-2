/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Adicione o atributo limite do tipo double e o encapsule 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) 
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o CPMF devido.
 */
public class ContaEspecial extends Conta {
	private double limite;
	double a;
	public ContaEspecial (double saldoInicial, double limite, String num, Cliente tit, Agencia ag) {
		super (saldoInicial, num, tit, ag);
		this.limite = limite;
	}
	
	public void imprimeDados() {
        System.out.println("======================================");
        System.out.println("CONTA ESPECIAL");
        super.imprimeDados();
        System.out.println("Limite: " + limite);
        System.out.println("========================================");
    }
	public void saque(double valor) {
		System.out.println("Realizando saque de R$ " + valor + " da conta " + super.getNumero());
		if (valor > 0) {
			if (valor <= saldo + limite && saldo < valor) {
				limite -= valor - saldo;
				a = valor - saldo;
				saldo -= valor - a;
				acumularIFN(valor);				
			} else
            System.out.println("Não há saldo ou limite disponível");
        
		} else {
        System.out.println("O valor de saque deve ser positivo");
    }
	}
}
