package X;

import java.util.ArrayList;

/* renamed from: X.3OH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OH extends C56082hw {
    public int A01;
    public C56112hz A04;
    public boolean A05;
    public float A00 = -1.0f;
    public int A02 = -1;
    public int A03 = -1;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r0.A14[0] != X.C05F.A01) goto L8;
     */
    @Override // X.C56082hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(X.C56142i3 r10, boolean r11) {
        /*
            r9 = this;
            X.2hw r3 = r9.A0h
            if (r3 == 0) goto L65
            X.2hy r0 = X.EnumC56102hy.LEFT
            X.2hz r7 = r3.A0A(r0)
            X.2hy r0 = X.EnumC56102hy.RIGHT
            X.2hz r6 = r3.A0A(r0)
            X.2hw r0 = r9.A0h
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L1f
            java.lang.Integer[] r0 = r0.A14
            r1 = r0[r5]
            java.lang.Integer r0 = X.C05F.A01
            r8 = 1
            if (r1 == r0) goto L20
        L1f:
            r8 = 0
        L20:
            int r0 = r9.A01
            if (r0 != 0) goto L3d
            X.2hy r0 = X.EnumC56102hy.TOP
            X.2hz r7 = r3.A0A(r0)
            X.2hy r0 = X.EnumC56102hy.BOTTOM
            X.2hz r6 = r3.A0A(r0)
            X.2hw r0 = r9.A0h
            if (r0 == 0) goto Ld9
            java.lang.Integer[] r0 = r0.A14
            r1 = r0[r2]
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto Ld9
        L3c:
            r8 = r2
        L3d:
            boolean r0 = r9.A05
            r1 = -1
            r4 = 5
            if (r0 == 0) goto L78
            X.2hz r2 = r9.A04
            boolean r0 = r2.A06
            if (r0 == 0) goto L78
            X.2i4 r2 = r10.A09(r2)
            X.2hz r0 = r9.A04
            int r0 = r0.A00()
            r10.A0D(r2, r0)
            int r0 = r9.A02
            if (r0 == r1) goto L66
            if (r8 == 0) goto L63
            X.2i4 r1 = r10.A09(r6)
        L60:
            r10.A0F(r1, r2, r5, r4)
        L63:
            r9.A05 = r5
        L65:
            return
        L66:
            int r0 = r9.A03
            if (r0 == r1) goto L63
            if (r8 == 0) goto L63
            X.2i4 r1 = r10.A09(r6)
            X.2i4 r0 = r10.A09(r7)
            r10.A0F(r2, r0, r5, r4)
            goto L60
        L78:
            int r0 = r9.A02
            r3 = 8
            if (r0 == r1) goto L97
            X.2hz r0 = r9.A04
            X.2i4 r2 = r10.A09(r0)
            X.2i4 r1 = r10.A09(r7)
            int r0 = r9.A02
            r10.A0E(r2, r1, r0, r3)
            if (r8 == 0) goto L65
            X.2i4 r1 = r10.A09(r6)
        L93:
            r10.A0F(r1, r2, r5, r4)
            return
        L97:
            int r0 = r9.A03
            if (r0 == r1) goto Lb5
            X.2hz r0 = r9.A04
            X.2i4 r2 = r10.A09(r0)
            X.2i4 r1 = r10.A09(r6)
            int r0 = r9.A03
            int r0 = -r0
            r10.A0E(r2, r1, r0, r3)
            if (r8 == 0) goto L65
            X.2i4 r0 = r10.A09(r7)
            r10.A0F(r2, r0, r5, r4)
            goto L93
        Lb5:
            float r0 = r9.A00
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L65
            X.2hz r0 = r9.A04
            X.2i4 r4 = r10.A09(r0)
            X.2i4 r3 = r10.A09(r6)
            float r2 = r9.A00
            X.2i5 r1 = r10.A06()
            X.2iC r0 = r1.A01
            r0.E6w(r4, r5)
            r0.E6w(r3, r2)
            r10.A0C(r1)
            return
        Ld9:
            r2 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3OH.A0O(X.2i3, boolean):void");
    }

    @Override // X.C56082hw
    public final void A0P(C56142i3 c56142i3, boolean z) {
        C56082hw c56082hw = this.A0h;
        if (c56082hw != null) {
            int A00 = C56142i3.A00(this.A04);
            if (this.A01 == 1) {
                this.A0V = A00;
                this.A0W = 0;
                A0H(c56082hw.A06());
                A0I(0);
                return;
            }
            this.A0V = 0;
            this.A0W = A00;
            A0I(c56082hw.A07());
            A0H(0);
        }
    }

    @Override // X.C56082hw
    public final boolean A0W() {
        return this.A05;
    }

    @Override // X.C56082hw
    public final boolean A0X() {
        return this.A05;
    }

    public final void A0c(int i) {
        C56112hz c56112hz;
        if (this.A01 != i) {
            this.A01 = i;
            ArrayList arrayList = this.A0p;
            arrayList.clear();
            if (i == 1) {
                c56112hz = this.A0e;
            } else {
                c56112hz = this.A0g;
            }
            this.A04 = c56112hz;
            arrayList.add(c56112hz);
            C56112hz[] c56112hzArr = this.A11;
            int length = c56112hzArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                c56112hzArr[i2] = c56112hz;
            }
        }
    }

    public C3OH() {
        C56112hz c56112hz = this.A0g;
        this.A04 = c56112hz;
        this.A01 = 0;
        ArrayList arrayList = this.A0p;
        arrayList.clear();
        arrayList.add(c56112hz);
        C56112hz[] c56112hzArr = this.A11;
        int length = c56112hzArr.length;
        for (int i = 0; i < length; i++) {
            c56112hzArr[i] = c56112hz;
        }
    }

    @Override // X.C56082hw
    public final C56112hz A0A(EnumC56102hy enumC56102hy) {
        int ordinal = enumC56102hy.ordinal();
        if (ordinal != 1 && ordinal != 3) {
            if ((ordinal != 2 && ordinal != 4) || this.A01 != 0) {
                return null;
            }
        } else if (this.A01 != 1) {
            return null;
        }
        return this.A04;
    }
}
