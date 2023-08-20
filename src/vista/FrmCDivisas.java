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

public class FrmCDivisas extends JFrame {

	private JPanel PanelDivisas;
	private JTextField TxtCantidad;
	private JComboBox<Object> CmbDivisaInicial;
	private JComboBox<Object> CmbDivisaFinal;
	private JButton BtnConvertir;
	private JTextArea TxaRespuesta;
	private JLabel lblNewLabel_1;

	
	public FrmCDivisas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 296);
		PanelDivisas = new JPanel();
		PanelDivisas.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelDivisas);
		PanelDivisas.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad: ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(36, 49, 61, 22);
		PanelDivisas.add(lblNewLabel);
		
		JLabel lblDivisa = new JLabel("Divisa: ");
		lblDivisa.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDivisa.setBounds(36, 98, 61, 22);
		PanelDivisas.add(lblDivisa);
		
		JLabel lblConvertirA = new JLabel("Convertir a:");
		lblConvertirA.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblConvertirA.setBounds(300, 49, 87, 22);
		PanelDivisas.add(lblConvertirA);
		
		TxtCantidad = new JTextField();
		TxtCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		TxtCantidad.setBounds(96, 50, 169, 20);
		PanelDivisas.add(TxtCantidad);
		TxtCantidad.setColumns(10);
		
		CmbDivisaInicial = new JComboBox<Object>();
		CmbDivisaInicial.setModel(new DefaultComboBoxModel(new String[] {"Peso Colombiano (COP)", "Dolar", "Euros", "Libras Esterlinas", "Yen", "Won"}));
		CmbDivisaInicial.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CmbDivisaInicial.setBounds(96, 98, 169, 22);
		PanelDivisas.add(CmbDivisaInicial);
		
		CmbDivisaFinal = new JComboBox<Object>();
		CmbDivisaFinal.setModel(new DefaultComboBoxModel(new String[] {"Dolar", "Euros", "Libras Esterlinas", "Yen", "Won", "Peso Colombiano (COP)"}));
		CmbDivisaFinal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		CmbDivisaFinal.setBounds(300, 82, 169, 22);
		PanelDivisas.add(CmbDivisaFinal);
		
		BtnConvertir = new JButton("Convertir");
		BtnConvertir.setFont(new Font("Times New Roman", Font.BOLD, 12));
		BtnConvertir.setBounds(211, 141, 89, 23);
		PanelDivisas.add(BtnConvertir);
		
		TxaRespuesta = new JTextArea();
		TxaRespuesta.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		TxaRespuesta.setBounds(36, 175, 433, 71);
		PanelDivisas.add(TxaRespuesta);
		
		lblNewLabel_1 = new JLabel("Conversor de Divisas");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(176, 11, 219, 27);
		PanelDivisas.add(lblNewLabel_1);
		
		
	}


	public JPanel getPanelDivisas() {
		return PanelDivisas;
	}


	public void setPanelDivisas(JPanel panelDivisas) {
		PanelDivisas = panelDivisas;
	}


	public JTextField getTxtCantidad() {
		return TxtCantidad;
	}


	public void setTxtCantidad(JTextField txtCantidad) {
		TxtCantidad = txtCantidad;
	}


	public JComboBox<Object> getCmbDivisaInicial() {
		return CmbDivisaInicial;
	}


	public void setCmbDivisaInicial(JComboBox<Object> cmbDivisaInicial) {
		CmbDivisaInicial = cmbDivisaInicial;
	}


	public JComboBox<Object> getCmbDivisaFinal() {
		return CmbDivisaFinal;
	}


	public void setCmbDivisaFinal(JComboBox<Object> cmbDivisaFinal) {
		CmbDivisaFinal = cmbDivisaFinal;
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


	
	
	
}
