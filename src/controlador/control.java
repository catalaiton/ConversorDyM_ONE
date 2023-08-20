package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.*;
import modelo.*;

public class control implements ActionListener{
	
	FrmEleccion FrmElec;
	FrmCDivisas FrmCD;
	FrmCPeso FrmCP;
	
	public control() {
		this.FrmElec = new FrmEleccion();
		this.FrmCD = new FrmCDivisas();
		this.FrmCP = new FrmCPeso();
	}
	
	public void iniciar() {
		FrmElec.setTitle("Eleccion de conversor");
		FrmElec.setLocationRelativeTo(null);
		FrmElec.getCDivisas().addActionListener(this);
		FrmElec.getCPeso().addActionListener(this);
		FrmElec.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(FrmElec.getCDivisas())){
			FrmCD.setTitle("Conversor Divisas");
			FrmCD.setLocationRelativeTo(null);
			FrmCD.getCmbDivisaInicial().addActionListener(this);
			FrmCD.getCmbDivisaFinal().addActionListener(this);
			FrmCD.getBtnConvertir().addActionListener(this);
			FrmCD.setVisible(true);
			FrmElec.setVisible(false);
		}
		
		if(e.getSource().equals(FrmElec.getCPeso())) {
			FrmCP.setTitle("Conversor de Medidas de Peso");
			FrmCP.setLocationRelativeTo(null);
			FrmCP.getCmbMedidaInicial().addActionListener(this);
			FrmCP.getCmbMedidaFinal().addActionListener(this);
			FrmCP.getBtnConvertir().addActionListener(this);
			FrmCP.setVisible(true);
			FrmElec.setVisible(false);
			
		}
		
		if(e.getSource().equals(FrmCD.getBtnConvertir())) {
			FrmCD.getTxaRespuesta().setText("");
			ConversorDivisas Divisa = new ConversorDivisas();
			Divisa.setCantidad(Float.parseFloat(FrmCD.getTxtCantidad().getText()));
			Divisa.setDivisaInicial(FrmCD.getCmbDivisaInicial().getSelectedItem().toString());
			Divisa.setDivisaFinal(FrmCD.getCmbDivisaFinal().getSelectedItem().toString());
			
			FrmCD.getTxaRespuesta().append("\nConversion: "+Divisa.Conversion());
			
			
		}
		
	}
	

}
