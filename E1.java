public class E1 {

    public static void main(String[] args) {
        String s1 = "ABCDCBDCBDACBDABDCBADF";
        String s2 = "ADF";

        System.out.println(pattern(s1, s2));
    }

    public static int pattern(String s1, String s2) {

        int resposta = -1;
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == s2.charAt(count)) {
                if (count == 0)
                    resposta = i;
                count++;
                if (count == s2.length())
                    return resposta;
            } else {
                count = 0;
                resposta = -1;
            }

        }

        return resposta;
    }

}
