package X;

/* renamed from: X.Rst, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class AbstractC61738Rst {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r1.endsWith(".facebook.com") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(android.webkit.WebResourceRequest r6, X.InterfaceC65614To5 r7) {
        /*
            r2 = 1
            X.C14360o3.A0B(r6, r2)
            java.lang.String r5 = r6.getMethod()
            android.net.Uri r0 = r6.getUrl()
            java.lang.String r1 = r0.getHost()
            java.lang.String r4 = r0.getPath()
            r3 = 0
            if (r1 == 0) goto L49
            if (r4 == 0) goto L49
            java.lang.String r0 = "GET"
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 == 0) goto L49
            java.lang.String r0 = "facebook.com"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L38
            java.lang.String r1 = X.AbstractC167007dF.A0h(r1)
            java.lang.String r0 = ".facebook.com"
            X.C14360o3.A0B(r0, r2)
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L49
        L38:
            java.lang.String r0 = "/tr"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L48
            java.lang.String r0 = "/tr/"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L49
        L48:
            r3 = 1
        L49:
            r4 = 0
            if (r3 == 0) goto L75
            android.net.Uri r0 = r6.getUrl()
            java.lang.String r3 = X.AbstractC166987dD.A19(r0)
            java.lang.String r0 = "?fbc="
            boolean r0 = X.AbstractC001900j.A0a(r3, r0, r4)
            if (r0 != 0) goto L72
            java.lang.String r0 = "&fbc="
            boolean r0 = X.AbstractC001900j.A0a(r3, r0, r4)
            if (r0 != 0) goto L72
            org.apache.http.client.methods.HttpGet r0 = new org.apache.http.client.methods.HttpGet     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6a
            return r2
        L6a:
            r2 = move-exception
            java.lang.String r1 = "IPixelRequestBuffer"
            java.lang.String r0 = "Url invalid to buffer"
            X.C0K8.A0F(r1, r0, r2)
        L72:
            r7.maybeCallTrListeners(r3)
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61738Rst.A00(android.webkit.WebResourceRequest, X.To5):boolean");
    }
}
