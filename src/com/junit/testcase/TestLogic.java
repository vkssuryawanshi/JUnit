package com.junit.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.junit.logic.Calculation;

public class TestLogic 
{
	@Test
	public void testFindMax()
	{
		assertEquals(4, Calculation.findMax(new int[] {1,2,3,4}));
		assertEquals(3,Calculation.findMax(new int[]{-12,-1,3,-4,-2}));  
	}

}
