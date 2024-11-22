public class Suma {
    public int a;
    public int b;

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calcular() {
        int resultado;

        resultado = this.a + this.b;
        
        return resultado;
    }
}
