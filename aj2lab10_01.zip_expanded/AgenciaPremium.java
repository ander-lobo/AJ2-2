/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 *
 * 
 * 1) Modifique esta classe para que herde de Agencia
 * 
 * 2) Acrescente um construtor valido. 
 * 
 * 3) Sobrescreva o metodo abstrato ajustarLimiteIndividual
 *    de acordo com as seguintes regras de negocio:
 *    
 *    a) se o saldo estiver negativo, abaixo de -5000.00 o limite deve ser ajustado para 1000.00
 *    b) se o saldo estiver positivo, abaixo de +5000.00 o limite deve ser ajustado para 30% do saldo  
 *    c) se o saldo estiver positivo, acima de  +5000.00 o limite deve ser ajustado para 50% do saldo
 * 
 */
public class AgenciaPremium extends Agencia {
	public AgenciaPremium(String num, Banco bc) {
        super(num, bc);
    }

	@Override
        protected void ajustarLimiteIndividual(ContaEspecial contaEspecial) {
        if (contaEspecial.getSaldo() < -5000) {       // a
            contaEspecial.setLimite(1000);
        } else if (contaEspecial.getSaldo() < 5000 && contaEspecial.getSaldo() >= 0) { // b
            contaEspecial.setLimite(contaEspecial.saldo*0.3);
        } else if (contaEspecial.getSaldo() > 5000) { // c
            contaEspecial.setLimite(contaEspecial.saldo*0.5);
        } 
    }


}
