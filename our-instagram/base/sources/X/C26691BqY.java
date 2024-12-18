package X;

/* renamed from: X.BqY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26691BqY extends AbstractC29093CsK {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26691BqY) {
                C26691BqY c26691BqY = (C26691BqY) obj;
                if (this.A00 != c26691BqY.A00 || !C14360o3.A0K(this.A02, c26691BqY.A02) || !C14360o3.A0K(this.A01, c26691BqY.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A02, this.A00 * 31));
    }

    public C26691BqY(int i, String str, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }
}
