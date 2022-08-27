class Solution {
    public boolean reorderedPowerOf2(int N) {
        int i = 1;
        Set<String> set = new HashSet();
        
        while (i <= 1000000000) {
            String s = "" + i;
            char[] c = s.toCharArray();
            Arrays.sort(c);
            set.add(new String(c));
            i <<= 1;
        }
        
        String s = "" + N;
        char[] c = s.toCharArray();
        Arrays.sort(c);
        
        return set.contains(new String(c));
    }
}