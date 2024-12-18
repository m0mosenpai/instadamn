package X;

import android.graphics.Outline;
import android.os.Build;

/* loaded from: classes5.dex */
public final class BIP {
    public float A00;
    public long A01;
    public long A02;
    public C60Y A03;
    public C60Y A04;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07;
    public C137656Ll A08;
    public AbstractC119385av A09;
    public C60Y A0A;
    public boolean A0B;
    public final Outline A0C;

    public static final void A00(BIP bip) {
        C60Y c60y;
        if (bip.A05) {
            bip.A02 = 0L;
            bip.A00 = 0.0f;
            bip.A04 = null;
            bip.A05 = false;
            bip.A07 = false;
            AbstractC119385av abstractC119385av = bip.A09;
            if (abstractC119385av != null && bip.A0B) {
                long j = bip.A01;
                if (C5YC.A02(j) > 0.0f && C5YC.A00(j) > 0.0f) {
                    bip.A06 = true;
                    if (abstractC119385av instanceof C119375au) {
                        C114205Dh c114205Dh = ((C119375au) abstractC119385av).A00;
                        float f = c114205Dh.A01;
                        float f2 = c114205Dh.A03;
                        bip.A02 = AbstractC119395aw.A00(f, f2);
                        float f3 = c114205Dh.A02;
                        float f4 = c114205Dh.A00;
                        bip.A01 = C5YB.A00(f3 - f, f4 - f2);
                        bip.A0C.setRect(Math.round(f), Math.round(f2), Math.round(f3), Math.round(f4));
                        return;
                    }
                    if (abstractC119385av instanceof C6Ln) {
                        C137656Ll c137656Ll = ((C6Ln) abstractC119385av).A00;
                        long j2 = c137656Ll.A06;
                        long j3 = AbstractC137646Lk.A00;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                        float f5 = c137656Ll.A01;
                        float f6 = c137656Ll.A03;
                        bip.A02 = AbstractC119395aw.A00(f5, f6);
                        float f7 = c137656Ll.A02;
                        float f8 = c137656Ll.A00;
                        bip.A01 = C5YB.A00(f7 - f5, f8 - f6);
                        if (AbstractC137666Lm.A01(c137656Ll)) {
                            bip.A0C.setRoundRect(Math.round(f5), Math.round(f6), Math.round(f7), Math.round(f8), intBitsToFloat);
                            bip.A00 = intBitsToFloat;
                            return;
                        }
                        c60y = bip.A03;
                        if (c60y == null) {
                            c60y = C60W.A00();
                            bip.A03 = c60y;
                        }
                        ((C60X) c60y).A03.reset();
                        c60y.AAG(c137656Ll, C05F.A00);
                    } else if (!(abstractC119385av instanceof C119405ax)) {
                        return;
                    } else {
                        c60y = ((C119405ax) abstractC119385av).A00;
                    }
                    if (Build.VERSION.SDK_INT <= 28 && !((C60X) c60y).A03.isConvex()) {
                        bip.A06 = false;
                        bip.A0C.setEmpty();
                        bip.A07 = true;
                    } else {
                        Outline outline = bip.A0C;
                        if (c60y instanceof C60X) {
                            outline.setConvexPath(((C60X) c60y).A03);
                            bip.A07 = !outline.canClip();
                        } else {
                            throw new UnsupportedOperationException(AbstractC111324zv.A00(1830));
                        }
                    }
                    bip.A04 = c60y;
                    return;
                }
            }
            bip.A0C.setEmpty();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (X.AbstractC25231BEo.A00(r4) == r6) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.AnonymousClass585 r19) {
        /*
            r18 = this;
            r2 = r18
            A00(r2)
            X.60Y r1 = r2.A04
            r11 = r19
            if (r1 == 0) goto L10
            r0 = 1
            r11.AI6(r1, r0)
            return
        L10:
            float r6 = r2.A00
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9d
            X.60Y r3 = r2.A0A
            X.6Ll r7 = r2.A08
            if (r3 == 0) goto L64
            long r0 = r2.A02
            long r4 = r2.A01
            if (r7 == 0) goto L64
            boolean r8 = X.AbstractC137666Lm.A01(r7)
            if (r8 == 0) goto L64
            float r8 = r7.A01
            float r10 = X.C119365at.A01(r0)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L64
            float r9 = r7.A03
            float r8 = X.C119365at.A02(r0)
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 != 0) goto L64
            float r1 = r7.A02
            float r0 = X.C5YC.A02(r4)
            float r10 = r10 + r0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L64
            float r1 = r7.A00
            float r0 = X.C5YC.A00(r4)
            float r8 = r8 + r0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L64
            long r4 = r7.A06
            long r0 = X.AbstractC137646Lk.A00
            float r0 = X.AbstractC25231BEo.A00(r4)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L64
        L5f:
            r0 = 1
            r11.AI6(r3, r0)
            return
        L64:
            long r0 = r2.A02
            float r12 = X.C119365at.A01(r0)
            float r13 = X.C119365at.A02(r0)
            long r0 = r2.A01
            float r4 = X.C5YC.A02(r0)
            float r14 = r12 + r4
            float r0 = X.C5YC.A00(r0)
            float r15 = r13 + r0
            long r16 = X.AbstractC137636Lj.A00(r6, r6)
            X.6Ll r1 = X.AbstractC137666Lm.A00(r12, r13, r14, r15, r16)
            if (r3 != 0) goto L94
            X.60X r3 = X.C60W.A00()
        L8a:
            java.lang.Integer r0 = X.C05F.A00
            r3.AAG(r1, r0)
            r2.A08 = r1
            r2.A0A = r3
            goto L5f
        L94:
            r0 = r3
            X.60X r0 = (X.C60X) r0
            android.graphics.Path r0 = r0.A03
            r0.reset()
            goto L8a
        L9d:
            long r0 = r2.A02
            float r13 = X.C119365at.A01(r0)
            float r14 = X.C119365at.A02(r0)
            long r1 = r2.A01
            float r0 = X.C5YC.A02(r1)
            float r15 = r13 + r0
            float r0 = X.C5YC.A00(r1)
            float r16 = r14 + r0
            r12 = 1
            r11.AI7(r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIP.A02(X.585):void");
    }

    public final boolean A03(long j) {
        AbstractC119385av abstractC119385av;
        if (!this.A0B || (abstractC119385av = this.A09) == null) {
            return true;
        }
        return AbstractC25294BHn.A01(abstractC119385av, C119365at.A01(j), C119365at.A02(j));
    }

    public final boolean A04(AbstractC119385av abstractC119385av, float f, float f2, long j, boolean z) {
        boolean z2;
        this.A0C.setAlpha(f);
        boolean z3 = !C14360o3.A0K(this.A09, abstractC119385av);
        if (z3) {
            this.A09 = abstractC119385av;
            this.A05 = true;
        }
        this.A01 = j;
        if (abstractC119385av != null && (z || f2 > 0.0f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.A0B != z2) {
            this.A0B = z2;
            this.A05 = true;
        }
        return z3;
    }

    public BIP() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.A0C = outline;
        this.A02 = 0L;
        this.A01 = 0L;
    }

    public final Outline A01() {
        A00(this);
        if (this.A0B && this.A06) {
            return this.A0C;
        }
        return null;
    }
}
