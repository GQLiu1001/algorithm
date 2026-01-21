class Day02XOR {
    // 异或小知识
    // a ^ b 相当于 a 和 b 无符号相加！
    // 可以用到异或的场景：
    // 注意 eor 变量初始值为0 因为 0 ^ n = n
    // 1. 找出只出现奇数次的一种数 其他数出现偶数次
    // 2. 找出只出现奇数次的两种数 其他数出现偶数次
    public static void main(String[] args) {
        int[] arr = { 3, 5, 56, 57, 89, 99, 101, 333, 939, 1993, 20003, 3, 5, 56, 57, 89, 99, 101, 333, 939, 1993, 20003, 77 };
        int eor = getEor(arr);
        System.out.println("只出现奇数次的数是：" + eor);

        // 找出只出现奇数次的两种数 a 和 b 且 a != b -> eor != 0 -> eor 某一位肯定不是 0
        int[] arr2 = { 3, 5, 56, 57, 89, 99, 101, 333, 939, 1993, 20003, 3, 5, 56, 57, 89, 99, 101, 333, 939, 1993, 20003, 77, 88 };
        int eor2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            eor2 ^= arr2[i];
        }
        // eor2 = a ^ b
        // 提取出最右侧的1 
        // ~ 取反
        int rightOne = eor2 & (~eor2 + 1);
        int onlyOne = 0;
        for (int i = 0; i < arr2.length; i++) {
            // 利用 rightOne 将 arr2 分成两部分 可以得出 a 或者 b
            if ((arr2[i] & rightOne) != 0) {
                onlyOne ^= arr2[i];
            }
        }
        System.out.println("只出现奇数次的两种数是：" + onlyOne + " 和 " + (eor2 ^ onlyOne));
    }

    private static int getEor(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        return eor;
    }
}