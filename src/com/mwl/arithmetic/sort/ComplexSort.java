package com.mwl.arithmetic.sort;

public class ComplexSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[]{23,433,545,4,334,232,12,1,3,3,4,5,6,6,7,8,4564,43523,3452,3,3,3,4453,26546,7,889,9,8,7,6,5,4,3,2,1};
		
		mergeSort(test,0,test.length-1);
		
		for(int i : test){
			System.out.print(i+" ");
		}
		
	}

	
	public static void mergeSort(int[] array , int a,int b){
		
		if(array.length <=1 || a>=b){
			return ;
		}
		
		int q  = (a+b)/2;
		mergeSort(array,a,q);
		mergeSort(array,q+1,b);
		merge(array,a,q,b);
	}
	
	
	public static void merge(int[] array,int a,int q,int b){
		int[] temp  = new int[array.length];
		for(int i = a; i<=b; i++){
			temp[i] = array[i];
		}
		int j=a,k=q+1;
		for(int i =a; i<=b;i++){
				if(j<=q && k<=b){
					if(temp[j]<=temp[k]){
						array[i]= temp[j++];
					}else{
						array[i] = temp[k++];
					}
				}else if(j<=q && k>b){
					array[i] = temp[j++];
				}else{
					array[i] = temp[k++];
				}
		}
	}
	
	
}
