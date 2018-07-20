package ydemo;

import java.util.regex.*;

public class demo01 {
	
	public static void main(String[] args)
	{
		String s = "2018-07-12 06:37:41 ManualCold(ManualCOLI)              CXP9024418/6_R47A72                 18.Q3      103s (1m43s)    145s (2m25s)    ";
		
		
		
		String regex = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}";
		//regex = "NODE|NO1DE";
		//regex = "(\\d+m\\d+s)";
		Pattern r = Pattern.compile(regex);
		Matcher m = r.matcher(s);	
		if (m.find()) {
            System.out.println(m.group(0));
        }
		//System.out.println(m.replaceAll(""	));
	}

}
