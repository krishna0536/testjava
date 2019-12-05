ipublic class DigitSum {

    /**
     * Calculate digit sum of a given integer
     * e.g: if given number is 237, then its digit sum = (2+3+7) = 12
     * @param number
     * @return digit sum of given integer <code>number</code>
     */
    public static int calculateDigitSum(int number) {
        int digitSum = 0;

        while (number > 0) {
            digitSum = digitSum + (number % 10);
            number = number / 10;
        }

        return digitSum;
    }

    /**
     * Reverse the given integer <code>number</code>
     * e.g: input = 1234, output = 4321
     * @param number
     * @return reversed integer
     */
    public static int reverseInteger(int number) {
        int reversedNumber = 0;

        while (number > 0) {
            int temp = (number % 10);
            reversedNumber = (reversedNumber * 10) + temp;
            number = number / 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = 133254;
        int digitSum = calculateDigitSum(number);
        int reverseNum = reverseInteger(number);
        System.out.println(" Number = " + number + "\n Digit Sum of Number = " + digitSum);
        System.out.println(" reverseNum = " + reverseNum );
    }
}
