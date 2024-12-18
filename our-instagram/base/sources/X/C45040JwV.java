package X;

/* renamed from: X.JwV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45040JwV extends C0T6 {
    public final long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45040JwV) {
                C45040JwV c45040JwV = (C45040JwV) obj;
                if (!C14360o3.A0K(this.A03, c45040JwV.A03) || !C14360o3.A0K(this.A01, c45040JwV.A01) || !C14360o3.A0K(this.A02, c45040JwV.A02) || this.A00 != c45040JwV.A00 || this.A04 != c45040JwV.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC25236BEt.A01(this.A00, AbstractC166997dE.A0K(this.A02, (AbstractC166987dD.A0J(this.A03) + AbstractC167017dG.A0M(this.A01)) * 31)));
    }

    public C45040JwV(Long l, String str, String str2, long j, boolean z) {
        this.A03 = str;
        this.A01 = l;
        this.A02 = str2;
        this.A00 = j;
        this.A04 = z;
    }
}
