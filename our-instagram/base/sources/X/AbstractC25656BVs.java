package X;

/* renamed from: X.BVs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25656BVs {
    public static final BVX A00;
    public static final XPB A01;

    static {
        C16930sl c16930sl = C16930sl.A00;
        A00 = new BVX(C6M3.Horizontal, C25653BVp.A00, null, null, new C28834Co4(2), c16930sl, c16930sl, c16930sl, AnonymousClass194.A02(AnonymousClass191.A00), 0.0f, 0, 0, 0, 0, 0, 0, 0, false, false, false);
        A01 = new XPB();
    }

    public static final long A00(InterfaceC30777DgE interfaceC30777DgE, int i) {
        int A002;
        BVX bvx = (BVX) interfaceC30777DgE;
        int i2 = bvx.A06;
        int i3 = bvx.A05;
        int i4 = -bvx.A08;
        long j = (i * (i2 + i3)) + i4 + bvx.A03;
        C6M3 c6m3 = bvx.A09;
        C6M3 c6m32 = C6M3.Horizontal;
        long A0s = AbstractC25232BEp.A0s(bvx.A0J);
        if (c6m3 == c6m32) {
            A002 = AbstractC25225BEi.A06(A0s);
        } else {
            A002 = C119055aN.A00(A0s);
        }
        long A03 = j - (A002 - C17s.A03(bvx.A0A.E4p(A002, i3, i4, r8, i - 1, i), 0, A002));
        if (A03 < 0) {
            return 0L;
        }
        return A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x003e, code lost:
    
        if ((r14 & 48) == 32) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002a, code lost:
    
        if ((r14 & 6) == 4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BVY A01(X.C5Tl r11, X.InterfaceC16820sZ r12, int r13, int r14, int r15) {
        /*
            r0 = r15 & 1
            r3 = 0
            if (r0 == 0) goto L6
            r13 = 0
        L6:
            r5 = 0
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L15
            r1 = 1088479535(0x40e0e12f, float:7.027488)
            java.lang.String r0 = "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)"
            X.C0fH.A01(r1, r0)
        L15:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            X.5C7 r7 = X.BVY.A0b
            r0 = r14 & 14
            r0 = r0 ^ 6
            r1 = 4
            r6 = r11
            if (r0 <= r1) goto L27
            boolean r0 = r11.AH2(r13)
            if (r0 != 0) goto L2c
        L27:
            r0 = r14 & 6
            r4 = 0
            if (r0 != r1) goto L2d
        L2c:
            r4 = 1
        L2d:
            r0 = r14 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L3b
            boolean r0 = r11.AH1(r5)
            if (r0 != 0) goto L40
        L3b:
            r1 = r14 & 48
            r0 = 0
            if (r1 != r2) goto L41
        L40:
            r0 = 1
        L41:
            r4 = r4 | r0
            r0 = r14 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto L50
            boolean r0 = r11.AH4(r12)
            if (r0 != 0) goto L54
        L50:
            r0 = r14 & 384(0x180, float:5.38E-43)
            if (r0 != r1) goto L55
        L54:
            r3 = 1
        L55:
            r4 = r4 | r3
            java.lang.Object r8 = r11.EEc()
            if (r4 != 0) goto L60
            java.lang.Object r0 = X.C5UI.A00
            if (r8 != r0) goto L68
        L60:
            X.BVt r8 = new X.BVt
            r8.<init>(r12, r13)
            r11.FBy(r8)
        L68:
            X.0sZ r8 = (X.InterfaceC16820sZ) r8
            r10 = 0
            r11 = 4
            java.lang.Object r1 = X.C6M6.A00(r6, r7, r8, r9, r10, r11)
            X.BVY r1 = (X.BVY) r1
            X.3Yl r0 = r1.A0B
            r0.Egh(r12)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L83
            r0 = 1555684444(0x5cb9dc5c, float:4.1852127E17)
            X.C0fH.A00(r0)
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25656BVs.A01(X.5Tl, X.0sZ, int, int, int):X.BVY");
    }
}
