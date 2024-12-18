package X;

/* loaded from: classes10.dex */
public final class Q6G extends SH5 {
    public final String A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q6G(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            r4 = 0
            java.lang.String r3 = "displayName"
            org.json.JSONObject r1 = X.AbstractC58318PtA.A17(r11)     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = "user"
            org.json.JSONObject r2 = r1.getJSONObject(r0)     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = "name"
            java.lang.String r1 = r2.getString(r0)     // Catch: java.lang.Exception -> L5e
            boolean r0 = r2.isNull(r3)     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L1c
            r0 = r4
            goto L20
        L1c:
            java.lang.String r0 = r2.getString(r3)     // Catch: java.lang.Exception -> L5e
        L20:
            X.C14360o3.A07(r1)     // Catch: java.lang.Exception -> L5e
            X.SFG r7 = new X.SFG     // Catch: java.lang.Exception -> L5e
            r7.<init>(r1, r0, r4)     // Catch: java.lang.Exception -> L5e
            android.os.Bundle r5 = X.AbstractC166987dD.A0b()
            java.lang.String r3 = "androidx.credentials.BUNDLE_KEY_SUBTYPE"
            java.lang.String r2 = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST"
            r5.putString(r3, r2)
            java.lang.String r1 = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON"
            r5.putString(r1, r11)
            java.lang.String r0 = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH"
            r5.putByteArray(r0, r4)
            android.os.Bundle r6 = X.AbstractC31174DnI.A0F(r3, r2)
            r6.putString(r1, r11)
            r6.putByteArray(r0, r4)
            java.lang.String r8 = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"
            r4 = r10
            r9 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A00 = r11
            boolean r0 = X.Rr3.A00(r11)
            if (r0 == 0) goto L57
            return
        L57:
            java.lang.String r0 = "requestJson must not be empty, and must be a valid JSON"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L5e:
            java.lang.String r0 = "user.name must be defined in requestJson"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q6G.<init>(java.lang.String, boolean):void");
    }
}
