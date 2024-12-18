package X;

/* loaded from: classes12.dex */
public final class XVX extends C0T6 {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XVX) {
                XVX xvx = (XVX) obj;
                if (!C14360o3.A0K(this.A02, xvx.A02) || !C14360o3.A0K(this.A03, xvx.A03) || this.A01 != xvx.A01 || this.A00 != xvx.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)));
        long j = this.A00;
        return A07 + ((int) (j ^ (j >>> 32)));
    }

    public XVX(long j, String str, long j2, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = j;
        this.A00 = j2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SafetyInterventionsUserImpressionTrackerEntity(interventionType=");
        A1C.append(this.A02);
        A1C.append(MSV.A00(137));
        A1C.append(this.A03);
        A1C.append(", totalImpressions=");
        A1C.append(this.A01);
        A1C.append(", lastImpressionTimestamp=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
