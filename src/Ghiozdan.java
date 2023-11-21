public class Ghiozdan {
    private Rechizita[] rechizite;
    private int numarRechizite;

    public Ghiozdan(int capacitateMaxima) {
        this.rechizite = new Rechizita[capacitateMaxima];
        this.numarRechizite = 0;
    }

    public void add(Manual manual) {
        rechizite[numarRechizite++] = manual;
    }

    public void add(Caiet caiet) {
        rechizite[numarRechizite++] = caiet;
    }

    public void listItems() {
        for (int i = 0; i < numarRechizite; i++) {
            System.out.println(rechizite[i].getNume());
        }
    }

    public void listManual() {
        for (int i = 0; i < numarRechizite; i++) {
            if (rechizite[i] instanceof Manual) {
                System.out.println(rechizite[i].getNume());
            }
        }
    }

    public void listCaiet() {
        for (int i = 0; i < numarRechizite; i++) {
            if (rechizite[i] instanceof Caiet) {
                System.out.println(rechizite[i].getNume());
            }
        }
    }

    public int getNrRechizite() {
        return numarRechizite;
    }

    public int getNrManuale() {
        int numarManuale = 0;
        for (int i = 0; i < numarRechizite; i++) {
            if (rechizite[i] instanceof Manual) {
                numarManuale++;
            }
        }
        return numarManuale;
    }

    public int getNrCaiete() {
        int numarCaiete = 0;
        for (int i = 0; i < numarRechizite; i++) {
            if (rechizite[i] instanceof Caiet) {
                numarCaiete++;
            }
        }
        return numarCaiete;
    }
}
