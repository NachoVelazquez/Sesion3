package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.signo;

public class Cuenta {

	private String id;
	private double saldo;
	private List<Movimiento> mov=new ArrayList();
	
	public Cuenta(double saldo,String id) {
		super();
		this.saldo = saldo;
		this.id=id;
		System.out.println("Saldo inicial: "+saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double i) {
		Movimiento m= new Movimiento(i,signo.H);
		m.setDetalle("Ingreso de "+i+" de la cuenta "+id);
		System.out.println(m.getDetalle());
		mov.add(m);
		this.saldo=saldo+i;
	}
	
	public void retirar(double i) {
		if((saldo-i)>-501) {
		Movimiento m= new Movimiento(i,signo.D);
		m.setDetalle("Reintegro de "+i+" de la cuenta "+id);
		System.out.println(m.getDetalle());
		mov.add(m);
		this.saldo=saldo-i;
		}else {
			System.out.println("Error: Fondos insuficientes (saldo: "+saldo+") en la cuenta "+id+" para el reintegro de "+i);
		}
	}
	

}
