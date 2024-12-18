package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class BSY extends AbstractC51572Yf {
    public final Boolean A00;
    public final InterfaceC16820sZ A01;
    public final boolean A02;
    public final Drawable A03;
    public final EnumC77683ds A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0094, code lost:
    
        if (r4 == false) goto L14;
     */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r22) {
        /*
            r21 = this;
            r10 = 0
            r11 = r22
            X.C14360o3.A0B(r11, r10)
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            X.2XE r6 = r11.A05
            android.content.Context r0 = r6.A0C
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165490(0x7f070132, float:1.7945199E38)
            r2 = 1
            r1.getValue(r0, r3, r2)
            X.3ay r13 = X.C51722Yv.A02
            java.lang.Integer r5 = X.C05F.A01
            X.9CT r0 = X.AbstractC25228BEl.A0m(r5, r10)
            r9 = 0
            X.2Yv r1 = X.AbstractC25225BEi.A0h(r9, r0)
            r0 = 1112014848(0x42480000, float:50.0)
            java.lang.Integer r8 = X.C05F.A00
            X.2Yv r1 = X.AbstractC25230BEn.A0d(r1, r8, r0, r10)
            X.3ds r0 = X.EnumC77683ds.FLEX_START
            X.2Yv r1 = X.AbstractC25232BEp.A15(r1, r8, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r0 = 4
            X.2Yv r1 = X.C9CV.A00(r1, r5, r4, r0)
            r0 = 32
            r2 = r21
            X.DRP r0 = X.DRP.A00(r2, r0)
            X.2Yv r19 = X.AbstractC25231BEo.A0Y(r1, r0)
            boolean r1 = r2.A06
            if (r1 == 0) goto Lff
            X.3e8 r7 = X.C3e8.FLEX_END
        L50:
            X.3ds r0 = r2.A04
            r20 = r0
            X.2Z0 r6 = X.AbstractC167007dF.A0P(r6)
            if (r1 == 0) goto L67
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            long r0 = X.AbstractC77623dm.A0D(r6, r0)
            java.lang.Integer r12 = X.C05F.A0A
            X.2Yv r13 = X.C9CU.A00(r9, r12, r10, r0)
        L67:
            X.2Z0 r12 = X.AbstractC25232BEp.A13(r6)
            android.graphics.drawable.Drawable r14 = r2.A03
            if (r14 == 0) goto La3
            long r0 = X.AbstractC77623dm.A0B(r12)
            java.lang.Integer r15 = X.C05F.A0D
            X.2Yv r0 = X.C9CU.A00(r9, r15, r10, r0)
            X.2Yv r15 = X.AbstractC25234BEr.A0J(r0, r12, r8, r5)
            android.graphics.drawable.Drawable r14 = r14.mutate()
            X.2XE r5 = r12.ArD()
            android.content.Context r1 = r5.A0C
            java.lang.Boolean r0 = r2.A00
            boolean r0 = X.C14360o3.A0K(r0, r4)
            if (r0 == 0) goto L96
            boolean r4 = r2.A02
            r0 = 2130970140(0x7f04061c, float:1.7548982E38)
            if (r4 != 0) goto L99
        L96:
            r0 = 2130970282(0x7f0406aa, float:1.754927E38)
        L99:
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            X.AbstractC25231BEo.A0x(r1, r14, r0)
            X.AbstractC25234BEr.A0r(r14, r5, r12, r15)
        La3:
            X.2XE r15 = r12.A00
            android.content.Context r1 = r15.A0C
            r0 = 2130970319(0x7f0406cf, float:1.7549345E38)
            int r18 = X.AbstractC25228BEl.A06(r1, r12, r0)
            float r0 = r3.getFloat()
            int r0 = (int) r0
            long r4 = X.AbstractC25229BEm.A0K(r0)
            java.lang.String r0 = "sans-serif-medium"
            android.graphics.Typeface r17 = android.graphics.Typeface.create(r0, r10)
            java.lang.String r0 = r2.A05
            r14 = r0
            long r2 = X.AbstractC77623dm.A09(r12)
            int r16 = X.AbstractC25228BEl.A04(r1, r12)
            long r0 = X.AbstractC25229BEm.A0D()
            X.3dw r15 = X.AbstractC25231BEo.A0a(r15, r9, r14, r10)
            r14 = r16
            X.AbstractC25233BEq.A1B(r12, r15, r14, r2)
            r3 = r17
            r2 = r18
            X.2XH r2 = X.AbstractC25233BEq.A0i(r3, r12, r15, r10, r2)
            int r2 = X.C2Z3.A00(r2, r4)
            X.AbstractC25234BEr.A14(r12, r15, r2, r0)
            X.AbstractC25234BEr.A1G(r15, r8, r10)
            r15.A0E()
            X.AbstractC25229BEm.A1E(r15)
            r15.A06(r9)
            X.AbstractC25227BEk.A1J(r12, r15)
            X.AbstractC25226BEj.A1R(r12, r6, r13)
            r1 = r19
            r0 = r20
            X.2WF r0 = X.AbstractC76963ci.A07(r6, r11, r1, r0, r7)
            return r0
        Lff:
            X.3e8 r7 = X.C3e8.CENTER
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BSY.A0Y(X.3bS):X.2Vc");
    }

    public BSY(Drawable drawable, EnumC77683ds enumC77683ds, Boolean bool, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        this.A05 = str;
        this.A03 = drawable;
        this.A04 = enumC77683ds;
        this.A02 = z;
        this.A00 = bool;
        this.A06 = z2;
        this.A01 = interfaceC16820sZ;
    }
}
