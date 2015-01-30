package com.google.gwt.sample.stockwatcher.client;

public class DingDingClass implements DingDing{
     Integer totalStock;
     
     @Override
     public void setTotalStock(Integer n){
    	 this.totalStock = n+2;
     }

}
