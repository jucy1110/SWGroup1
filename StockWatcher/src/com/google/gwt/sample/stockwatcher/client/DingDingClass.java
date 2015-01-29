package com.google.gwt.sample.stockwatcher.client;

public class DingDingClass {
     Integer totalStock;
     Integer totalChange;
     
     public void setTotalStock(Integer n){
    	 this.totalStock = n+2;
    	 if (n > 3){
    		 totalChange++;
    	 }
    	 
     }
}
