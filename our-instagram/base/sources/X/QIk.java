package X;

import com.fbpay.w3c.CardDetails;

/* loaded from: classes10.dex */
public final class QIk extends C0T6 {
    public CardDetails A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final W39 A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIk) {
                QIk qIk = (QIk) obj;
                if (!C14360o3.A0K(this.A00, qIk.A00) || !C14360o3.A0K(this.A05, qIk.A05) || this.A01 != qIk.A01 || this.A04 != qIk.A04 || !C14360o3.A0K(this.A06, qIk.A06) || this.A03 != qIk.A03 || this.A02 != qIk.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A08(this.A02, AbstractC167007dF.A07(this.A03, (AbstractC167007dF.A07(this.A04, AbstractC167007dF.A07(this.A01, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC25227BEk.A07(this.A06)) * 31));
    }

    public QIk(CardDetails cardDetails, W39 w39, String str, long j, long j2, long j3, long j4) {
        this.A00 = cardDetails;
        this.A05 = w39;
        this.A01 = j;
        this.A04 = j2;
        this.A06 = str;
        this.A03 = j3;
        this.A02 = j4;
    }
}
