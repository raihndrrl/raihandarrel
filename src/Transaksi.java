public class Transaksi {

    private String keterangan;
    private double jumlah;
    private String tipe;

public Transaksi(String keterangan, double jumlah, String tipe) {
    this.keterangan = keterangan;
    this.jumlah = jumlah;
    this.tipe = tipe;
}

public String getKeterangan() {
    return keterangan;
}

public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

public double getJumlah() {
    return jumlah;
}

public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

public String getTipe() {
    return tipe;
}

public void setTipe(String tipe) {
        this.tipe = tipe;
    }

@Override
public String toString() {
    return tipe + " - " + keterangan + ": Rp " + jumlah;
}

}


