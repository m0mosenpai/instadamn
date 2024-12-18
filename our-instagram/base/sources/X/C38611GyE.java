package X;

/* renamed from: X.GyE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38611GyE extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38611GyE) {
                C38611GyE c38611GyE = (C38611GyE) obj;
                if (!C14360o3.A0K(this.A00, c38611GyE.A00) || !C14360o3.A0K(this.A01, c38611GyE.A01) || !C14360o3.A0K(this.A02, c38611GyE.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A00)) + AbstractC167017dG.A0O(this.A02);
    }

    public C38611GyE(String str, String str2, String str3) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
