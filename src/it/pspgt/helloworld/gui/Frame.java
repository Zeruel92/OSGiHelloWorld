/*
 * Author Gabriele Tramonte
 * Classe Finestra che richiama il comando al click del bottone
 */
package it.pspgt.helloworld.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import it.pspgt.helloworld.api.HelloWorldInterface;

public class Frame extends JFrame implements ActionListener {
	private volatile HelloWorldInterface service;
	private JButton b;
	public Frame(){
		b=new JButton("Click Here!");
		add(b);
		b.addActionListener(this);
		this.setVisible(true);
		this.pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		service.hello();

	}
	
	public void stop(){
		this.dispose();
	}

}
