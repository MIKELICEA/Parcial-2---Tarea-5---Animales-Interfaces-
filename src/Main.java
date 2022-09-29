import opp.parcial2.animales.*;

public class Main {
    public static void main(String[] args) {
        Animal pato = new Pato();
        Animal aguila = new Aguila();
        Animal halcon = new Halcon();
        Animal condor = new Condor();
        Animal gorrion = new Gorrion();

        System.out.println(pato);
        System.out.println(aguila);
        System.out.println(halcon);
        System.out.println(condor);
        System.out.println(gorrion);

        Animal trucha = new Trucha();
        Animal tilapia = new Tilapia();
        Animal salmon = new Salmon();
        Animal sardina = new Sardina();

        System.out.println(trucha);
        System.out.println(tilapia);
        System.out.println(salmon);
        System.out.println(sardina);

        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal raton = new Raton();
        Animal tortuga = new Tortuga();

        System.out.println(perro);
        System.out.println(gato);
        System.out.println(raton);
        System.out.println(tortuga);
    }
}