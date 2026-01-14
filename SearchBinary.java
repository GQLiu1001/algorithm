public class SearchBinary {
    public static void main(String[] args) {
        // 有序数组 查找 target -> 二分
        int[] arr = {3,5,56,57,89,99,101,333,939,1993,20003};
        var target = 99;
        var index = binarySearch(arr,target);
        System.out.println(index);
    }

     static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            // int mid = (left + right) / 2;
            int mid = (left + right) >>> 1;
            if (arr[mid] == target) {
                return mid;
            }else if(arr[mid] > target){
                right = mid - 1;
                continue;
            }else{
                left = mid + 1;
            }
        }
        return -1;
     }
}
