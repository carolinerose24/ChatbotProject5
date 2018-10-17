package chat.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Chatbot
{
	
	ArrayList <String> responseList = new ArrayList<String>();
	ArrayList <String> spookyList = new ArrayList<String>();

	private String currentUser;
	private String joke;
	private String content;
	private String name;
	

	
	public String askName (String name)
	{
		name = JOptionPane.showInputDialog(null, "What is your name?");
		return name;
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello, how are you?");
		responseList.add("Goodbye?");
		responseList.add("Yes, I agree");
		responseList.add("No, I disagree");
		responseList.add("What's your favorite color?");
		responseList.add("I do not understand.");
		responseList.add("Where are you from?");
		
		spookyList.add("Ghost Shark is coming!");
		spookyList.add("Here's Johnny!!");
		spookyList.add("I see dead people.");
		spookyList.add("He was dead the whole time!");
		spookyList.add("It's alive! It's ALIVE!");
		spookyList.add(" Don't blink. Blink and you're dead. They are fast. Faster than you can believe. Don't turn your back. Don't look away. And don't blink. Good Luck.");
		spookyList.add("Hey, who turned out the lights?");
	}
	
	
	
	public Chatbot() //default  constructor to avoid error/crash
	{ //THIS WAY WORKS
//		currentUser = "Bob";
//		joke = "your face";
//		content = "  ";
//		name = "what is this one for? I don't know.";
		
		//you could also do it this way
		this.name = "bananaaaa"; //or do it this way
		this.currentUser = new String ("BaNAnaAnas");
		this.content = new String ("What a turnout!");
		this.name = new String ("not null");
	
		//initialize lists:
		this.responseList = new ArrayList<String>(); //now these are not null-list of nothing
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	
	public Chatbot(String currentUser, String joke, String content, String name, ArrayList responseList, ArrayList spookyList)
	{
		this.currentUser = currentUser;
		this.joke = joke;
		this.content = content;
		this.name = name;
		this.responseList = responseList;
		this.spookyList = spookyList;
	}
	
	public String processText (String userText)
	{
		String output = "";
		output += "You said: "  + userText;
		
		
		return output;
	}
	
	
	
	
	
//----------------------------------------------getters------------------------------------	
	public String getCurrentUser()
	{
		return currentUser;
	}
	public String getJoke()
	{
		return joke;
	}
	public String getContent()
	{
		return content;
	}
	public String getName()
	{
		return name;
	}
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
//----------------------------------------------setters-----------------------------------------
	
	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser; 
	}
	public void setJoke(String joke)
	{
		this.joke = joke; 
	}
	public void setContent(String content)
	{
		this.content = content; 
	}
	public void setName(String name)
	{
		this.name = name; 
	}
	public void setResponseList(ArrayList<String> responseList)
	{
		this.responseList = responseList; 
	}
	public void setSpookyList(ArrayList<String> spookyList)
	{
		this.spookyList = spookyList; 
	}
	
	

}
