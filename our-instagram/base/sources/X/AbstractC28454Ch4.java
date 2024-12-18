package X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Ch4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28454Ch4 {
    public static final C5Y4 A03;
    public static final C5Y4 A04;
    public static final C5Y4 A01 = AbstractC25225BEi.A0I(null, 1.0f, 1500.0f);
    public static final C5Y4 A02 = AbstractC25225BEi.A0I(new C119145aW(0.1f), 1.0f, 1500.0f);
    public static final C5Y4 A07 = AbstractC25225BEi.A0I(new C5YC(C5YB.A00(0.5f, 0.5f)), 1.0f, 1500.0f);
    public static final C5Y4 A05 = AbstractC25225BEi.A0I(AbstractC25225BEi.A0R(AbstractC119395aw.A00(0.5f, 0.5f)), 1.0f, 1500.0f);
    public static final C5Y4 A06 = AbstractC25225BEi.A0I(CNF.A00, 1.0f, 1500.0f);
    public static final C5Y4 A00 = AbstractC25225BEi.A0I(1, 1.0f, 1500.0f);

    static {
        long A0q = AbstractC25232BEp.A0q();
        A03 = AbstractC25225BEi.A0I(new C119235af(A0q), 1.0f, 1500.0f);
        A04 = AbstractC25225BEi.A0I(new C119055aN(A0q), 1.0f, 1500.0f);
    }

    public static final InterfaceC74963Ym A01(C5Y6 c5y6, C5Tl c5Tl, float f, int i) {
        C5Y6 c5y62 = c5y6;
        if ((i & 2) != 0) {
            c5y62 = A02;
        }
        if (C0fH.A02()) {
            C0fH.A01(1046560386, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        InterfaceC74963Ym A002 = A00(c5y62, AbstractC118445Xg.A01, c5Tl, new C119145aW(f), null, null, DalvikInternals.IOPRIO_BACKGROUND, 8);
        if (C0fH.A02()) {
            C0fH.A00(1308962318);
        }
        return A002;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
    
        if ((r13 & 384) == 256) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC74963Ym A02(X.C5Y6 r9, X.C5Tl r10, X.InterfaceC16660sJ r11, float r12, int r13, int r14) {
        /*
            r2 = r13
            r6 = r9
            r0 = r14 & 2
            if (r0 == 0) goto L8
            X.5Y4 r6 = X.AbstractC28454Ch4.A01
        L8:
            r0 = r14 & 4
            r4 = 0
            if (r0 == 0) goto L10
            r4 = 1008981770(0x3c23d70a, float:0.01)
        L10:
            r1 = r14 & 16
            r0 = 0
            if (r1 == 0) goto L16
            r11 = r0
        L16:
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L24
            r1 = -955372669(0xffffffffc70e2b83, float:-36395.51)
            java.lang.String r0 = "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)"
            X.C0fH.A01(r1, r0)
        L24:
            X.5Y4 r0 = X.AbstractC28454Ch4.A01
            r5 = 3
            r8 = r10
            if (r6 != r0) goto L83
            r0 = 1125598679(0x431745d7, float:151.27281)
            r10.Eno(r0)
            r0 = r13 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r0 <= r3) goto L3e
            boolean r0 = r10.AH1(r4)
            if (r0 != 0) goto L43
        L3e:
            r1 = r13 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r3) goto L44
        L43:
            r0 = 1
        L44:
            java.lang.Object r6 = r10.EEc()
            if (r0 != 0) goto L4e
            java.lang.Object r0 = X.C5UI.A00
            if (r6 != r0) goto L59
        L4e:
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            X.5Y4 r6 = X.AbstractC25231BEo.A0P(r0)
            r10.FBy(r6)
        L59:
            X.5Y4 r6 = (X.C5Y4) r6
            boolean r13 = X.AbstractC25228BEl.A1W(r10)
        L5f:
            java.lang.Float r9 = java.lang.Float.valueOf(r12)
            X.5Xk r7 = X.AbstractC118445Xg.A02
            java.lang.Float r10 = java.lang.Float.valueOf(r4)
            r1 = r2 & 14
            int r2 = r2 << r5
            r0 = r2 & 7168(0x1c00, float:1.0045E-41)
            int r12 = X.AbstractC25233BEq.A01(r0, r1, r2)
            X.3Ym r1 = A00(r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L82
            r0 = -926406864(0xffffffffc8c82730, float:-409913.5)
            X.C0fH.A00(r0)
        L82:
            return r1
        L83:
            r0 = 1125708605(0x4318f33d, float:152.95015)
            r10.Eno(r0)
            boolean r13 = X.AbstractC25228BEl.A1W(r10)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28454Ch4.A02(X.5Y6, X.5Tl, X.0sJ, float, int, int):X.3Ym");
    }

    public static final InterfaceC74963Ym A03(C5Tl c5Tl, float f) {
        return A02(null, c5Tl, null, f, 3072, 22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if ((r17 & 6) == 4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC74963Ym A00(X.C5Y6 r11, X.InterfaceC118485Xk r12, X.C5Tl r13, java.lang.Object r14, java.lang.Object r15, X.InterfaceC16660sJ r16, int r17, int r18) {
        /*
            r3 = r16
            r0 = r18 & 4
            r10 = 0
            if (r0 == 0) goto L18
            java.lang.Object r11 = r13.EEc()
            java.lang.Object r0 = X.C5UI.A00
            if (r11 != r0) goto L16
            X.5Y4 r11 = X.AbstractC25231BEo.A0P(r10)
            r13.FBy(r11)
        L16:
            X.5Y4 r11 = (X.C5Y4) r11
        L18:
            r0 = r18 & 8
            if (r0 == 0) goto L1d
            r15 = r10
        L1d:
            r0 = r18 & 32
            if (r0 == 0) goto L22
            r3 = r10
        L22:
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L30
            r1 = -1291415060(0xffffffffb30691ec, float:-3.133202E-8)
            java.lang.String r0 = "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)"
            X.C0fH.A01(r1, r0)
        L30:
            java.lang.Object r2 = r13.EEc()
            java.lang.Object r1 = X.C5UI.A00
            if (r2 != r1) goto L3c
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = X.AbstractC25232BEp.A0w(r13, r10)
        L3c:
            X.3Yl r2 = (X.InterfaceC74953Yl) r2
            java.lang.Object r7 = r13.EEc()
            if (r7 != r1) goto L4c
            X.5Y1 r7 = new X.5Y1
            r7.<init>(r12, r14, r15)
            r13.FBy(r7)
        L4c:
            X.5Y1 r7 = (X.C5Y1) r7
            X.3Yl r9 = X.C5WZ.A00(r13, r3)
            if (r15 == 0) goto L6b
            boolean r0 = r11 instanceof X.C5Y4
            if (r0 == 0) goto L6b
            r4 = r11
            X.5Y4 r4 = (X.C5Y4) r4
            java.lang.Object r0 = r4.A02
            boolean r0 = X.C14360o3.A0K(r0, r15)
            if (r0 != 0) goto L6b
            float r3 = r4.A00
            float r0 = r4.A01
            X.5Y4 r11 = X.AbstractC25225BEi.A0I(r15, r3, r0)
        L6b:
            r4 = 0
            X.3Yl r8 = X.C5WZ.A00(r13, r11)
            java.lang.Object r11 = r13.EEc()
            if (r11 != r1) goto L81
            r3 = 1
            java.lang.Integer r0 = X.C05F.A01
            X.3It r11 = new X.3It
            r11.<init>(r3, r0)
            r13.FBy(r11)
        L81:
            X.1Iq r11 = (X.InterfaceC24731Iq) r11
            boolean r6 = r13.AH6(r11)
            r0 = r17 & 14
            r0 = r0 ^ 6
            r5 = 4
            if (r0 <= r5) goto L94
            boolean r0 = r13.AH6(r14)
            if (r0 != 0) goto L99
        L94:
            r0 = r17 & 6
            r3 = 0
            if (r0 != r5) goto L9a
        L99:
            r3 = 1
        L9a:
            r3 = r3 | r6
            java.lang.Object r0 = r13.EEc()
            if (r3 != 0) goto La3
            if (r0 != r1) goto Lab
        La3:
            X.DH1 r0 = new X.DH1
            r0.<init>(r4, r11, r14)
            r13.FBy(r0)
        Lab:
            X.0sZ r0 = (X.InterfaceC16820sZ) r0
            X.C5UX.A05(r13, r0)
            boolean r0 = X.AbstractC25231BEo.A1R(r13, r11, r7)
            boolean r0 = X.AbstractC25232BEp.A1a(r13, r8, r9, r0)
            java.lang.Object r6 = r13.EEc()
            if (r0 != 0) goto Lc0
            if (r6 != r1) goto Lc8
        Lc0:
            X.MCR r6 = new X.MCR
            r6.<init>(r7, r8, r9, r10, r11)
            r13.FBy(r6)
        Lc8:
            X.0sF r6 = (X.InterfaceC16620sF) r6
            X.C5UX.A04(r13, r11, r6)
            java.lang.Object r1 = r2.getValue()
            X.3Ym r1 = (X.InterfaceC74963Ym) r1
            if (r1 != 0) goto Ld7
            X.5Y2 r1 = r7.A04
        Ld7:
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto Le3
            r0 = 790694707(0x2f210b33, float:1.4646843E-10)
            X.C0fH.A00(r0)
        Le3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28454Ch4.A00(X.5Y6, X.5Xk, X.5Tl, java.lang.Object, java.lang.Object, X.0sJ, int, int):X.3Ym");
    }
}
