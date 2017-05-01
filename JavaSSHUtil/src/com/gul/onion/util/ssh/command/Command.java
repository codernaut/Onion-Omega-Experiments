package com.gul.onion.util.ssh.command;

import javax.xml.bind.annotation.XmlAttribute;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Gul Zaib
 * 
 *
 */

public class Command {
	@Getter@Setter@XmlAttribute
	private String name;
	@Getter@Setter@XmlAttribute
	private String command;

}
