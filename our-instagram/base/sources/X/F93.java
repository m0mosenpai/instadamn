package X;

/* loaded from: classes6.dex */
public abstract class F93 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc A[Catch: Exception -> 0x00e3, IOException -> 0x00e9, TryCatch #3 {IOException -> 0x00e9, Exception -> 0x00e3, blocks: (B:3:0x0004, B:5:0x0011, B:8:0x0016, B:10:0x001e, B:12:0x002a, B:14:0x0032, B:16:0x003a, B:18:0x0042, B:20:0x004a, B:22:0x0050, B:23:0x0054, B:25:0x005c, B:27:0x0063, B:29:0x006b, B:32:0x0072, B:34:0x0076, B:37:0x007d, B:39:0x0081, B:41:0x0089, B:42:0x00ac, B:44:0x00bc, B:45:0x00cd, B:47:0x00d3, B:52:0x009a, B:53:0x00aa, B:54:0x0094), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C34636FNt parseFromJson(X.C16L r6) {
        /*
            r1 = 0
            X.C14360o3.A0B(r6, r1)
            X.FNt r5 = new X.FNt     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            r5.<init>()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            X.16R r2 = r6.A11()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            X.16R r0 = X.C16R.A0D     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r2 == r0) goto L16
            r6.A0z()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            goto Le1
        L16:
            X.16R r2 = r6.A1J()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            X.16R r0 = X.C16R.A09     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r2 == r0) goto L7d
            java.lang.String r2 = X.AbstractC166997dE.A0s(r6)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r0 != 0) goto L76
            java.lang.String r0 = "message_on_banner"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r0 != 0) goto L76
            java.lang.String r0 = "type"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r0 != 0) goto L72
            java.lang.String r0 = "notification_type"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r0 != 0) goto L72
            java.lang.String r0 = "in_app_url"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r0 == 0) goto L54
            java.lang.String r0 = X.AbstractC167017dG.A0m(r6)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            r5.A04 = r0     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
        L50:
            r6.A0z()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            goto L16
        L54:
            java.lang.String r0 = "sender"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r0 == 0) goto L63
            com.instagram.user.model.User r0 = X.AbstractC31171DnF.A0S(r6, r1)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            r5.A01 = r0     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            goto L50
        L63:
            java.lang.String r0 = "extra_info"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r0 == 0) goto L50
            java.lang.String r0 = X.AbstractC167017dG.A0m(r6)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            r5.A03 = r0     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            goto L50
        L72:
            X.AbstractC31178DnM.A1I(r6)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            goto L50
        L76:
            java.lang.String r0 = X.AbstractC167017dG.A0m(r6)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            r5.A05 = r0     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            goto L50
        L7d:
            java.lang.String r2 = r5.A03     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r2 == 0) goto L94
            java.lang.String r1 = "\\\""
            java.lang.String r0 = "\""
            java.lang.String r0 = r2.replace(r1, r0)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            X.16L r0 = X.C16V.A00(r0)     // Catch: java.io.IOException -> L9a java.lang.Exception -> Le3 java.io.IOException -> Le9
            X.FGs r0 = X.F94.parseFromJson(r0)     // Catch: java.io.IOException -> L9a java.lang.Exception -> Le3 java.io.IOException -> Le9
            r5.A00 = r0     // Catch: java.io.IOException -> L9a java.lang.Exception -> Le3 java.io.IOException -> Le9
            goto Lac
        L94:
            X.FGs r0 = new X.FGs     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            r0.<init>()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            goto Laa
        L9a:
            java.lang.String r0 = "error parsing extra_info field for json string: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r2)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            java.lang.String r0 = "InAppNotificationEvent"
            X.C0w9.A03(r0, r1)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            X.FGs r0 = new X.FGs     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            r0.<init>()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
        Laa:
            r5.A00 = r0     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
        Lac:
            java.lang.String r1 = "ig://"
            java.lang.String r0 = r5.A04     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            X.0bW r0 = X.C34996FbT.A01     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            android.net.Uri r4 = X.AbstractC08820cl.A01(r0, r1)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r4 == 0) goto Le2
            java.lang.String r0 = r4.getHost()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            r0.getClass()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            r5.A02 = r0     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            java.util.Set r0 = r4.getQueryParameterNames()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
        Lcd:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            if (r0 == 0) goto Le2
            java.lang.String r2 = X.AbstractC166987dD.A1B(r3)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            java.util.Map r1 = r5.A06     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            java.lang.String r0 = r4.getQueryParameter(r2)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            r1.put(r2, r0)     // Catch: java.lang.Exception -> Le3 java.io.IOException -> Le9
            goto Lcd
        Le1:
            r5 = 0
        Le2:
            return r5
        Le3:
            r0 = move-exception
            X.3zu r0 = X.AbstractC166987dD.A0m(r0)
            throw r0
        Le9:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F93.parseFromJson(X.16L):X.FNt");
    }
}
