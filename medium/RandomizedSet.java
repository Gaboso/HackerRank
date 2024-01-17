package medium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
class RandomizedSet {

    private final Set<Integer> innerSet;
    private final Random random;

    public RandomizedSet() {
        innerSet = new HashSet<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (innerSet.contains(val)) {
            return false;
        }

        innerSet.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (innerSet.contains(val)) {
            innerSet.remove(val);
            return true;
        }

        return false;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(innerSet.size());

        Iterator<Integer> iter = innerSet.iterator();
        for (int i = 0; i < randomIndex; i++) {
            iter.next();
        }
        return iter.next();
    }

}