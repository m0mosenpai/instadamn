package X;

/* loaded from: classes9.dex */
public final class N0Y extends AbstractC07490aO {
    public final C08610cP A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r3 == false) goto L6;
     */
    @Override // X.AbstractC07490aO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(android.content.Context r5, android.content.Intent r6, X.InterfaceC08100bW r7, java.lang.Object r8) {
        /*
            r4 = this;
            r0 = 0
            X.0cP r2 = r4.A00
            java.lang.String r1 = X.AbstractC31173DnH.A0q(r8)
            X.C14360o3.A07(r1)
            X.C14360o3.A0B(r2, r0)
            java.util.List r0 = X.OVP.A01
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L34
            r0 = 0
            boolean r3 = r2.A03(r5, r6, r0)
            if (r3 != 0) goto L33
        L1c:
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r1 = "DirectMessageTrustedAppChecker"
            java.lang.String r0 = "Failed trusted app check: %s"
            X.C0K8.A0P(r1, r0, r2)
            java.lang.String r0 = "Binding intent not handled due to permission check failure"
            X.C0w9.A03(r1, r0)
            if (r7 == 0) goto L33
            java.lang.String r0 = "Failed Stella trusted app check"
            r7.EH9(r0)
        L33:
            return r3
        L34:
            r3 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N0Y.A00(android.content.Context, android.content.Intent, X.0bW, java.lang.Object):boolean");
    }

    public N0Y() {
        C08600cO c08600cO = new C08600cO();
        c08600cO.A05("com.instagram.android.fbpermission.MANAGE_MESSAGING");
        c08600cO.A04("MANAGE_DIRECT_MESSAGING");
        this.A00 = c08600cO.A00();
    }
}
