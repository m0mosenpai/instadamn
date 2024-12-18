package X;

/* loaded from: classes10.dex */
public final class RTP extends RT7 {
    public final RT7 A00;
    public final SXu A01;
    public final String A02;
    public final SYD A03;

    public final boolean equals(Object o) {
        if (!(o instanceof RTP)) {
            return false;
        }
        RTP rtp = (RTP) o;
        if (!rtp.A03.equals(this.A03) || !rtp.A00.equals(this.A00) || !rtp.A02.equals(this.A02)) {
            return false;
        }
        return AbstractC58320PtC.A1X(rtp.A01, this.A01);
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(RTP.class, this.A02, this.A03, this.A00, this.A01);
    }

    public RTP(RT7 variant, SYD kekUri, SXu dekParsingStrategy, String dekParametersForNewKeys) {
        this.A01 = dekParsingStrategy;
        this.A02 = dekParametersForNewKeys;
        this.A03 = kekUri;
        this.A00 = variant;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        A1C.append(this.A02);
        A1C.append(", dekParsingStrategy: ");
        A1C.append(this.A03);
        A1C.append(", dekParametersForNewKeys: ");
        A1C.append(this.A00);
        A1C.append(", variant: ");
        return AbstractC58323PtF.A0q(this.A01, A1C);
    }
}
