package logging;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	
	public static void takelogs(String classname , String msg)
	{
		
		DOMConfigurator.configure("../ExtentReport/Layout.xml");
		Logger Log = Logger.getLogger(classname);
		Log.info(msg);
		
	}

}
