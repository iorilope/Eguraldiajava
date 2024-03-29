/*
 * 20 mar 2024
 * Ioritz Lopetegi
 */
package JavaEguraldia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.*;



// TODO: Auto-generated Javadoc
/**
 * 
 * @author Ioritz Lopetegi
 */
public class Interfazea extends JFrame {

	/** Interfazearen izena. */
	private String InterfIzena;
	
	/** Interfazearen titulua. */
	private String InterfTitulua;
	
	/** Interfazearen  altuera. */
	private Integer InterfAltuera;
	
	/** Interfazearen zabalera. */
	private Integer InterfZabalera;
	
	/** Interfazearen Layout-a. */
	private LayoutManager Interflayout;
	
	/** Interfazea ikusgarri / ez ikusgarri. */
	private boolean InterfIkusi;

	/** Gure interfazearen konponenteak gordetzeko arraylist-a. */
	private ArrayList Konponenteak;
	
	/** Interfazearen posizioa X. */
	private Integer InterfPosX;
	
	/** Interfazearen posizioa Y. */
	private Integer InterfPosY;


	/**
	 * Interfaze berria sortu eta hasieratzen du.
	 *
	 * @param izenaString , Interfazaren izena
	 * @param tituluaString, interfazearen titulua
	 * @param altuera, interfazearen altuera
	 * @param zabalera, interfazearen zabalera
	 * @param ikusgarri, interfazearen ikusgarritasuna
	 * @see Interfazea#initUI()
	 */
	public Interfazea(String izenaString, String tituluaString, int altuera, int zabalera, boolean ikusgarri) {

		this.InterfIzena = izenaString;
		this.InterfTitulua = tituluaString;
		this.InterfAltuera = altuera;
		this.InterfZabalera = zabalera;
		this.InterfIkusi = ikusgarri;
		this.Konponenteak = new ArrayList<>();
		

		this.initUI();

	}
	
	/**
	 * 
	 */
	public Interfazea() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return Interfazearen titulua
	 */
	public String getInterfTitulua() {
		return InterfTitulua;
	}

	/**
	 * @return Interfazearen layout-a
	 */
	public LayoutManager getInterflayout() {
		return Interflayout;
	}

	/**
	 * @return Interfazea ikusgarri edo ez
	 */
	public boolean getisInterfIkusi() {
		return InterfIkusi;
	}
	
	/**
	 * Konponenteak eskuratzen ditu
	 *
	 * @return Jframe konponenteak
	 */
	public ArrayList<JComponent> getKonponenteak() {
		  
		  return new ArrayList<>(Konponenteak);
		}
	
	/**
	 * Jframe konponenteak garbitu.
	 */
	public void konponenteakgarbitu () {
		Konponenteak.clear();
	}
	
	/**
	 * Window Listener-a gehitzen du.
	 *
	 * @param listener,xagu gertaera
	 */
	public void addWindowListener(WindowListener listener) {
		  super.addWindowListener(listener);
		}
	
	/**
	 * Key listener-a gehitu.
	 *
	 * @param listener, teklatu gertaera
	 */
	public void addKeyListener(KeyListener listener) {
		  super.addKeyListener(listener);
		}

	/**Interfazearen titulua ezarri
	 * 
	 * @param Interfazearen titulua
	 */
	public void setInterfTitulua(String interfTitulua) {
		InterfTitulua = interfTitulua;
	}

	/**Interfazearen layout-a ezarri
	 * 
	 * @param Interfazearen layout mota
	 */
	public void setInterflayout(LayoutManager interflayout) {
		Interflayout = interflayout;
	}

	/** ikusgarritasuna ezarri inerfazearentzat
	 * 
	 * @param interfIkusi  
	 */
	public void setInterfIkusi(boolean interfIkusi) {
		InterfIkusi = interfIkusi;
	}

	
	/**
	 * Interfaze tamaina ezartzen du
	 *
	 * @param altuera, interfazearen altuera zehatza, zenbaki osoa
	 * @param zabalera, interfazearen zabalera zehatza,zenbaki osoa
	 */
	public void setInterfTamaina( int altuera, int zabalera) {
		
		InterfAltuera = altuera;
		InterfZabalera = zabalera;
		
	}
	
	/**
	 * Interfazearen posizioa itzultzen du.
	 *
	 * @param x 
	 * @param y 
	 */
	public void SetInterfPosizioa ( int x , int y) {
		
		InterfPosX = x;
		InterfPosY = y;
			
	}
	
	/**
	 * Interfazea hasieratzen du.
	 */
	private void initUI() {
	   setName(InterfIzena);
	    setTitle(InterfTitulua);
	    setSize(InterfZabalera, InterfAltuera);
	    setVisible(InterfIkusi);
	    setLayout(new BorderLayout());
	}
	
	/**
	 * Konponentea gehitzen du
	 *
	 * @param konponentea, JFrame-eko konponenteak
	 */
	public void addkonponentea(JComponent konponentJComponent) {
		  Konponenteak.add(konponentJComponent);
		// JFrameren maketazioari ere osagaia gehitu nahiko bageenioke hemen : konponenteak.add(component,borderlayout.center)
		}
	
	
	/**
	 * Konponentea ezabatzen du.
	 *
	 * @param konponentea, JFrame-eko konponenteak
	 */
	public void removekonponentea(JComponent konponentJComponent) {
		  Konponenteak.remove(konponentJComponent);
	
		}
	
	/**
	 * Content pane-a eskuratzen du.
	 *
	 * @return gure containerra
	 */
	public Container getContentPane() {
		  return super.getContentPane();
		}
	
	/**
	 * Interfazeari pack egiten dio.
	 */
	public void pack() {
		  super.pack();
		}
	public void HomeMenuSortu() {
        Interfazea homeMenuInterfazea = new Interfazea("JavaEguraldia", "JavaEguraldia", 600, 1000, true);
        
        BorderLayout homemenuBorderLayout = new BorderLayout();
        
        homeMenuInterfazea.setLocationRelativeTo(null);
        homeMenuInterfazea.setInterflayout(homemenuBorderLayout);
        homeMenuInterfazea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //Goiko panela 
        JPanel GoikoPanela = new JPanel();
        GoikoPanela.setLayout(new FlowLayout());
        //GoikoPanela.setBackground(Color.blue);

        // Konponenteak gehitu goiko panelean
        JLabel ubikazioaJLabel = new JLabel("Ubikazioa: ");
        GoikoPanela.add(ubikazioaJLabel);

        JTextField ubikazioaTextField = new JTextField(20);
        GoikoPanela.add(ubikazioaTextField);

        JLabel DataorduLabel = new JLabel("Eguna eta ordua: ");
        GoikoPanela.add(DataorduLabel);

        JLabel DataorduTextField = new JLabel();
        DataorduTextField.setText(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
        GoikoPanela.add(DataorduTextField);
        GoikoPanela.setPreferredSize(new Dimension(600,50));
       
        homeMenuInterfazea.add(GoikoPanela, BorderLayout.SOUTH);
        
        
        
        
        JPanel ErdikoPanela = new JPanel();
        ErdikoPanela.setLayout(new BorderLayout());

        //Erdiko Paneleko konponenteak gehitu
        JLabel tenperaturaLabel = new JLabel("Tenperatura: ");
        ErdikoPanela.add(tenperaturaLabel, BorderLayout.NORTH);

        JLabel tenperaturaTextField = new JLabel();
        tenperaturaTextField.setText("20°C");
        ErdikoPanela.add(tenperaturaTextField, BorderLayout.CENTER);

        JLabel BaldintzaMeteorologikoakLabel = new JLabel("Baldintza Meteorologikoak: ");
        ErdikoPanela.add(BaldintzaMeteorologikoakLabel, BorderLayout.SOUTH);

        JLabel BaldintzaMeteorologikoakTextField = new JLabel();
        BaldintzaMeteorologikoakTextField.setText("Eguzkitsua");
        ErdikoPanela.add(BaldintzaMeteorologikoakTextField, BorderLayout.SOUTH);

        ImageIcon KlimaIrudia = new ImageIcon("C:\\Users\\1ag3.iorilope\\Downloads\\weather-forecast.png"); // irudia
        JLabel KlimaIrudiaLabel = new JLabel(KlimaIrudia);
        ErdikoPanela.add(KlimaIrudiaLabel, BorderLayout.EAST);

       
        
        homeMenuInterfazea.add(ErdikoPanela, BorderLayout.EAST);
        
        
        
        
        
        
        
        
        homeMenuInterfazea.pack();
        
    }
	
	
	

	   

	    private static JPanel crearPanelInferior() {
	        JPanel panelInferior = new JPanel();
	        panelInferior.setLayout(new FlowLayout());

	        // Añadir componentes al panel inferior
	        JLabel pronosticoLabel = new JLabel("Pronóstico: ");
	        panelInferior.add(pronosticoLabel);

	        JComboBox pronosticoComboBox = new JComboBox();
	        pronosticoComboBox.addItem("Hoy");
	        pronosticoComboBox.addItem("Mañana");
	        pronosticoComboBox.addItem("Próximos 7 días");
	        panelInferior.add(pronosticoComboBox);

	        return panelInferior;
	    }
	}
	
	
	
	

