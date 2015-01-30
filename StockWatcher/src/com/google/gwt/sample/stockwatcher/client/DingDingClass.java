package com.google.gwt.sample.stockwatcher.client;

public class DingDingClass implements DingDing{
     Integer totalStock;
     Integer totalChange;
     
     @Override
<<<<<<< HEAD
     public void setTotalStock(Integer n){
    	 this.totalStock = n+2;
    	 if (n > 3){
    		 totalChange++;
    	 }
    	 if (totalStock<5){
    		 totalChange = totalChange *3;
    	 }
=======
     public int setTotalStock(Integer n){
    	 int m = 3+5+6+7;
    	 return m;
>>>>>>> dingbranch
     }
//<<<<<<< HEAD
//	}
//=======

}
//>>>>>>> dingbranch
