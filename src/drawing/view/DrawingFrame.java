package drawing.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import drawing.controller.DrawingController;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingPanel basePanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new DrawingPanel(baseController);
		
		setupFrame();
	}
	
	//Sets the parameters for the frame
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Drawing");
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
