package X;

/* renamed from: X.Rsx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61742Rsx {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r6.A01.isEmpty() != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(X.SFB r6, java.lang.String r7) {
        /*
            if (r6 == 0) goto Laa
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto Lf
            java.util.List r0 = r6.A01
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto Laa
            r4 = 0
            android.net.Uri r4 = X.AbstractC08820cl.A03(r7)     // Catch: java.lang.SecurityException -> L18
            goto L24
        L18:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "IABStickyUTMParamsDecorator"
            java.lang.String r0 = "URL parsing throw security exception: %s"
            X.AbstractC63254SgB.A01(r1, r0, r2)
        L24:
            if (r4 == 0) goto Laa
            java.lang.String r1 = r6.A00
            if (r1 != 0) goto L76
            r2 = 0
        L2b:
            java.lang.String r1 = r4.getAuthority()
            if (r1 != 0) goto L6f
            r0 = 0
        L32:
            boolean r0 = X.C2I7.A00(r2, r0)
            if (r0 == 0) goto Laa
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = r4.getScheme()
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = r4.getAuthority()
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = r4.getPath()
            android.net.Uri$Builder r5 = r1.path(r0)
            java.util.Set r0 = r4.getQueryParameterNames()
            java.util.Iterator r2 = r0.iterator()
        L5d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7d
            java.lang.String r1 = X.AbstractC166987dD.A1B(r2)
            java.lang.String r0 = r4.getQueryParameter(r1)
            r5.appendQueryParameter(r1, r0)
            goto L5d
        L6f:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            goto L32
        L76:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r1.toLowerCase(r0)
            goto L2b
        L7d:
            java.util.List r0 = r6.A01
            java.util.Iterator r3 = r0.iterator()
        L83:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r2 = r3.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r0 = r2.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r4.getQueryParameter(r0)
            if (r0 != 0) goto L83
            java.lang.Object r1 = r2.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r2.second
            java.lang.String r0 = (java.lang.String) r0
            r5.appendQueryParameter(r1, r0)
            goto L83
        La5:
            java.lang.String r0 = X.AbstractC58319PtB.A0q(r5)
            return r0
        Laa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61742Rsx.A00(X.SFB, java.lang.String):java.lang.String");
    }
}
