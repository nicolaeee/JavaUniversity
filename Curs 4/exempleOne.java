
public class exempleOne {
    public static void main(String[] args) {
        //Delararea variabililor booleane
        boolean a, b;

        //Afisarea capului de tabel
        System.out.println("a\tb\ta AND b\ta OR b\ta XOR b\tneg a\tneg b");

        //Loop pentur toate combinatiile posibile

        for(int i = 0; i <= 1; i++){
            for(int j = 0; j <= 1; j++){
               a = (i == 1);
               b = (j == 1);

                // Calculul rezultatelor operatiilor logice
                boolean andResult = a && b;
                boolean orResult = a || b;
                boolean xorResult = a ^ b;
                boolean notA = !a;
                boolean notB = !b;

                // Afisarea rezultatelor
                System.out.println(a + "\t" + b + "\t" + andResult + "\t" + orResult + "\t" + xorResult + "\t" + notA + "\t" + notB);
            }
        }
    }
}
