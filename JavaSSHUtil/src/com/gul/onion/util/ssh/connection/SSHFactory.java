package com.gul.onion.util.ssh.connection;

import java.net.UnknownHostException;
import java.util.HashMap;

import com.jcabi.ssh.SSHByPassword;
import com.jcabi.ssh.Shell;
/**
 * 
 * @author Gul Zaib
 * Shell factory class
 *
 */
public class SSHFactory {
	
	public static enum ShellType {plain,verbose,safe,empty};
	private static HashMap<String,Shell> connections=new HashMap<String,Shell>();
	/**
	 * will return a connection of shell if already created with given params or will create a new shell connection
	 * @param ipadress
	 * @param username
	 * @param password
	 * @param port
	 * @param type
	 * @return
	 * @throws UnknownHostException
	 */
	public static Object getConnectionByPassword(String ipadress,String username, String password,int port,ShellType type) throws UnknownHostException {
		String key=username+"/"+password+"@"+ipadress+":"+port+"--"+type;
		Shell shell=connections.get(key);
		if(shell==null) {
			shell= new SSHByPassword(ipadress, port, username, password);
			switch (type) {
			case empty:
				return new Shell.Empty(shell);
			case plain:
				return new Shell.Plain(shell);
			case safe:
				return new Shell.Safe(shell);
			case verbose:
				return new Shell.Verbose(shell);
			default:
				return new Shell.Plain(shell);
			
			}
		}
		else
			return null;
	}
	

}
