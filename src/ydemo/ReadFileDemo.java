package ydemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.*;

public class ReadFileDemo {
	
	public  static  void main(String[] args)
	{
		File file = new File("C:\\Users\\live0\\Desktop\\新建文本文档 (4).txt");
		BufferedReader reader = null; 
		ArrayList list = new ArrayList();
		String patten = ".*\\d{4}-\\d{2}-\\d{2}.*";
		try
		{
			// System.out.println("以行为单位读取文件内容，一次读一整行：");  
	            reader = new BufferedReader(new FileReader(file));  
	            String tempString = null;  
	            int line = 1;  
	            // 一次读入一行，直到读入null为文件结束  
	            while ((tempString = reader.readLine()) != null) {  
	                // 显示行号  
	                list.add(tempString);
	                line++;  
	            }  
	            reader.close();  
	            
	            for(int i= list.size();i>0;i--)
	            {
	            	Matcher ms=Pattern.compile(patten).matcher(list.get(i-1).toString());  	           
	            	boolean b = ms.matches();	         
	            	//System.out.println(b+" "+list.get(i-1).toString());
	            	if(b)
	            	{
	            		//System.out.println(b+" "+list.get(i-1).toString());
	            		String str1 = "\\)\\s+\\d+s\\s+\\(";
	            		Pattern r = Pattern.compile(str1);
	            		Matcher m = r.matcher(list.get(i-1).toString());	
	            		if (m.find()) {
	            			String str2 = "\\d+";
	            			r = Pattern.compile(str2);
	            			m = r.matcher(m.group(0));
	            			if(m.find())
	                        System.out.println(m.group(0));
	                    }
	            		break;
	            	}	            
	            }
	            
		}
		catch(IOException  e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}

}
