import java.util.Arrays;

public class ClockwiseArray {
/*
* Task: "Numbers from 1 to 999 are arranged in a circle (as on the clock face). If you delete each 4th number, which three numbers will remain at the end?"
* Задача: «Числа от 1 до 999 расположены по кругу (как на циферблате часов). Если вычеркивать каждое 4-е число, какие три числа останутся в конце?»
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;		//array pass cycles increment
		int i = 0;		//increment
		int s = 999;		//array size, 999 values
		int z = 4;		//step
		int n = 3;		//number of iterations
		int array[] = new int[s*n];		//initial array with sequence
		int arraysum[] = new int[s];	//result array
		int k = 1, l = 1, m = 1;		//the last 3 numbers
		
		for (c=0; c<n; c++) { //filling in the array 20 times
			for (i=0; i<s; i++) { //filling in the array with 1,2,3..999
			array[i+c*s]=i+1;
			//System.out.println(Arrays.asList(array[i]));
			}
		
		}
						
		for (i=z-1; i<array.length; i=i+z) { // "delete" each 4th element
			array[i] = 0;
		}
		//System.out.println(Arrays.toString(array));
		
		for (i=0; i<s; i++) {
			for (c=0; c<n; c++) {
				arraysum[i]=arraysum[i]+array[i+c*s];
			}
		
			if (arraysum[i]==array[i]*n) {
				k = arraysum[Math.abs(i-2*z)]/n;
				l = arraysum[Math.abs(i-1*z)]/n;
				m = arraysum[Math.abs(i-0*z)]/n;
			}
		
		}
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
	}

}
