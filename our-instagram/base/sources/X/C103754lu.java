package X;

/* renamed from: X.4lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103754lu {
    public C103744ls A00;
    public C18920wW A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (X.C103744ls.A00(r0) == X.C05F.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.Boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r8 = this;
            r7 = 0
            r5 = 0
            X.4ls r0 = r8.A00
            if (r0 == 0) goto Lf
            java.lang.Integer r1 = X.C103744ls.A00(r0)
            java.lang.Integer r0 = X.C05F.A00
            r6 = 1
            if (r1 != r0) goto L10
        Lf:
            r6 = 0
        L10:
            boolean r0 = X.C218914p.A08()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.0wW r2 = r8.A01
            java.lang.String r1 = "android_mgeoapi_module_use"
            X.0kM r0 = r2.A00
            X.0Ai r1 = r2.A00(r0, r1)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L79
            java.lang.String r0 = "module_name"
            r1.AAP(r0, r10)
            java.lang.String r0 = "method_name"
            r1.AAP(r0, r11)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "is_app_in_background_no_delay"
            r1.A7v(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)
            java.lang.String r0 = "is_blocked_by_failsafe"
            r1.A7v(r0, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_initiated_by_failsafe"
            r1.A7v(r0, r2)
            java.lang.String r0 = "allow_collection_in_background"
            r1.A7v(r0, r9)
            java.lang.String r0 = "token"
            r1.AAP(r0, r5)
            java.lang.String r0 = "caller_context"
            r1.AAP(r0, r12)
            java.lang.String r0 = "is_app_in_background_with_delay"
            r1.A7v(r0, r4)
            java.lang.String r0 = "delayed_background_grace_period_ms"
            r1.A9K(r0, r3)
            java.lang.String r0 = "location_permission_setting"
            r1.AAP(r0, r13)
            java.lang.String r0 = "detailed_location_permission_setting"
            r1.AAP(r0, r14)
            r1.Cht()
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103754lu.A01(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void A00(Boolean bool, Long l, String str, String str2, String str3, String str4, String str5) {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "android_mgeoapi_module_internal_use");
        if (A00.isSampled()) {
            A00.AAP("moduleName", str);
            A00.AAP("methodName", str2);
            A00.AAP("callerName", str3);
            A00.AAP("locatonProviderAccessType", str4);
            A00.AAP("locationProviderType", str5);
            A00.A7v("isCacheUsedDirectly", bool);
            A00.A9K("locationFreshness", l);
            A00.Cht();
        }
    }
}
