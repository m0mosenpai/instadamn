package X;

/* renamed from: X.KUr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45940KUr extends AbstractC46445Kh5 {
    public final int A00;
    public final long A01;
    public final C45116Jxl A02;
    public final C3PO A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45940KUr) {
                C45940KUr c45940KUr = (C45940KUr) obj;
                if (!C14360o3.A0K(this.A02, c45940KUr.A02) || this.A05 != c45940KUr.A05 || this.A03 != c45940KUr.A03 || this.A00 != c45940KUr.A00 || this.A01 != c45940KUr.A01 || !C14360o3.A0K(this.A04, c45940KUr.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A01, (AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A0D(this.A05, AbstractC167017dG.A0M(this.A02) * 31)) + this.A00) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C45940KUr(C45116Jxl c45116Jxl, C3PO c3po, String str, int i, long j, boolean z) {
        this.A02 = c45116Jxl;
        this.A05 = z;
        this.A03 = c3po;
        this.A00 = i;
        this.A01 = j;
        this.A04 = str;
    }
}
