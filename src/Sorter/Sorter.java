/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorter;

import com.sun.org.apache.bcel.internal.classfile.Utility;
import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import java.util.*;
/**
 *
 * @author INT303
 */
public class Sorter {

    private final static int CUTOFF = 10;

    private static void swap(Comparable x[], int i, int j) {
        Comparable tmp = x[i];
        x[i] = x[j];
        x[j] = tmp;
    }
    
    private static void swap(Object x[],int i,int j) {
        Object tmp = x[i];
        x[i] = x[j];
        x[j] = tmp;
    }

    private static void insertionSort(Comparable x[]) {
    }

    public static void main(String[] args) {
//        Integer x[] = new Integer[30];
//        for (int i = 0; i < x.length; i++) {
//            x[i] = new Integer((int) (Math.random() * 100));
//        }
//        System.out.println("Before sorting........");
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(x[i] + "\t");
//        }
//        Sorter.selectionSort(x);
//        System.out.println("\n\nSelection Sorted........");
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(x[i] + "\t");
//        }
     Integer x[] = new Integer[200_000];
     Integer y[] = new Integer[200_000];
     Random r=new Random();
        for (int i = 0; i < x.length; i++) {
            x[i]=r.nextInt(1000000);
        }
        System.arraycopy(x, 0, y, 0, x.length);
        Arrays.sort(x,0,20);
        long before=System.currentTimeMillis();
        Arrays.parallelSort(x);
        long duration1=System.currentTimeMillis()-before;
        
        before=System.currentTimeMillis();
        insertionSort(y);
        long duration2=System.currentTimeMillis()-before;
        System.out.println("para : "+duration1);
        System.out.println("insert : "+duration2);
    }

//    public static void insertionSort(Comparable x[]) {
//        for (int i = 1; i < x.length; i++) {
//            Comparable tmp = x[i];
//            int j = i;
//            for (; j > 0 && tmp.compareTo(x[j - 1]) < 0; j--) {
//                x[j] = x[j - 1];
//            }
//            x[j] = tmp;
//        }
//    }
    public static void bubbleSort(Comparable x[]) {
        for (int i = x.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (x[j].compareTo(x[j + 1]) > 0) {
                    swap(x,i, i + 1);
                }
            }
        }
    }

    public static void selectionSort(Comparable x[]) {
        for (int i = x.length - 1; i > 0; i--) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                if (x[j].compareTo(x[max]) > 0) {
                    max = j;
                }
            }
            if (max != i) {
                swap(x,max, i);
            }

        }
    }

    public static void quickSort(Comparable x[]) {
        quickSort(x, 0, x.length - 1);
        insertionSort(x);
    }

    private static int selectPivot(Comparable x[], int left, int right) {
        int middle = (left + right) / 2;
        // sort left middle right
        if (x[middle].compareTo(x[left]) < 0) {
            swap(x, left, middle);
        }
        if (x[right].compareTo(x[left]) < 0) {
            swap(x, left, right);
        }
        if (x[right].compareTo(x[middle]) < 0) {
            swap(x, middle, right);
        }
        return middle;
    }

    private static void quickSort(Comparable x[], int left, int right) {
        if (right - left >= CUTOFF) {
            int p = selectPivot(x, left, right); // select pivot & sort left middle right
            swap(x, p, right); // hide pivot
            Comparable pivot = x[right];
            int i, j;
            for (i = left, j = right - 1;;) {
                while (i <= j && x[i].compareTo(pivot) < 0) {
                    i++;
                }
                while (i <= j && x[j].compareTo(pivot) >= 0) {
                    j--;
                }
                if (i >= j) {
                    break;
                }
                swap(x, i++, j--);
            }
            if (x[i].compareTo(pivot) > 0) // restore pivot
            {
                swap(x, i, right);
            }
            if (left < i) {
                quickSort(x, left, i - 1);
            }
            if (right > i) {
                quickSort(x, i + 1, right);
            }
        }
    }

    public static void mergeSort(Comparable x[]) {
        Comparable tmpArr[] = new Comparable[x.length];
        mergeSort(x, tmpArr, 0, x.length - 1);
    }

    public static void mergeSort(Comparable x[],
            Comparable tmpArr[], int left, int right) {

        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(x, tmpArr, left, middle);
            mergeSort(x, tmpArr, middle + 1, right);
            merge(x, tmpArr, left, middle, right);
        }
    }

    private static void merge(Comparable x[], Comparable tmpArr[],
            int left, int middle, int right) {

        int i = left;
        int j = left;
        int k = middle + 1;
        while (j <= middle && k <= right) {
            if (x[j].compareTo(x[k]) < 0) {
                tmpArr[i++] = x[j++];
            } else {
                tmpArr[i++] = x[k++];
            }
        }
        while (j <= middle) {
            tmpArr[i++] = x[j++];
        }

        for (i = left; i < k; ++i) {
            x[i] = tmpArr[i];
        }
    }
}
