package X;

/* renamed from: X.JRe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43621JRe extends C0T6 {
    public final long A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43621JRe) {
                C43621JRe c43621JRe = (C43621JRe) obj;
                if (this.A02 != c43621JRe.A02 || this.A01 != c43621JRe.A01 || this.A00 != c43621JRe.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A08(this.A02)) + AbstractC25228BEl.A03(this.A00);
    }

    public C43621JRe(long j, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LoadState(isLoading=");
        A1C.append(this.A02);
        A1C.append(", canLoadMore=");
        A1C.append(this.A01);
        A1C.append(", oldestThreadLoadTimestamp=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
