package javaShell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javaShell {
	
	private core core;
	
	public static void main(String args[]) {
		
		
		javaShell shell = new javaShell();
		
		try {
			shell.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void run() throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		String line = null;
		core = new core();
		while((line = br.readLine()) != null) {
			 
			 if(line.equals("exit")) {
				 System.exit(0);
			 }
			 core.doCMD(translator.trans(line));
			 
		}
	}

}
