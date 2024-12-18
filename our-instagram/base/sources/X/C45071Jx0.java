package X;

import java.util.Arrays;

/* renamed from: X.Jx0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45071Jx0 extends C0T6 {
    public final long A00;
    public final C51622MrF A01;
    public final EnumC74603Ws A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final byte[] A0A;

    public C45071Jx0(C51622MrF c51622MrF, EnumC74603Ws enumC74603Ws, String str, String str2, String str3, String str4, String str5, String str6, String str7, byte[] bArr, long j) {
        C14360o3.A0B(str, 1);
        AbstractC25234BEr.A1R(str2, str3, str4, str5, str6);
        AbstractC167007dF.A1I(str7, 7, enumC74603Ws);
        C14360o3.A0B(bArr, 11);
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A09 = str5;
        this.A03 = str6;
        this.A04 = str7;
        this.A02 = enumC74603Ws;
        this.A01 = c51622MrF;
        this.A00 = j;
        this.A0A = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45071Jx0) {
                C45071Jx0 c45071Jx0 = (C45071Jx0) obj;
                if (!C14360o3.A0K(this.A07, c45071Jx0.A07) || !C14360o3.A0K(this.A08, c45071Jx0.A08) || !C14360o3.A0K(this.A05, c45071Jx0.A05) || !C14360o3.A0K(this.A06, c45071Jx0.A06) || !C14360o3.A0K(this.A09, c45071Jx0.A09) || !C14360o3.A0K(this.A03, c45071Jx0.A03) || !C14360o3.A0K(this.A04, c45071Jx0.A04) || this.A02 != c45071Jx0.A02 || !C14360o3.A0K(this.A01, c45071Jx0.A01) || this.A00 != c45071Jx0.A00 || !C14360o3.A0K(this.A0A, c45071Jx0.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A08, AbstractC166987dD.A0J(this.A07)))))))))) + Arrays.hashCode(this.A0A);
    }
}
