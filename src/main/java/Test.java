import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] list=new int[]{2,7,11,15,2};
        int x=9;
        test(list,x);

    }

    public static void test(int[] list, int x) {
        for (int i = 0; i < list.length; i++) {
            for (int j =i+1; j <list.length ; j++) {
                int y=list[i]+list[j];
                if(y==x)
                {System.out.println(i);
                 System.out.println(j);
                 System.out.println("bug???");
                 System.out.println("push-test");
                }
            }

        }



    }


}
