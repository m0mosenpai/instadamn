package X;

/* loaded from: classes9.dex */
public final class OKv {
    public final int A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        OKv oKv;
        if (this != obj) {
            if (obj instanceof OKv) {
                oKv = (OKv) obj;
            } else {
                oKv = null;
            }
            if (oKv == null || !C14360o3.A0K(this.A01, oKv.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public OKv(String str, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A03 = z;
        this.A00 = i;
        this.A02 = z2;
        this.A04 = z3;
    }
}
