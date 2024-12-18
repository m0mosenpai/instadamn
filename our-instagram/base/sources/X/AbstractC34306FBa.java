package X;

/* renamed from: X.FBa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34306FBa {
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        if (r3 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.common.session.UserSession r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            r14 = r22
            r13 = 0
            r12 = 1
            r1 = r15
            com.instagram.user.model.User r15 = X.AbstractC166987dD.A10(r15)
            r0 = 0
            X.0wW r2 = X.AbstractC12220kQ.A01(r0, r1)
            java.lang.String r1 = "commerce_buyer_ui_events"
            X.0Ai r11 = X.AbstractC166987dD.A0f(r2, r1)
            java.lang.String r10 = ""
            r2 = r18
            if (r18 == 0) goto L1b
            goto L1d
        L1b:
            r1 = r10
            goto L26
        L1d:
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L2b
            X.C14360o3.A08(r1)     // Catch: java.lang.IllegalArgumentException -> L2b
            java.lang.String r1 = X.AbstractC166997dE.A10(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L2b
        L26:
            X.Eqr r9 = X.EnumC33456Eqr.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2b
            goto L2d
        L2b:
            X.Eqr r9 = X.EnumC33456Eqr.UNKNOWN
        L2d:
            java.util.HashMap r8 = X.AbstractC166987dD.A1G()
            java.lang.String r7 = ","
            r2 = r21
            if (r21 == 0) goto L7f
            java.lang.String[] r1 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            r6 = 0
            java.util.List r1 = X.AbstractC001900j.A0R(r2, r1, r13)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            java.lang.String[] r5 = X.AbstractC31173DnH.A1b(r1, r13)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r5 == 0) goto L7f
            int r4 = r5.length     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
        L47:
            if (r6 >= r4) goto L7f
            r2 = r5[r6]     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            java.lang.String r1 = ":"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            java.util.List r1 = X.AbstractC001900j.A0R(r2, r1, r13)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            java.lang.String[] r3 = X.AbstractC31173DnH.A1b(r1, r13)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r3 == 0) goto L62
            int r1 = r3.length     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r13 >= r1) goto L62
            r2 = r3[r13]     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r2 != 0) goto L65
        L62:
            r2 = r10
            if (r3 == 0) goto L6c
        L65:
            int r1 = r3.length     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r12 >= r1) goto L6c
            r1 = r3[r12]     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r1 != 0) goto L6d
        L6c:
            r1 = r10
        L6d:
            boolean r3 = r2.equals(r10)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r3 != 0) goto L7c
            boolean r3 = r1.equals(r10)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r3 != 0) goto L7c
            r8.put(r2, r1)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
        L7c:
            int r6 = r6 + 1
            goto L47
        L7f:
            java.lang.String r1 = "deeplink_destination"
            if (r22 != 0) goto L84
            r14 = r10
        L84:
            r8.put(r1, r14)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            java.lang.String r1 = "deeplink_destination_params"
            if (r23 == 0) goto L8d
            r10 = r23
        L8d:
            r8.put(r1, r10)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            goto L93
        L91:
            r0 = move-exception
            throw r0
        L93:
            java.lang.String r1 = "flow_name"
            r2 = r17
            r11.AAP(r1, r2)
            java.lang.String r2 = "entry"
            java.lang.String r1 = "flow_step"
            r11.AAP(r1, r2)
            java.lang.String r1 = "invoice_id"
            r2 = r19
            r11.AAP(r1, r2)
            r1 = r20
            if (r20 == 0) goto Lb0
            java.util.List r0 = X.AbstractC167007dF.A0m(r1, r7, r13)
        Lb0:
            java.lang.String r1 = "order_item_ids"
            r11.AAk(r1, r0)
            java.lang.String r0 = "referrer_surface"
            r11.A8R(r9, r0)
            java.lang.String r0 = "session"
            r1 = r16
            r11.AAP(r0, r1)
            java.lang.String r0 = r15.getId()
            java.lang.Long r1 = X.AbstractC166997dE.A0j(r0)
            java.lang.String r0 = "user_id"
            r11.A9K(r0, r1)
            r0 = 905(0x389, float:1.268E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            r11.A9M(r0, r8)
            if (r24 == 0) goto Le2
            java.lang.String r0 = "succeed"
        Ldb:
            X.AbstractC31171DnF.A1B(r11, r0)
            r11.Cht()
            return
        Le2:
            java.lang.String r0 = "fail"
            goto Ldb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34306FBa.A00(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
