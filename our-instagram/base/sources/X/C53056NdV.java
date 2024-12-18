package X;

/* renamed from: X.NdV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53056NdV extends AbstractC53585Nmr {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53056NdV) {
                C53056NdV c53056NdV = (C53056NdV) obj;
                if (!C14360o3.A0K(this.A00, c53056NdV.A00) || !C14360o3.A0K(this.A01, c53056NdV.A01) || !C14360o3.A0K(this.A03, c53056NdV.A03) || !C14360o3.A0K(this.A02, c53056NdV.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00)) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public C53056NdV(String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }
}
