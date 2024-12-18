package X;

/* loaded from: classes5.dex */
public final class CVE {
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVE) {
                long j = this.A01;
                CVE cve = (CVE) obj;
                long j2 = cve.A01;
                long j3 = C1132359l.A01;
                if (j != j2 || this.A00 != cve.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = C1132359l.A01;
        int A03 = AbstractC25227BEk.A03(j);
        long j3 = this.A00;
        return A03 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public CVE(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SelectionColors(selectionHandleColor=");
        A1C.append((Object) C1132359l.A06(this.A01));
        A1C.append(", selectionBackgroundColor=");
        return AbstractC167017dG.A0o(C1132359l.A06(this.A00), A1C);
    }
}
