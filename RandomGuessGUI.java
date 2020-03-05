//Filename RandomGuessGUI.java
//Tom 3/3/2020

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RandomGuessGUI extends JFrame implements ActionListener
{
	//instance variables and objects for this class
	JLabel title = new JLabel("Random Guessing Game");
	JLabel instruction = new JLabel("Enter a number between 1 and 10");
	JTextField input = new JTextField(3);
	JLabel compResult = new JLabel("");
	JLabel summary = new JLabel("");

	JButton button = new JButton("Play Game");

	//Constructor method for this class
	public RandomGuessGUI()
	{
		super("Random Guess GUI");
		setBounds(450, 300, 260, 200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Layout manager for the GUI
		setLayout(new FlowLayout());

		add(title);
		add(instruction);
		add(input);
		add(compResult);
		add(summary);
		add(button);

		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// variables and constants
		int userGuess;
		int comNumber;
		String msg;
		String compNum = "";
		
		// input phase
		userGuess = Integer.parseInt(input.getText());
		
		// calculation phase
		comNumber = (1 + (int)(Math.random() * 10));
		
		if(userGuess == comNumber)
		{
			msg = "YOU WON!";
		}
		else
		{
			if(userGuess > comNumber)
			{
				msg = "Your guess is too high!";
			}
			else 
			{
				msg = "Your guess is too low!";
			}
		}
		
		// Output phase
		//compNum = Integer.toString(comNumber);
		compResult.setText("Computer's number is: " + comNumber);
		summary.setText(msg);
	}

	public static void main(String[] args)
	{
		RandomGuessGUI game1 = new RandomGuessGUI();
		game1.setVisible(true);
	}
}