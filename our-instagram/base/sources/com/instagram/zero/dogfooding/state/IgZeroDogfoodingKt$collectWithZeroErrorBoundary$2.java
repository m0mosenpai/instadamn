package com.instagram.zero.dogfooding.state;

import X.InterfaceC19960yQ;

/* loaded from: classes4.dex */
public final class IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2 implements InterfaceC19960yQ {
    public final /* synthetic */ String A00;
    public final /* synthetic */ InterfaceC19960yQ A01;

    public IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2(String str, InterfaceC19960yQ interfaceC19960yQ) {
        this.A01 = interfaceC19960yQ;
        this.A00 = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(3:10|11|12)(2:21|22))(4:23|24|25|(1:27))|14|15|16))|32|6|7|(0)(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 9
            boolean r0 = X.C9CZ.A00(r7, r3)
            if (r0 == 0) goto L26
            r4 = r7
            X.9CZ r4 = (X.C9CZ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L32
            java.lang.Object r0 = r4.A01
            com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2 r0 = (com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2) r0
            goto L2c
        L26:
            X.9CZ r4 = new X.9CZ
            r4.<init>(r5, r7, r3)
            goto L16
        L2c:
            X.AbstractC09560e7.A00(r3)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L5d
            goto L5d
        L30:
            r3 = move-exception
            goto L4c
        L32:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L3a:
            X.AbstractC09560e7.A00(r3)
            X.0yQ r0 = r5.A01     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5d
            r4.A01 = r5     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5d
            r4.A00 = r1     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5d
            java.lang.Object r0 = r0.emit(r6, r4)     // Catch: java.lang.Exception -> L4a java.util.concurrent.CancellationException -> L5d
            if (r0 != r2) goto L5d
            return r2
        L4a:
            r3 = move-exception
            r0 = r5
        L4c:
            X.0wb r2 = X.C18950wb.A01
            r1 = 238954923(0xe3e29ab, float:2.343937E-30)
            java.lang.String r0 = r0.A00
            X.0f5 r0 = r2.AEp(r0, r1)
            r0.ERI(r3)
            r0.report()
        L5d:
            X.0eB r0 = X.C0eB.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2.emit(java.lang.Object, X.1Ds):java.lang.Object");
    }
}
