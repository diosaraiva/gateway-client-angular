package com.diosaraiva.clientapi.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.springframework.stereotype.Service;

@Service
public class FileUtil {
	public static byte[] unzipFile(byte[] zip) throws IOException {
		ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(zip));
		ZipEntry entry = zis.getNextEntry();

		byte[] buffer = new byte[1024];
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		while (entry != null) {
			int len;
			while ((len = zis.read(buffer)) > 0) {
				baos.write(buffer, 0, len);
			}
			baos.close();
			entry = zis.getNextEntry();
		}

		return baos.toByteArray();
	}

	public File[] filterFiles (String dir, String charSequence, String extension) {
		File file = new File(dir);

		FilenameFilter filenameFilter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.contains(charSequence) && name.endsWith(extension);
			}
		};

		File[] matchingFiles = file.listFiles(filenameFilter);

		return matchingFiles;
	}

	public static byte[] readFileToByteArray (File file){
		FileInputStream fis = null;
		
		byte[] byteArray = new byte[(int) file.length()];
		try{
			fis = new FileInputStream(file);
			fis.read(byteArray);
			fis.close();        
		}catch(IOException ioExp){
			ioExp.printStackTrace();
		}
		
		return byteArray;
	}
	
	public void getFileInfo (File file) {
	    if (file.exists()) {
	      System.out.println("File name: " + file.getName()); 
	      System.out.println("Absolute path: " + file.getAbsolutePath()); 
	      System.out.println("Writeable: " + file.canWrite()); 
	      System.out.println("Readable " + file.canRead()); 
	      System.out.println("File size in bytes " + file.length());
	    } else {
	      System.out.println("The file does not exist.");
	    }
	}
}