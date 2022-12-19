package com.flag;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	private FlagPanel panel = new FlagPanel();
	
	public MyFrame() throws HeadlessException{
		
		setTitle("Indian Flag");
		setSize(440,600);
		setLocationByPlatform(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
	}
	
}
