package X;

/* loaded from: classes12.dex */
public final class XVW extends C0T6 {
    public final long A00;
    public final long A01;
    public final String A02;

    public XVW(String str, long j, long j2) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XVW) {
                XVW xvw = (XVW) obj;
                if (!C14360o3.A0K(this.A02, xvw.A02) || this.A01 != xvw.A01 || this.A00 != xvw.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A01, AbstractC166987dD.A0J(this.A02));
        long j = this.A00;
        return A07 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SafetyInterventionsGlobalImpressionTrackerEntity(interventionType=");
        A1C.append(this.A02);
        A1C.append(", totalImpressions=");
        A1C.append(this.A01);
        A1C.append(", lastImpressionTimestamp=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
