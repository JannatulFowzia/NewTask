package com.tutor;

import java.util.List;

public class NewBean {
	private InnerDependency spellChecker;
	public List<String> addressList; 
	public List<String> getAddressList() {
		System.out.println(addressList);
		return addressList;
	}
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	   // a setter method to inject the dependency.
	   public void setSpellChecker(InnerDependency spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	   
	   // a getter method to return spellChecker
	   public InnerDependency getSpellChecker() {
	      return spellChecker;
	   }
	   
	   
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }

}
