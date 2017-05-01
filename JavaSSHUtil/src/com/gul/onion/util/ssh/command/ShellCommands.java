package com.gul.onion.util.ssh.command;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Gul Zaib
 * https://www.linkedin.com/in/codernaut
 * container class for root element in command xml
 *
 */

@XmlRootElement
public class ShellCommands {
	
	@Getter@Setter@XmlAttribute
	private String name;
	@Getter@Setter@XmlElement
	private ArrayList<CommandType> types; 
	

}
