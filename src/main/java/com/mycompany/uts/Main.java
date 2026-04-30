package com.mycompany.uts;

import Atribut.User;
import Atribut.Penerbit;
import Atribut.Buku;

public class Main {
    public static void main(String[] args) {

        User user = new User(1, "user@mail.com", "12345");
        user.index();
        user.store();
        user.update();
        user.destroy();

        System.out.println();

        Penerbit penerbit = new Penerbit(1, "Gramedia", "Jakarta");
        penerbit.index();
        penerbit.store();
        penerbit.update();
        penerbit.destroy();

        System.out.println();

        Buku buku = new Buku(1, "Belajar Java", "Andi", penerbit);
        buku.index();
        buku.store();
        buku.update();
        buku.destroy();
    }
}