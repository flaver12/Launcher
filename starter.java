	/**
	 * 
	 * @author flaver, flaverkleiber@yahoo.de
	 * @version 1.0
	 * @cophyright 2013 flavcode
	 *
	 */

public class starter {
	
private final String start_tag = "<mod_string>";
private final String end_tag = "</mod_string>";

	
	public void normalStart (byte[] buff) throws Exception{
		String xml = new String(buff);
		int pos1;
		int pos2;
		
		pos1 = xml.indexOf(start_tag);
		if(pos1 < 0) {
			throw new Exception("Starttag not found!("+start_tag+")");
		}
		
		pos1 += start_tag.length();
		
		pos2 = xml.indexOf(end_tag);
		if(pos2 < 0) {
			throw new Exception("Endtag not found!("+end_tag+")");
		}
		
		String params = xml.substring(pos1, pos2);
		System.out.println("["+params+"]");
		
		ProcessBuilder pb = new ProcessBuilder("arma3.exe", "-mod="+params);
		pb.start();
		System.exit(0);
	}
	
	public void editorStart(byte[] buff) throws Exception {
		String xml = new String(buff);
		int pos1;
		int pos2;
		
		pos1 = xml.indexOf(start_tag);
		if(pos1 < 0) {
			throw new Exception("Starttag not found!("+start_tag+")");
		}
		
		pos1 += start_tag.length();
		
		pos2 = xml.indexOf(end_tag);
		if(pos2 < 0) {
			throw new Exception("Endtag not found!("+end_tag+")");
		}
		
		String params = xml.substring(pos1, pos2);
		System.out.println("["+params+"]");
		
		ProcessBuilder pb = new ProcessBuilder("arma3.exe", "-mod="+params,"-noSplash","-showScriptErrors","-window");
		pb.start();
		System.exit(0);
	}
	
}
