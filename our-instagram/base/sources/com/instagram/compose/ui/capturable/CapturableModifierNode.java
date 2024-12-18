package com.instagram.compose.ui.capturable;

import X.C008002u;
import X.C05A;
import X.C14360o3;
import X.C58K;
import X.C5AY;
import X.O7E;

/* loaded from: classes3.dex */
public final class CapturableModifierNode extends C5AY implements C58K {
    public final C05A A00;

    public CapturableModifierNode(O7E o7e) {
        C14360o3.A0B(o7e, 1);
        this.A00 = new C008002u(o7e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.5AY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.graphics.Picture r7, com.instagram.compose.ui.capturable.CapturableModifierNode r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 39
            boolean r0 = X.MAO.A02(r9, r3)
            if (r0 == 0) goto L5b
            r6 = r9
            X.MAO r6 = (X.MAO) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 != r4) goto L61
            java.lang.Object r3 = r6.A02
            X.58K r3 = (X.C58K) r3
            java.lang.Object r8 = r6.A01
            X.5AY r8 = (X.C5AY) r8
            X.AbstractC09560e7.A00(r1)
        L2c:
            r8.A0G(r3)
            X.0eB r5 = X.C0eB.A00
            return r5
        L32:
            X.AbstractC09560e7.A00(r1)
            X.3Pr r2 = new X.3Pr
            r2.<init>()
            r0 = 8
            X.BAO r1 = new X.BAO
            r1.<init>(r0, r7, r2)
            X.6Ld r0 = new X.6Ld
            r0.<init>()
            X.6CI r3 = new X.6CI
            r3.<init>(r0, r1)
            r8.A0F(r3)
            r6.A01 = r8
            r6.A02 = r3
            r6.A00 = r4
            java.lang.Object r0 = r2.A0E(r6)
            if (r0 != r5) goto L2c
            return r5
        L5b:
            X.MAO r6 = new X.MAO
            r6.<init>(r8, r9, r3)
            goto L16
        L61:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.ui.capturable.CapturableModifierNode.A00(android.graphics.Picture, com.instagram.compose.ui.capturable.CapturableModifierNode, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.compose.ui.capturable.CapturableModifierNode r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 31
            boolean r0 = X.MAG.A01(r6, r3)
            if (r0 == 0) goto L3a
            r4 = r6
            X.MAG r4 = (X.MAG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L27
            if (r1 != r0) goto L40
            java.lang.Object r2 = r4.A01
            X.AbstractC09560e7.A00(r3)
        L26:
            return r2
        L27:
            X.AbstractC09560e7.A00(r3)
            android.graphics.Picture r1 = new android.graphics.Picture
            r1.<init>()
            r4.A01 = r1
            r4.A00 = r0
            java.lang.Object r0 = A00(r1, r5, r4)
            if (r0 == r2) goto L26
            return r1
        L3a:
            X.MAG r4 = new X.MAG
            r4.<init>(r5, r6, r3)
            goto L16
        L40:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.ui.capturable.CapturableModifierNode.A01(com.instagram.compose.ui.capturable.CapturableModifierNode, X.1Ds):java.lang.Object");
    }
}
