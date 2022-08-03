import java.util.*;

class MyCalendar {

    private TreeMap<Integer, Integer> slots;

    public MyCalendar() {
        slots = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> left = slots.floorEntry(start);
        if (left == null) {
            left = slots.firstEntry();
            if ( left != null && end > left.getKey() ) {
                return false;
            }
        } else if (left != null && start < left.getValue()) {
            return false;
        }
        Map.Entry<Integer, Integer> right = slots.ceilingEntry(start);
        if(right == null) {
            right = slots.lastEntry();
            if ( right != null && start < right.getValue()) {
                return false;
            }
        } else if(right != null && end > right.getKey()) {
            return false;
        }
        slots.put(start, end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */