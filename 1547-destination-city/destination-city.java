
class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();

        // Populate the map with the cities and their destinations
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }

        // Start from the first city and find the destination city
        String currentCity = paths.get(0).get(0);
        while (map.containsKey(currentCity)) {
            currentCity = map.get(currentCity);
        }

        return currentCity;
    }
}
