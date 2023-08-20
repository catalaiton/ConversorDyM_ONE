package modelo;

public class ConversorMasa extends Conversor{
	
	public ConversorMasa(float Cantidad, String DivisaInicial, String DivisaFinal) {
		super(Cantidad,DivisaInicial,DivisaFinal);
	}
	
	public ConversorMasa() {
		super();
	}
	
	
	@Override
	public float Conversion() {
		float resultado = 0;
		
		if(this.DivisaInicial == this.DivisaFinal) {
			resultado = this.Cantidad;
		}else {
			switch(this.DivisaInicial) {
			case "Kilogramo":
				resultado= ConversionKilogramo();
				break;
			case "Gramo":
				resultado= ConversionGramo();
				break;
			case "Miligramo":
				resultado = ConversionMiligramo();
				break;
			case "Libra":
				resultado = ConversorLibra();
				break;
			case "Onza":
				resultado = ConversorOnza();
				break;
			case "Tonelada":
				resultado = ConversorTonelada();
				break;
			}
		}
		return resultado;
	}
	
	public float ConversionKilogramo() {
		float Ck =0;
		switch(this.DivisaFinal) {
		case "Gramo":
			Ck = this.Cantidad*1000;
			break;
		case "Miligramo":
			Ck=this.Cantidad*1000000;
			break;
		case "Libra":
			Ck=(float) (this.Cantidad*2.20462);
			break;
		case "Onza":
			Ck=(float) (this.Cantidad*35.274);
			break;
		case "Tonelada":
			Ck=(float) (this.Cantidad*0.001);
			break;
		}
		return Ck;
	}
	
	public float ConversionGramo() {
		float Cg =0;
		switch(this.DivisaFinal) {
		case "Kilogramo":
			Cg = (float) (this.Cantidad*0.001);
			break;
		case "Miligramo":
			Cg=this.Cantidad*10000;
			break;
		case "Libra":
			Cg=(float) (this.Cantidad*0.0220462);
			break;
		case "Onza":
			Cg=(float) (this.Cantidad*0.035274);
			break;
		case "Tonelada":
			Cg=(float) (this.Cantidad*1e-6);
			break;
		}
		return Cg;
	}
	
	public float ConversionMiligramo() {
		float Cm =0;
		switch(this.DivisaFinal) {
		case "Kilogramo":
			Cm = (float) (this.Cantidad*1e-6);
			break;
		case "Gramo":
			Cm=(float) (this.Cantidad*0.001);
			break;
		case "Libra":
			Cm=(float) (this.Cantidad*2.2046e-6);
			break;
		case "Onza":
			Cm=(float) (this.Cantidad*3.5274e-5);
			break;
		case "Tonelada":
			Cm=(float) (this.Cantidad*1e-9);
			break;
		}
		return Cm;
	}
	
	public float ConversorLibra() {
		float Cl =0;
		switch(this.DivisaFinal) {
		case "Kilogramo":
			Cl = (float) (this.Cantidad*0.453592);
			break;
		case "Gramo":
			Cl=(float) (this.Cantidad*453.592);
			break;
		case "Miligramo":
			Cl=(float) (this.Cantidad*453592.37);
			break;
		case "Onza":
			Cl=(float) (this.Cantidad*16);
			break;
		case "Tonelada":
			Cl=(float) (this.Cantidad*0.000453592);
			break;
		}
		return Cl;
	}
	
	public float ConversorOnza() {
		float Co =0;
		switch(this.DivisaFinal) {
		case "Kilogramo":
			Co = (float) (this.Cantidad*0.02835);
			break;
		case "Gramo":
			Co=(float) (this.Cantidad*28.3495);
			break;
		case "Miligramo":
			Co=(float) (this.Cantidad*28349.54);
			break;
		case "Libra":
			Co=(float) (this.Cantidad*0.0625);
			break;
		case "Tonelada":
			Co=(float) (this.Cantidad*0.0000283495);
			break;
		}
		return Co;
	}
	
	public float ConversorTonelada() {
		float Ct =0;
		switch(this.DivisaFinal) {
		case "Kilogramo":
			Ct = (float) (this.Cantidad*1000);
			break;
		case "Gramo":
			Ct=(float) (this.Cantidad*1000000);
			break;
		case "Miligramo":
			Ct=(float) (this.Cantidad*1000000000);
			break;
		case "Libra":
			Ct=(float) (this.Cantidad*2204.62);
			break;
		case "Onza":
			Ct=(float) (this.Cantidad*35273.94);
			break;
		}
		return Ct;
	}

}
