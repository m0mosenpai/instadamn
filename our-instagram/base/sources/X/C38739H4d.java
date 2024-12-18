package X;

/* renamed from: X.H4d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38739H4d extends C0T6 implements JJF {
    public final String A00;
    public final String A01;

    @Override // X.JJF
    public final C38739H4d EyD() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38739H4d) {
                C38739H4d c38739H4d = (C38739H4d) obj;
                if (!C14360o3.A0K(this.A00, c38739H4d.A00) || !C14360o3.A0K(this.A01, c38739H4d.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C38739H4d(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
