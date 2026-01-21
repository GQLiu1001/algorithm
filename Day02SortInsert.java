public class Day02SortInsert {
    // 插入排序是 从最左侧起 交换出一个有序区 然后将无序区的数 插入到有序区中合适的位置
    // 有些类似于打扑克时整理手牌的过程
    // 有些时候的插入排序比冒泡排序效率更高
    public static void main(String[] args) {
        int[] arr = { 56, 1993 ,3, 101 ,5, 57, 89,  333, 939,99 , 20003 };
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void insertSort(int[] arr) {
        // 插入排序的核心是 将无序区的数 插入到有序区
        // 注意 0~0 已经是有序区 所以 i 从 1 开始
        for (int i = 1; i < arr.length; i++) {
            // 无序区第一个数
            // 1 3 4 2 此时 i = 3
            //       ↑
            int temp = arr[i]; // temp 第一次就是 2 需要更新！
            int insertIndex = i; // 记录最终的插入位置（默认是自己的位置）
            // 在有序区找到合适的位置插入
            for (int j = i - 1; j >= 0; j--) {
                // 1 3 4 2 此时 j = 2
                //     ↑
                // 1 3 2 4 此时 j = 1
                //   ↑
                // 1 2 3 4 此时 j = 0
                // ↑
                if (arr[j] > temp) {
                    // 4 > 2 ok 换位
                    // 1 3 2 4
                    // 下一轮
                    // 3 > 2 ok 换位
                    // 1 2 3 4
                    // 下一轮
                    arr[j + 1] = arr[j];
                    // 更新 temp 的位置
                    insertIndex = j;
                } else {
                    // 1 2 3 4 此时 j = 0
                    // 1 > 2 no 不换位
                    break;
                }
                
            }
            // 找到位置后 插入
            arr[insertIndex] = temp;
        }
    }
}
