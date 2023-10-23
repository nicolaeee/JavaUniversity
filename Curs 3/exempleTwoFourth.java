

public class exempleTwoFourth {
    public static void main(String[] args) {
        boolean p, q, r;

          // Afisarea capului de tabel
        System.out.println("p\tq\tr\t(p && q) || (q && r) || !p");

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                for (int k = 0; k <= 1; k++) {
                    // Asignarea valorilor pentru p, q si r
                    p = (i == 1);
                    q = (j == 1);
                    r = (k == 1);

                    // Calculul rezultatului expresiei
                    boolean result = (p && q) || (q && r) || !p;

                    // Afisarea rezultatului
                    System.out.println(p + "\t" + q + "\t" + r + "\t" + result);
                }
            }
        }
    }
}
