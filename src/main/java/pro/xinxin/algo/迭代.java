package pro.xinxin.algo;

/**
 * 本类用于学习迭代
 * https://www.hello-algo.com/chapter_computational_complexity/iteration_and_recursion/
 */
public class 迭代 {
    /**
     * for循环
     * 求和1+2+3+...+n
     */
    public static int sumFor(int num){
        int sum=0;
        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
        return sum;
    }

    /**
     * while循环
     * 求和1+2+3+...+n
     */
    public static int sumWhile(int num){
        int sum=0;
        int i=1;
        while (i<=num){
            sum+=i;
            i++;
        }
        return sum;
    }

    /**
     * for嵌套
     */
    /* 双层 for 循环 */
    public static String nestedForLoop(int n) {
        StringBuilder res = new StringBuilder();
        // 循环 i = 1, 2, ..., n-1, n
        for (int i = 1; i <= n; i++) {
            // 循环 j = 1, 2, ..., n-1, n
            for (int j = 1; j <= n; j++) {
                res.append("(" + i + ", " + j + "), ");
            }
        }
        return res.toString();
    }


    /**
     * main方法，用于测试
     */
    public static void main(String[] args) {
        System.out.println(sumFor(10));
        System.out.println(sumWhile(100));
        System.out.println(nestedForLoop(10));
    }
}
