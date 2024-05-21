public class Main {
    public static void main(String[] args) {
        Animale animale = new Animale("Verso non riconosciuto");
        Gatto gatto = new Gatto("Miao!");
        System.out.print("Animale = ");
        animale.faiIlVerso();
        System.out.print("Gatto = ");
        gatto.faiIlVerso();
    }
}