package X;

import com.facebookpay.offsite.models.message.OffsiteData;

/* renamed from: X.L9a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47793L9a {
    public final long A00;
    public final OffsiteData A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47793L9a) {
                C47793L9a c47793L9a = (C47793L9a) obj;
                if (this.A00 != c47793L9a.A00 || !C14360o3.A0K(this.A01, c47793L9a.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC25235BEs.A03(this.A00));
    }

    public C47793L9a(OffsiteData offsiteData, long j) {
        this.A00 = j;
        this.A01 = offsiteData;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OffsiteDataValue(timestamp=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(287));
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
