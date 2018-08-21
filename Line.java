package swing;
import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Line extends JFrame

{

	public Line()
	{

		setSize(960,960);

		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void paint(Graphics g)

	{

	g.setColor(Color.RED);

		g.drawLine(0, 480, 960, 480);

	}



public static void main(String[] args)

{

	Line t=new Line();

}

}