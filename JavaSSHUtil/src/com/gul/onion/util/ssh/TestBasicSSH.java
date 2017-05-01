package com.gul.onion.util.ssh;

import java.io.IOException;

import com.jcabi.ssh.SSH;
import com.jcabi.ssh.SSHByPassword;
import com.jcabi.ssh.Shell;
import com.jcabi.ssh.Shell.Plain;

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

	private static final String host="192.168.100.3";
	private static final int port=22;
	private static final String userName="root";
	private static final String password ="mahmahmah";
	
	public static void main(String[] args) {
		Shell shell;
		try {
			shell = new SSHByPassword(host, port, userName, password);
			Plain plain= new Shell.Plain(shell);
		    String stdout=plain.exec("oled-exp -i");
		    for(int i=0;i<1000;i++) {
		    	if(i%4==0)
		    		plain.exec("oled-exp writeByte 0x00");
		    	else
		    		plain.exec("oled-exp writeByte 0xff");
		    	System.out.println(""+i);
		    		
		    }
			System.out.println(stdout);
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
