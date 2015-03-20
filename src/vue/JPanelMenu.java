/*
 * JPanelMenu.java
 *
 * Copyright (C) 2015 Erwan Marchand (mccartnay) <erwan.marchand@orange.fr>
 *
 *
 * Distributed under WTFPL terms
 *
 *            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *                    Version 2, December 2004
 *
 * Copyright (C) 2004 Sam Hocevar <sam@hocevar.net>
 *
 * Everyone is permitted to copy and distribute verbatim or modified
 * copies of this license document, and changing it is allowed as long
 * as the name is changed.
 *
 *            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 *
 *  0. You just DO WHAT THE FUCK YOU WANT TO.
 *
 */

import java.swing.*;
import java.awt.event.*;
import java.awt.*;


public class JPanelMenu extends JPanel {

	private JButton bActualiser;
	private JButton bQuitter;
	private JButton bSites;
	private JList lNews;
	private MoteurUI moteurUI;

	public JPanelMenu(MoteurUI unMoteurUI) {

		moteurUI = unMoteurUI;
		bActualiser = new JButton("Actualiser");
		bQuitter = new JButton("Quitter");
		bSites = new JButton("Sites");
		lNews = new JList(moteurUI.getNews());

		this.add(bSites, BorderLayout.SOUTH);
		bSites.addMouseListener(new MouseAdapter(){
			public void MouseClicked(MouseEvent event) {
				moteurUI.setPanel(PANEL_SITE);
			}
		});

		this.add(bActualiser, BorderLayout.SOUTH);
		bActualiser.addMouseListener(new MouseAdapter(){
			public void MouseClicked(MouseEvent event) {
				moteurUI.actualiser();
			}
		});

		this.add(bQuitter, BorderLayout.SOUTH);
		bQuitter.addActionListener(new ActionListener(){
			public void ActionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

	}

}


