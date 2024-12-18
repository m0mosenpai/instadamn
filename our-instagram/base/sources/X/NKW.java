package X;

/* loaded from: classes9.dex */
public final class NKW extends AbstractC53468Nkv {
    public final int A00;
    public final int A01 = 2131968948;
    public final int A02 = 2131956061;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NKW) {
                NKW nkw = (NKW) obj;
                if (this.A03 != nkw.A03 || this.A00 != nkw.A00 || this.A01 != nkw.A01 || this.A02 != nkw.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03 * 31) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public NKW(int i, int i2) {
        this.A03 = i;
        this.A00 = i2;
    }
}
