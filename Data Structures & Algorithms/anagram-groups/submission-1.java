class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mem = new HashMap<>();

        for(String str: strs) {
            int[] arr = new int[26];

            for(char c : str.toCharArray()) {
                arr[c - 'a']++;
            }

            String index = Arrays.toString(arr);


            mem.putIfAbsent(index, new ArrayList<String>());

            mem.get(index).add(str);
        }

        return new ArrayList<>(mem.values());

    }
}
