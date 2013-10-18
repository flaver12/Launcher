/**
 * 
 * @author flaver, flaverkleiber@yahoo.de
 * @version 1.0
 * @cophyright 2013 flavcode
 *
 */

//Imports
import java.io.*;
import java.net.*;

public class connector  {
	//Variabel
     String fAddress = "http://files.24th-sts.eu/launcher/24sts_launcher.xml"; 
    

    public byte[] getStartParams () throws Exception {
    	
		OutputStream outStream = null;
		HttpURLConnection http  = null;
		
		InputStream is = null;
		URL Url;
		Url= new URL(fAddress);
		
		http = (HttpURLConnection) Url.openConnection();
		int stat = http.getResponseCode();
		is = http.getInputStream();

	
	//If false Request trhow exception!
	if(stat != 200) {
		throw new Exception("Request nicht erfolgreich:" + stat);
	 }
	
	   int len =  http.getContentLength();
	   
	   //If filelenght is 0 error!
	   if(len == 0) {
		   throw new Exception("Leeres File!");
	   } 
	   
	   byte[] buff = new byte[len];
	   is.read(buff);
	   is.close();
	   
	   return buff;
   }
   
    //Connects to the FTP
   public void connectFtp () {
	   
	   
	   
   }
}
