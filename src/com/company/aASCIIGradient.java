package com.company;

import java.util.Scanner;

/**
 * Created by tz6ysq on 10/12/2015.
 */
public class aASCIIGradient implements iASCIIGradient {

    Scanner in;
    int width, ehight, x1, y1, x2, y2;
    double radius;
    char[] colors;
    String type;



    public aASCIIGradient() {
        in = new Scanner(System.in);

        getParams();

        if (type.equals("radial")){

        }
    }

    @Override
    public void plotRadial() {
        /* Iterate through rows and columns. */

        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                /* Distance from this coordinate to center. */

                double dist = Math.sqrt(Math.pow(r - y1, 2) + Math.pow(c - x1, 2));

                dist /= radius;

                dist *= colors.length;

                System.out.print(colors[Math.min((int)dist, colors.length -1)]);
            }
            System.out.println();
        }
    }

    @Override
    public void plotLinear() {
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                double dist =
            }
        }
    }

    @Override
    public void getParams() {

    }
}
