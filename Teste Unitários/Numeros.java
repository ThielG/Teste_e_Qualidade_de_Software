package testeunitario.matematica;

public class Numeros {

    public boolean numeroPar(int n) {
        return n % 2 == 0;
    }

    public int areaQuadrado(int lado) {
        return lado * lado;
    }

    public boolean numeroDivisivel (int dividendo, int divisor) {
        return dividendo % divisor == 0;
    }

    public int somar(int primeiroNumero, int segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public int subtracao(int primeiroNumero, int segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    public boolean testMedia(int primeriaNota, int segundaNota, int terceitaNota) {
        int minimo = 7;
        return ((primeriaNota + segundaNota + terceitaNota) / 3) >= minimo;
    }

    public  boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
