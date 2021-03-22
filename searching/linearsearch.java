/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.searching;
import java.util.*;
/**
 *
 * @author Dell
 */
public class linearsearch {
    public static void main(String[] args)
    {
        linearsearch(new int[] {4,3,2,8,1,6,7},8);
    }
    public static void linearsearch(int[] a,int x)
    {
        boolean b=false;
        int idx = 0;
       for(int i=0;i<a.length;i++)
       {
           if(a[i]==x)
           {
                idx=i;
                b=true;
                break;
           }
       }
       if(b==true)
           System.out.println("Element present at "+(idx+1));
       else
           System.out.println("-1");
    }
    
    
}
