package javaShell;

import java.util.HashMap;
import java.util.Map;

public class translator {
	
	public static Map<String, String[]> map = new HashMap<String, String[]>();
	static {
		map.put("ls", winCMD.dir);
		map.put("note", winCMD.notepad);
	}
	public static String[] trans(String command) {
		if(map.get(command) == null) {
			System.out.println("Invalid command");
			return null;
		}else
			return map.get(command);
	}
}
