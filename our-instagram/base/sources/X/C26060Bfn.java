package X;

import java.util.List;

/* renamed from: X.Bfn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26060Bfn extends C0T6 {
    public final long A00;
    public final BJ3 A01;
    public final EnumC77173d3 A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public static final C26060Bfn A00(BJ3 bj3, EnumC77173d3 enumC77173d3, Integer num, String str, String str2, String str3, List list, long j, boolean z, boolean z2) {
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A13(str2, str3, num);
        AbstractC167017dG.A1T(enumC77173d3, bj3);
        C14360o3.A0B(list, 9);
        return new C26060Bfn(bj3, enumC77173d3, num, str, str2, str3, list, j, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26060Bfn) {
                C26060Bfn c26060Bfn = (C26060Bfn) obj;
                if (!C14360o3.A0K(this.A05, c26060Bfn.A05) || !C14360o3.A0K(this.A06, c26060Bfn.A06) || !C14360o3.A0K(this.A04, c26060Bfn.A04) || this.A03 != c26060Bfn.A03 || this.A00 != c26060Bfn.A00 || this.A02 != c26060Bfn.A02 || this.A01 != c26060Bfn.A01 || this.A08 != c26060Bfn.A08 || this.A09 != c26060Bfn.A09 || !C14360o3.A0K(this.A07, c26060Bfn.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A05)));
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "OTHER";
        } else {
            str = "SELF";
        }
        return AbstractC166987dD.A0I(this.A07, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC25236BEt.A01(this.A00, AbstractC25231BEo.A0H(str, intValue, A0K)))))));
    }

    public C26060Bfn(BJ3 bj3, EnumC77173d3 enumC77173d3, Integer num, String str, String str2, String str3, List list, long j, boolean z, boolean z2) {
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = num;
        this.A00 = j;
        this.A02 = enumC77173d3;
        this.A01 = bj3;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26060Bfn() {
        /*
            r12 = this;
            java.lang.String r4 = ""
            java.lang.Integer r3 = X.C05F.A00
            r8 = 0
            X.3d3 r2 = X.EnumC77173d3.A03
            X.BJ3 r1 = X.BJ3.A03
            r10 = 1
            X.0sl r7 = X.C16930sl.A00
            r0 = r12
            r5 = r4
            r6 = r4
            r11 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26060Bfn.<init>():void");
    }
}
