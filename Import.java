package object;
import java.util.Scanner;
public class solution {
	 String mergeAlternately(String word1, String word2) {
		 StringBuffer res = new StringBuffer("");
		 for(int i=0;i<word1.length();i++) {
			 res.append(word1.charAt(i));
			 res.append(word2.charAt(i));
			 if(i==word1.length() && i==word2.length())
				 return res.toString();
		 }
		return res.toString();
		 
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		solution obj = new solution();
		String res = obj.mergeAlternately(word1,word2);
		System.out.println(res);
		
	}
	
	

}
