package X;

import java.util.List;

/* renamed from: X.MaR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50726MaR extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C50726MaR(InterfaceC50393MMv interfaceC50393MMv, C5Hc c5Hc, boolean z, boolean z2, boolean z3) {
        this.A00 = 1;
        C14360o3.A0B(c5Hc, 5);
        this.A04 = z;
        this.A05 = z2;
        this.A03 = z3;
        this.A01 = interfaceC50393MMv;
        this.A02 = c5Hc;
    }

    public static boolean A01(C50726MaR c50726MaR, Integer num, Object obj, C05A c05a) {
        return c05a.AIi(obj, A00((Integer) c50726MaR.A02, num, c50726MaR.A03, c50726MaR.A04, c50726MaR.A05));
    }

    public final boolean equals(Object obj) {
        C50726MaR c50726MaR;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C50726MaR)) {
                        return false;
                    }
                    c50726MaR = (C50726MaR) obj;
                    if (c50726MaR.A00 != 0 || !C14360o3.A0K(this.A01, c50726MaR.A01) || this.A03 != c50726MaR.A03 || this.A04 != c50726MaR.A04 || !C14360o3.A0K(this.A02, c50726MaR.A02)) {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C50726MaR)) {
                        return false;
                    }
                    C50726MaR c50726MaR2 = (C50726MaR) obj;
                    if (c50726MaR2.A00 != 1 || this.A04 != c50726MaR2.A04 || this.A05 != c50726MaR2.A05 || this.A03 != c50726MaR2.A03 || !C14360o3.A0K(this.A01, c50726MaR2.A01) || !C14360o3.A0K(this.A02, c50726MaR2.A02)) {
                        return false;
                    }
                    return true;
                }
                return true;
            default:
                if (this != obj) {
                    if (obj instanceof C50726MaR) {
                        c50726MaR = (C50726MaR) obj;
                        if (c50726MaR.A00 != 2 || this.A02 != c50726MaR.A02 || this.A01 != c50726MaR.A01 || this.A03 != c50726MaR.A03 || this.A04 != c50726MaR.A04) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (this.A05 != c50726MaR.A05) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L54;
                case 1: goto L35;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = X.AbstractC53933Nt6.A00(r0)
            int r1 = r0 * 31
            java.lang.Object r0 = r3.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = X.AbstractC53933Nt6.A00(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A03
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r1 = r3.A04
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L28
            r0 = 1231(0x4cf, float:1.725E-42)
        L28:
            int r2 = r2 + r0
            int r2 = r2 * 31
            boolean r1 = r3.A05
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L33
            r0 = 1231(0x4cf, float:1.725E-42)
        L33:
            int r2 = r2 + r0
            return r2
        L35:
            boolean r0 = r3.A04
            int r1 = X.AbstractC25225BEi.A08(r0)
            boolean r0 = r3.A05
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r0 = r3.A03
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A01
            int r2 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A02
            int r0 = r0.hashCode()
            goto L33
        L54:
            java.lang.Object r0 = r3.A01
            int r1 = X.AbstractC166987dD.A0G(r0)
            boolean r0 = r3.A03
            int r1 = X.AbstractC167007dF.A0D(r0, r1)
            boolean r0 = r3.A04
            int r2 = X.AbstractC167007dF.A0D(r0, r1)
            java.lang.Object r0 = r3.A02
            int r0 = r0.hashCode()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50726MaR.hashCode():int");
    }

    public static final C50726MaR A00(Integer num, Integer num2, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1N(num, num2);
        return new C50726MaR(num, num2, z, z2, z3);
    }

    public C50726MaR(C26003Ber c26003Ber, List list) {
        this.A00 = 0;
        this.A00 = 0;
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A03 = false;
        this.A04 = false;
        this.A02 = c26003Ber;
        this.A05 = false;
    }

    public C50726MaR(Integer num, Integer num2, boolean z, boolean z2, boolean z3) {
        this.A00 = 2;
        this.A02 = num;
        this.A01 = num2;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50726MaR() {
        /*
            r7 = this;
            r0 = 2
            r1 = r7
            r7.A00 = r0
            java.lang.Integer r2 = X.C05F.A00
            r4 = 0
            r3 = r2
            r5 = r4
            r6 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50726MaR.<init>():void");
    }
}
