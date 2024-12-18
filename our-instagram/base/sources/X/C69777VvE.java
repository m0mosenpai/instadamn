package X;

import com.fbpay.w3c.CardDetails;

/* renamed from: X.VvE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69777VvE {
    public CardDetails A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final W39 A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69777VvE) {
                C69777VvE c69777VvE = (C69777VvE) obj;
                if (!C14360o3.A0K(this.A00, c69777VvE.A00) || !C14360o3.A0K(this.A05, c69777VvE.A05) || this.A01 != c69777VvE.A01 || this.A04 != c69777VvE.A04 || !C14360o3.A0K(this.A06, c69777VvE.A06) || this.A03 != c69777VvE.A03 || this.A02 != c69777VvE.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DemaskResults(cardDetails=");
        sb.append(this.A00);
        sb.append(", failure=");
        sb.append(this.A05);
        sb.append(", timeInMs=");
        sb.append(this.A01);
        sb.append(", timeInMsForBindCard=");
        sb.append(this.A04);
        sb.append(", errorLogEventResultType=");
        sb.append(this.A06);
        sb.append(", timeInMsDemaskCardStart=");
        sb.append(this.A03);
        sb.append(", timeInMsDemaskCardEnd=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int i = 0;
        int A07 = AbstractC167007dF.A07(this.A04, AbstractC167007dF.A07(this.A01, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A05)) * 31));
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        int A072 = AbstractC167007dF.A07(this.A03, (A07 + i) * 31);
        long j = this.A02;
        return A072 + ((int) (j ^ (j >>> 32)));
    }

    public C69777VvE(CardDetails cardDetails, W39 w39, String str, long j, long j2, long j3, long j4) {
        this.A00 = cardDetails;
        this.A05 = w39;
        this.A01 = j;
        this.A04 = j2;
        this.A06 = str;
        this.A03 = j3;
        this.A02 = j4;
    }
}
