class FirstUniqueString {

    static int findUniqueString(String str) {

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            if (count == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String str = "loveleetcode";

        int unique = findUniqueString(str);

        System.out.println(unique);
    }

}
