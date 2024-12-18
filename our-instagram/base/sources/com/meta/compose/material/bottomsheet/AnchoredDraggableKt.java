package com.meta.compose.material.bottomsheet;

import X.C0eB;
import X.C1JX;
import X.EnumC27348C5d;
import X.InterfaceC23621Ds;

/* loaded from: classes5.dex */
public abstract class AnchoredDraggableKt {
    public static final Object A00(AnchoredDraggableState anchoredDraggableState, Object obj, InterfaceC23621Ds interfaceC23621Ds, float f) {
        Object A05 = anchoredDraggableState.A05(EnumC27348C5d.Default, obj, interfaceC23621Ds, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, null, f));
        if (A05 != C1JX.A02) {
            return C0eB.A00;
        }
        return A05;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(3:18|19|(1:21))|14|15|16))|23|6|7|(0)(0)|14|15|16) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.InterfaceC23621Ds r5, X.InterfaceC16820sZ r6, X.InterfaceC16620sF r7) {
        /*
            r3 = 30
            boolean r0 = X.D3k.A02(r5, r3)
            if (r0 == 0) goto L22
            r4 = r5
            X.D3k r4 = (X.D3k) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L2c
            goto L28
        L22:
            X.D3k r4 = new X.D3k
            r4.<init>(r3, r5)
            goto L16
        L28:
            X.AbstractC09560e7.A00(r1)     // Catch: X.PWB -> L43
            goto L43
        L2c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L31:
            X.AbstractC09560e7.A00(r1)
            r1 = 0
            X.PZm r0 = new X.PZm     // Catch: X.PWB -> L43
            r0.<init>(r1, r6, r7)     // Catch: X.PWB -> L43
            r4.A00 = r2     // Catch: X.PWB -> L43
            java.lang.Object r0 = X.AnonymousClass194.A00(r4, r0)     // Catch: X.PWB -> L43
            if (r0 != r3) goto L43
            return r3
        L43:
            X.0eB r0 = X.C0eB.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.material.bottomsheet.AnchoredDraggableKt.A01(X.1Ds, X.0sZ, X.0sF):java.lang.Object");
    }
}
