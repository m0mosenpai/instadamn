package X;

/* loaded from: classes5.dex */
public abstract class BH4 {
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0052, code lost:
    
        if ((r19 & 384) == 256) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x003e, code lost:
    
        if ((r19 & 48) == 32) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.JTG A00(X.BH6 r13, X.BH5 r14, X.InterfaceC118485Xk r15, X.C5Tl r16, java.lang.Object r17, java.lang.Object r18, int r19) {
        /*
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto Le
            r1 = 469740043(0x1bffaa0b, float:4.22961E-22)
            java.lang.String r0 = "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)"
            X.C0fH.A01(r1, r0)
        Le:
            r2 = r16
            java.lang.Object r8 = r2.EEc()
            java.lang.Object r3 = X.C5UI.A00
            r9 = r13
            r10 = r14
            r12 = r17
            r13 = r18
            if (r8 != r3) goto L27
            X.JTG r8 = new X.JTG
            r11 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r2.FBy(r8)
        L27:
            X.JTG r8 = (X.JTG) r8
            r4 = r19
            r0 = r19 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            r7 = 1
            r15 = 0
            if (r0 <= r1) goto L3b
            boolean r0 = r2.AH6(r12)
            if (r0 != 0) goto L40
        L3b:
            r0 = r19 & 48
            r6 = 0
            if (r0 != r1) goto L41
        L40:
            r6 = 1
        L41:
            r0 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r0 <= r5) goto L4f
            boolean r0 = r2.AH6(r13)
            if (r0 != 0) goto L54
        L4f:
            r1 = r4 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r5) goto L55
        L54:
            r0 = 1
        L55:
            r6 = r6 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r19
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 <= r1) goto L67
            boolean r0 = r2.AH6(r9)
            if (r0 != 0) goto L6c
        L67:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 == r1) goto L6c
            r7 = 0
        L6c:
            r6 = r6 | r7
            java.lang.Object r14 = r2.EEc()
            if (r6 != 0) goto L75
            if (r14 != r3) goto L85
        L75:
            X.ME7 r14 = new X.ME7
            r16 = r9
            r17 = r8
            r18 = r12
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19)
            r2.FBy(r14)
        L85:
            X.0sZ r14 = (X.InterfaceC16820sZ) r14
            X.C5UX.A05(r2, r14)
            boolean r1 = r2.AH6(r10)
            java.lang.Object r0 = r2.EEc()
            if (r1 != 0) goto L96
            if (r0 != r3) goto L9b
        L96:
            r0 = 6
            X.DRZ r0 = X.DRZ.A00(r2, r10, r8, r0)
        L9b:
            X.0sJ r0 = (X.InterfaceC16660sJ) r0
            X.C5UX.A03(r2, r8, r0)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto Lac
            r0 = -640337835(0xffffffffd9d53855, float:-7.5020135E15)
            X.C0fH.A00(r0)
        Lac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BH4.A00(X.BH6, X.BH5, X.5Xk, X.5Tl, java.lang.Object, java.lang.Object, int):X.JTG");
    }

    public static final JTG A01(BH6 bh6, BH5 bh5, C5Tl c5Tl, float f, float f2, int i) {
        if (C0fH.A02()) {
            C0fH.A01(1364886622, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i2 = i << 3;
        JTG A00 = A00(bh6, bh5, AbstractC118445Xg.A02, c5Tl, Float.valueOf(f), Float.valueOf(f2), AbstractC25230BEn.A03(i) | (57344 & i2) | (i2 & 458752));
        if (C0fH.A02()) {
            C0fH.A00(-161138920);
        }
        return A00;
    }

    public static final BH5 A02(C5Tl c5Tl) {
        if (C0fH.A02()) {
            C0fH.A01(621579947, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object EEc = c5Tl.EEc();
        if (EEc == C5UI.A00) {
            EEc = new BH5();
            c5Tl.FBy(EEc);
        }
        BH5 bh5 = (BH5) EEc;
        bh5.A00(c5Tl, 0);
        if (C0fH.A02()) {
            C0fH.A00(-343757249);
        }
        return bh5;
    }
}
