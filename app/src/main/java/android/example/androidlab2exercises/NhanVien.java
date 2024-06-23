package android.example.androidlab2exercises;

public class NhanVien {
    int idPic;
    String maNV;
    String tenNV;
    Boolean gioiTinh;
    Boolean isPicked = false;
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) { this.maNV = maNV; }
    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }
    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Boolean getPicked() {
        return isPicked;
    }
    public void setPicked(Boolean picked) {
        isPicked = picked;
    }

    public NhanVien() { }

    public NhanVien(String maNV, String tenNV, Boolean gioiTinh) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
    }
}
