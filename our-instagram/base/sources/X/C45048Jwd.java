package X;

/* renamed from: X.Jwd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45048Jwd extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45048Jwd) {
                C45048Jwd c45048Jwd = (C45048Jwd) obj;
                if (!C14360o3.A0K(this.A04, c45048Jwd.A04) || !C14360o3.A0K(this.A03, c45048Jwd.A03) || !C14360o3.A0K(this.A05, c45048Jwd.A05) || this.A00 != c45048Jwd.A00 || this.A01 != c45048Jwd.A01 || this.A02 != c45048Jwd.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A04))) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public C45048Jwd(String str, String str2, String str3, int i, int i2, int i3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
