package com.example.hewan;

import java.util.ArrayList;

public class DataHewan {
    private static final String[] urutanHewan ={
            "1. Persia",
            "2. british shorthair",
            "3. Bengal",
            "4. Maine Coons",
            "5. American Shorthairs",
            "6. Ragdoll",
            "7. Domestik",



    };

    private static String detailHewan[] = {

            "Kucing persia adalah ras kucing domestik berbulu panjang dengan karakter wajah bulat dan moncong pendek. Namanya mengacu pada Persia, nama lama Iran, di mana kucing serupa ditemukan. Sejak akhir abad 19, kucing jenis ini dikembangkan di Britania Raya dan Amerika Serikat usai Perang Dunia II.eringin (Ficus benjamina dan beberapa jenis (genus) Ficus lain dari suku ara-araan atau Moraceae), yang disebut juga waringin atau (agak keliru) ara (kiara ki berarti “pohon”), dikenal sebagai tumbuhan pekarangan dan tumbuhan hias pot. Pemulia telah mengembangkan beringin berdaun loreng (variegata) yang populer sebagai tanaman hias ruangan. Beringin juga sering digunakan sebagai objek bonsai",
            "Kucing bulu pendek britania(british shorthai) adalah salah satu ras kucing tertua yang nenek moyang dipercayai memiliki hubungan dengan bangsa Romawi yang pernah dahulu menguasai Inggris. Kucing ini adalah kucing berbadan sedang dengan bulu yang pendek. Selain itu, kucing ini juga banyak menjadi ikon",
            "Kucing bengal adalah keturunan keempat dari hasil persilangan antara kucing american shorthair dengan kucing asian leopard. Kucing ini berasal dari California, Amerika Serikat. Meskipun tergolong kucing hutan, tetapi ras bengal termasuk hewan yang banyak digemari dan dijadikan hewan peliharaan",
            "Maine coon adalah salah satu ras kucing tertua dan alami yang berasal dari Maine, Amerika Serikat. Ras ini dipercayai nenek moyangnya berasal dari ras anggora dan kucing hutan norwegia",
            "Kucing bulu pendek amerika(American Shorthair) adalah salah satu ras kucing dari Amerika Utara yang masih merupakan keturunan dari ras kucing bulu pendek eropa dan kucing bulu pendek britania raya",
            "Ragdoll adalah salah satu ras kucing terbesar di dunia yang telah diakui oleh Guinness World Records. Ragdoll awalnya dikembangkan oleh Ann Baker dari Amerika Serikat.",
            "kucing domestik atau kucing rumah adalah sejenis mamalia karnivora dari keluarga Felidae. Kata kucing biasanya merujuk kepada kucing yang telah dijinakkan, tetapi bisa juga merujuk kepada kucing besar seperti singa dan harimau.",
    };

    private static final int[] imageHewan = {
            R.drawable.kucing1,
            R.drawable.kucing2,
            R.drawable.kucing3,
            R.drawable.kucing4,
            R.drawable.kucing5,
            R.drawable.kucing6,
            R.drawable.kucing7,
    };

    static ArrayList<Hewan> getListData() {
        ArrayList<Hewan> list = new ArrayList<>();
        for (int position = 0; position < urutanHewan.length; position++) {
            Hewan hewan = new Hewan();
            hewan.setNama(urutanHewan[position]);
            hewan.setDetail(detailHewan[position]);
            hewan.setPhoto(imageHewan[position]);
            list.add(hewan);
        }
        return list;
    }
}