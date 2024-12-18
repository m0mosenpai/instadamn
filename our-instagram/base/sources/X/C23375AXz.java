package X;

/* renamed from: X.AXz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23375AXz implements InterfaceC48192Ji {
    public final /* synthetic */ AA6 A00;

    public C23375AXz(AA6 aa6) {
        this.A00 = aa6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x005e, code lost:
    
        if (r5 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0059, code lost:
    
        if (r5 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[Catch: JSONException -> 0x00b9, TryCatch #0 {JSONException -> 0x00b9, blocks: (B:21:0x0064, B:23:0x0068, B:24:0x006d, B:26:0x0071, B:27:0x0079, B:29:0x0097, B:31:0x00a8, B:32:0x00b1, B:34:0x00b5), top: B:20:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[Catch: JSONException -> 0x00b9, TryCatch #0 {JSONException -> 0x00b9, blocks: (B:21:0x0064, B:23:0x0068, B:24:0x006d, B:26:0x0071, B:27:0x0079, B:29:0x0097, B:31:0x00a8, B:32:0x00b1, B:34:0x00b5), top: B:20:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[Catch: JSONException -> 0x00b9, TryCatch #0 {JSONException -> 0x00b9, blocks: (B:21:0x0064, B:23:0x0068, B:24:0x006d, B:26:0x0071, B:27:0x0079, B:29:0x0097, B:31:0x00a8, B:32:0x00b1, B:34:0x00b5), top: B:20:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[Catch: JSONException -> 0x00b9, TryCatch #0 {JSONException -> 0x00b9, blocks: (B:21:0x0064, B:23:0x0068, B:24:0x006d, B:26:0x0071, B:27:0x0079, B:29:0x0097, B:31:0x00a8, B:32:0x00b1, B:34:0x00b5), top: B:20:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC48192Ji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.AnonymousClass436 r8) {
        /*
            r7 = this;
            if (r8 == 0) goto Lc0
            java.lang.Object r5 = r8.Bos()
            X.2JS r5 = (X.C2JS) r5
            r4 = 1
            if (r5 == 0) goto L57
            java.lang.Class<X.9cp> r3 = X.C213289cp.class
            r2 = 0
            java.lang.String r1 = "fx_waffle_wfs_and_nta_eligibility"
            r0 = -435543782(0xffffffffe60a211a, float:-1.630743E23)
            X.2JS r1 = r5.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L57
            java.lang.String r0 = "eligible_for_waffle_wfs"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
            if (r0 != r4) goto L57
            X.9s6 r6 = X.EnumC222659s6.A02
        L23:
            java.lang.Class<X.9cp> r2 = X.C213289cp.class
            java.lang.String r1 = "fx_waffle_wfs_and_nta_eligibility"
            r0 = -435543782(0xffffffffe60a211a, float:-1.630743E23)
            X.2JS r1 = r5.A03(r2, r1, r0)
            if (r1 == 0) goto L5c
            java.lang.String r0 = "eligible_for_waffle_nta"
            boolean r0 = r1.getCoercedBooleanField(r4, r0)
            if (r0 != r4) goto L5c
            X.9s6 r3 = X.EnumC222659s6.A02
        L3a:
            java.lang.Class<X.9cp> r2 = X.C213289cp.class
            java.lang.String r1 = "fx_waffle_wfs_and_nta_eligibility"
            r0 = -435543782(0xffffffffe60a211a, float:-1.630743E23)
            X.2JS r2 = r5.A03(r2, r1, r0)
            if (r2 == 0) goto L61
            r1 = 2
            java.lang.String r0 = "super_eligible_for_waffle_nta"
            boolean r0 = r2.getCoercedBooleanField(r1, r0)
            if (r0 != r4) goto L61
            X.9s6 r1 = X.EnumC222659s6.A02
        L52:
            X.AA6 r5 = r7.A00
            java.lang.String r4 = "FXIGAccessLibrarySSOAndRegFlagAppJob"
            goto L64
        L57:
            X.9s6 r6 = X.EnumC222659s6.A03
            if (r5 == 0) goto L5c
            goto L23
        L5c:
            X.9s6 r3 = X.EnumC222659s6.A03
            if (r5 == 0) goto L61
            goto L3a
        L61:
            X.9s6 r1 = X.EnumC222659s6.A03
            goto L52
        L64:
            boolean r0 = r5.A06     // Catch: org.json.JSONException -> Lb9
            if (r0 != 0) goto L6d
            org.json.JSONObject r0 = r5.A04     // Catch: org.json.JSONException -> Lb9
            X.C2054197m.A02(r6, r0)     // Catch: org.json.JSONException -> Lb9
        L6d:
            boolean r0 = r5.A05     // Catch: org.json.JSONException -> Lb9
            if (r0 != 0) goto L79
            org.json.JSONObject r0 = r5.A04     // Catch: org.json.JSONException -> Lb9
            X.C2054197m.A00(r3, r0)     // Catch: org.json.JSONException -> Lb9
            X.C2054197m.A01(r1, r0)     // Catch: org.json.JSONException -> Lb9
        L79:
            org.json.JSONObject r3 = r5.A04     // Catch: org.json.JSONException -> Lb9
            java.lang.String r2 = "timestamp"
            long r0 = r5.A00     // Catch: org.json.JSONException -> Lb9
            r3.put(r2, r0)     // Catch: org.json.JSONException -> Lb9
            X.1UM r0 = r5.A01     // Catch: org.json.JSONException -> Lb9
            X.1ZT r2 = r0.AR9()     // Catch: org.json.JSONException -> Lb9
            java.lang.String r1 = "sso_settings_v2"
            java.lang.String r0 = r3.toString()     // Catch: org.json.JSONException -> Lb9
            r2.A09(r1, r0)     // Catch: org.json.JSONException -> Lb9
            boolean r0 = r2.A0B()     // Catch: org.json.JSONException -> Lb9
            if (r0 == 0) goto Lb1
            X.97m r0 = r5.A02     // Catch: org.json.JSONException -> Lb9
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch: org.json.JSONException -> Lb9
            X.0Tz r2 = X.C06090Tz.A05     // Catch: org.json.JSONException -> Lb9
            r0 = 36324870589592104(0x810d4700013228, double:3.0353326571470276E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)     // Catch: org.json.JSONException -> Lb9
            if (r0 == 0) goto Lb1
            X.0vz r0 = r3.deviceSession     // Catch: org.json.JSONException -> Lb9
            android.content.Context r0 = r0.A06()     // Catch: org.json.JSONException -> Lb9
            X.C23130AMj.A05(r0)     // Catch: org.json.JSONException -> Lb9
        Lb1:
            X.BD7 r0 = r5.A03     // Catch: org.json.JSONException -> Lb9
            if (r0 == 0) goto Lbf
            r0.onSuccess()     // Catch: org.json.JSONException -> Lb9
            return
        Lb9:
            r1 = move-exception
            java.lang.String r0 = "Failed saving sso settings"
            X.C0K8.A0F(r4, r0, r1)
        Lbf:
            return
        Lc0:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23375AXz.invoke(X.436):void");
    }
}
