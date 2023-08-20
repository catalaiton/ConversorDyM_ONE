package modelo;

public abstract class Conversor {
	protected float Cantidad;
	protected String DivisaInicial, DivisaFinal;
	
	public Conversor(float Cantidad, String DivisaInicial, String DivisaFinal) {
		this.Cantidad = Cantidad;
		this.DivisaInicial = DivisaInicial;
		this.DivisaFinal = DivisaFinal;
	}
	
	public Conversor() {
		this.Cantidad = 0;
		this.DivisaInicial = "";
		this.DivisaFinal = "";
	}
	
	public abstract float Conversion();

	
	
	@Override
	public String toString() {
		return "\n Cantidad: "+ this.Cantidad +""
				+ "\n Divisa inicial: "+this.DivisaInicial
				+"\n Divisa Final: "+this.DivisaFinal;
	}

	public double getCantidad() {
		return (float) Cantidad;
	}

	

	public void setCantidad(float cantidad) {
		Cantidad = cantidad;
	}

	public String getDivisaInicial() {
		return DivisaInicial;
	}

	public void setDivisaInicial(String divisaInicial) {
		DivisaInicial = divisaInicial;
	}

	public String getDivisaFinal() {
		return DivisaFinal;
	}

	public void setDivisaFinal(String divisaFinal) {
		DivisaFinal = divisaFinal;
	}
	
	
}
