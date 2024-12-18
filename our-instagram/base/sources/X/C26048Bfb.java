package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Bfb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26048Bfb extends C0T6 {
    public final int A00;
    public final ImageUrl A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final String A0E;

    public C26048Bfb(ImageUrl imageUrl, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        AbstractC25229BEm.A1J(list, 5, list2);
        AbstractC25229BEm.A1O(str6, 14, str7);
        this.A01 = imageUrl;
        this.A05 = str;
        this.A04 = str2;
        this.A07 = str3;
        this.A09 = list;
        this.A06 = str4;
        this.A0D = z;
        this.A0C = z2;
        this.A0B = z3;
        this.A0A = list2;
        this.A0E = str5;
        this.A02 = num;
        this.A00 = i;
        this.A08 = str6;
        this.A03 = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26048Bfb) {
                C26048Bfb c26048Bfb = (C26048Bfb) obj;
                if (!C14360o3.A0K(this.A01, c26048Bfb.A01) || !C14360o3.A0K(this.A05, c26048Bfb.A05) || !C14360o3.A0K(this.A04, c26048Bfb.A04) || !C14360o3.A0K(this.A07, c26048Bfb.A07) || !C14360o3.A0K(this.A09, c26048Bfb.A09) || !C14360o3.A0K(this.A06, c26048Bfb.A06) || this.A0D != c26048Bfb.A0D || this.A0C != c26048Bfb.A0C || this.A0B != c26048Bfb.A0B || !C14360o3.A0K(this.A0A, c26048Bfb.A0A) || !C14360o3.A0K(this.A0E, c26048Bfb.A0E) || !C14360o3.A0K(this.A02, c26048Bfb.A02) || this.A00 != c26048Bfb.A00 || !C14360o3.A0K(this.A08, c26048Bfb.A08) || !C14360o3.A0K(this.A03, c26048Bfb.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0K(this.A08, (((AbstractC166997dE.A0K(this.A0E, AbstractC166997dE.A0J(this.A0A, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0D, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A09, (((AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31))))))) + AbstractC166997dE.A0I(this.A02)) * 31) + this.A00) * 31));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26048Bfb() {
        /*
            r16 = this;
            r2 = 0
            java.lang.String r3 = ""
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.AbstractC25225BEi.A0t(r3)
            X.0sl r10 = X.C16930sl.A00
            r12 = 0
            r0 = r16
            r4 = r2
            r5 = r2
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r11 = r10
            r13 = r12
            r14 = r12
            r15 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26048Bfb.<init>():void");
    }
}
