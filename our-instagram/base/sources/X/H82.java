package X;

/* loaded from: classes7.dex */
public final class H82 extends C0T6 implements JJB {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H82) {
                H82 h82 = (H82) obj;
                if (!C14360o3.A0K(this.A02, h82.A02) || !C14360o3.A0K(this.A00, h82.A00) || !C14360o3.A0K(this.A01, h82.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0J(this.A02)));
    }

    public H82(String str, String str2, String str3) {
        AbstractC167027dH.A13(str, str2, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
