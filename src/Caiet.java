public class Caiet extends Rechizita{
    public Caiet(String eticheta) {
        super(eticheta);
    }

    @Override
    public String getNume() {
        return this.eticheta + " Caiet";
    }
}
