package drawing.view;

import javax.swing.*;
import drawing.controller.DrawingController;
import java.awt.*;
import java.awt.event.*;


public class DrawingPanel extends JPanel
{
	private DrawingController baseController;
	private SpringLayout baseLayout;
	private JButton rectangleButton;
	private ShapePanel shapePanel;
	
	public DrawingPanel(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		shapePanel = new ShapePanel(baseController);
		baseLayout = new SpringLayout();
		rectangleButton = new JButton("");
		
		
		setupLayout();
		setupPanel();
		setupListeners();
	}
	//Adds the components of the program to the screen
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GRAY);
		this.setMinimumSize(new Dimension(600, 600));
		
		this.add(rectangleButton);
		this.add(shapePanel);
	}
	
	//Locations of the screen components
	private void setupLayout()
	{
		
	}
	//Listeners for actions
	private void setupListeners()
	{
		rectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangles();
			}
		});
	}
}
