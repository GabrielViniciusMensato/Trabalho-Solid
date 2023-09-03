package sistema.valid;

import java.util.Random;

public class GeradorNumerosConta {

    private static Random rand = new Random();

    public static int gerarNumero() {
        return 100000 + rand.nextInt(900000);
    }
}
