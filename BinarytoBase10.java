/**-------------------------------------------------------------------------------------*/
/* BinarytoBase10.java  -  Base Change 101                                              */
/*                                                                                      */
/*--------------------------------------------------------------------------------------*/
/*  @author  Kshitij Shah                                                               */
/*  Date:    March 8 2017                                                               */
/*--------------------------------------------------------------------------------------*/
/*  Input:   number in base 2                                                           */
/*  Output:  same number in base 10                                                     */
/*--------------------------------------------------------------------------------------*/

import java.io.*;

public class BinarytoBase10{
    static int base (int a){
	if (a == 0){
	    return 0;
	} else {
	int b;
	return b = 2 * base(a / 10) + a % 10; 
	}
    }

    public static void main (String str[]) throws IOException {
	BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
	System.out.println("Binary to Base 10 Converter: \n\n");
	System.out.print("What binary do you want to change the base of?:  ");
	int a = Integer.parseInt(stdin.readLine ());
	System.out.println("The number in base 10 is " + base(a));
    }
}

