package X;

/* loaded from: classes10.dex */
public final class SMR {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public SMR(String str, String str2, String str3, String str4, boolean z) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A04 = z;
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00() {
        /*
            r11 = this;
            java.lang.String r7 = r11.A03
            boolean r0 = r11.A04
            java.lang.String r3 = r11.A00
            java.lang.String r2 = r11.A01
            java.lang.String r1 = r11.A02
            r6 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            java.util.ArrayList r5 = X.AbstractC16960so.A1N(r0)
            if (r2 == 0) goto L1c
            r5.add(r2)
        L1c:
            if (r1 == 0) goto L21
            r5.add(r1)
        L21:
            java.util.HashSet r0 = X.S8U.A00
            boolean r0 = r0.contains(r7)
            r10 = 0
            if (r0 == 0) goto La2
            java.lang.StringBuilder r4 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "%s("
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r7)
            r4.append(r0)
            r3 = 0
            java.util.Iterator r9 = r5.iterator()
        L3c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r7 = r9.next()
            int r8 = r3 + 1
            if (r3 >= 0) goto L52
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L52:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L72
            X.SeG r1 = X.C63159SeG.A00
            java.lang.String r7 = (java.lang.String) r7
            X.C14360o3.A0B(r7, r6)
            org.json.JSONObject r0 = X.AbstractC58318PtA.A17(r7)     // Catch: org.json.JSONException -> L82
            java.lang.Object r0 = r1.A01(r0)     // Catch: org.json.JSONException -> L82
            java.lang.String r2 = r0.toString()     // Catch: org.json.JSONException -> L82
            java.lang.String r1 = "\\\\"
            java.lang.String r0 = "\\"
            java.lang.String r7 = X.AbstractC002300n.A0d(r2, r1, r0, r6)     // Catch: org.json.JSONException -> L82
            goto L86
        L72:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 == 0) goto L79
            java.lang.String r0 = "%d"
            goto L88
        L79:
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L80
            java.lang.String r0 = "%b"
            goto L88
        L80:
            r0 = 0
            goto L8c
        L82:
            java.lang.String r7 = X.C63159SeG.A00(r7, r6)
        L86:
            java.lang.String r0 = "'%s'"
        L88:
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r7)
        L8c:
            if (r0 == 0) goto La2
            r4.append(r0)
            int r0 = X.AbstractC58318PtA.A08(r5)
            if (r3 >= r0) goto L9a
            X.AbstractC58318PtA.A1S(r4)
        L9a:
            r3 = r8
            goto L3c
        L9c:
            java.lang.String r0 = ");"
            java.lang.String r10 = X.AbstractC166997dE.A0x(r0, r4)
        La2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SMR.A00():java.lang.String");
    }
}
