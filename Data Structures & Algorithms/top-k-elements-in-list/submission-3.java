class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mem = new HashMap<>();

        for (int num : nums) {
            mem.put(num, mem.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(mem::get));

        for (int num : mem.keySet()) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
