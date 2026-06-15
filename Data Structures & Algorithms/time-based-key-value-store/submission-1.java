class TimeMap {

    private Map<String, TreeMap<Integer, String>> memory;
    public TimeMap() {
        memory = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        memory.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> item = memory.get(key);

        if(item == null) {
            return "";
        }

        if(item.get(timestamp) != null) {
            return item.get(timestamp);
        }

        Map.Entry<Integer, String> entry = item.floorEntry(timestamp);


        return entry == null ? "" : entry.getValue();
    }
}
