package chat.controller;
import java.util.*;

import javax.swing.JOptionPane;

import chat.model.Chatbot;


public class ChatController
{
	private Chatbot simplebot;
	public ChatController() 
	{
		simplebot = new Chatbot();//default constructor
	}
	
	public Chatbot getSimplebot()
	{
		return simplebot;
	}
	public void setSimplebot(Chatbot simplebot)
	{
		this.simplebot = simplebot;
	}
	
		
	public void start()
	{
		String userInput = "banana";
		
		while (!userInput.equalsIgnoreCase("quit"))  //user input != to quit
		{
				//userText1 = JOptionPane.showInputDialog(null, "Type 'quit' to exit.");
			userInput = interactWithChatbot(userInput);
		}
	}
	
	public String interactWithChatbot(String text)
	{
		String userInput1 = JOptionPane.showInputDialog(null, "Hi, what do you want to talk about?");		
		String chatbotSays = simplebot.processText(userInput1);
		return chatbotSays;
	}
}