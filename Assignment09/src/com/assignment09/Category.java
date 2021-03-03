package com.assignment09;

import java.io.Serializable;

public class Category implements Serializable  
{
	
	private static final long serialVersionUID = 1L;
	
	private int catID;
	private String catName;
	
	Category()
	{
		catID=0;
		catName="";
	}

	public int getCatID() 
	{
		return catID;
	}

	public void setCatID(int catID) 
	{
		this.catID = catID;
	}

	public String getCatName()
	{
		return catName;
	}

	public void setCatName(String catName) 
	{
		this.catName = catName;
		if(catName.equalsIgnoreCase("horror"))
			this.setCatID(2);
		if(catName.equalsIgnoreCase("thriller"))
			this.setCatID(1);
		if(catName.equalsIgnoreCase("suspense"))
			this.setCatID(3);
	}
	
	
}