package com.instagram.criticalpath;

import X.C12L;
import X.C24711Io;
import X.InterfaceC19960yQ;

/* loaded from: classes.dex */
public final class AppStartQueue$1$2 implements InterfaceC19960yQ {
    public final /* synthetic */ C12L A00;
    public final /* synthetic */ C24711Io A01;

    public AppStartQueue$1$2(C12L c12l, C24711Io c24711Io) {
        this.A01 = c24711Io;
        this.A00 = c12l;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC19960yQ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(X.AbstractRunnableC14200nk r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 31
            boolean r0 = X.C9CY.A00(r9, r3)
            if (r0 == 0) goto L5a
            r6 = r9
            X.9CY r6 = (X.C9CY) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L60
            java.lang.Object r0 = r6.A01
            com.instagram.criticalpath.AppStartQueue$1$2 r0 = (com.instagram.criticalpath.AppStartQueue$1$2) r0
            X.AbstractC09560e7.A00(r1)
        L28:
            X.1Io r0 = r0.A01
            X.C24711Io.A00(r0)
            X.0eB r5 = X.C0eB.A00
        L2f:
            return r5
        L30:
            X.AbstractC09560e7.A00(r1)
            X.12L r3 = r7.A00
            boolean r2 = r8.isSendToNetworkThreadPool
            int r1 = r8.runnableId
            int r0 = r8.priority
            if (r2 == 0) goto L55
            X.0nZ r3 = r3.CPG(r1, r0)
        L41:
            r2 = 0
            r1 = 21
            X.9Ct r0 = new X.9Ct
            r0.<init>(r8, r2, r1)
            r6.A01 = r7
            r6.A00 = r4
            java.lang.Object r0 = X.AbstractC23641Du.A00(r6, r3, r0)
            if (r0 == r5) goto L2f
            r0 = r7
            goto L28
        L55:
            X.0nZ r3 = r3.AOT(r1, r0)
            goto L41
        L5a:
            X.9CY r6 = new X.9CY
            r6.<init>(r7, r9, r3)
            goto L16
        L60:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.criticalpath.AppStartQueue$1$2.emit(X.0nk, X.1Ds):java.lang.Object");
    }
}
