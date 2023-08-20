package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class FrmCPeso extends JFrame {

	private JPanel PanelPeso;
	private JTextField TxtCantidad;
	private JComboBox<Object> CmbMedidaInicial;
	private JComboBox<Object> CmbMedidaFinal;
	private JButton BtnConvertir;
	private JTextArea TxaRespuesta;
	private JButton BtnRegresar;
	private JButton BtnSalir;
	
	
	public FrmCPeso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 324);
		PanelPeso = new JPanel();
		PanelPeso.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelPeso);
		PanelPeso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad: ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(33, 40, 67, 29);
		PanelPeso.add(lblNewLabel);
		
		JLabel lblMedidaDePeso = new JLabel("Medida de Peso: ");
		lblMedidaDePeso.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblMedidaDePeso.setBounds(33, 92, 88, 29);
		PanelPeso.add(lblMedidaDePeso);
		
		JLabel lblConvertirA = new JLabel("Convertir a:");
		lblConvertirA.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblConvertirA.setBounds(300, 47, 88, 29);
		PanelPeso.add(lblConvertirA);
		
		TxtCantidad = new JTextField();
		TxtCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		TxtCantidad.setBounds(129, 44, 134, 20);
		PanelPeso.add(TxtCantidad);
		TxtCantidad.setColumns(10);
		
		CmbMedidaInicial = new JComboBox<Object>();
		CmbMedidaInicial.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CmbMedidaInicial.setModel(new DefaultComboBoxModel<Object>(new String[] {"Kilogramo", "Gramo", "Miligramo", "Libra", "Onza", "Tonelada"}));
		CmbMedidaInicial.setBounds(131, 95, 132, 22);
		PanelPeso.add(CmbMedidaInicial);
		
		CmbMedidaFinal = new JComboBox<Object>();
		CmbMedidaFinal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CmbMedidaFinal.setModel(new DefaultComboBoxModel<Object>(new String[] {"Gramo", "Kilogramo", "Miligramo", "Libra", "Onza", "Tonelada"}));
		CmbMedidaFinal.setBounds(300, 79, 132, 22);
		PanelPeso.add(CmbMedidaFinal);
		
		BtnConvertir = new JButton("Convertir");
		BtnConvertir.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BtnConvertir.setBounds(209, 128, 89, 23);
		PanelPeso.add(BtnConvertir);
		
		TxaRespuesta = new JTextArea();
		TxaRespuesta.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		TxaRespuesta.setBounds(33, 169, 431, 77);
		PanelPeso.add(TxaRespuesta);
		
		BtnRegresar = new JButton("Regresar");
		BtnRegresar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BtnRegresar.setBounds(33, 251, 89, 23);
		PanelPeso.add(BtnRegresar);
		
		BtnSalir = new JButton("Salir");
		BtnSalir.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BtnSalir.setBounds(375, 251, 89, 23);
		PanelPeso.add(BtnSalir);
		
		
	}


	public JPanel getPanelPeso() {
		return PanelPeso;
	}


	public void setPanelPeso(JPanel panelPeso) {
		PanelPeso = panelPeso;
	}


	public JTextField getTxtCantidad() {
		return TxtCantidad;
	}


	public void setTxtCantidad(JTextField txtCantidad) {
		TxtCantidad = txtCantidad;
	}


	public JComboBox<Object> getCmbMedidaInicial() {
		return CmbMedidaInicial;
	}


	public void setCmbMedidaInicial(JComboBox<Object> cmbMedidaInicial) {
		CmbMedidaInicial = cmbMedidaInicial;
	}


	public JComboBox<Object> getCmbMedidaFinal() {
		return CmbMedidaFinal;
	}


	public void setCmbMedidaFinal(JComboBox<Object> cmbMedidaFinal) {
		CmbMedidaFinal = cmbMedidaFinal;
	}


	public JButton getBtnConvertir() {
		return BtnConvertir;
	}


	public void setBtnConvertir(JButton btnConvertir) {
		BtnConvertir = btnConvertir;
	}


	public JTextArea getTxaRespuesta() {
		return TxaRespuesta;
	}


	public void setTxaRespuesta(JTextArea txaRespuesta) {
		TxaRespuesta = txaRespuesta;
	}


	public JButton getBtnRegresar() {
		return BtnRegresar;
	}


	public void setBtnRegresar(JButton btnRegresar) {
		BtnRegresar = btnRegresar;
	}


	public JButton getBtnSalir() {
		return BtnSalir;
	}


	public void setBtnSalir(JButton btnSalir) {
		BtnSalir = btnSalir;
	}

	
	

}
