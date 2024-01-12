/*
The idea behind this solution is broken down into different parts.

    First we needed a stable DataSructure. It would be a great advantage if the DS doesn't let duplicates.
    HashSet is a go-to DS for such cases. But it doesn't promise any order.
    Due to which the alternative is LinkedHashSet.
    With the LHS we are able to maintain order and avoid duplicates - which makes insertion and deletion O(1).
    For random generation, Java Util's Random library promises the random generations are made with the consideration of frequency of the random number as well.
*/

class RandomizedSet {

	LinkedHashSet<Integer> sets = null;	
    Random random;

    public RandomizedSet() {
        sets = new LinkedHashSet<>();	
        random = new Random();
    }
    
    public boolean insert(int val) {
        return sets.add(val);
    }
    
    public boolean remove(int val) {
        return sets.remove(val);
    }
    
    public int getRandom() {
        int randomIdx = random.nextInt(sets.size());
        return sets.toArray(new Integer[]{0})[randomIdx];
    }
}
