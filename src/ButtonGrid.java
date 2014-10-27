import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonGrid {
	JFrame frame = new JFrame();//create frame and grid
	JButton[][] grid;
	
	
	public ButtonGrid(int width, int height)
	{
		frame.setLayout(new GridLayout(width,height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		grid=new JButton[width][height];//allocate grid size
		
		for (int y=0; y<height;y++)//grid buttons added to grid
		{
			for(int x=0; x<width; x++)
			{
				grid[x][y]=new JButton("("+x+", "+y+")");//will display (x, y)
				
				grid[x][y].addActionListener(new ActionListener(){//add action listener to each button to change color of button when pressed
					public void actionPerformed(ActionEvent e){

					    ((JButton)e.getSource()).setBackground(Color.red);
					    }
					});
				
				
				frame.add(grid[x][y]);
			}
		}
		
	}
}
