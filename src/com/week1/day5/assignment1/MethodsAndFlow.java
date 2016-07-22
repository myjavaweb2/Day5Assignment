package com.week1.day5.assignment1;

public class MethodsAndFlow {

	private String[] stringArray;
	
	public MethodsAndFlow(String[] stringArray)
	{
		this.stringArray = stringArray;
	}
	
	public void outputSubset(int startPosition, int numberOfValues)
	{
		if (startPosition < 0 || startPosition > stringArray.length -1)
			startPosition = 0;
		
		if (numberOfValues < 0 || numberOfValues < stringArray.length -1)
			startPosition = 0;
		
		if (numberOfValues + startPosition > stringArray.length -1)
			numberOfValues = stringArray.length - startPosition;
		
		for (int i = startPosition; i < startPosition + numberOfValues -1; i++) 
		{
			System.out.println(stringArray[i]);
		}
	}
	
	public void outputAll() 
	{
		
		outputSubset(0, stringArray.length -1);
	}

}
