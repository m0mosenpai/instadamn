package X;

import com.fbpay.w3c.CardDetails;

/* loaded from: classes10.dex */
public final class QIi extends C0T6 {
    public CardDetails A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final W39 A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIi) {
                QIi qIi = (QIi) obj;
                if (!C14360o3.A0K(this.A00, qIi.A00) || !C14360o3.A0K(this.A04, qIi.A04) || this.A01 != qIi.A01 || !C14360o3.A0K(this.A05, qIi.A05) || this.A03 != qIi.A03 || this.A02 != qIi.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A08(this.A02, AbstractC167007dF.A07(this.A03, (AbstractC167007dF.A07(this.A01, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC25227BEk.A07(this.A05)) * 31));
    }

    public QIi(CardDetails cardDetails, W39 w39, String str, long j, long j2, long j3) {
        this.A00 = cardDetails;
        this.A04 = w39;
        this.A01 = j;
        this.A05 = str;
        this.A03 = j2;
        this.A02 = j3;
    }
}
