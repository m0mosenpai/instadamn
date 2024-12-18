package androidx.compose.foundation.gestures.snapping;

/* loaded from: classes5.dex */
public abstract class SnapFlingBehaviorKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0pO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C5Y6 r14, X.C5Y2 r15, X.C6MC r16, X.InterfaceC23621Ds r17, X.InterfaceC16660sJ r18, float r19, float r20) {
        /*
            r4 = r17
            r11 = r15
            r3 = r19
            boolean r0 = r4 instanceof X.C29625D3a
            if (r0 == 0) goto La4
            r13 = r4
            X.D3a r13 = (X.C29625D3a) r13
            int r2 = r13.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La4
            int r2 = r2 - r1
            r13.A02 = r2
        L17:
            java.lang.Object r1 = r13.A05
            X.1JX r4 = X.C1JX.A02
            int r0 = r13.A02
            r10 = 1
            if (r0 == 0) goto L61
            if (r0 != r10) goto Lab
            float r2 = r13.A01
            float r3 = r13.A00
            java.lang.Object r8 = r13.A04
            X.0pO r8 = (X.C15080pO) r8
            java.lang.Object r11 = r13.A03
            X.5Y2 r11 = (X.C5Y2) r11
            X.AbstractC09560e7.A00(r1)
        L31:
            java.lang.Object r0 = r11.A00()
            float r5 = X.AbstractC166987dD.A09(r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L52
            r5 = 0
        L3f:
            float r0 = r8.A00
            float r3 = r3 - r0
            java.lang.Float r1 = X.AbstractC25225BEi.A10(r3)
            r0 = 29
            X.5Y2 r0 = X.BG4.A01(r11, r4, r5, r0)
            X.CPl r4 = new X.CPl
            r4.<init>(r0, r1)
            return r4
        L52:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5c
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3f
        L5a:
            r5 = r2
            goto L3f
        L5c:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
            goto L5a
        L61:
            X.AbstractC09560e7.A00(r1)
            X.0pO r8 = new X.0pO
            r8.<init>()
            java.lang.Object r0 = r15.A00()
            float r2 = X.AbstractC166987dD.A09(r0)
            java.lang.Float r12 = X.AbstractC25225BEi.A10(r3)
            java.lang.Object r0 = r15.A00()
            float r1 = X.AbstractC166987dD.A09(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            r15 = r0 ^ 1
            X.DRf r5 = new X.DRf
            r6 = r16
            r7 = r18
            r9 = r20
            r5.<init>(r6, r7, r8, r9, r10)
            r13.A03 = r11
            r13.A04 = r8
            r13.A00 = r3
            r13.A01 = r2
            r13.A02 = r10
            r10 = r14
            r14 = r5
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A02(r10, r11, r12, r13, r14, r15)
            if (r0 != r4) goto L31
            return r4
        La4:
            X.D3a r13 = new X.D3a
            r13.<init>(r4)
            goto L17
        Lab:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A00(X.5Y6, X.5Y2, X.6MC, X.1Ds, X.0sJ, float, float):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0pO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C5Y2 r11, X.C6MY r12, X.C6MC r13, X.InterfaceC23621Ds r14, X.InterfaceC16660sJ r15, float r16) {
        /*
            r9 = r16
            r10 = 0
            boolean r0 = r14 instanceof X.D3j
            if (r0 == 0) goto L6d
            r4 = r14
            X.D3j r4 = (X.D3j) r4
            int r0 = r4.A05
            if (r0 != r10) goto L6d
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r4.A01 = r2
        L19:
            java.lang.Object r1 = r4.A04
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A01
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 != r2) goto L73
            float r9 = r4.A00
            java.lang.Object r8 = r4.A03
            X.0pO r8 = (X.C15080pO) r8
            java.lang.Object r11 = r4.A02
            X.5Y2 r11 = (X.C5Y2) r11
            X.AbstractC09560e7.A00(r1)
        L31:
            float r0 = r8.A00
            float r9 = r9 - r0
            java.lang.Float r1 = X.AbstractC25225BEi.A10(r9)
            X.CPl r0 = new X.CPl
            r0.<init>(r11, r1)
            return r0
        L3e:
            X.AbstractC09560e7.A00(r1)
            X.0pO r8 = new X.0pO
            r8.<init>()
            java.lang.Object r0 = r11.A00()
            float r1 = X.AbstractC166987dD.A09(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            r0 = r0 ^ 1
            X.DRf r5 = new X.DRf
            r6 = r13
            r7 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A02 = r11
            r4.A03 = r8
            r4.A00 = r9
            r4.A01 = r2
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A04(r11, r12, r4, r5, r0)
            if (r0 != r3) goto L31
            return r3
        L6d:
            X.D3j r4 = new X.D3j
            r4.<init>(r14)
            goto L19
        L73:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A01(X.5Y2, X.6MY, X.6MC, X.1Ds, X.0sJ, float):java.lang.Object");
    }
}
