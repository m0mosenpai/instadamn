package X;

/* renamed from: X.Gln, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37892Gln extends C0T6 implements InterfaceC31098Dlg {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37892Gln) {
                C37892Gln c37892Gln = (C37892Gln) obj;
                if (!C14360o3.A0K(this.A02, c37892Gln.A02) || !C14360o3.A0K(this.A01, c37892Gln.A01) || this.A00 != c37892Gln.A00 || this.A03 != c37892Gln.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A01)) * 31) + this.A00) * 31);
    }

    public C37892Gln(String str, String str2, int i, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = z;
    }
}
