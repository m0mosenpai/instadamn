package X;

/* renamed from: X.KNt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45766KNt extends AbstractC46411KgX {
    public final C38321qM A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C45766KNt(C38321qM c38321qM, String str, String str2, String str3) {
        AbstractC167007dF.A1F(c38321qM, 1, str3);
        this.A00 = c38321qM;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45766KNt) {
                C45766KNt c45766KNt = (C45766KNt) obj;
                if (!C14360o3.A0K(this.A00, c45766KNt.A00) || !C14360o3.A0K(this.A03, c45766KNt.A03) || !C14360o3.A0K(this.A02, c45766KNt.A02) || !C14360o3.A0K(this.A01, c45766KNt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, (((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31);
    }
}
