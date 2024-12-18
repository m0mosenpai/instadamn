package com.instagram.preferences.common.async;

import X.C56494P6k;
import X.InterfaceC19960yQ;

/* loaded from: classes9.dex */
public final class NuxDisabledAsyncKeyValueStore$getBoolean$$inlined$map$1$2 implements InterfaceC19960yQ {
    public final /* synthetic */ C56494P6k A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC19960yQ A02;
    public final /* synthetic */ boolean A03;

    public NuxDisabledAsyncKeyValueStore$getBoolean$$inlined$map$1$2(C56494P6k c56494P6k, String str, InterfaceC19960yQ interfaceC19960yQ, boolean z) {
        this.A02 = interfaceC19960yQ;
        this.A00 = c56494P6k;
        this.A01 = str;
        this.A03 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 38
            boolean r0 = X.PX5.A02(r9, r3)
            if (r0 == 0) goto L66
            r6 = r9
            X.PX5 r6 = (X.PX5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L6c
            X.AbstractC09560e7.A00(r1)
        L24:
            X.0eB r5 = X.C0eB.A00
            return r5
        L27:
            X.AbstractC09560e7.A00(r1)
            X.0yQ r3 = r7.A02
            java.util.Map r8 = (java.util.Map) r8
            X.P6k r0 = r7.A00
            java.util.Map r2 = r0.A01
            java.lang.String r1 = r7.A01
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L56
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C14360o3.A0C(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L45:
            boolean r0 = r1.booleanValue()
        L49:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A00 = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L24
            return r5
        L56:
            java.lang.Object r1 = r8.get(r1)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L63
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L63
            goto L45
        L63:
            boolean r0 = r7.A03
            goto L49
        L66:
            X.PX5 r6 = new X.PX5
            r6.<init>(r7, r9, r3)
            goto L16
        L6c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.preferences.common.async.NuxDisabledAsyncKeyValueStore$getBoolean$$inlined$map$1$2.emit(java.lang.Object, X.1Ds):java.lang.Object");
    }
}
