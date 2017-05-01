package com.gul.onion.util.ssh;

import java.util.HashMap;

import com.jcabi.ssh.Shell;

public class SSHFactory {
	
	public static enum ShellType {plain,verbose,safe,empty};
	public static HashMap<String,Shell> connections=new HashMap<String,Shell>();
	public static Shell getConnectionByPassword(String ipadress,String username, String password,ShellType type) {
		
	}
	

}
