package X;

/* renamed from: X.HDz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38971HDz extends AbstractC39653Hii {
    public final int A00;
    public final AbstractC115105If A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38971HDz) {
                C38971HDz c38971HDz = (C38971HDz) obj;
                if (!C14360o3.A0K(this.A01, c38971HDz.A01) || this.A00 != c38971HDz.A00 || this.A02 != c38971HDz.A02 || this.A04 != c38971HDz.A04 || this.A03 != c38971HDz.A03 || this.A06 != c38971HDz.A06 || this.A05 != c38971HDz.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A02, (AbstractC166987dD.A0G(this.A01) + this.A00) * 31)))));
    }

    public C38971HDz(AbstractC115105If abstractC115105If, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = abstractC115105If;
        this.A00 = i;
        this.A02 = z;
        this.A04 = z2;
        this.A03 = z3;
        this.A06 = z4;
        this.A05 = z5;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FailState(optionalResponse=");
        A1C.append(this.A01);
        A1C.append(", chunkIndex=");
        A1C.append(this.A00);
        A1C.append(", isFirstPage=");
        A1C.append(this.A02);
        A1C.append(", isRefreshing=");
        A1C.append(this.A04);
        A1C.append(", isPrefetchResponse=");
        A1C.append(this.A03);
        A1C.append(", isStreaming=");
        A1C.append(this.A06);
        A1C.append(", isRequestedFromCache=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }
}
