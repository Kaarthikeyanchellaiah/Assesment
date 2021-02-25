package com.kctech.five;

public class Testfour {
	
	public static int compute(int[] input)
    {
        int num = 0;
        int i=1;
        int[] Arrayone = input.clone();
        int c;
        boolean check;
        while (i < input.length) {
            
        	Arrayone[0]=input[0]-num;
            Arrayone[i] = input[i] - num;
            
            
            c= -num;
            check = true;
            while(Arrayone[i]<=Arrayone[i-1]) {
                if (c>num) {
                    num++;
                    check = false;
                    break;
                }
                Arrayone[i] = input[i] + c;
                c++;
            }
            if (check) {
                i++;
            } else {
                i=1;
            }
        }

        return num;
    }

	public static void main(String[] args) {
		int var[]= {5,4,3,2,8};
        System.out.print(Testfour.compute(var));


	}

}
