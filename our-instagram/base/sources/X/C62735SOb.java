package X;

import com.facebookpay.otc.models.OtcInput;

/* renamed from: X.SOb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62735SOb {
    public final OtcInput A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62735SOb) {
                C62735SOb c62735SOb = (C62735SOb) obj;
                if (!C14360o3.A0K(this.A01, c62735SOb.A01) || !C14360o3.A0K(this.A00, c62735SOb.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public C62735SOb(OtcInput otcInput, String str) {
        this.A01 = str;
        this.A00 = otcInput;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProductComponent(productId=");
        A1C.append(this.A01);
        A1C.append(", otcInput=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
