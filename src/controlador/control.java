package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
		
		//Pantalla Conversor de Divisas
		if(e.getSource().equals(FrmElec.getCDivisas())){
			FrmCD.setTitle("Conversor Divisas");
			FrmCD.setLocationRelativeTo(null);
			FrmCD.getCmbDivisaInicial().addActionListener(this);
			FrmCD.getCmbDivisaFinal().addActionListener(this);
			FrmCD.getBtnConvertir().addActionListener(this);
			FrmCD.getBtnRegresar().addActionListener(this);
			FrmCD.getBtnSalir().addActionListener(this);
			FrmCD.setVisible(true);
			FrmElec.setVisible(false);
		}
		
		//Pantalla Conversor de Masas
		if(e.getSource().equals(FrmElec.getCPeso())) {
			FrmCP.setTitle("Conversor de Medidas de Peso");
			FrmCP.setLocationRelativeTo(null);
			FrmCP.getCmbMedidaInicial().addActionListener(this);
			FrmCP.getCmbMedidaFinal().addActionListener(this);
			FrmCP.getBtnConvertir().addActionListener(this);
			FrmCP.getBtnRegresar().addActionListener(this);
			FrmCP.getBtnSalir().addActionListener(this);
			FrmCP.setVisible(true);
			FrmElec.setVisible(false);
			
		}
		
		//Accion boton Convertir Conversor Divisas
		if(e.getSource().equals(FrmCD.getBtnConvertir())) {
			FrmCD.getTxaRespuesta().setText("");
			ConversorDivisas Divisa = new ConversorDivisas();
			Divisa.setCantidad(Float.parseFloat(FrmCD.getTxtCantidad().getText()));
			Divisa.setDivisaInicial(FrmCD.getCmbDivisaInicial().getSelectedItem().toString());
			Divisa.setDivisaFinal(FrmCD.getCmbDivisaFinal().getSelectedItem().toString());
			FrmCD.getTxaRespuesta().append("\nConversion: "+Divisa.Conversion());	
		}
		
		
		//Accion boton Convertir Conversor de Masas
		if(e.getSource().equals(FrmCP.getBtnConvertir())) {
			FrmCP.getTxaRespuesta().setText("");
			ConversorMasa Masa = new ConversorMasa();
			Masa.setCantidad(Float.parseFloat(FrmCP.getTxtCantidad().getText()));
			Masa.setDivisaInicial(FrmCP.getCmbMedidaInicial().getSelectedItem().toString());
			Masa.setDivisaFinal(FrmCP.getCmbMedidaFinal().getSelectedItem().toString());
			FrmCP.getTxaRespuesta().append("\nConversion: "+Masa.Conversion());
		}
		
		if(e.getSource().equals(FrmCD.getBtnRegresar())) {
			
			int resp = JOptionPane.showConfirmDialog(FrmCD, "Desea regresar a la pantalla principal?...", "Regresar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                FrmCD.setVisible(false);
                FrmElec.setVisible(true);
            }
		}
		
		if(e.getSource().equals(FrmCD.getBtnSalir())) {
			int resp = JOptionPane.showConfirmDialog(FrmCD, "Desea terminar la ejecucion?...", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                FrmCD.dispose();
            }
		}
		
		
		if(e.getSource().equals(FrmCP.getBtnRegresar())) {
			int resp = JOptionPane.showConfirmDialog(FrmCD, "Desea regresar a la pantalla principal?...","Regresar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(resp == JOptionPane.YES_OPTION) {
				FrmCP.setVisible(false);
				FrmElec.setVisible(true);
			}
		}
		
		if(e.getSource().equals(FrmCP.getBtnSalir())) {
			int resp = JOptionPane.showConfirmDialog(FrmCP, "Desea terminar la ejecucion?...", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resp == JOptionPane.YES_OPTION) {
                FrmCP.dispose();
            }
		}
			
	}
	

}
