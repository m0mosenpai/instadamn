package X;

/* loaded from: classes10.dex */
public final class SLT {
    public final long A00;
    public final String A01;
    public final String A02;

    public SLT(long j, String str, String str2) {
        C14360o3.A0B(str, 2);
        this.A00 = j;
        this.A01 = str;
        this.A02 = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void postMessage(java.lang.String r11) {
        /*
            r10 = this;
            r6 = 0
            X.C14360o3.A0B(r11, r6)
            org.json.JSONObject r9 = X.AbstractC58318PtA.A17(r11)     // Catch: org.json.JSONException -> Lc2
            java.lang.String r7 = "messageCode"
            java.lang.String r0 = "UNKNOWN_ERROR"
            java.lang.String r5 = r9.optString(r7, r0)
            X.SfN r4 = X.C63217SfN.A06
            if (r4 == 0) goto L5c
            if (r5 == 0) goto L20
            int r0 = r5.hashCode()
            java.lang.String r8 = "url"
            switch(r0) {
                case -1747592519: goto La4;
                case -1694626987: goto L81;
                case -1546851156: goto L68;
                case -256569643: goto L5d;
                default: goto L20;
            }
        L20:
            X.0e4 r5 = X.AbstractC166987dD.A1L(r7, r5)
            boolean r0 = r4.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_organic"
            X.0e4 r3 = X.AbstractC166987dD.A1L(r0, r1)
            X.SFa r0 = r4.A03
            long r0 = r0.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "token_expiry_time"
            X.0e4 r2 = X.AbstractC166987dD.A1L(r0, r1)
            java.lang.String r1 = r10.A02
            java.lang.String r0 = "media_id"
            X.0e4 r0 = X.AbstractC166987dD.A1L(r0, r1)
            X.0e4[] r0 = new X.C09530e4[]{r5, r3, r2, r0}
            java.util.HashMap r5 = X.AbstractC06930Yk.A02(r0)
            X.ShB r0 = X.C63305ShB.A00()
            long r1 = r10.A00
            java.lang.String r4 = r10.A01
            java.lang.String r3 = "JS_MESSAGE_RECEIVED"
            r0.A04(r1, r3, r4, r5)
        L5c:
            return
        L5d:
            java.lang.String r0 = "AUTHENTICATE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r3 = "BWP_START_LOGIN"
            goto L8b
        L68:
            java.lang.String r0 = "CLOSE_VIEW"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r3 = "BWP_RETURN_TO_FEED"
            X.ShB r2 = X.C63305ShB.A00()
            java.lang.String r0 = ""
            X.QDZ r1 = new X.QDZ
            r1.<init>(r2, r3, r0)
            X.C63305ShB.A02(r1, r2, r6)
            goto La0
        L81:
            java.lang.String r0 = "REFRESH_TOKEN"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r3 = "BWP_REFRESH_TOKEN"
        L8b:
            X.ShB r2 = X.C63305ShB.A00()
            java.lang.String r1 = ""
            X.QDZ r0 = new X.QDZ
            r0.<init>(r2, r3, r1)
            X.C63305ShB.A02(r0, r2, r6)
            java.lang.String r0 = r9.optString(r8, r1)
            if (r0 != 0) goto La0
            r0 = r1
        La0:
            X.C63217SfN.A07 = r0
            goto L20
        La4:
            java.lang.String r0 = "OPEN_EXTERNAL_LINK"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r0 = ""
            java.lang.String r3 = r9.optString(r8, r0)
            X.ShB r2 = X.C63305ShB.A00()
            java.lang.String r1 = "BWP_OPEN_EXTERNAL_LINK"
            X.QDZ r0 = new X.QDZ
            r0.<init>(r2, r1, r3)
            X.C63305ShB.A02(r0, r2, r6)
            goto L20
        Lc2:
            java.lang.String r2 = "BwPMessageHandler"
            java.lang.Object[] r1 = new java.lang.Object[]{r11}
            java.lang.String r0 = "Ill formatted message %s"
            X.AbstractC63254SgB.A02(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SLT.postMessage(java.lang.String):void");
    }
}
