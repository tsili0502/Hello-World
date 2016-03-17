import java.util.*;

class SortDemo
{

	//遍历数组的功能。
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+", ");
			else
				System.out.println(arr[x]+"]");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {34,19,11,109,3,56};


		printArray(arr);

//		selectSort(arr);
		selectSort_2(arr);



		printArray(arr);
	}

	//交换方法
	public static void exch(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	//冒泡排序。
	
	public static void bubbleSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=0; y<arr.length-1-x; y++)
			{
				if(arr[y]>arr[y+1])	
				{
					exch(arr,y,y+1);
					/*
					int temp  = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
				}
			}	
		}
	}


	
	//选择排序。
	
	public static void selectSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
				{
					exch(arr,x,y);
					/*
					int temp  = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					*/
				}
			}
		}
	}
	//选择排序方法二，使用index。
	public static void selectSort_2(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			int num = arr[x];
			int index = x;
			for(int y=x+1; y<arr.length; y++)
			{
				if(num>arr[y])
				{
					num = arr[y];
					index = y;
				}
			}
			if(index!=x)
				exch(arr,x,index);
		}
	}
}