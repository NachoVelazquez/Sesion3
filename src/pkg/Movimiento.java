package pkg;

public class Movimiento {
	private double importe;
	private String detalle;
	public enum signo{D, H};
	private signo sig;
	
	
	public Movimiento(double importe,signo s) {
		super();
		this.importe = importe;
		this.sig=s;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	};
	
	
	
}
