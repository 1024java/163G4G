package com.test.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberAction {
     
	List<Integer> list; 
	List<Integer> lit; 
	int readm;
	public void getList(){
		list=new ArrayList<Integer>();
		lit=new ArrayList<Integer>();
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 list.add(4);list.add(5);
		 list.add(6);
		 list.add(7);list.add(8);list.add(9);list.add(10);list.add(11);list.add(12);list.add(13);list.add(14);list.add(15);list.add(16);
		 list.add(17);list.add(18);list.add(19);list.add(20);
     for (int i = 0; i <10; i++) {		   
        double random = Math.random();
        readm=(int) Math.floor(random*10);   
 		list.contains(readm);
 		lit.add(list.get(readm));
 		
    } 
     
	}
  
	  
	public void aa(){
		getList();
	}
	public static void main(String[] args) {
		NumberAction a=new NumberAction();
		 a.getList();
	}
}
