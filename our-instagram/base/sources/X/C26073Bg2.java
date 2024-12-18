package X;

import com.instagram.opal.impl.data.OpalProfileData;

/* renamed from: X.Bg2 */
/* loaded from: classes5.dex */
public final class C26073Bg2 extends C0T6 {
    public final int A00;
    public final C51745MtU A01;
    public final C51751Mta A02;
    public final C51751Mta A03;
    public final OpalProfileData A04;
    public final OpalProfileData A05;
    public final C74 A06;
    public final Integer A07;
    public final C5Hc A08;
    public final boolean A09;
    public final boolean A0A;

    public static /* synthetic */ C26073Bg2 A01(OpalProfileData opalProfileData, C26073Bg2 c26073Bg2) {
        return A00(null, opalProfileData, null, null, c26073Bg2, null, 0, 2046, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26073Bg2) {
                C26073Bg2 c26073Bg2 = (C26073Bg2) obj;
                if (!C14360o3.A0K(this.A05, c26073Bg2.A05) || !C14360o3.A0K(this.A04, c26073Bg2.A04) || !C14360o3.A0K(this.A03, c26073Bg2.A03) || !C14360o3.A0K(this.A02, c26073Bg2.A02) || !C14360o3.A0K(this.A01, c26073Bg2.A01) || !C14360o3.A0K(this.A08, c26073Bg2.A08) || this.A00 != c26073Bg2.A00 || this.A0A != c26073Bg2.A0A || this.A07 != c26073Bg2.A07 || this.A09 != c26073Bg2.A09 || this.A06 != c26073Bg2.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C26073Bg2 A00(C51745MtU c51745MtU, OpalProfileData opalProfileData, OpalProfileData opalProfileData2, C74 c74, C26073Bg2 c26073Bg2, Integer num, int i, int i2, boolean z, boolean z2) {
        C51751Mta c51751Mta;
        C51751Mta c51751Mta2;
        C74 c742 = c74;
        boolean z3 = z2;
        Integer num2 = num;
        boolean z4 = z;
        int i3 = i;
        C51745MtU c51745MtU2 = c51745MtU;
        OpalProfileData opalProfileData3 = opalProfileData2;
        OpalProfileData opalProfileData4 = opalProfileData;
        C5Hc c5Hc = null;
        if ((i2 & 1) != 0) {
            opalProfileData4 = c26073Bg2.A05;
        }
        if ((i2 & 2) != 0) {
            opalProfileData3 = c26073Bg2.A04;
        }
        if ((i2 & 4) != 0) {
            c51751Mta = c26073Bg2.A03;
        } else {
            c51751Mta = null;
        }
        if ((i2 & 8) != 0) {
            c51751Mta2 = c26073Bg2.A02;
        } else {
            c51751Mta2 = null;
        }
        if ((i2 & 16) != 0) {
            c51745MtU2 = c26073Bg2.A01;
        }
        if ((i2 & 32) != 0) {
            c5Hc = c26073Bg2.A08;
        }
        if ((i2 & 64) != 0) {
            i3 = c26073Bg2.A00;
        }
        if ((i2 & 128) != 0) {
            z4 = c26073Bg2.A0A;
        }
        if ((i2 & 256) != 0) {
            num2 = c26073Bg2.A07;
        }
        if ((i2 & 512) != 0) {
            z3 = c26073Bg2.A09;
        }
        if ((i2 & 1024) != 0) {
            c742 = c26073Bg2.A06;
        }
        C14360o3.A0B(opalProfileData4, 0);
        AbstractC167027dH.A13(opalProfileData3, c51751Mta, c51751Mta2);
        AbstractC167007dF.A1I(c5Hc, 5, num2);
        C14360o3.A0B(c742, 10);
        return new C26073Bg2(c51745MtU2, c51751Mta, c51751Mta2, opalProfileData4, opalProfileData3, c742, num2, c5Hc, i3, z4, z3);
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A0A, (AbstractC166997dE.A0J(this.A08, (AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A05)))) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31);
        int intValue = this.A07.intValue();
        switch (intValue) {
            case 1:
                str = "Delight";
                break;
            case 2:
                str = "None";
                break;
            default:
                str = "Tease";
                break;
        }
        return AbstractC166987dD.A0I(this.A06, AbstractC167007dF.A0D(this.A09, AbstractC25231BEo.A0H(str, intValue, A0D)));
    }

    public C26073Bg2(C51745MtU c51745MtU, C51751Mta c51751Mta, C51751Mta c51751Mta2, OpalProfileData opalProfileData, OpalProfileData opalProfileData2, C74 c74, Integer num, C5Hc c5Hc, int i, boolean z, boolean z2) {
        this.A05 = opalProfileData;
        this.A04 = opalProfileData2;
        this.A03 = c51751Mta;
        this.A02 = c51751Mta2;
        this.A01 = c51745MtU;
        this.A08 = c5Hc;
        this.A00 = i;
        this.A0A = z;
        this.A07 = num;
        this.A09 = z2;
        this.A06 = c74;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26073Bg2() {
        /*
            r24 = this;
            r6 = 0
            r9 = 0
            java.lang.String r2 = ""
            X.C74 r1 = X.C74.A07
            X.0sl r8 = X.C16930sl.A00
            com.instagram.opal.impl.data.OpalProfileData r0 = new com.instagram.opal.impl.data.OpalProfileData
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r2
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.instagram.opal.impl.data.OpalProfileData r10 = new com.instagram.opal.impl.data.OpalProfileData
            r11 = r1
            r12 = r2
            r13 = r2
            r14 = r2
            r15 = r2
            r16 = r6
            r17 = r2
            r18 = r8
            r19 = r9
            r20 = r9
            r21 = r9
            r22 = r9
            r23 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r7 = 15
            r8 = 4
            X.Mta r13 = new X.Mta
            r2 = r13
            r3 = r6
            r4 = r6
            r5 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.Mta r14 = new X.Mta
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.5HZ r19 = X.C5HZ.A01
            java.lang.Integer r18 = X.C05F.A0C
            r11 = r24
            r12 = r6
            r15 = r0
            r16 = r10
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26073Bg2.<init>():void");
    }
}
