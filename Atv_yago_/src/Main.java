class Main {
    Main() {
    }

    public static void main(String[] args) {
        Herois heroi1 = new Herois("Hayato", 100, 50, 60);
        Herois heroi2 = new Herois("Alok", 90, 45, 47);
        heroi1.Info();
        heroi2.Info();
        heroi1.atacar(heroi2);
        heroi1.atacar(heroi2);
        heroi1.atacar(heroi2);
        heroi2.atacar(heroi1);
        heroi1.Info();
        heroi2.Info();
    }
}