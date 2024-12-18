package X;

/* renamed from: X.NdT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53054NdT extends AbstractC53585Nmr {
    public final String A00;
    public final String A01;
    public final String A02;

    public C53054NdT(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53054NdT) {
                C53054NdT c53054NdT = (C53054NdT) obj;
                if (!C14360o3.A0K(this.A01, c53054NdT.A01) || !C14360o3.A0K(this.A02, c53054NdT.A02) || !C14360o3.A0K(this.A00, c53054NdT.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A00);
    }
}
