package X;

/* loaded from: classes11.dex */
public final class UPC extends C0T6 {
    public int A00;
    public int A01;
    public int A02;
    public VEE A03;
    public String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPC) {
                UPC upc = (UPC) obj;
                if (this.A02 != upc.A02 || this.A00 != upc.A00 || this.A01 != upc.A01 || !C14360o3.A0K(this.A04, upc.A04) || this.A03 != upc.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public UPC() {
        VEE vee = VEE.A0R;
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A04 = "";
        this.A03 = vee;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A04, ((((this.A02 * 31) + this.A00) * 31) + this.A01) * 31) + this.A03.hashCode();
    }
}
