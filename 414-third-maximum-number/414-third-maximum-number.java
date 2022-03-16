class Solution {
  
        public int thirdMax(int[] nums) {
    long[] max = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
    int count = 0;
    for (int num : nums) {
      for (int j = 0; j < 3; j++) {
        if (max[j] > num) continue;
        else if (max[j] == num) break;
        int k = j;
        long temp1, temp2;
        temp1 = num;
        count++;
        while (k < 3) {
          temp2 = max[k];
          max[k] = temp1;
          temp1 = temp2;
          k++;
        }
        break;
      }
    }
    System.out.println(Integer.MIN_VALUE);
    return (count >= 3) ? (int) max[2] : (int) max[0];
  }
}
