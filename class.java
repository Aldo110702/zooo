public class main{
    public static void main(string[] args){
        ArrayList<Konsumsi> listkonsumsi= new ArrayList<>();
        konsumsi<makanan, minuman> breakfast = new konsumsi<>();
        konsumsi<makanan, minuman> lunch = new konsumsi<>();

        makanan roti = new makanan();
        roti.setNamaHidangan("roti tawar");
        minuman susu = new minuman();
        susu.setNamaHidangan("susu sapi");
        breakfast.setKonsumsi(roti,susu);
        liskonsumsi.add(breakfast);

        makanan nasi = new makanan();
        nasi.setNamaHidangan("nais putih");
        minuman air = new minuman();
        air.setNamaHidangan("air putih)'

        lunch.setkonsumsi(nasi,air);
        listkonsumsi.add(lunch);

        system.out.println("menu konsumsi");
        for (konsumsi<makanan.,minuman> konsumsi: listkonsumsi){
            makanan makanan = konsumsi.getM();
            minuman minuman = konsumsi.getI();

            system.out.println(makanan.disantap());
            system.out.println(miniman.disantap());
        }
    }
}