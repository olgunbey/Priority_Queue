public class ornek {
    public static void main(String[] args) {
        oncelikliKuyruk liste = new oncelikliKuyruk();

        liste.ekle(50, 1);
        liste.ekle(60, 1);
        liste.ekle(70, 1);
        liste.ekle(80, 4);
        liste.ekle(90, 4);
        liste.ekle(100, 3);
        liste.ekle(120, 2);
        liste.ekle(130, 3);
        liste.ekle(20, 2);
        liste.ekle(1, 1);
        liste.listele();
    }
}