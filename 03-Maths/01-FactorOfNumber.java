class FactorOfNumber {

    public static void main(String[] args) {

        //factor of a number
        int num = 5;
        int count = 0;

        for (int i = 1; i * i <= num; i++) {

            if (num % i == 0) {
                count++;
                if (i != num / i) {
                    count++;
                }
            }

        }

        System.out.println(count);

    }
}
