package X;

import com.instagram.user.model.ProductDetailsProductItemDict;

/* renamed from: X.GzN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38682GzN extends C0T6 {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public final int A08;

    public C38682GzN(EnumC53230NgS enumC53230NgS, ProductDetailsProductItemDict productDetailsProductItemDict, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A08 = 0;
        AbstractC167017dG.A1P(str, str2);
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A00 = productDetailsProductItemDict;
        this.A02 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A01 = enumC53230NgS;
    }

    public final boolean equals(Object obj) {
        if (this.A08 != 0) {
            if (this != obj) {
                if (obj instanceof C38682GzN) {
                    C38682GzN c38682GzN = (C38682GzN) obj;
                    if (c38682GzN.A08 != 1 || !C14360o3.A0K(this.A02, c38682GzN.A02) || !C14360o3.A0K(this.A03, c38682GzN.A03) || !C14360o3.A0K(this.A04, c38682GzN.A04) || !C14360o3.A0K(this.A07, c38682GzN.A07) || !C14360o3.A0K(this.A06, c38682GzN.A06) || !C14360o3.A0K(this.A01, c38682GzN.A01) || !C14360o3.A0K(this.A00, c38682GzN.A00) || !C14360o3.A0K(this.A05, c38682GzN.A05)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C38682GzN)) {
                return false;
            }
            C38682GzN c38682GzN2 = (C38682GzN) obj;
            if (c38682GzN2.A08 != 0 || !C14360o3.A0K(this.A04, c38682GzN2.A04) || !C14360o3.A0K(this.A03, c38682GzN2.A03) || !C14360o3.A0K(this.A05, c38682GzN2.A05) || !C14360o3.A0K(this.A00, c38682GzN2.A00) || !C14360o3.A0K(this.A02, c38682GzN2.A02) || !C14360o3.A0K(this.A07, c38682GzN2.A07) || !C14360o3.A0K(this.A06, c38682GzN2.A06) || this.A01 != c38682GzN2.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0K;
        int A0I;
        if (this.A08 != 0) {
            A0K = (((((((((AbstractC166997dE.A0K(this.A03, AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
            A0I = AbstractC25227BEk.A07(this.A05);
        } else {
            A0K = (((((((((AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A04)) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31;
            A0I = AbstractC166997dE.A0I(this.A01);
        }
        return A0K + A0I;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38682GzN(X.EnumC53230NgS r3, com.instagram.user.model.ProductDetailsProductItemDict r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r2 = this;
            r0 = 0
            r2.A08 = r0
            r0 = r11 & 4
            r1 = 0
            if (r0 == 0) goto L9
            r7 = r1
        L9:
            r0 = r11 & 8
            if (r0 == 0) goto Le
            r4 = r1
        Le:
            r0 = r11 & 16
            if (r0 == 0) goto L13
            r8 = r1
        L13:
            r0 = r11 & 32
            if (r0 == 0) goto L18
            r9 = r1
        L18:
            r0 = r11 & 64
            if (r0 == 0) goto L1d
            r10 = r1
        L1d:
            r0 = r11 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L22
            r3 = r1
        L22:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38682GzN.<init>(X.NgS, com.instagram.user.model.ProductDetailsProductItemDict, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public C38682GzN() {
        this.A08 = 1;
        this.A08 = 1;
        String str = C5GU.A0B.A00;
        this.A08 = 1;
        C14360o3.A0B(str, 2);
        this.A02 = null;
        this.A03 = str;
        this.A04 = null;
        this.A07 = null;
        this.A06 = null;
        this.A01 = null;
        this.A00 = null;
        this.A05 = null;
    }
}
