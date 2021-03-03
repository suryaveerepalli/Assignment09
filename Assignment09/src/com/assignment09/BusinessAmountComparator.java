package com.assignment09;

import java.util.Comparator;

public class BusinessAmountComparator implements Comparator<Movie>
{

	@Override
	public int compare(Movie o1, Movie o2) 
	{
		return Double.compare(o1.getTotalBusiness(), o2.getTotalBusiness());
	}

}

