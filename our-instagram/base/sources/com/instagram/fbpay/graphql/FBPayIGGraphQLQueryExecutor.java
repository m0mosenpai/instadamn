package com.instagram.fbpay.graphql;

import X.C14360o3;
import X.C1Df;
import X.C1Dk;
import X.C40701ud;
import X.InterfaceC40711ue;
import X.InterfaceC48192Ji;
import X.InterfaceC48212Jk;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class FBPayIGGraphQLQueryExecutor implements InterfaceC40711ue {
    public final C40701ud A00;

    public FBPayIGGraphQLQueryExecutor(C40701ud c40701ud) {
        C14360o3.A0B(c40701ud, 1);
        this.A00 = c40701ud;
    }

    @Override // X.InterfaceC40711ue
    public final C1Df ATW(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk, Executor executor) {
        C14360o3.A0B(c1Dk, 0);
        return this.A00.ATW(interfaceC48212Jk, interfaceC48192Ji, c1Dk, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C1Dk r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 20
            boolean r0 = X.C9CX.A00(r7, r3)
            if (r0 == 0) goto L45
            r4 = r7
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L82
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L4d
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.SLr r2 = X.SSG.A00(r0)
            return r2
        L37:
            X.AbstractC09560e7.A00(r3)
            X.1ud r0 = r5.A00
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r4)
            if (r3 != r2) goto L24
            return r2
        L45:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r5, r7, r3, r0)
            goto L16
        L4d:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L7c
            X.8jk r3 = (X.C194848jk) r3
            java.lang.Object r1 = r3.A00
            X.5If r1 = (X.AbstractC115105If) r1
            boolean r0 = r1 instanceof X.C115095Ie
            if (r0 == 0) goto L64
            X.5Ie r1 = (X.C115095Ie) r1
            java.lang.Throwable r1 = r1.A00
        L5f:
            X.SLr r2 = X.SSG.A01(r1)
            return r2
        L64:
            boolean r0 = r1 instanceof X.C115115Ig
            if (r0 == 0) goto L76
            X.5Ig r1 = (X.C115115Ig) r1
            java.lang.Object r0 = r1.A00
            java.lang.String r0 = r0.toString()
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            goto L5f
        L76:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L7c:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L82:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor.A00(X.1Dk, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC40711ue
    public final C1Df ATV(InterfaceC48212Jk interfaceC48212Jk, InterfaceC48192Ji interfaceC48192Ji, C1Dk c1Dk) {
        return this.A00.ATV(interfaceC48212Jk, interfaceC48192Ji, c1Dk);
    }
}
