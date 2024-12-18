package X;

/* renamed from: X.BVy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25662BVy {
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005f, code lost:
    
        if ((r13 & 6) == 4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C6GU A00(X.C5Y6 r10, X.BVY r11, X.C5Tl r12, int r13, int r14) {
        /*
            r2 = 0
            r4 = 0
            r3 = 0
            r0 = r14 & 2
            r9 = 1
            if (r0 == 0) goto Ld
            X.Cn3 r2 = new X.Cn3
            r2.<init>()
        Ld:
            r0 = r14 & 4
            r5 = 0
            if (r0 == 0) goto L16
            X.6MY r4 = X.C6MS.A00(r12)
        L16:
            r0 = r14 & 8
            r7 = 0
            if (r0 == 0) goto L27
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
            r0 = 1137180672(0x43c80000, float:400.0)
            X.5Y4 r10 = X.AbstractC25225BEi.A0I(r1, r6, r0)
        L27:
            r0 = r14 & 16
            if (r0 == 0) goto L2d
            r3 = 1056964608(0x3f000000, float:0.5)
        L2d:
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L3b
            r1 = -714177662(0xffffffffd56e8382, float:-1.6390537E13)
            java.lang.String r0 = "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)"
            X.C0fH.A01(r1, r0)
        L3b:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto La9
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto La9
            X.5UP r0 = X.C5V2.A01
            java.lang.Object r8 = r12.AJX(r0)
            java.lang.Object r6 = X.AbstractC25226BEj.A18(r12)
            r0 = r13 & 14
            r0 = r0 ^ 6
            r7 = 4
            if (r0 <= r7) goto L5c
            boolean r0 = r12.AH4(r11)
            if (r0 != 0) goto L61
        L5c:
            r1 = r13 & 6
            r0 = 0
            if (r1 != r7) goto L62
        L61:
            r0 = 1
        L62:
            boolean r7 = X.AbstractC25232BEp.A1a(r12, r4, r10, r0)
            r0 = r13 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L74
            boolean r0 = r12.AH4(r2)
            if (r0 != 0) goto L79
        L74:
            r0 = r13 & 48
            if (r0 == r1) goto L79
            r9 = 0
        L79:
            r7 = r7 | r9
            boolean r0 = X.AbstractC25232BEp.A1a(r12, r8, r6, r7)
            java.lang.Object r1 = r12.EEc()
            if (r0 != 0) goto L88
            java.lang.Object r0 = X.C5UI.A00
            if (r1 != r0) goto L9a
        L88:
            X.DcH r1 = new X.DcH
            r1.<init>(r11, r6, r3, r5)
            X.BW1 r0 = new X.BW1
            r0.<init>(r11, r2, r1)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior
            r1.<init>(r10, r4, r0)
            r12.FBy(r1)
        L9a:
            X.6GU r1 = (X.C6GU) r1
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto La8
            r0 = 1656336582(0x62b9b0c6, float:1.7126928E21)
            X.C0fH.A00(r0)
        La8:
            return r1
        La9:
            java.lang.String r0 = "snapPositionalThreshold should be a number between 0 and 1. You've specified "
            java.lang.String r0 = X.AnonymousClass001.A0N(r0, r3)
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25662BVy.A00(X.5Y6, X.BVY, X.5Tl, int, int):X.6GU");
    }
}
