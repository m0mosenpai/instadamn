package X;

import com.fbpay.hub.transactions.api.UpcomingPayout;
import com.google.common.collect.ImmutableList;

/* renamed from: X.SZg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62963SZg {
    public final UpcomingPayout A00;
    public final ImmutableList A01;
    public final String A02;

    public C62963SZg(UpcomingPayout upcomingPayout, ImmutableList immutableList, String str) {
        this.A02 = str;
        AbstractC63311ShH.A04(immutableList, "transactions");
        this.A01 = immutableList;
        this.A00 = upcomingPayout;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62963SZg) {
                C62963SZg c62963SZg = (C62963SZg) obj;
                if (!C14360o3.A0K(this.A02, c62963SZg.A02) || !C14360o3.A0K(this.A01, c62963SZg.A01) || !C14360o3.A0K(this.A00, c62963SZg.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC63311ShH.A02(this.A02) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A00);
    }

    public C62963SZg(SE8 se8) {
        this.A02 = se8.A01;
        ImmutableList immutableList = se8.A00;
        AbstractC63311ShH.A04(immutableList, "transactions");
        this.A01 = immutableList;
        this.A00 = null;
    }
}
