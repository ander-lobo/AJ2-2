/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * O metodo inicializaConta e util para evitar a necessidade de inicializar
 * atributo por atributo, desta forma podemos chamar um unico metodo e passar
 * todos os parametros em uma unica chamada.
 * 
 * 1) Implemente os metodos que nao foram implementados na classe Conta de 
 * acordo com a especificacao nos metodos.
 */
class Conta {

    double saldo;
    String numero;
    String titular;
    int agencia;
    int banco;

    /**
     * @param saldoInicial
     *            Saldo inicial da conta
     * @param num
     *            Numero da conta
     * @param tit
     *            Titular da conta
     * @param ag
     *            Numero da agencia
     * @param bc
     *            Numero do banco
     */
    void inicializaConta(double saldoInicial, String num, String tit, int ag, int bc) {
        System.out.println("Inicializando uma conta com os seguintes dados:");
        saldo = saldoInicial;
        numero = num;
        titular = tit;
        agencia = ag;
        banco = bc;
    }

    /**
     * @param valor:
     *            valor a ser sacado da conta
     */
    /*
     * 1. Verificar se o valor do saque e positivo.
     * 2. Verificar se ha saldo suficiente para efetuar o saque 
     *    2.1. Se o saldo for suficiente, efetuar o saque 
     *    2.2. Se o saldo for insuficiente imprimir na tela que o saldo e insuficiente
     */
    void saque(double valor) {
    	if (valor <= saldo && valor > 0) {
    		saldo -= valor;
    		System.out.println("Saque efetuado com sucesso!");
    	} else if (valor < 0) {
    		System.out.println("Não é possível efetuar o saque!");
    	} else {
    		System.out.println("O saldo é insuficiente!");
    	}
    }

    /**
     * @param valor
     *            Valor a ser depositado da conta
     */
    /*
     * 1. Verificar se o valor do deposito e positivo, se for efetue o deposito
     */
    void deposito(double valor) {
    	if (valor >= 0) {
    		saldo += valor;
    		System.out.println("Depósito efetuado com sucesso!");
    	} else {
    		System.out.println("Não é possível efetuar o depósito!");
    	}
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println("AGENCIA:\t" + agencia + "\t BANCO:\t" + banco);
        System.out.println("NUMERO: \t" + numero);
        System.out.println("TITULAR: \t" + titular);
        System.out.println("SALDO: \t\t" + saldo);
        System.out.println("-----------------------------\n");
    }

    /**
     * @return saldo da conta
     */
    double getSaldo() {
        return saldo;
    }
}
