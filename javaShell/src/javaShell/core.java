package javaShell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;



public class core {
	
	private Process proc;
	
	public void doCMD(String[] cmd) throws IOException {
		
		if(cmd == null) {
			return;
		}
		this.proc = Runtime.getRuntime().exec(cmd);
		InputStream fis = proc.getInputStream();
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String line = null;
		
		while((line = br.readLine())!= null) {
			//System.out.println(core.decode(line, "gbk"));
			System.out.println(line);
		}
		
	}
	
	public static String decode(String value, String code) {
		try {
			return java.net.URLDecoder.decode(value, code);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
