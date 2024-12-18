package X;

/* loaded from: classes10.dex */
public final class RTN extends RT7 {
    public final SXt A00;
    public final String A01;

    public final boolean equals(Object o) {
        if (!(o instanceof RTN)) {
            return false;
        }
        RTN rtn = (RTN) o;
        if (!rtn.A01.equals(this.A01)) {
            return false;
        }
        return AbstractC58320PtC.A1X(rtn.A00, this.A00);
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(RTN.class, this.A01, this.A00);
    }

    public RTN(SXt keyUri, String variant) {
        this.A01 = variant;
        this.A00 = keyUri;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LegacyKmsAead Parameters (keyUri: ");
        A1C.append(this.A01);
        A1C.append(", variant: ");
        return AbstractC58323PtF.A0q(this.A00, A1C);
    }
}
