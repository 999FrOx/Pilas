package Pilas;

public class Pila {
    private int capacidad;
    private String[] arreglo;
    private int cima;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new String[capacidad];
        this.cima = -1;
    }

    public void push(String elemento) {
        if (estaLlena()) {
            System.out.println("Error: La pila está llena.");
            return;
        }
        cima++;
        arreglo[cima] = elemento;
        System.out.println("Recordatorio \"" + elemento + "\" agregado.");
    }

    public String pop() {
        if (estaVacia()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
        String elemento = arreglo[cima];
        cima--;
        System.out.println("Recordatorio '" + elemento + "' Agregado.");
        return elemento;
    }

    public String peek() {
        if (estaVacia()) {
            System.out.println("Error: La pila está vacía.");
            return null;
        }
        System.out.println("Ultimo recordatorio: " + arreglo[cima]);
        return arreglo[cima];
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == capacidad - 1;
    }

    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
        System.out.print("Tus Recordatorios: ");
        for (int i = cima; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
