package X;

/* renamed from: X.3u1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86883u1 extends C0T6 {
    public final C206309Bn A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86883u1) {
                C86883u1 c86883u1 = (C86883u1) obj;
                if (this.A04 != c86883u1.A04 || this.A02 != c86883u1.A02 || this.A03 != c86883u1.A03 || !C14360o3.A0K(this.A01, c86883u1.A01) || !C14360o3.A0K(this.A00, c86883u1.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        return ((((i4 + i5) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public C86883u1(C206309Bn c206309Bn, String str, boolean z, boolean z2, boolean z3) {
        this.A04 = z;
        this.A02 = z2;
        this.A03 = z3;
        this.A01 = str;
        this.A00 = c206309Bn;
    }
}
