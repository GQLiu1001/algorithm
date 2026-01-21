public class Day02SortBubble {
    // 冒泡排序是 先固定最右侧 然后把左侧的数 两两比较交换 得出最大的数后 放到最右侧
    public static void main(String[] args) {
        int[] arr = { 56, 1993 ,3, 101 ,5, 57, 89,  333, 939,99 , 20003 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        // 冒泡排序的核心是 相邻 元素两两比较、交换
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}