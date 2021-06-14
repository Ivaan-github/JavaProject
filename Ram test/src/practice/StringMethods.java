package practice;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String str="Sankoju";
		
		//Method1: using StringBuilder to reverse string
		
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		System.out.println(sb.reverse());

//		Method2: Using Loop and reverse string
		
		String result="";
		
		for(int i=str.length()-1;i>=0;i--) {
			result=result+str.charAt(i);
			
		}
		System.out.println(result);
		
		// Method3: using split 
		
		String rev="sankoju";
		String [] br=rev.split("");
	
		String w="";
		for (int h=br.length-1;h>=0;h--) {
	w=w+br[h];	
		}
		System.out.println(w);
		
		// To convert to Lowercase
		String a="SANKOJU";
		System.out.println(a.toLowerCase());
		
		//Convert to Uppercase
		String b="sankoju";
		System.out.println(b.toUpperCase());
		
		
		//Verify chars repeated in string
		String name="Ram Sankoju";
		int icount=0;
		char compstring='a';
		
		for (int i=1;i<name.length();i++)
		{
			
			if (compstring==name.charAt(i)){ 
				icount=icount+1;
			}
		}
		System.out.println(icount);
		
		
		//Verify the string Polyndrome
		
		String pstr="Mom";
		StringBuilder z=new StringBuilder();
		z.append(pstr);
		if (pstr.equalsIgnoreCase(z.reverse().toString())) {
			System.out.println("It's a plyndrome");
		}
		else
		{
			System.out.println("Given string is not a polyndrome");
		}
		
		
		//Split and display words in reverse order
		
		String val="Ram,Ivaan,Himan,Anu,Yashi,Avika";
		String order="";
		String [] p= val.split(",");
		for (int i=p.length-1;i>=0;i--) {
			
			order=order+p[i];
		}
		System.out.println(order);
		
		
		//Split  and sort
		
				String val1="Ram,Ivaan,Himan,Anu,Yashi,Avika";
				String [] r= val1.split(",");
			     Arrays.sort(r);
				System.out.println(Arrays.toString(r));
				
						
		//Search a substring in string
				String u="Hello Testing";
		System.out.println(u.toLowerCase().contains("testing"));
		
		
		
		
	

	}

}
