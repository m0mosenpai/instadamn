package X;

/* renamed from: X.RbF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60900RbF extends C1P1 {
    public final /* synthetic */ C54732fW A00;
    public final /* synthetic */ boolean A01;

    public C60900RbF(C54732fW c54732fW, boolean z) {
        this.A00 = c54732fW;
        this.A01 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(243740891);
        if (this.A01) {
            C54732fW.A02(this.A00, r4.A08.C98().A01 * 1000);
        }
        C0f9.A0A(541517758, A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = -308138412(0xffffffffeda22e54, float:-6.2740724E27)
            int r5 = X.C0f9.A03(r0)
            X.435 r12 = (X.AnonymousClass435) r12
            r0 = 45045563(0x2af573b, float:2.5764007E-37)
            int r4 = X.C0f9.A03(r0)
            java.lang.Object r8 = r12.A01
            if (r8 == 0) goto Lbf
            X.42m r8 = (X.AbstractC907342m) r8
            java.lang.Class<X.QHC> r7 = X.QHC.class
            java.lang.String r3 = "viewer"
            X.42m r0 = r8.A00(r7, r3)
            if (r0 == 0) goto Lbf
            X.42m r0 = r8.A00(r7, r3)
            java.lang.Class<X.QHB> r2 = X.QHB.class
            java.lang.String r1 = "zero_cms_native"
            X.42m r0 = r0.A00(r2, r1)
            if (r0 == 0) goto Lbf
            X.2fW r6 = r11.A00
            X.42m r0 = r8.A00(r7, r3)
            X.42m r2 = r0.A00(r2, r1)
            X.1Qx r0 = r6.A08
            X.1R0 r0 = r0.C98()
            int r0 = r0.A00
            r6.A00 = r0
            java.util.Locale r0 = X.C1Q2.A02()
            java.lang.String r0 = r0.toString()
            r6.A04 = r0
            java.lang.String r0 = "hash_code"
            java.lang.String r0 = r2.A05(r0)
            r6.A02 = r0
            java.lang.Class<X.QHA> r1 = X.QHA.class
            java.lang.String r0 = "cms_pairs"
            com.google.common.collect.ImmutableList r0 = r2.A02(r0, r1)
            X.1LA r7 = r0.listIterator()
            java.util.HashMap r3 = X.AbstractC166987dD.A1G()
        L66:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r2 = r7.next()
            X.42m r2 = (X.AbstractC907342m) r2
            java.lang.String r0 = "text_key"
            java.lang.String r1 = r2.A05(r0)
            java.lang.String r0 = "content"
            java.lang.String r0 = r2.A05(r0)
            r3.put(r1, r0)
            goto L66
        L83:
            r6.A05 = r3
            r0 = 0
            X.44S r1 = new X.44S
            r1.<init>(r0)
            java.util.Map r0 = r6.A05     // Catch: X.AnonymousClass400 -> Lca
            java.lang.String r9 = r1.A0F(r0)     // Catch: X.AnonymousClass400 -> Lca
            X.1Ai r8 = r6.A0A     // Catch: X.AnonymousClass400 -> Lca
            int r1 = r6.A00     // Catch: X.AnonymousClass400 -> Lca
            X.0xq r10 = r8.A01     // Catch: X.AnonymousClass400 -> Lca
            X.0xo r0 = r10.ARD()     // Catch: X.AnonymousClass400 -> Lca
            java.lang.String r7 = "cms_client_hash"
            r0.E7D(r7, r1)     // Catch: X.AnonymousClass400 -> Lca
            r0.apply()     // Catch: X.AnonymousClass400 -> Lca
            java.lang.String r3 = r6.A04     // Catch: X.AnonymousClass400 -> Lca
            X.0ry r1 = r8.A8b     // Catch: X.AnonymousClass400 -> Lca
            X.0YR[] r2 = X.C23031Ai.A8c     // Catch: X.AnonymousClass400 -> Lca
            r0 = 179(0xb3, float:2.51E-43)
            r0 = r2[r0]     // Catch: X.AnonymousClass400 -> Lca
            r1.Egi(r8, r3, r0)     // Catch: X.AnonymousClass400 -> Lca
            java.lang.String r0 = r6.A02     // Catch: X.AnonymousClass400 -> Lca
            X.AbstractC31176DnK.A1X(r10, r7, r0)     // Catch: X.AnonymousClass400 -> Lca
            X.0ry r1 = r8.A8a     // Catch: X.AnonymousClass400 -> Lca
            r0 = 180(0xb4, float:2.52E-43)
            r0 = r2[r0]     // Catch: X.AnonymousClass400 -> Lca
            r1.Egi(r8, r9, r0)     // Catch: X.AnonymousClass400 -> Lca
            goto Ld2
        Lbf:
            X.2fW r6 = r11.A00
            java.lang.String r1 = "ZeroCmsAPIUtil"
            java.lang.String r0 = "zero cms native object is null because we haven't changed since last time"
            X.C0w9.A03(r1, r0)
            goto Ld2
        Lca:
            r2 = move-exception
            java.lang.String r1 = "ZeroCmsAPIUtil"
            java.lang.String r0 = "Error while serializing cms data"
            X.C0w9.A06(r1, r0, r2)
        Ld2:
            boolean r0 = r11.A01
            if (r0 == 0) goto Le5
            X.1Qx r0 = r6.A08
            X.1R0 r0 = r0.C98()
            int r0 = r0.A01
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            X.C54732fW.A02(r6, r0)
        Le5:
            r0 = 1651584834(0x62712f42, float:1.11226765E21)
            X.C0f9.A0A(r0, r4)
            r0 = -1694363015(0xffffffff9b021279, float:-1.0759317E-22)
            X.C0f9.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60900RbF.onSuccess(java.lang.Object):void");
    }
}
