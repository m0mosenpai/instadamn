package X;

/* renamed from: X.Ebd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32773Ebd extends FKR {
    public final C38321qM A00;
    public final C38321qM A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32773Ebd) {
                C32773Ebd c32773Ebd = (C32773Ebd) obj;
                if (!C14360o3.A0K(this.A02, c32773Ebd.A02) || !C14360o3.A0K(this.A01, c32773Ebd.A01) || !C14360o3.A0K(this.A00, c32773Ebd.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32773Ebd(C38321qM c38321qM, C38321qM c38321qM2, String str) {
        super(C2EY.A1F, str);
        this.A02 = str;
        this.A01 = c38321qM;
        this.A00 = c38321qM2;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
