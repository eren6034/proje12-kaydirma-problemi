public class proje12kaydirmaproblemi {
    public static void main(String[] args) {
        String kelime = "Programlama";
        int uzunluk = kelime.length();

        for (int i = 0; i < uzunluk; i++) {
            for (int j = 0; j < uzunluk; j++) {
                int indeks = (i + j) % uzunluk;
                System.out.print(kelime.charAt(indeks));
            }
            System.out.println();
        }
    }
}