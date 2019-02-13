
package com.data;
import java.util.Arrays;

public class MergeSort {
    public static void main(String [] args) {
    	int [] i = new int[] {0,2,4,2,4,6,8,10,14};
//    	merge(i, 0, 2, i.length-1);
    	mergeSort(i, 0, i.length-1);
    	System.out.println(Arrays.toString(i));
    }
    
    public static void mergeSort(int [] arr,int low,int high) {
    	int middle = (high+low)/2;
    	if(low<high) {
    		//处理左边
    		mergeSort(arr, low, middle);
    		//处理右边
        	mergeSort(arr, middle+1, high);
        	//归并
        	merge(arr, low, middle, high);
    	}
    	
    }
    
    public static void merge(int [] arr,int low,int middle,int high) {
    	int[] temp = new int[high-low+1];
    	int i = low;
    	int j = middle+1;
    	int index = 0;
    	//遍历两个数组取出小的数字，放入临时数组中
    	while(i<=middle&&j<=high) {
    		if(arr[i]<=arr[j]) {
    			temp[index] = arr[i];
    			i++;
    		}else {
    			temp[index] = arr[j];
    			j++;
    		}
    		index++;
    	}
    	//处理多余的数据
    		while(j<=high) {
    			temp[index] = arr[j];
    			j++;
    			index++;
    		}
    		while(i<=middle) {
    			temp[index] = arr[i];
    			i++;
    			index++;
    		}
    		index++;
    	//把临时数组中的数据重新存入原数组
    	for(int k = 0;k<temp.length;k++) {
			arr[k+low] = temp[k];
		}
    	
    }
}
