class Barang {
    private String idProduk;
    private String nama;
    private double harga;

    Barang(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getIdProduk() {
        return idProduk;
    }

}

class Nomor1 {
    public static void main(String[] args) {
        Barang br1 = new Barang("BRG-001","Tas Gucci");
        br1.setHarga(1200);

        Barang br2 = new Barang("BRG-002","Printer Epson L355");
        br2.setHarga(200);

        System.out.println(br1.getIdProduk()+" | " +br1.getNama()+" : "+br1.getHarga());

        Barang br3 = new Barang("BRG-003","Koper",150);

        Barang br4 = new Barang("BRG-004","Helm",20);

        System.out.println(br3.getIdProduk()+" | " +br3.getNama()+" : "+br3.getHarga());
        System.out.println(br4.getIdProduk()+" | " +br4.getNama()+" : "+br4.getHarga());

        System.out.println(br1.getHarga()+br3.getHarga()+br4.getHarga());
    }
}