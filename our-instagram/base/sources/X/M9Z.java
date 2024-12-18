package X;

/* loaded from: classes8.dex */
public final class M9Z implements InterfaceC19960yQ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public M9Z(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto La1;
                case 1: goto L51;
                default: goto L5;
            }
        L5:
            r3 = 41
            boolean r0 = X.PX5.A02(r8, r3)
            if (r0 == 0) goto L2b
            r4 = r8
            X.PX5 r4 = (X.PX5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r4.A00 = r2
        L1b:
            java.lang.Object r1 = r4.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 == r3) goto L7d
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2b:
            X.PX5 r4 = new X.PX5
            r4.<init>(r6, r8, r3)
            goto L1b
        L31:
            X.AbstractC09560e7.A00(r1)
            java.lang.Object r2 = r6.A01
            X.0yQ r2 = (X.InterfaceC19960yQ) r2
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r0 = r6.A03
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L46
            if (r1 != 0) goto L48
        L46:
            java.lang.String r1 = r6.A02
        L48:
            r4.A00 = r3
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r5) goto Lbd
            return r5
        L51:
            r3 = 35
            boolean r0 = X.PX5.A02(r8, r3)
            if (r0 == 0) goto L77
            r4 = r8
            X.PX5 r4 = (X.PX5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r4.A00 = r2
        L67:
            java.lang.Object r1 = r4.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L81
            if (r0 == r3) goto L7d
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L77:
            X.PX5 r4 = new X.PX5
            r4.<init>(r6, r8, r3)
            goto L67
        L7d:
            X.AbstractC09560e7.A00(r1)
            goto Lbd
        L81:
            X.AbstractC09560e7.A00(r1)
            java.lang.Object r2 = r6.A01
            X.0yQ r2 = (X.InterfaceC19960yQ) r2
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r0 = r6.A03
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L96
            if (r1 != 0) goto L98
        L96:
            java.lang.String r1 = r6.A02
        L98:
            r4.A00 = r3
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r5) goto Lbd
            return r5
        La1:
            com.facebook.mantle.ig.IGMantle r7 = (com.facebook.mantle.ig.IGMantle) r7
            java.lang.String r4 = r6.A03
            java.lang.String r1 = r6.A02
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.RegularImmutableMap.A02
            X.C14360o3.A07(r0)
            com.google.common.util.concurrent.ListenableFuture r3 = r7.runMantleWithConfigStr(r4, r1, r0)
            java.lang.Object r2 = r6.A01
            r0 = 1
            X.LWR r1 = new X.LWR
            r1.<init>(r4, r2, r0)
            X.1M8 r0 = X.C1M8.A01
            X.C2OD.A03(r1, r3, r0)
        Lbd:
            X.0eB r5 = X.C0eB.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M9Z.emit(java.lang.Object, X.1Ds):java.lang.Object");
    }
}
