package com.instagram.preferences.common.async;

import X.InterfaceC19960yQ;

/* loaded from: classes2.dex */
public final class AsyncKeyValueStoreWrapper$getLong$$inlined$map$1$2 implements InterfaceC19960yQ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC19960yQ A02;

    public AsyncKeyValueStoreWrapper$getLong$$inlined$map$1$2(String str, InterfaceC19960yQ interfaceC19960yQ, long j) {
        this.A02 = interfaceC19960yQ;
        this.A01 = str;
        this.A00 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 34
            boolean r0 = X.C9CX.A00(r9, r3)
            if (r0 == 0) goto L51
            r6 = r9
            X.9CX r6 = (X.C9CX) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L57
            X.AbstractC09560e7.A00(r1)
        L24:
            X.0eB r5 = X.C0eB.A00
            return r5
        L27:
            X.AbstractC09560e7.A00(r1)
            X.0yQ r3 = r7.A02
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r0 = r7.A01
            java.lang.Object r1 = r8.get(r0)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L4e
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L4e
            long r1 = r1.longValue()
        L40:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r6.A00 = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L24
            return r5
        L4e:
            long r1 = r7.A00
            goto L40
        L51:
            X.9CX r6 = new X.9CX
            r6.<init>(r7, r9, r3)
            goto L16
        L57:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.preferences.common.async.AsyncKeyValueStoreWrapper$getLong$$inlined$map$1$2.emit(java.lang.Object, X.1Ds):java.lang.Object");
    }
}
