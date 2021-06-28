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

    public double length2(int X1, int Y1, int X2, int Y2) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = X1;
        p1.y = Y1;
        p2.x = X2;
        p2.y = Y2;
        return p1.distance(p2);
    }
}
public class LineComp {
    public static void main(String[] args) {
        System.out.println("welcome to line comparison problem by OOPS");
        utilityLineComparison obj1 = new utilityLineComparison();
        double length1 = obj1.length1(4,4,8,8);
        System.out.println("Length of line1 is : " + length1);
        double length2 = obj1.length1(12,12,14,14);
        System.out.println("Length of line2 is : " + length2);
    }
}
