package androidx.compose.foundation.gestures.snapping;

import X.AbstractC27739CLg;
import X.C14360o3;
import X.C57B;
import X.C5Y6;
import X.C6GS;
import X.C6GU;
import X.C6MC;
import X.C6MY;
import X.InterfaceC23621Ds;
import androidx.compose.foundation.gestures.ScrollableKt;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "Please use the snapFlingBehavior function", replaceWith = @ReplaceWith(expression = "androidx.compose.foundation.gestures.snapping.snapFlingBehavior", imports = {}))
/* loaded from: classes3.dex */
public final class SnapFlingBehavior implements C6GU {
    public C57B A00 = ScrollableKt.A02;
    public final C5Y6 A01;
    public final C6MY A02;
    public final C6GS A03;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6MC r6, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r7, X.InterfaceC23621Ds r8, X.InterfaceC16660sJ r9, float r10) {
        /*
            r3 = 2
            boolean r0 = X.C9CY.A00(r8, r3)
            if (r0 == 0) goto L47
            r4 = r8
            X.9CY r4 = (X.C9CY) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r0 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L31
            if (r2 != r1) goto L4d
            java.lang.Object r9 = r4.A01
            X.0sJ r9 = (X.InterfaceC16660sJ) r9
            X.AbstractC09560e7.A00(r0)
        L27:
            r2 = 0
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r2)
            r9.invoke(r1)
            return r0
        L31:
            X.AbstractC09560e7.A00(r0)
            X.57B r0 = r7.A00
            r8 = 0
            X.9DO r5 = new X.9DO
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A01 = r9
            r4.A00 = r1
            java.lang.Object r0 = X.AbstractC23641Du.A00(r4, r0, r5)
            if (r0 != r3) goto L27
            return r3
        L47:
            X.9CY r4 = new X.9CY
            r4.<init>(r7, r8, r3)
            goto L15
        L4d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A00(X.6MC, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, X.1Ds, X.0sJ, float):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C6MC r9, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r10, X.InterfaceC23621Ds r11, X.InterfaceC16660sJ r12, float r13, float r14) {
        /*
            r6 = 1
            boolean r0 = X.C9CW.A00(r11, r6)
            if (r0 == 0) goto L6d
            r8 = r11
            X.9CW r8 = (X.C9CW) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r8.A00 = r2
        L15:
            java.lang.Object r1 = r8.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r8.A00
            if (r0 == 0) goto L27
            if (r0 != r6) goto L75
            X.AbstractC09560e7.A00(r1)
        L22:
            X.CPl r1 = (X.C27848CPl) r1
            X.5Y2 r2 = r1.A00
            return r2
        L27:
            X.AbstractC09560e7.A00(r1)
            float r5 = java.lang.Math.abs(r13)
            r4 = 0
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 == 0) goto L7d
            float r0 = java.lang.Math.abs(r14)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L7d
            r8.A00 = r6
            X.6MY r1 = r10.A02
            float r0 = X.AbstractC28007CWe.A00(r1, r4, r14)
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L65
            X.CmO r4 = new X.CmO
            r4.<init>(r1)
        L50:
            X.DiG r4 = (X.InterfaceC30903DiG) r4
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r13)
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r14)
            r5 = r9
            r9 = r12
            java.lang.Object r1 = r4.ACL(r5, r6, r7, r8, r9)
            if (r1 != r2) goto L22
            return r2
        L65:
            X.5Y6 r0 = r10.A01
            X.CmP r4 = new X.CmP
            r4.<init>(r0)
            goto L50
        L6d:
            r0 = 42
            X.9CW r8 = new X.9CW
            r8.<init>(r10, r11, r6, r0)
            goto L15
        L75:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L7d:
            X.5Y2 r2 = X.BG4.A00(r13, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A01(X.6MC, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, X.1Ds, X.0sJ, float, float):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.C6GU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E4A(X.C6MC r6, X.InterfaceC23621Ds r7, X.InterfaceC16660sJ r8, float r9) {
        /*
            r5 = this;
            r3 = 0
            boolean r0 = X.C9CW.A00(r7, r3)
            if (r0 == 0) goto L50
            r4 = r7
            X.9CW r4 = (X.C9CW) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L44
            if (r1 != r0) goto L58
            X.AbstractC09560e7.A00(r3)
        L23:
            X.CPl r3 = (X.C27848CPl) r3
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            X.5Y2 r2 = r3.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r2.A00()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
        L3e:
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            return r2
        L44:
            X.AbstractC09560e7.A00(r3)
            r4.A00 = r0
            java.lang.Object r3 = A00(r6, r5, r4, r8, r9)
            if (r3 != r2) goto L23
            return r2
        L50:
            r0 = 42
            X.9CW r4 = new X.9CW
            r4.<init>(r5, r7, r3, r0)
            goto L15
        L58:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.E4A(X.6MC, X.1Ds, X.0sJ, float):java.lang.Object");
    }

    @Override // X.C6MZ
    public final /* synthetic */ Object E49(C6MC c6mc, InterfaceC23621Ds interfaceC23621Ds, float f) {
        return E4A(c6mc, interfaceC23621Ds, AbstractC27739CLg.A00, f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        if (!C14360o3.A0K(snapFlingBehavior.A01, this.A01) || !C14360o3.A0K(snapFlingBehavior.A02, this.A02) || !C14360o3.A0K(snapFlingBehavior.A03, this.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }

    public SnapFlingBehavior(C5Y6 c5y6, C6MY c6my, C6GS c6gs) {
        this.A03 = c6gs;
        this.A02 = c6my;
        this.A01 = c5y6;
    }
}
