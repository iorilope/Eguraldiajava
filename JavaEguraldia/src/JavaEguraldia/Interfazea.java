/*
 * 20 mar 2024
 * Ioritz Lopetegi
 */
package JavaEguraldia;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;



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
	 * Inerfazeari pack egiten dio.
	 */
	public void pack() {
		  super.pack();
		}
	
	
	
	
	
}
