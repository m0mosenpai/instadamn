package X;

/* renamed from: X.JwZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45044JwZ extends C0T6 {
    public final double A00;
    public final double A01;
    public final int A02;
    public final String A03;
    public final String A04;

    public C45044JwZ(String str, String str2, double d, double d2, int i) {
        C14360o3.A0B(str2, 2);
        this.A03 = str;
        this.A04 = str2;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45044JwZ) {
                C45044JwZ c45044JwZ = (C45044JwZ) obj;
                if (!C14360o3.A0K(this.A03, c45044JwZ.A03) || !C14360o3.A0K(this.A04, c45044JwZ.A04) || Double.compare(this.A00, c45044JwZ.A00) != 0 || Double.compare(this.A01, c45044JwZ.A01) != 0 || this.A02 != c45044JwZ.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0K(this.A04, AbstractC167017dG.A0O(this.A03) * 31) + AbstractC28006CWd.A00(this.A00)) * 31) + AbstractC28006CWd.A00(this.A01)) * 31) + this.A02;
    }
}
