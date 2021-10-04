class Buku {
    private String judul;
    private String pengarang;
    private double harga;

    public Buku(String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public double getHarga() {
        return harga;
    }

}

class Nomor2 {
    public static void main(String[] args) {
        Buku bk1 = new Buku("Harry Potter","J.K. Rowling",300000);
        Buku bk2 = new Buku("UML","Ivar Jacobson",400000);

        System.out.println("Judul : "+ bk1.getJudul() + "\n" + "Pengarang : " + bk1.getPengarang() +" \n "+ "Harga : " + bk1.getHarga() + "\n");
        System.out.println("Judul : "+ bk2.getJudul() + "\n" + "Pengarang : " + bk2.getPengarang() +" \n "+ "Harga : " + bk2.getHarga() + "\n");

    }
}