package X;

/* renamed from: X.0Zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07200Zt {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C07200Zt)) {
                return false;
            }
            C07200Zt c07200Zt = (C07200Zt) obj;
            if (this.A01 != c07200Zt.A01 || this.A02 != c07200Zt.A02 || this.A04 != c07200Zt.A04 || this.A03 != c07200Zt.A03 || this.A00 != c07200Zt.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.A01 + 31) * 31) + this.A02) * 31) + this.A04) * 31) + this.A03) * 31) + this.A00;
    }
}
