public class E2{

    public static void main(String[] args){
        System.out.println(search("ADF","ABCDCBDCBDACBDABDCBADF"));
    }

    private static int search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        long patHash = hash(pat, M);

        for (int i = 0; i <= N - M; i++) {
            long txtHash = hash(txt.substring(i, i+M), M);
            if (patHash == txtHash) return i; // ocorrência? colisão?
        }
        return N; // nenhuma ocorrência
    }

    //
    //Notação: o padrão tem M caracteres, o texto tem N caracteres, o alfabeto tem R caracteres  (0 … R−1) 
    //      Q é o módulo para o cálculo do Hash.
    //      Qual o valor de Q?  Escolha Q igual a um primo grande para minimizar a chance de colisões.
    //              Por exemplo: o maior primo que possa ser representado com um int

    private static long hash(String s, int M) {
        long h = 0;
        for (int j = 0; j < M; j++)
            h = (h * 72 + s.charAt(j)) % 582109237;
        return h;
    }

}