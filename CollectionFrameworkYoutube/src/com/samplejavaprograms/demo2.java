package com.samplejavaprograms;

public class demo2 {
 	
	public static void main(String[] args)
	{
		System.out.println(anumber);
	}
		    public void setAnumber(int newanumber) 
		    {
		    	private  int anumber;
		        if (newanumber >= 1 && newanumber <= 3) 
		        {
		            anumber = newanumber;
		        } 
		        else
		        {
		            throw new IllegalArgumentException("anumber out of range");
		        }
		    }

	}


