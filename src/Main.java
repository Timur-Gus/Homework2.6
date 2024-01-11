import java.util.*;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
    }

    public static void taskOne() {
        //Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void taskTwo() {
        //Задание 2
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 88299, 3, 4, 422341, 5, 5,361, 137));
        Set<Integer> nums1 = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                nums1.add(num);
            }
        }
        List<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums1);
        for (int i = 0; i < nums3.size() - 1; i++) {
            if (nums3.get(i) > nums3.get(i + 1)) {
                int n = nums3.get(i);
                nums3.set(i, nums3.get(i + 1));
                nums3.set(i + 1, n);
            }
        }
        System.out.println(nums3);
    }

    public static void taskThree() {
        //Задание 3
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> strings1 = new HashSet<>();
        strings1.addAll(strings);
        System.out.println(strings1);
    }
    public static void taskFour() {
        //Задание 4
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String,Integer> strings1 = new HashMap<>();
        for (String string : strings) {
            if (!strings1.containsKey(string)) {
                strings1.put(string, 1);
            }
            else {
                strings1.put(string, strings1.get(string) + 1);
            }
        }
        System.out.println(strings1.values());
    }
}