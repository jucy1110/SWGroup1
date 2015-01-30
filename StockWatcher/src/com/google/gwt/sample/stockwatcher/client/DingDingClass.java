package com.google.gwt.sample.stockwatcher.client;

public class DingDingClass implements DingDing{
     Integer totalStock;
     Integer totalChange;
     
     @Override
     public void setTotalStock(Integer n){
    	 this.totalStock = n+2;
    	 if (n > 3){
    		 totalChange++;
    	 }
     }
	}