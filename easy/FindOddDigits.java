package easy;

class FindOddDigits {
    public int findNumbers(int[] nums) {
        int counter = 0;

        for (int current : nums) {
            int digitCount = 0;
            int num = current;

            while (num != 0) {
                num /= 10;
                digitCount++;
            }

            if (digitCount % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }
}