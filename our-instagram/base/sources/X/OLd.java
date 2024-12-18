package X;

import libraries.zero.headers.ZeroHeadersEntry;

/* loaded from: classes9.dex */
public final class OLd {
    public final long A00;
    public final ZeroHeadersEntry A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OLd) {
                OLd oLd = (OLd) obj;
                if (!C14360o3.A0K(this.A01, oLd.A01) || this.A00 != oLd.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC25228BEl.A03(this.A00);
    }

    public OLd(ZeroHeadersEntry zeroHeadersEntry, long j) {
        this.A01 = zeroHeadersEntry;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MostRecentEntry(entry=");
        A1C.append(this.A01);
        A1C.append(AbstractC43591JPw.A00(103));
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
