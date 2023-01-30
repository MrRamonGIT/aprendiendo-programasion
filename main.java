public class main {
    public static void main(String[] args){
        coche miCoche = new coche();
        miCoche.incremento();
        System.out.println(miCoche.puertas);
    }
    static class coche{
        public int puertas = 4;
        public void incremento(){
            this.puertas++;
        }
    }
}
