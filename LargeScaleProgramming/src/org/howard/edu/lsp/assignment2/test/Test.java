package org.howard.edu.lsp.assignment2.test;

import java.util.ArrayList;
import java.util.Arrays;

import org.howard.edu.lsp.assignment2.combination.Combination;

public class Test {

	public static void main(String[] args) {
		
	
	int [] input1 = {2,-1,-1};
    int target1 = 1;
    
    printInput(input1, target1);
    printOutput(input1, target1);

    int [] input2 = {5, 5, 10, 15};
    int target2 = 15;
    
    printInput(input2, target2);
    printOutput(input2, target2);

    int [] input3 = {0, 1, 0, 1};
    int target3 = 1;
    
    printInput(input3, target3);
    printOutput(input3, target3);
    
     
    //lists where no combination will add upto target will output an empty list
    int [] input4 = {};
    int target4 = 1;
    
    printInput(input4, target4);
    printOutput(input4, target4);
    
    int [] input5 = {2,-1,-1};
    int target5 = 4;
    
    printInput(input5, target5);
    printOutput(input5, target5);
    
    //lists with 0 
    int [] input6 = {0};
    int target6 = 0;
    
    printInput(input6, target6);
    printOutput(input6, target6);
    
    //empty lists
    int [] input7 = {};
    int target7 = 0;
    
    printInput(input7, target7);
    printOutput(input7, target7);

    int [] input8 = {1,2,3,4,5,6};
    int target8 = 6;
    
    printInput(input8, target8);
    printOutput(input8, target8);
    
    int [] input9 = {1,6,4,5,2,3};
    int target9 = 6;
    
    printInput(input9, target9);
    printOutput(input9, target9);
    
    int [] input10 = {10,1,2,7,6,1,5};
    int target10 = 8;
    
    printInput(input10, target10);
    printOutput(input10, target10);
    
	
	}
	
	public static void printInput(int [] inputArr, int target1) {
		System.out.println("Input list : " + Arrays.toString(inputArr) + '\n'  + "Target: " + target1 );
	
		
	}
	
	public static void printOutput(int [] inputArr, int target1) {

		Combination	testCase = new Combination();
		
		ArrayList <ArrayList> output = testCase.findCombinations(inputArr, target1);
	    System.out.println("Output: " + Arrays.toString(output.toArray()) + "\n");

		
	}

}
