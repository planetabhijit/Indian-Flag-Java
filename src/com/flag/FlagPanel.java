package com.flag;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FlagPanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.decode("#FF8F1C"));
		g.drawRect(10,10,400,70);
		g.fillRect(10,10,400,70);
	
		g.setColor(Color.WHITE);
		g.drawRect(10, 80,400,70);
		g.fillRect(10, 80,400,70);
		
		g.setColor(Color.GREEN);
		g.drawRect(10, 150, 400, 70);
		g.fillRect(10, 150, 400, 70);
		
		g.setColor(Color.BLACK);
		g.fillRect(10,10,5,640);

		try {
			
			Image img = ImageIO.read(new FileInputStream("src/ashoka.png"));
			g.drawImage(img,165,80,70,70,null);
			g.setFont(new Font("Lato", Font.BOLD, 30));
			g.setColor(Color.BLUE);
			g.drawString("Happy Independance Day", 26, 480);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
