package X;

/* loaded from: classes7.dex */
public final class H3Y extends C0T6 implements JJE {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public H3Y(String str, String str2, String str3, String str4) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // X.JJE
    public final H3Y EuB() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3Y) {
                H3Y h3y = (H3Y) obj;
                if (!C14360o3.A0K(this.A00, h3y.A00) || !C14360o3.A0K(this.A01, h3y.A01) || !C14360o3.A0K(this.A02, h3y.A02) || !C14360o3.A0K(this.A03, h3y.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00))));
    }
}
