package com.tutor;

import java.util.List;

public class InnerDependency {
	 public List<String> addressList; 
		
	   public InnerDependency(){
	      System.out.println("Inside SpellChecker constructor." );
	   }
	   public void checkSpelling(){
	      System.out.println("Inside checkSpelling." );
	   }
	  public List<String> getAddressList() {
			System.out.println(addressList);
			return addressList;
		}
		public void setAddressList(List<String> addressList) {
			this.addressList = addressList;
		}
	}
