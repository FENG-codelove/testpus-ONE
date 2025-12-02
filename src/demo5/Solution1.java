package demo5;


// 快速排序
public class Solution1 {
    public static int methon(int []arr,int low,int high ) {
        int i=low-1;
        for (int j = low; j <high; j++) {
            if (arr[j] < arr[high]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;
        }
        return i+1;
    }
}
