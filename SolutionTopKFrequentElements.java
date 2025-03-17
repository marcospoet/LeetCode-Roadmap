import java.util.*;

public class SolutionTopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> contador = new HashMap<>();
        List<Integer>[] frecuencias = new List[nums.length + 1]; // frecuencias[0] no se usa porque no hay 0 frecuencias

        for (int i = 0; i < frecuencias.length; i++) {
            frecuencias[i] = new ArrayList<>();
        }

        for (int n : nums) {
            contador.put(n, contador.getOrDefault(n, 0) + 1); // el getOrDefault es para evitar el null pointer en caso de que no exista la key
        }
        for (Map.Entry<Integer, Integer> numeros : contador.entrySet()) { // entrySet() devuelve un set de pares key-value
            frecuencias[numeros.getValue()].add(numeros.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = frecuencias.length - 1; i > 0 && index < k; i--) {
            for (int n : frecuencias[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2}; int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));

    }

}
