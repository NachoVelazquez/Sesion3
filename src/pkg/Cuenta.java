package pkg;

public class Cuenta {

	private double saldo;
	
	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double i) {
		
		this.saldo=saldo+i;
	}
	
	public void retirar(double i) {
		this.saldo=saldo-i;
		
	}
	

}
