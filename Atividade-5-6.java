package Objetos;

public class ContaBancaria {

    private String numeroConta;
    private double saldo;
    public void sacar(double valor) {saldo = saldo - valor;}
    public double saldoAtual() {return saldo;}
    public void depositar(double valor) {saldo = saldo + valor;}
    
    
    public ContaBancaria(){

    }

    public ContaBancaria(String numeroConta, double depositar) {
        this.numeroConta = numeroConta;
        this.saldo = saldo + depositar;
    }

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.sacar(double) = saldo - sacar(double);
    }
    
    public ContaBancaria(String numeroConta, ) {
        this.numeroConta = numeroConta;
        this.saldoAtual() = saldo;
    }


}
