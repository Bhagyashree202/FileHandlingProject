package com.LockedMe;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager
{
	/**
	 * This method return the file names from the folder
	 * @param folderpath
	 * @return List<String>
	 */

	public static List<String> getAllFiles(String folderpath) 
	{
		// Creating file object
		File f1=new File(folderpath);
		
		//Getting all the files into FileArray
		File[] listofFiles = f1.listFiles();
		List<String> fileNames=new ArrayList<String>();
		
		for(File f:listofFiles)
			fileNames.add(f.getName());
		
		//return the List
		return fileNames;

	}
	
	/**
	 * This method will create or append content into the file specified
	 * @param folderpath
	 * @param fileName
	 * @param content
	 * @return
	 */
	
	public static boolean createFiles(String folderpath,String fileName,List<String> content)
	{
		try
		{
			File f1 = new File(folderpath, fileName);
					FileWriter fw = new FileWriter(f1);
					
			for(String s:content)
			{
				fw.write(s+"\n");
			}
			fw.close();
			return true;
		}
		catch(Exception Ex)
		{
	        return false;
		}
	
	}
   /**
    * This method will delete the file name if it exists.
    * @param folderpath
    * @param fileName
    * @return
    */
	
	public static boolean deleteFile(String folderpath,String fileName)
	{
	
		File file = new File(folderpath+"\\"+fileName);
		
		try
		{
		   if(file.delete())
			   return true;
		   else
			   return false;
		}
		catch(Exception Ex)
		{
			return false;
		}
	}re
		
  /**
   * This method search the file if exist
   * @param folderpath
   * @param fileName
   * @return
   */
		
	

    public static boolean searchFile(String folderpath,String fileName)
  {
    //adding folder path with file name and creating file object
	File file = new File(folderpath+"\\"+fileName);
	 if(file.exists())
		   return true;
	   else
		   return false;
  }
}
