package X;

/* renamed from: X.KNs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45765KNs extends AbstractC46411KgX {
    public final C38321qM A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45765KNs) {
                C45765KNs c45765KNs = (C45765KNs) obj;
                if (!C14360o3.A0K(this.A00, c45765KNs.A00) || !C14360o3.A0K(this.A01, c45765KNs.A01) || !C14360o3.A0K(this.A02, c45765KNs.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A02);
    }

    public C45765KNs(C38321qM c38321qM, String str, String str2) {
        AbstractC167017dG.A1P(c38321qM, str);
        this.A00 = c38321qM;
        this.A01 = str;
        this.A02 = str2;
    }
}
