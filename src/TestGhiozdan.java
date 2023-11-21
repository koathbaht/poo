public class TestGhiozdan {
    public static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan(10);

        Manual manual1 = new Manual("Manual de Matematica");
        Manual manual2 = new Manual("Manual de Limba Romana");
        Caiet caiet1 = new Caiet("Caiet de Biologie");
        Caiet caiet2 = new Caiet("Caiet de Fizica");

        ghiozdan.add(manual1);
        ghiozdan.add(manual2);
        ghiozdan.add(caiet1);
        ghiozdan.add(caiet2);

        System.out.println("Numar total de rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Numar de manuale: " + ghiozdan.getNrManuale());
        System.out.println("Numar de caiete: " + ghiozdan.getNrCaiete());

        System.out.println("Lista rechizitelor:");
        ghiozdan.listItems();

        System.out.println("Lista manualelor:");
        ghiozdan.listManual();

        System.out.println("Lista caietelor:");
        ghiozdan.listCaiet();
    }
}
