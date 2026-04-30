package Atribut;

public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private Penerbit penerbit;

    public Buku(int id, String judul, String penulis, Penerbit penerbit) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }

    public void index() {
        System.out.println("SELECT * FROM buku;");
    }

    public void store() {
        System.out.println("INSERT INTO buku (id, judul, penulis, penerbit_id) VALUES (" 
                + id + ", '" + judul + "', '" + penulis + "', " + penerbit + ");");
    }

    public void update() {
        System.out.println("UPDATE buku SET judul='" + judul + "', penulis='" 
                + penulis + "' WHERE id=" + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM buku WHERE id=" + id + ";");
    }
}