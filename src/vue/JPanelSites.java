/*
 * JPanelSites.java
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

public class JPanelSites {

	private JButton bQuitter;
	private MoteurUI moteurUI;

	public JPanelSites(MoteurUI unMoteurUI) {

		moteurUI = unMoteurUI;
		bQuitter = new JButton("Quitter");

		this.add(bQuitter, BorderLayout.SOUTH);
		bQuitter.addActionListener(new ActionListener(){
			public void ActionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

	}

}


