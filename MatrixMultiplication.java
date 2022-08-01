package com.company;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
//        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int[][] c = new int[3][3];
        for(int x =0; x<3; x++){
            for(int y =0; y<3; y++){
                System.out.println("Enter the value of a["+x+"]["+y+"]");
                a[x][y] = sc.nextInt();
            }
        }
        for(int x =0; x<3; x++){
            for(int y =0; y<3; y++){
                System.out.println("Enter the value of b["+x+"]["+y+"]");
                b[x][y] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("The resultant matrix c is");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
