package com.bl.opps;

import java.awt.*;

class utilityLineComparison {
    public double length1(int X1, int Y1, int X2, int Y2) {
        Point q1 = new Point();
        Point q2 = new Point();
        q1.x = X1;
        q1.y = Y1;
        q2.x = X2;
        q2.y = Y2;
        return q1.distance(q2);
    }
}
public class LineComp {
    public static void main(String[] args) {
        System.out.println("welcome to line comparison problem by OOPS");
        utilityLineComparison obj1 = new utilityLineComparison();
        double length1 = obj1.length1(4,4,8,8);
        System.out.println("Length of line1 is : " + length1);
    }
}
