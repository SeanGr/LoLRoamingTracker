import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;


public class GUIwindow {

	GUIwindow(){
		
	JFrame guiFrame = new JFrame();
	
	guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	guiFrame.setTitle("Example GUI");
	guiFrame.setSize(300,250);
	
	guiFrame.setLocationRelativeTo(null);
	
	String[] testArray = {"test1", "test2"};
	
	String[] testArrayTwo = {"what", "OMG"};

	//First JPanel
	final JPanel comboPanel = new JPanel();
	JLabel comboLb1 = new JLabel("First");
	JComboBox fruits = new JComboBox(testArray);
	
	comboPanel.add(comboLb1);
	comboPanel.add(fruits);
	
	
	// Create the second JPanel. 
	//Add a JLabel and Jlist and make use the JPanel is not visible.
	
	final JPanel listPanel = new JPanel();
	listPanel.setVisible(false);
	JLabel listLb1 = new JLabel("Second: ");
	JList vegs = new JList(testArrayTwo);
	vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);
	
	listPanel.add(listLb1);
	listPanel.add(vegs);
	
	JButton vegFruitBut = new JButton( "Toggle");
	
	//The ActionListener class is used to handle the 
	//event that happens when the user clicks the button.
	//As there is not a lot that needs to happen we can 
	//define an anonymous inner class to make the code simpler.
	vegFruitBut.addActionListener(new ActionListener()
	{
	@Override
	public void actionPerformed(ActionEvent event)
	{
		//When the fruit of veg button is pressed 
		//the setVisible value of the listPanel and 
		//comboPanel is switched from true to  
		//value or vice versa.
		listPanel.setVisible(!listPanel.isVisible());
		comboPanel.setVisible(!comboPanel.isVisible());
	}
	});
	
	//The JFrame uses the BorderLayout layout manager.
	//Put the two JPanels and JButton in different areas.
	guiFrame.add(comboPanel, BorderLayout.NORTH); 
	guiFrame.add(listPanel, BorderLayout.CENTER); 
	guiFrame.add(vegFruitBut,BorderLayout.SOUTH); 
	
	//make sure the JFrame is visible 
	guiFrame.setVisible(true);
	
	}
	
}
