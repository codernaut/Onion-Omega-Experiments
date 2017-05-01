package com.gul.onion.util.ssh.command;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Gul Zaib
 * 
 * jaxb class commandtypes
 *
 */

public class CommandType {
	@Getter@Setter@XmlAttribute
	private String name;
	@Getter@Setter@XmlElement
	private ArrayList<Command> commands; 

}
