import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    // *************查找 binarySearch()****************
    public static void main(String[] args) {
//        char[] e = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
//        // 排序后再进行二分查找，否则找不到
//        System.out.println(e);
//        Arrays.sort(e);
//        System.out.println("Arrays.sort(e)" + Arrays.toString(e));
//        System.out.println("Arrays.binarySearch(e, 'c')：");
//        int s = Arrays.binarySearch(e, 'c');
//        System.out.println("字符c在数组的位置：" + s);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        for (String s : list) {
            if ("2".equals(s)) {
                list.remove(s);
            }
        }
        System.out.println(list);
    }
}
