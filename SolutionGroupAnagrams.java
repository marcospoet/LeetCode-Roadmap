import java.util.*;

public class SolutionGroupAnagrams {

    public static  List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for (String str: strs){
            char[] ordenado = str.toCharArray();
            Arrays.sort(ordenado);
            String strOrdenado = new String(ordenado);
            if(map.containsKey(strOrdenado)){
                map.get(strOrdenado).add(str);
            } else {
                map.put(strOrdenado, new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] s = {"act","pots","tops","cat","stop","hat"};
        groupAnagrams(s);
        System.out.println(groupAnagrams(s));

    }
}
