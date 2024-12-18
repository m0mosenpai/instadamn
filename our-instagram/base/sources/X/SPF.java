package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class SPF {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SPF) {
                SPF spf = (SPF) obj;
                if (!C14360o3.A0K(this.A00, spf.A00) || !C14360o3.A0K(this.A01, spf.A01) || !C14360o3.A0K(this.A02, spf.A02) || !C14360o3.A0K(this.A04, spf.A04) || !C14360o3.A0K(this.A03, spf.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31))) + AbstractC25227BEk.A07(this.A03);
    }

    public SPF(String str, String str2, String str3, String str4, Map map) {
        AbstractC167017dG.A1R(str2, str3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = map;
        this.A03 = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VerifyAuthFactor(authType=");
        A1C.append(this.A00);
        A1C.append(", paymentType=");
        A1C.append(this.A01);
        A1C.append(", sessionId=");
        A1C.append(this.A02);
        A1C.append(", authParam=");
        A1C.append(this.A04);
        A1C.append(", targetAccountId=");
        return AbstractC25236BEt.A0Y(this.A03, A1C);
    }
}
