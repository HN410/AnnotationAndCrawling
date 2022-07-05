package com.annotator.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.Properties;

import com.annotator.App;


public class PropertiesClass {
	private static final String address = "MainSettings.properties";
	public static final String WANTED_FILE_KEY = "WantedFile";

	public static void setProperties(Properties properties) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(address);
			properties.store(out, "MainSettings");
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
				}catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	
	public static Properties getProperties(){
		Properties properties = new Properties();
		FileInputStream in = null;

		Path curDir = getApplicationDir(App.class);
		Path propertiesPath = curDir.resolve(address);
		

		try {
			in = new FileInputStream(propertiesPath.toString());
			properties.load(in);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(in != null) {
				try {
					in.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}

		return properties;
	}

	public static Path getApplicationDir(Class<?> cls){
		ProtectionDomain pd = cls.getProtectionDomain();
		CodeSource cs = pd.getCodeSource();
		URL location = cs.getLocation();
		URI uri = null;
		try {
			uri = location.toURI();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			ErrorChecker.errorCheck(e);
		}
		Path path = Paths.get(uri);
		Path curDir = Paths.get(new File(path.toString()).getParent());
		return curDir;
	}

}
