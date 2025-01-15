package ArraysHashing;

import java.util.Arrays;

public class Main {

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    /*public static int smallInd(int[] arr) {
        int small = arr[0];
        int smallIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public static int[] selectionSort(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int index = smallInd(arr);
            result[i] = arr[index];
            arr[index] = Integer.MAX_VALUE;
        }
        return result;
    }*/

    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int pos = i;
            int min = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    pos = j;
                    min = nums[j];
                }
            }
            int temp = nums[i];
            nums[i] = nums[pos];
            nums[pos] = temp;
        }
        return nums;
    }

    public static int sum(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sum(arr, index + 1);
    }

    public static int count(int[] arr, int count) {
        if (count >= arr.length) {
            return 0;
        }
        return 1 + count(arr, count + 1);
    }

    public static int maximum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int sub_max = maximum(arr, index + 1);
        return arr[index] > sub_max ? arr[index] : sub_max;
    }

    /*public static int partition(int[] arr, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;
        int pivot = arr[from];

        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }

        }
        return leftIndex;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int[] quickSort(int[] arr, int from, int to) {

        if (from < to) {
            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);
        }

        return arr;
    }*/

    public static int[] quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int pivot = arr[to];
            int i = from - 1;

            for (int j = from; j < to; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[to];
            arr[to] = temp;

            int pivotIndex = i + 1;

            quickSort(arr, from, pivotIndex - 1);
            quickSort(arr, pivotIndex, to);
        }
        return arr;
    }

    public static int linearSearch(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
            index++;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {53, 1, 20, 243};
        System.out.println(linearSearch(nums, 91));
    }
}
