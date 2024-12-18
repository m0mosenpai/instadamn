package X;

/* renamed from: X.K2s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45290K2s extends C0T6 implements MNW {
    public final C45128JyU A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45290K2s) {
                C45290K2s c45290K2s = (C45290K2s) obj;
                if (!C14360o3.A0K(this.A00, c45290K2s.A00) || !C14360o3.A0K(this.A01, c45290K2s.A01) || this.A03 != c45290K2s.A03 || this.A02 != c45290K2s.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0M(this.A00) * 31)));
    }

    public C45290K2s(C45128JyU c45128JyU, String str, boolean z, boolean z2) {
        this.A00 = c45128JyU;
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
    }

    public C45290K2s() {
        this(null, "", false, false);
    }
}
