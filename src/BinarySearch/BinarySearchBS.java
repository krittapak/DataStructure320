/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

import java.util.Arrays;
import static java.util.Arrays.binarySearch;

/**
 *
 * @author INT303
 */
public class BinarySearchBS {

    public static void main(String[] args) {
        int data[] ={9,15,32,71,78,92,101,115,117,129,270,350,470,500};
        int pos=binarySearch(data,128);
        System.out.println("position: "+pos);
        
        pos = binarySearch(data,117);
        System.out.println("found117@" +pos);
    }
    
    private static int binarySearch(int[]data,int key){
        int position =-1;
        int left =0;
        int right = data.length-1;
        int middle =0;
        
        while(left<=right){
            middle = (left+right)/2;
            int value = data[middle];
            if(key<value){
                right = middle-1;
            }else if(key>value){
                left=middle+1;
            }else{
                position = middle;
                break;
            }
        }
        return position;
    }
    
    private static int binarySearch(Comparable[]data,Comparable key) {
        int position =0;
        return position;
    }
    
}
