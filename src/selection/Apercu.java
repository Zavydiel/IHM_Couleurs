package selection;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import couleurs.Palette;

import sun.misc.Perf.GetPerfAction;

import fenetre.Fenetre;

public class Apercu extends JPanel {
	 JFrame fenetre;
	
	public Apercu(JFrame parent) {
		super();
		this.fenetre = parent;
		setPreferredSize(new Dimension(1366,300));
		Graphe graph = new Graphe(fenetre);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(BorderFactory.createTitledBorder("Apercu"));
		add(graph);
		
		JButton bouton = new JButton("Exportation");
		bouton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				((Fenetre) fenetre).permuterEcran();
				
			}

			
		});

		add(bouton);
	}
	
	public Palette GetPalette() {
		return ((Fenetre) fenetre).getPalette();
	}
	
}
