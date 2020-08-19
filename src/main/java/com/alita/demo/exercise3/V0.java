package com.alita.demo.exercise3;

import java.util.ArrayList;
import java.util.List;

public class V0 {
	
	public static List<String> G=new ArrayList<String>();
	
	public void getClosure(String s) {
		String st="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='.') {
				if(s.charAt(i+1)>='A'&&s.charAt(i)<='Z')
				st=s.charAt(i+1)+"";
			}
		}
		
		System.out.println(st);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		G.add("S->ac");
//		G.add("S->bd");
//		
//		new V0().getClosure("S->.S");
		Integer i=0;
		i=i+1;
		System.out.println(i);
	}

}
