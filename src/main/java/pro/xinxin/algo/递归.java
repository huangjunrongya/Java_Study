package pro.xinxin.algo;

/**
 * 用于学习递归
 * https://www.hello-algo.com/chapter_computational_complexity/iteration_and_recursion/#3
 */
public class 递归 {
    /**
     * 递归
     *
     * 计算1到n的和
     * 终止条件：用于决定什么时候由“递”转“归”。
     * 递归调用：对应“递”，函数调用自身，通常输入更小或更简化的参数。
     * 返回结果：对应“归”，将当前递归层级的结果返回至上一层。
     *
     */
    public static int recursion(int num){
        if (num==1){
            return 1;
        }
        return num+recursion(num-1);
    }

    /**
     * 尾递归
     *
     * 尾递归：
     * 递归调用是函数返回前的最后一个操作，这意味着函数返回到上一层级后，无需继续执行其他操作，因此系统无需保存上一层函数的上下文。
     * 普通递归：
     * 当函数返回到上一层级的函数后，需要继续执行代码，因此系统需要保存上一层调用的上下文。
     *
     * 普通递归：
     * 求和操作是在“归”的过程中执行的，每层返回后都要再执行一次求和操作。
     * 尾递归：
     * 求和操作是在“递”的过程中执行的，“归”的过程只需层层返回。
     */
    public static int tailRecur(int num,int res){
        if (num==0){
            return res;
        }
        return tailRecur(num-1,res+num);
    }

    /**
     * 递归树
     * 返回斐波那契数列的第n个数字
     */
    public static int fib(int num){
        if (num==1||num==2){
            return num-1;
        }
        int res=fib(num-1)+fib(num-2);
        return res;
    }


    /**
     * main方法，用于测试
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(recursion(10));
        System.out.println(tailRecur(3, 0));
        System.out.println(fib(5));
    }
}
