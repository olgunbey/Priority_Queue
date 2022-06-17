import java.rmi.server.RemoteStub;

public class oncelikliKuyruk {
    oncelikliKuyrukDugum on;
    oncelikliKuyrukDugum arka;

    public oncelikliKuyruk() {
        this.on = this.arka = null;
    }

    public boolean isEmpty() {
        return (this.on == null);
    }

    public void ekle(int data, int once) {
        oncelikliKuyrukDugum yeni = new oncelikliKuyrukDugum(data, once);

        if (isEmpty()) {
            this.on = yeni;
            this.arka = yeni;
        } else {
            // basa ekleme 111 2222 3333
            if (yeni.oncelik < this.on.oncelik) {
                yeni.sonraki = this.on;
                this.on = yeni;
                return;
            }
            // sona ekleme
            if (yeni.oncelik >= this.arka.oncelik) {
                arka.sonraki = yeni;
                this.arka = yeni;
                return;
            }
            // araya ekleme 111333555

            oncelikliKuyrukDugum temp = this.on;
            while (yeni.oncelik >= temp.sonraki.oncelik) {
                temp = temp.sonraki;
            }
            yeni.sonraki = temp.sonraki;
            temp.sonraki = yeni;
        }

    }

    public int cikar() {
        if (this.isEmpty()) {
            return -1;
        }
        int veri = this.on.eleman;
        if (this.on.sonraki == null) {
            this.arka = null;
        }
        this.on = this.on.sonraki;
        return veri;
    }

    public void listele() {
        oncelikliKuyrukDugum tmp = this.on;
        while (tmp != null) {
            tmp.yazdır();
            tmp = tmp.sonraki;
        }

    }

}
