package com.data;

/**
 * 快速排序算法
 */
public class Quick {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 3, 6, 2, 4 };
		sort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	// 将数组根据标准数来进行分割
	public static void sort(int[] arr, int start, int end) {
		if (start < end) {
			// 把数组中的第0个元素作为标准数
			int stard = arr[start];
			// 记录排序的下标
			int low = start;
			int high = end;
			// 循环找出比标准数大和比标准数小的元素
			while (low < high) {
				// 右边的比标准数大
				while (low < high && stard <= arr[high]) {
					high--;
				}
				arr[low] = arr[high];
				// 左边的比标准数小
				while (low < high && arr[low] <= stard) {
					low++;
				}
				arr[high] = arr[low];
			}
			arr[low] = stard;
			// 处理所有的小的数字
			sort(arr, start, low);
			// 处理所有的大数字
			sort(arr, low + 1, end);

		}
	}
}
