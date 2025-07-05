package main.Ejercicio_04_depth;

public class Depth {

    public static class Nodo {
        public int valor;
        public Nodo izquierda, derecha;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }
    public static int calcularProfundidadMaxima(Nodo raiz) {
        if (raiz == null) return 0;
        int izquierda = calcularProfundidadMaxima(raiz.izquierda);
        int derecha = calcularProfundidadMaxima(raiz.derecha);
        return Math.max(izquierda, derecha) + 1;
    }
}

