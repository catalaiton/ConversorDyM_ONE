package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;

public class FrmEleccion extends JFrame {

	private JPanel PanelEleccion;
	private JMenuBar menuBar;
	private JMenu Menu;
	private JMenuItem CDivisas;
	private JMenuItem CPeso;
	
	public FrmEleccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 137);
		PanelEleccion = new JPanel();
		PanelEleccion.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelEleccion);
		PanelEleccion.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(80, 33, 150, 22);
		PanelEleccion.add(menuBar);
		
		Menu = new JMenu("Seleccione un conversor");
		menuBar.add(Menu);
		
		CDivisas = new JMenuItem("Conversor de Divisas");
		Menu.add(CDivisas);
		
		CPeso = new JMenuItem("Conversor Medidas de Peso");
		Menu.add(CPeso);
		
		JLabel lblNewLabel = new JLabel("Bienvenido/a");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(109, 0, 94, 22);
		PanelEleccion.add(lblNewLabel);
	}

	public JPanel getPanelEleccion() {
		return PanelEleccion;
	}

	public void setPanelEleccion(JPanel panelEleccion) {
		PanelEleccion = panelEleccion;
	}


	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public JMenu getMenu() {
		return Menu;
	}

	public void setMenu(JMenu menu) {
		Menu = menu;
	}

	public JMenuItem getCDivisas() {
		return CDivisas;
	}

	public void setCDivisas(JMenuItem cDivisas) {
		CDivisas = cDivisas;
	}

	public JMenuItem getCPeso() {
		return CPeso;
	}

	public void setCPeso(JMenuItem cPeso) {
		CPeso = cPeso;
	}
}
