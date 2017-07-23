package com.gul.onion.util.ssh.command;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * 
 * @author Gul Zaib
 * https://www.linkedin.com/in/codernaut
 * container for predefined shell commands
 * 
 * GUI class will use these maps to auto generate GUI
 * 
 */
public class CommandRegistry {
	
	
	private static ShellCommands shellCommands; 
	private static HashMap<String,ArrayList<CommandType>> commandTypeMap;
	private static HashMap<String,ArrayList<Command>> commandMap;
	private static HashMap<String,String> nameCommandMap;
	
	
	public static void loadCommands(String fileParam) throws JAXBException {
		File file = new File(fileParam);
		JAXBContext jaxbContext = JAXBContext.newInstance(ShellCommands.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		shellCommands = (ShellCommands) jaxbUnmarshaller.unmarshal(file);		
		createCommandTypeMap();
		createCommandMap();
		createNameCommandMap();
		
	}


	private static void createCommandMap() {
		if(commandTypeMap==null)
			commandTypeMap=new HashMap<>();
		
	}


	private static void createNameCommandMap() {
		
		
	}


	private static void createCommandTypeMap() {
		
		
	}
	
	

}
