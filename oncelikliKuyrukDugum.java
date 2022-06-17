public class oncelikliKuyrukDugum {

    public int eleman;
    public oncelikliKuyrukDugum sonraki;
    public int oncelik;

    public oncelikliKuyrukDugum(int v, int o) {
        this.eleman = v;
        this.oncelik = o;
    }

    public void yazdır() {
        System.out.println("ONCELIK SIRASI: " + this.oncelik + " " + "DEGER: " + this.eleman);
    }

}
