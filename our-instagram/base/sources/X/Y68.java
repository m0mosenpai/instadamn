package X;

import android.graphics.RectF;
import android.opengl.Matrix;

/* loaded from: classes12.dex */
public final class Y68 {
    public int A00;
    public int A02;
    public YPm A04;
    public InterfaceC199678sJ A06;
    public C201278vB A07;
    public boolean A08;
    public boolean A09;
    public Y0E A0A;
    public final C178597wX A0B;
    public final YPI A0C;
    public final C72831XoN A0E;
    public final Y0E A0G;
    public final C72837XoW A0H;
    public final C72535Xfo A0I;
    public final C72672Xkp A0J;
    public final float[] A0F = new float[16];
    public int A01 = 0;
    public RectF A03 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public EnumC197748ol A05 = EnumC197748ol.DISABLE;
    public final C72850Xp6 A0D = new C72850Xp6();

    public static Y0E A00(Y68 y68, boolean z) {
        if (y68.A0E.A02.A00() == C05F.A00 && z) {
            Y0E y0e = y68.A0A;
            if (y0e == null) {
                Y0E y0e2 = new Y0E(new C73345Y9a(y68));
                y68.A0A = y0e2;
                return y0e2;
            }
            return y0e;
        }
        return y68.A0G;
    }

    public static void A01(Y68 y68) {
        int i;
        float[] fArr = y68.A0F;
        int i2 = y68.A01;
        if (i2 != 1) {
            if (i2 != 2) {
                i = 270;
                if (i2 != 3) {
                    i = 0;
                }
            } else {
                i = 180;
            }
        } else {
            i = 90;
        }
        Matrix.setIdentityM(fArr, 0);
        AbstractC197988p9.A02(fArr, (360 - i) % 360);
        AbstractC197988p9.A01(fArr);
        RectF rectF = y68.A03;
        Matrix.translateM(fArr, 0, rectF.left, rectF.top, 0.0f);
        Matrix.scaleM(fArr, 0, rectF.width(), rectF.height(), 1.0f);
        AbstractC197988p9.A01(fArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0007, code lost:
    
        if (r6 <= 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.Y68 r4, int r5, int r6) {
        /*
            X.Xp6 r3 = r4.A0D
            monitor-enter(r3)
            r2 = 0
            if (r5 <= 0) goto L9
            r1 = 1
            if (r6 > 0) goto La
        L9:
            r1 = 0
        La:
            java.lang.String r0 = "Non zero width and height required"
            X.C0J8.A08(r1, r0)     // Catch: java.lang.Throwable -> L30
            int r0 = r3.A02     // Catch: java.lang.Throwable -> L30
            if (r5 != r0) goto L18
            int r0 = r3.A00     // Catch: java.lang.Throwable -> L30
            if (r6 != r0) goto L18
            goto L2e
        L18:
            r3.A00()     // Catch: java.lang.Throwable -> L30
            r3.A02 = r5     // Catch: java.lang.Throwable -> L30
            r3.A00 = r6     // Catch: java.lang.Throwable -> L30
            r3.A01 = r2     // Catch: java.lang.Throwable -> L30
            monitor-exit(r3)
            X.Xkp r0 = r4.A0J
            X.Y7X r1 = r0.A00
            X.Y68 r0 = r1.A07
            if (r4 != r0) goto L2f
            X.Y7X.A07(r1, r5, r6)
            return
        L2e:
            monitor-exit(r3)
        L2f:
            return
        L30:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y68.A02(X.Y68, int, int):void");
    }

    public final void A03() {
        InterfaceC199678sJ interfaceC199678sJ = this.A06;
        if (interfaceC199678sJ != null) {
            interfaceC199678sJ.destroy();
            this.A06 = null;
        }
        this.A0D.A00();
        this.A08 = false;
    }

    public final void A04() {
        int i;
        if (this.A0B.A00.CUZ(80)) {
            C199758sR A00 = this.A0E.A00(this.A06.BoW(), this.A02, this.A00);
            int i2 = A00.A01;
            if (i2 != 0 && (i = A00.A00) != 0) {
                A02(this, i2, i);
            }
        }
    }

    public final void A05(C73348Y9d c73348Y9d, InterfaceC197808or interfaceC197808or) {
        if (!this.A08) {
            this.A06.CNf(interfaceC197808or);
            if (!this.A0B.A00.CUZ(80) && this.A06.BIB() > 0 && this.A06.BI0() > 0) {
                A02(this, this.A06.BIB(), this.A06.BI0());
            }
            Matrix.setIdentityM(this.A0F, 0);
            A01(this);
            YPm yPm = this.A04;
            if (yPm != null) {
                yPm.Emf(c73348Y9d);
            }
            this.A08 = true;
            AbstractC180237zD.A02("RenderManager::initInput", new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        if (r2.CLe() == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.Y68 r16) {
        /*
            r15 = this;
            X.8vB r0 = r15.A07
            if (r0 == 0) goto Lea
            X.8ol r1 = r15.A05
            X.8ol r0 = X.EnumC197748ol.DISABLE
            if (r1 == r0) goto Lea
            X.8ol r0 = X.EnumC197748ol.CAPTURE
            if (r1 != r0) goto L4d
            r0 = 16
            float[] r6 = new float[r0]
            r1 = r16
            X.8sJ r0 = r1.A06
            r0.CAY(r6)
            X.XoW r5 = r15.A0H
            X.8sJ r0 = r1.A06
            int r4 = r0.Bfz()
            X.8sJ r0 = r1.A06
            int r3 = r0.Bfo()
            java.util.List r0 = r5.A02
            java.util.Iterator r1 = r0.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            r2 = 1
            if (r0 == 0) goto L41
            java.lang.Object r0 = r1.next()
            X.YPy r0 = (X.InterfaceC73611YPy) r0
            r0.EVx(r2)
            r0.setSize(r4, r3)
            goto L2d
        L41:
            float[] r0 = r5.A05
            r1 = 0
            android.opengl.Matrix.invertM(r0, r1, r6, r1)
            float[] r0 = r5.A04
            android.opengl.Matrix.setIdentityM(r0, r1)
            goto L87
        L4d:
            X.8ol r0 = X.EnumC197748ol.ENABLE
            if (r1 != r0) goto L89
            X.XoW r5 = r15.A0H
            X.8sJ r0 = r15.A06
            int r4 = r0.BIB()
            X.8sJ r0 = r15.A06
            int r3 = r0.BI0()
            java.util.List r0 = r5.A02
            java.util.Iterator r2 = r0.iterator()
        L65:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r1 = r2.next()
            X.YPy r1 = (X.InterfaceC73611YPy) r1
            r0 = 0
            r1.EVx(r0)
            r1.setSize(r4, r3)
            goto L65
        L79:
            float[] r3 = r5.A04
            r2 = 0
            android.opengl.Matrix.setIdentityM(r3, r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.opengl.Matrix.scaleM(r3, r2, r1, r0, r1)
            r2 = 1
        L87:
            r5.A00 = r2
        L89:
            X.XoW r4 = r15.A0H
            X.8vB r0 = r15.A07
            X.810 r9 = r0.A00()
            float[] r10 = r0.A04
            X.8sJ r0 = r15.A06
            boolean r3 = r0.EGy()
            long r13 = r0.Bff()
            boolean r0 = r4.A00
            if (r0 == 0) goto Lea
            java.util.List r0 = r4.A02
            java.util.Iterator r7 = r0.iterator()
        La7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lea
            java.lang.Object r2 = r7.next()
            X.YPy r2 = (X.InterfaceC73611YPy) r2
            boolean r0 = r2.CLe()
            r5 = 0
            if (r0 == 0) goto La7
            X.8vB r8 = r4.A01
            float[] r11 = r4.A05
            float[] r12 = r4.A04
            r8.A02(r9, r10, r11, r12, r13)
            boolean r0 = r2.E6G(r8, r3)
            if (r0 == 0) goto Ld0
            boolean r0 = r2.CLe()
            r6 = 1
            if (r0 != 0) goto Ld1
        Ld0:
            r6 = 0
        Ld1:
            java.lang.String r1 = "FrameProcessorHelper::processFrames - "
            X.8u6 r0 = r2.B7w()
            java.lang.String r0 = r0.name()
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.AbstractC180237zD.A02(r1, r0)
            if (r6 == 0) goto La7
            r2.ENR()
            goto La7
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y68.A06(X.Y68):void");
    }

    public Y68(C178597wX c178597wX, C72837XoW c72837XoW, C72535Xfo c72535Xfo, C72672Xkp c72672Xkp, C72831XoN c72831XoN, InterfaceC199678sJ interfaceC199678sJ) {
        this.A0B = c178597wX;
        this.A06 = interfaceC199678sJ;
        this.A0H = c72837XoW;
        this.A0I = c72535Xfo;
        this.A0J = c72672Xkp;
        this.A0E = c72831XoN;
        this.A02 = interfaceC199678sJ.BIB();
        this.A00 = interfaceC199678sJ.BI0();
        this.A09 = c178597wX.A00.CUZ(80);
        Y9Z y9z = new Y9Z(this);
        this.A0C = y9z;
        this.A0G = new Y0E(y9z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r10 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] A07(X.EnumC197888oz r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            X.Y0E r6 = A00(r9, r14)
            X.Y0E.A00(r6)
            boolean r0 = r6.A01
            if (r0 == r14) goto L12
            android.util.SparseArray r0 = r6.A04
            r0.clear()
            r6.A01 = r14
        L12:
            if (r10 != 0) goto L83
            X.YPI r0 = r6.A00
            X.8oz r10 = r0.AwN()
            r0 = 1
            if (r10 != 0) goto L83
        L1d:
            int r0 = r0 * 31
            int r0 = r0 + r11
            int r0 = r0 * 31
            int r0 = r0 + r12
            int r5 = r0 * 31
            int r5 = r5 + r13
            android.util.SparseArray r4 = r6.A04
            java.lang.Object r3 = r4.get(r5)
            float[] r3 = (float[]) r3
            if (r3 != 0) goto L7e
            r8 = 16
            float[] r3 = new float[r8]
            r2 = 0
            android.opengl.Matrix.setIdentityM(r3, r2)
            r7 = r13 & 4
            r0 = 4
            r1 = 1
            if (r7 != r0) goto L44
            r0 = 1119092736(0x42b40000, float:90.0)
            X.AbstractC197988p9.A02(r3, r0)
            r2 = 1
        L44:
            r7 = r13 & 8
            r0 = 8
            if (r7 != r0) goto L4f
            r0 = 1127481344(0x43340000, float:180.0)
            X.AbstractC197988p9.A02(r3, r0)
        L4f:
            r0 = r13 & 16
            if (r0 != r8) goto L59
            r0 = 1132920832(0x43870000, float:270.0)
            X.AbstractC197988p9.A02(r3, r0)
            r2 = 1
        L59:
            r0 = r13 & 1
            if (r0 != r1) goto L60
            X.AbstractC197988p9.A01(r3)
        L60:
            r1 = 2
            r0 = r13 & 2
            if (r0 != r1) goto L68
            X.AbstractC197988p9.A00(r3)
        L68:
            X.8oz r0 = X.EnumC197888oz.A02
            if (r10 != r0) goto L7b
            X.YPI r0 = r6.A00
            int r1 = r0.AtK()
            int r0 = r0.AtE()
            if (r2 == 0) goto L7f
            X.AbstractC72568Xgw.A00(r3, r12, r11, r1, r0)
        L7b:
            r4.put(r5, r3)
        L7e:
            return r3
        L7f:
            X.AbstractC72568Xgw.A00(r3, r1, r0, r11, r12)
            goto L7b
        L83:
            int r0 = r10.hashCode()
            int r0 = r0 + 31
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y68.A07(X.8oz, int, int, int, boolean):float[]");
    }
}
