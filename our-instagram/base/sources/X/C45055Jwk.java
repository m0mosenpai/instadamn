package X;

import java.util.HashMap;

/* renamed from: X.Jwk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45055Jwk extends C0T6 {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final HashMap A06;
    public final HashMap A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45055Jwk) {
                C45055Jwk c45055Jwk = (C45055Jwk) obj;
                if (!C14360o3.A0K(this.A02, c45055Jwk.A02) || !C14360o3.A0K(this.A03, c45055Jwk.A03) || !C14360o3.A0K(this.A06, c45055Jwk.A06) || !C14360o3.A0K(this.A07, c45055Jwk.A07) || this.A00 != c45055Jwk.A00 || this.A01 != c45055Jwk.A01 || !C14360o3.A0K(this.A04, c45055Jwk.A04) || !C14360o3.A0K(this.A05, c45055Jwk.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC25236BEt.A01(this.A01, (((((AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC166997dE.A0I(this.A07)) * 31) + this.A00) * 31)));
    }

    public C45055Jwk(String str, String str2, String str3, String str4, HashMap hashMap, HashMap hashMap2, int i, long j) {
        AbstractC167017dG.A1P(str, str2);
        AbstractC167007dF.A1I(str3, 7, str4);
        this.A02 = str;
        this.A03 = str2;
        this.A06 = hashMap;
        this.A07 = hashMap2;
        this.A00 = i;
        this.A01 = j;
        this.A04 = str3;
        this.A05 = str4;
    }
}
