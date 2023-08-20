package modelo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;



public class ConversorDivisas extends Conversor{
	
	public ConversorDivisas(float Cantidad, String DivisaInicial, String DivisaFinal) {
		super(Cantidad,DivisaInicial,DivisaFinal);
	}
	
	public ConversorDivisas() {
		super();
	}

	@Override
	public float Conversion() {
		float  resultado=0;
		if(this.DivisaInicial == this.DivisaFinal) {
			resultado = this.Cantidad;
		}else {
		switch(this.DivisaInicial) {
		case "Peso Colombiano (COP)":
			resultado = ConversionPesoColombiano();
			break;
		case "Dolar":
			resultado = ConversionDolar();
			break;
		case "Euros":
			resultado = ConversionEuro();
			break;
		case "Libras Esterlinas":
			resultado = ConversionLibrasEsterlinas();
			break;
		case "Yen":
			resultado = ConversionYen();
			break;
		case "Won":
			resultado = ConversionWon();
			break;
			}
		}
		return resultado;
	}

	public float  ConversionPesoColombiano() {
		float Cp=0;
		switch(this.DivisaFinal) {
		case "Dolar":
			Cp = (float) (this.Cantidad * 0.00024293);
			 Math.round(Cp);
			 break;
		case "Euros":
			Cp = (float) (this.Cantidad * 0.0022);
			Math.round(Cp);
			break;
		case "Libras Esterlinas":
			Cp = (float) (this.Cantidad*0.00019);
			Math.round(Cp);
			break;
		case "Yen":
			Cp = (float) (this.Cantidad*0.035);
			Math.round(Cp);
			break;
		case "Won":
			Cp = (float) (this.Cantidad*0.33);
			Math.round(Cp);
			break;
		}
		
		return (float) Cp;
	}
	
	public float ConversionDolar() {
		float Cd=0;
		switch(this.DivisaFinal) {
		case "Euros":
			Cd = (float) (this.Cantidad * 0.92);
			Math.round(Cd);
			break;
		case "Libras Esterlinas":
			Cd = (float) (this.Cantidad*0.79);
			Math.round(Cd);
			break;
		case "Yen":
			Cd = (float) (this.Cantidad*145.20);
			Math.round(Cd);
			break;
		case "Won":
			Cd = (float) (this.Cantidad*1340.16);
			Math.round(Cd);
			break;
		case "Peso Colombiano (COP)":
			Cd = (float) (this.Cantidad * 4100.44);
			Math.round(Cd);
			break;
		}
		return (float) Cd;
	}

	public float ConversionEuro() {
		float Ce=0;
		switch(this.DivisaFinal) {
		case "Dolar":
			Ce = (float) (this.Cantidad*1.09);
			Math.round(Ce);
			break;
		case "Libras Esterlinas":
			Ce = (float) (this.Cantidad*0.85);
			Math.round(Ce);
			break;
		case "Yen":
			Ce = (float) (this.Cantidad*157.94);
			Math.round(Ce);
			break;
		case "Won":
			Ce = (float) (this.Cantidad*1456.91);
			Math.round(Ce);
			break;
		case "Peso Colombiano (COP)":
			Ce = (float) (this.Cantidad * 4457.66);
			Math.round(Ce);
			break;
		}
		return (float) Ce;
	}
	
	public float ConversionLibrasEsterlinas() {
		float Cl=0;
		switch(this.DivisaFinal) {
		case "Dolar":
			Cl = (float) (this.Cantidad*1.27);
			Math.round(Cl);
			break;
		case "Euros":
			Cl = (float) (this.Cantidad*1.17);
			Math.round(Cl);
			break;
		case "Yen":
			Cl = (float) (this.Cantidad*184.92);
			Math.round(Cl);
			break;
		case "Won":
			Cl = (float) (this.Cantidad*1706.04);
			Math.round(Cl);
			break;
		case "Peso Colombiano (COP)":
			Cl = (float) (this.Cantidad * 5219.86);
			Math.round(Cl);
			break;
		}
		return (float) Cl;
	}
	
	public float ConversionYen() {
		float Cy=0;
		switch(this.DivisaFinal) {
		case "Dolar":
			Cy = (float) (this.Cantidad*0.0069);
			Math.round(Cy);
			break;
		case "Euros":
			Cy = (float) (this.Cantidad*0.0063);
			Math.round(Cy);
			break;
		case "Libras Esterlinas":
			Cy = (float) (this.Cantidad*0.0054);
			Math.round(Cy);
			break;
		case "Won":
			Cy = (float) (this.Cantidad*9.23);
			Math.round(Cy);
			break;
		case "Peso Colombiano (COP)":
			Cy = (float) (this.Cantidad * 28.23);
			Math.round(Cy);
			break;
		}
		return (float) Cy;
	}
	
	public float ConversionWon() {
		float Cw=0;
		switch(this.DivisaFinal) {
		case "Dolar":
			Cw = (float) (this.Cantidad*0.00075);
			Math.round(Cw);
			break;
		case "Euros":
			Cw = (float) (this.Cantidad*0.00069);
			Math.round(Cw);
			break;
		case "Libras Esterlinas":
			Cw = (float) (this.Cantidad*0.0000059);
			Math.round(Cw);
			break;
		case "Yen":
			Cw = (float) (this.Cantidad*0.11);
			Math.round(Cw);
			break;
		case "Peso Colombiano (COP)":
			Cw = (float) (this.Cantidad * 3.06);
			Math.round(Cw);
			break;
		}
		return (float) Cw;
	}
	
}
