class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mapToCheck  = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            int[] counts = new int[26];

            for(int j = 0; j < strs[i].length(); j ++) {
                counts[strs[i].charAt(j) - 'a']++;
            }

            String index = Arrays.toString(counts);

            mapToCheck.putIfAbsent(index, new ArrayList<>());
            mapToCheck.get(index).add(strs[i]);
        }

        return new ArrayList<>(mapToCheck.values());
    }
}
