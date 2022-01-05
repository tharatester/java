package org.Global;

import org.Global2.ESection;

public class FSection extends ESection {// child
	public void CompanyName() {
		System.out.println("Global");
		
	}
	public static void main(String[] args) {
		FSection f= new FSection();
		f.CompanyName();
		f.ClientName();
	}
	
		
	}


