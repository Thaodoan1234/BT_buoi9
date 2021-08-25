public class PhanSo {

   private int tuSo;
   private int mauSo;

   public void print() {
       System.out.format("%d/%d\n",this.tuSo, this.mauSo);
   }

   public void init(int tuSo, int mauSo) {
       this.tuSo = tuSo;
       this.mauSo = mauSo;
   }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int UCLN(int a, int b) {
       while (a != b) {
           if (a > b) {
               a -= b;
           }
           else {
               b -= a;
           }
       }
       return a;
    }

    public void rutGonPhanSo() {
       int i = UCLN(this.getTuSo(), this.getMauSo());
       this.setTuSo(this.getTuSo()/i);
       this.setMauSo(this.getMauSo()/i);
    }

    public void congPhanSo(PhanSo ps) {
       int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
       int ms = this.getMauSo() * ps.getMauSo();
       PhanSo tongps = new PhanSo(ts,ms);
       tongps.rutGonPhanSo();
       System.out.println("Tổng hai phân số = " + tongps.tuSo + "/" + tongps.mauSo);
    }

    public void hieuPhanSo(PhanSo ps) {
       int ts = this.getTuSo() * ps.mauSo - ps.getTuSo() *this.getMauSo();
       int ms = this.getMauSo() * ps.getMauSo();
       PhanSo hieups = new PhanSo(ts, ms);
       hieups.rutGonPhanSo();
       System.out.println("Hiệu hai phân số = " + hieups.tuSo + "/" + hieups.mauSo);
    }

    public void nhanPhanSo(PhanSo ps) {
       int ts = this.getTuSo() * ps.getTuSo();
       int ms = this.getMauSo() * ps.getMauSo();
       PhanSo nhanps = new PhanSo(ts,ms);
       nhanps.rutGonPhanSo();
       System.out.println("Tích hai phan so = " + nhanps.tuSo + "/" + nhanps.mauSo);
    }

    public void chiaPhanSo(PhanSo ps) {
       int ts = this.getTuSo() * ps.getMauSo();
       int ms = this.getMauSo() * ps.getTuSo();
       PhanSo thuongps = new PhanSo(ts, ms);
       thuongps.rutGonPhanSo();
       System.out.println("Chia hai phân số = " + thuongps.tuSo + "/" + thuongps.mauSo);
    }

}
