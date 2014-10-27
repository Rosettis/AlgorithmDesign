import java.awt.GridLayout;
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
				frame.add(grid[x][y]);
			}
		}
		
	}
}
