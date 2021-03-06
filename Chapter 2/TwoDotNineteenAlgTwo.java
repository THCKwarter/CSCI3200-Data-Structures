//CSCI3200 - Chapter 2 Assignment 2.19 - Algorithm 2
//Matthew Johnston

import java.util.Random;
public class TwoDotNineteenAlgTwo {
	public static void main(String[] args) {
		//Quadratic maximum contiguous substance sum algorithm
		Random rand = new Random();
		int[] arr = new int[10];
		int[] resultsArr = new int[3];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (rand.nextInt(20)-10);
			System.out.println("Index " + (i) + ": " + arr[i]);
		}
		
		//Print results
		System.out.println("=======================");
		resultsArr = maxSubSum2(arr);
		System.out.println("Sum: " + resultsArr[0]);
		System.out.println("Start Index: " + resultsArr[1]);
		System.out.println("End Index: " + resultsArr[2]);
	}

	public static int[] maxSubSum2(int[] a){
		int maxSum = 0;
		int[] results = new int[3];

		for(int i = 0; i < a.length; i++){
			int thisSum = 0;
			boolean firstTime = false;
			for(int j = i; j < a.length; j++){
				thisSum += a[j];
				System.out.println("thisSum: " + thisSum + ", j: " + j);

				if(thisSum > maxSum){
					if(!firstTime){
						results[1] = j;
						firstTime = true;
					}
					maxSum = thisSum;
					results[0] = maxSum;
					results[2] = j;
				}
			}
		}
		return results;
	}
}