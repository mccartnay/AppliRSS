/*
 * MoteurUI.java
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

public class MoteurUI extends JFrame {

	private JPanelMenu JPM;
	private JPanelNews JPN;
	private JPanelSites JPS;
	private Moteur moteur;
	private int panel;

	public MoteurUI(JPanelMenu uneJPM, JPanelNews uneJPN, JPanelSites uneJPS, Moteur unMoteur) {

		JPM = uneJPM;
		JPN = uneJPN;
		JPS = uneJPS;
		moteur = unMoteur;

		setSize(800,600);
		setTitle("AppliRSS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


	public void paint(Graphics g) {

		super.paint();

	}

	public void actualiser() {

		if (panel = PANEL_MENU) {
		}
		if (panel = PANEL_SITE) {
		}
		if (panel = PANEL_NEWS) {
		}
		repaint();

	}

}


