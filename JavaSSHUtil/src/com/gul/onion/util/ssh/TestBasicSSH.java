package com.gul.onion.util.ssh;

import com.jcabi.ssh.Shell;

import java.io.IOException;
import java.net.UnknownHostException;

import com.jcabi.ssh.SSH;

/**
 * 
 * Basic ssh test class
 * @author Gul Zaib
 *
 */
public class TestBasicSSH {
	
	/**
	 * test code from
	 * http://ssh.jcabi.com/
	 * @param args
	 */

	private static final String host="";
	private static final int port=22;
	private static final String userName="root";
	private static final String password ="test"
	
	public static void main(String[] args) {
		Shell shell;
		try {
			shell = new SSH(host, port, userName, password);
			String stdout = new Shell.Plain(shell).exec("echo 'Hello, world!'");
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
