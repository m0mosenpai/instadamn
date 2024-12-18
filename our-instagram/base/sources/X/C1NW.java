package X;

/* renamed from: X.1NW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NW implements C14O {
    public static final C1NW A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (r4.endsWith(r0) != false) goto L28;
     */
    @Override // X.C14O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E43(X.C1QW r7, java.lang.String r8) {
        /*
            r6 = this;
            r3 = 1
            if (r8 == 0) goto L44
            int r0 = r8.length()
            if (r0 == 0) goto L44
            java.net.URI r0 = r7.A09
            java.lang.String r4 = r0.getHost()
            r5 = 0
            if (r4 == 0) goto L34
            int r0 = r4.length()
            if (r0 == 0) goto L34
            java.lang.String r0 = "ak.instagram.com"
            boolean r0 = r4.endsWith(r0)
            if (r0 == 0) goto L4f
            X.9s0 r2 = X.EnumC222599s0.A02
        L22:
            X.9s0 r0 = X.EnumC222599s0.A02
            if (r2 != r0) goto L45
            java.lang.String r0 = "Pragma"
            java.lang.String r1 = "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-get-client-ip"
        L2a:
            r7.A01(r0, r1)
            java.lang.String r1 = "Cdn"
            java.util.Map r0 = r7.A0A
            r0.put(r1, r2)
        L34:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "InstagramTraceEnabled"
            java.util.Map r1 = r7.A0A
            r1.put(r0, r2)
            java.lang.String r0 = "InstagramTraceToken"
            r1.put(r0, r8)
        L44:
            return
        L45:
            java.lang.String r0 = "X-FB-Debug"
            java.lang.String r1 = "True"
            r7.A01(r0, r1)
            java.lang.String r0 = "X-FB-Origin-Debug"
            goto L2a
        L4f:
            java.lang.String[] r2 = X.CML.A00
            r0 = r2[r5]
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L81
            r1 = 46
            r0 = r2[r5]
            java.lang.String r0 = X.AnonymousClass001.A0D(r0, r1)
            X.C14360o3.A0B(r0, r3)
            boolean r0 = r4.endsWith(r0)
            if (r0 != 0) goto L81
            r0 = r2[r3]
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L81
            r0 = r2[r3]
            java.lang.String r0 = X.AnonymousClass001.A0D(r0, r1)
            X.C14360o3.A0B(r0, r3)
            boolean r0 = r4.endsWith(r0)
            if (r0 == 0) goto L34
        L81:
            X.9s0 r2 = X.EnumC222599s0.A03
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1NW.E43(X.1QW, java.lang.String):void");
    }
}
