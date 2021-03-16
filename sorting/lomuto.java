/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sorting;
import java.util.*;
/**
 *
 * @author Dell
 */
public class lomuto {
    public static void main(String[] args)
    {
        
        findlomuto(new int[] {4,6,5,1,6});
        hoare(new int[] {4,6,5,1,6});
    }
    public static void findlomuto(int A[])
    {
        int low=0;
        int high=A.length-1;
        lomuto(A,low,high);
    }
    public static void lomuto(int A[],int low,int high)
    {
        int pivot=A[high];
        int i=low;
        for(int j=low;j<high;j++)
        {
            if(pivot<A[j])
            {
                swap(A,i,j);
                   i++;   
            }
            
            System.out.println("Lomuto:"+ Arrays.toString(A));
            
        }
        swap(A,i,high);
        System.out.println("Lomuto:"+ Arrays.toString(A));
        
    }
    public static void hoare(int A[])
    {
        int pivot=A[0];
        int i=0,j=A.length-1;
        while(i<j)
        {
            if(A[i]<pivot)
            {
               i++;
            }
            if(A[j]>pivot)
            {
                j--;
            }
            if(j<=i)
            {
               break; 
            }
            
            
            swap(A,i,j);
        }
        System.out.println("Hoare:"+Arrays.toString(A));
        
    }
    public static void swap(int[] A, int i,int j)
    {
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
}
