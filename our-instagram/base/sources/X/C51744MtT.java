package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;
import com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;

/* renamed from: X.MtT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51744MtT extends C0T6 {
    public final AbstractC53632Nnd A00;
    public final AbstractC53632Nnd A01;
    public final Object A02;
    public final boolean A03;
    public final GridSelfViewLocation A04;
    public final AbstractC53632Nnd A05;
    public final AbstractC53632Nnd A06;
    public final AbstractC53632Nnd A07;
    public final AbstractC53632Nnd A08;
    public final AbstractC53632Nnd A09;
    public final AbstractC53632Nnd A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51744MtT() {
        /*
            r16 = this;
            r1 = 0
            r12 = 0
            r11 = 32767(0x7fff, float:4.5916E-41)
            r0 = r16
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r13 = r12
            r14 = r12
            r15 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51744MtT.<init>():void");
    }

    public static /* synthetic */ C51744MtT A01(C51744MtT c51744MtT, Object obj) {
        return A00(c51744MtT, null, null, null, null, null, obj, 16383, false, false);
    }

    public final GridLayoutConfigForLayoutInput A02(Context context) {
        C14360o3.A0B(context, 0);
        return new GridLayoutConfigForLayoutInput(this.A08.A01(), this.A09.A01(), this.A0A.A01(), this.A06.A01(), this.A00.A01(), this.A01.A01(), this.A05.A01(), this.A07.A01(), this.A03, this.A0E, this.A0D, this.A0B, this.A0C, this.A04, this.A02);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51744MtT) {
                C51744MtT c51744MtT = (C51744MtT) obj;
                if (!C14360o3.A0K(this.A08, c51744MtT.A08) || !C14360o3.A0K(this.A09, c51744MtT.A09) || !C14360o3.A0K(this.A0A, c51744MtT.A0A) || !C14360o3.A0K(this.A06, c51744MtT.A06) || !C14360o3.A0K(this.A00, c51744MtT.A00) || !C14360o3.A0K(this.A01, c51744MtT.A01) || !C14360o3.A0K(this.A05, c51744MtT.A05) || !C14360o3.A0K(this.A07, c51744MtT.A07) || this.A03 != c51744MtT.A03 || this.A0E != c51744MtT.A0E || this.A0D != c51744MtT.A0D || this.A0B != c51744MtT.A0B || this.A0C != c51744MtT.A0C || this.A04 != c51744MtT.A04 || !C14360o3.A0K(this.A02, c51744MtT.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C51744MtT(com.facebook.rtc.views.omnigrid.GridSelfViewLocation r19, X.AbstractC53632Nnd r20, X.AbstractC53632Nnd r21, X.AbstractC53632Nnd r22, X.AbstractC53632Nnd r23, X.AbstractC53632Nnd r24, X.AbstractC53632Nnd r25, X.AbstractC53632Nnd r26, X.AbstractC53632Nnd r27, java.lang.Object r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r18 = this;
            r0 = r29
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r3 = r19
            r12 = r28
            r1 = r29 & 1
            r17 = 0
            if (r1 == 0) goto L20
            X.N0I r4 = X.N0I.A00(r17)
        L20:
            r1 = r29 & 2
            if (r1 == 0) goto L28
            X.N0I r5 = X.N0I.A00(r17)
        L28:
            r1 = r29 & 4
            if (r1 == 0) goto L30
            X.N0I r6 = X.N0I.A00(r17)
        L30:
            r1 = r29 & 8
            if (r1 == 0) goto L38
            X.N0I r7 = X.N0I.A00(r17)
        L38:
            r1 = r29 & 16
            if (r1 == 0) goto L40
            X.N0I r8 = X.N0I.A00(r17)
        L40:
            r1 = r29 & 32
            if (r1 == 0) goto L48
            X.N0I r9 = X.N0I.A00(r17)
        L48:
            r1 = r29 & 64
            if (r1 == 0) goto L50
            X.N0I r10 = X.N0I.A00(r17)
        L50:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L58
            X.N0I r11 = X.N0I.A00(r17)
        L58:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = r30
            boolean r13 = X.AbstractC25226BEj.A1U(r1, r2)
            r1 = r0 & 512(0x200, float:7.17E-43)
            r2 = r31
            boolean r14 = X.AbstractC25226BEj.A1U(r1, r2)
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = r32
            boolean r15 = X.AbstractC25226BEj.A1U(r1, r2)
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = r33
            boolean r16 = X.AbstractC25226BEj.A1U(r1, r2)
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L7e
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r3 = com.facebook.rtc.views.omnigrid.GridSelfViewLocation.TOP_RIGHT
        L7e:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L83
            r12 = 0
        L83:
            r2 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51744MtT.<init>(com.facebook.rtc.views.omnigrid.GridSelfViewLocation, X.Nnd, X.Nnd, X.Nnd, X.Nnd, X.Nnd, X.Nnd, X.Nnd, X.Nnd, java.lang.Object, int, boolean, boolean, boolean, boolean):void");
    }

    public static /* synthetic */ C51744MtT A00(C51744MtT c51744MtT, GridSelfViewLocation gridSelfViewLocation, AbstractC53632Nnd abstractC53632Nnd, AbstractC53632Nnd abstractC53632Nnd2, AbstractC53632Nnd abstractC53632Nnd3, AbstractC53632Nnd abstractC53632Nnd4, Object obj, int i, boolean z, boolean z2) {
        AbstractC53632Nnd abstractC53632Nnd5;
        AbstractC53632Nnd abstractC53632Nnd6;
        AbstractC53632Nnd abstractC53632Nnd7;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj2 = obj;
        GridSelfViewLocation gridSelfViewLocation2 = gridSelfViewLocation;
        boolean z6 = z2;
        boolean z7 = z;
        AbstractC53632Nnd abstractC53632Nnd8 = abstractC53632Nnd4;
        AbstractC53632Nnd abstractC53632Nnd9 = abstractC53632Nnd3;
        AbstractC53632Nnd abstractC53632Nnd10 = abstractC53632Nnd2;
        AbstractC53632Nnd abstractC53632Nnd11 = abstractC53632Nnd;
        AbstractC53632Nnd abstractC53632Nnd12 = null;
        if ((i & 1) != 0) {
            abstractC53632Nnd5 = c51744MtT.A08;
        } else {
            abstractC53632Nnd5 = null;
        }
        if ((i & 2) != 0) {
            abstractC53632Nnd6 = c51744MtT.A09;
        } else {
            abstractC53632Nnd6 = null;
        }
        if ((i & 4) != 0) {
            abstractC53632Nnd11 = c51744MtT.A0A;
        }
        if ((i & 8) != 0) {
            abstractC53632Nnd10 = c51744MtT.A06;
        }
        if ((i & 16) != 0) {
            abstractC53632Nnd9 = c51744MtT.A00;
        }
        if ((i & 32) != 0) {
            abstractC53632Nnd8 = c51744MtT.A01;
        }
        if ((i & 64) != 0) {
            abstractC53632Nnd7 = c51744MtT.A05;
        } else {
            abstractC53632Nnd7 = null;
        }
        if ((i & 128) != 0) {
            abstractC53632Nnd12 = c51744MtT.A07;
        }
        if ((i & 256) != 0) {
            z7 = c51744MtT.A03;
        }
        if ((i & 512) != 0) {
            z3 = c51744MtT.A0E;
        } else {
            z3 = false;
        }
        if ((i & 1024) != 0) {
            z4 = c51744MtT.A0D;
        } else {
            z4 = false;
        }
        if ((i & C3OO.FLAG_MOVED) != 0) {
            z6 = c51744MtT.A0B;
        }
        if ((i & 4096) != 0) {
            z5 = c51744MtT.A0C;
        } else {
            z5 = false;
        }
        if ((i & 8192) != 0) {
            gridSelfViewLocation2 = c51744MtT.A04;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            obj2 = c51744MtT.A02;
        }
        C14360o3.A0B(abstractC53632Nnd5, 0);
        JQ0.A1O(abstractC53632Nnd6, abstractC53632Nnd11, abstractC53632Nnd10, abstractC53632Nnd9, abstractC53632Nnd8);
        AbstractC167017dG.A1U(abstractC53632Nnd7, abstractC53632Nnd12);
        C14360o3.A0B(gridSelfViewLocation2, 13);
        return new C51744MtT(gridSelfViewLocation2, abstractC53632Nnd5, abstractC53632Nnd6, abstractC53632Nnd11, abstractC53632Nnd10, abstractC53632Nnd9, abstractC53632Nnd8, abstractC53632Nnd7, abstractC53632Nnd12, obj2, z7, z3, z4, z6, z5);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A09, AbstractC166987dD.A0G(this.A08)))))))))))))) + AbstractC167017dG.A0M(this.A02);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridLayoutConfig(leftPadding=");
        A1C.append(this.A08);
        A1C.append(", rightPadding=");
        A1C.append(this.A09);
        A1C.append(", topPadding=");
        A1C.append(this.A0A);
        A1C.append(", bottomPadding=");
        A1C.append(this.A06);
        A1C.append(", horizontalSpacing=");
        A1C.append(this.A00);
        A1C.append(", verticalSpacing=");
        A1C.append(this.A01);
        A1C.append(", bottomInset=");
        A1C.append(this.A05);
        A1C.append(", itemHeightOffset=");
        A1C.append(this.A07);
        A1C.append(", disablesFloatingSelfView=");
        A1C.append(this.A03);
        A1C.append(", skipsDefaultGridLayout=");
        A1C.append(this.A0E);
        A1C.append(", forcesHorizontalLayoutForTwoPersonLayout=");
        A1C.append(this.A0D);
        A1C.append(", appliesPaddingToFullscreenLayout=");
        A1C.append(this.A0B);
        A1C.append(", aspectFillFullscreenSingleItem=");
        A1C.append(this.A0C);
        A1C.append(", selfViewLocation=");
        A1C.append(this.A04);
        A1C.append(", layoutExtras=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }

    public C51744MtT(GridSelfViewLocation gridSelfViewLocation, AbstractC53632Nnd abstractC53632Nnd, AbstractC53632Nnd abstractC53632Nnd2, AbstractC53632Nnd abstractC53632Nnd3, AbstractC53632Nnd abstractC53632Nnd4, AbstractC53632Nnd abstractC53632Nnd5, AbstractC53632Nnd abstractC53632Nnd6, AbstractC53632Nnd abstractC53632Nnd7, AbstractC53632Nnd abstractC53632Nnd8, Object obj, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        JQ0.A1O(abstractC53632Nnd, abstractC53632Nnd2, abstractC53632Nnd3, abstractC53632Nnd4, abstractC53632Nnd5);
        AbstractC167017dG.A1U(abstractC53632Nnd6, abstractC53632Nnd7);
        AbstractC25229BEm.A1N(abstractC53632Nnd8, 8, gridSelfViewLocation);
        this.A08 = abstractC53632Nnd;
        this.A09 = abstractC53632Nnd2;
        this.A0A = abstractC53632Nnd3;
        this.A06 = abstractC53632Nnd4;
        this.A00 = abstractC53632Nnd5;
        this.A01 = abstractC53632Nnd6;
        this.A05 = abstractC53632Nnd7;
        this.A07 = abstractC53632Nnd8;
        this.A03 = z;
        this.A0E = z2;
        this.A0D = z3;
        this.A0B = z4;
        this.A0C = z5;
        this.A04 = gridSelfViewLocation;
        this.A02 = obj;
    }
}
