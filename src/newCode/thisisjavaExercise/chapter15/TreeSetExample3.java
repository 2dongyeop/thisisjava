package thisisjava.chapter15;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");
        treeSet.add("f");

        System.out.println("[c <= 단어 < f 검색]");
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", false);
        for(String word : rangeSet) {
            System.out.println(word);
        }
    }
}
