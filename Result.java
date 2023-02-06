
/*a) (A * B - C * D)
b) 2A - B + 3D
c) A2 + B2 - C2 + D2
d) A3 + B - C
*/

package com.mycompany.result;

public class Result 
{

    public static void main(String[] args) 
    {
        int  A = 5,B = 6,C = 7,D = 8;
        int sum1,sum2,sum3,sum4;
        
        sum1 = A * B - C * D;
        sum2 = 2 * A - B + 3*D;
        sum3 = A * A + B * B -C * C + D * D;
        sum4 = A * A * A + B - C;
        
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
