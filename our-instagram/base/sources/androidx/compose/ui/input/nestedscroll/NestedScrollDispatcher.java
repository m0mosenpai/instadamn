package androidx.compose.ui.input.nestedscroll;

import X.BFZ;
import X.C19L;
import X.C9EV;
import X.InterfaceC16820sZ;

/* loaded from: classes3.dex */
public final class NestedScrollDispatcher {
    public NestedScrollNode A00;
    public InterfaceC16820sZ A01 = new C9EV(this, 19);
    public C19L A02;

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r6, long r7) {
        /*
            r5 = this;
            r3 = 3
            boolean r0 = X.C9CW.A00(r6, r3)
            if (r0 == 0) goto L42
            r4 = r6
            X.9CW r4 = (X.C9CW) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L4a
            X.AbstractC09560e7.A00(r3)
        L23:
            X.BFb r3 = (X.C25242BFb) r3
            long r0 = r3.A00
        L27:
            X.BFb r2 = new X.BFb
            r2.<init>(r0)
            return r2
        L2d:
            X.AbstractC09560e7.A00(r3)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r5.A00()
            if (r0 == 0) goto L3f
            r4.A00 = r1
            java.lang.Object r3 = r0.Da5(r4, r7)
            if (r3 != r2) goto L23
            return r2
        L3f:
            r0 = 0
            goto L27
        L42:
            r0 = 42
            X.9CW r4 = new X.9CW
            r4.<init>(r5, r6, r3, r0)
            goto L15
        L4a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.A01(X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r10, long r11, long r13) {
        /*
            r9 = this;
            r3 = 2
            boolean r0 = X.C9CW.A00(r10, r3)
            if (r0 == 0) goto L44
            r4 = r10
            X.9CW r4 = (X.C9CW) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L4c
            X.AbstractC09560e7.A00(r3)
        L23:
            X.BFb r3 = (X.C25242BFb) r3
            long r0 = r3.A00
        L27:
            X.BFb r2 = new X.BFb
            r2.<init>(r0)
            return r2
        L2d:
            X.AbstractC09560e7.A00(r3)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r3 = r9.A00()
            if (r3 == 0) goto L41
            r4.A00 = r0
            r5 = r11
            r7 = r13
            java.lang.Object r3 = r3.DZz(r4, r5, r7)
            if (r3 != r2) goto L23
            return r2
        L41:
            r0 = 0
            goto L27
        L44:
            r0 = 42
            X.9CW r4 = new X.9CW
            r4.<init>(r9, r10, r3, r0)
            goto L15
        L4c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.A02(X.1Ds, long, long):java.lang.Object");
    }

    public final NestedScrollNode A00() {
        NestedScrollNode nestedScrollNode = this.A00;
        if (nestedScrollNode != null && nestedScrollNode.A08) {
            return (NestedScrollNode) BFZ.A01(nestedScrollNode);
        }
        return null;
    }
}
