package X;

/* loaded from: classes10.dex */
public final /* synthetic */ class SL4 {
    public final /* synthetic */ C58883QEt A00;
    public final /* synthetic */ QF6 A01;

    public /* synthetic */ SL4(C58883QEt c58883QEt, QF6 qf6) {
        this.A00 = c58883QEt;
        this.A01 = qf6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r15 = this;
            X.QEt r1 = r15.A00
            X.QF6 r3 = r15.A01
            android.content.Context r5 = r1.A00
            X.5G6 r0 = r1.A0Y
            X.Sam r0 = r0.A02
            com.facebook.quicklog.QuickPerformanceLogger r7 = r0.A01
            X.SKK r0 = r1.A0Z
            X.0f6 r6 = r0.A00
            r13 = 2
            boolean r8 = X.AbstractC167007dF.A1R(r13, r6, r5)
            java.lang.String r9 = X.AbstractC53593Nn0.A00
            int r0 = r9.length()
            if (r0 != 0) goto Leb
            java.lang.String r12 = "empty_content_read_from_file"
            java.lang.String r14 = ""
            java.util.UUID r0 = X.C0HM.A00()
            int r4 = r0.hashCode()
            r2 = 646459195(0x26882f3b, float:9.449698E-16)
            r7.markerStart(r2, r4)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            java.lang.String r11 = "file_name"
            r0 = 140(0x8c, float:1.96E-43)
            java.lang.String r0 = X.MSV.A00(r0)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            r7.markerAnnotate(r2, r4, r11, r0)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            java.lang.String r1 = "js_name"
            java.lang.String r10 = "autofill_contact_enhanced"
            r7.markerAnnotate(r2, r4, r1, r10)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            java.io.FileInputStream r9 = r5.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            X.C14360o3.A0A(r9)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            java.nio.charset.Charset r1 = X.C15W.A05     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            r5.<init>(r9, r1)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            java.lang.String r9 = X.AbstractC38581qm.A00(r5)     // Catch: java.lang.Throwable -> L7a
            r5.close()     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            int r1 = r9.length()     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            if (r1 != 0) goto L76
            r7.markerPoint(r2, r4, r12)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            r1 = 3
            r7.markerEnd(r2, r4, r1)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            r1 = 646456808(0x268825e8, float:9.44717E-16)
            X.0f5 r5 = r6.AEp(r12, r1)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            java.lang.String r1 = "script_name"
            r5.ABW(r1, r10)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            r5.ABW(r11, r0)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            r5.report()     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            goto Le3
        L76:
            r7.markerEnd(r2, r4, r13)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            goto Le3
        L7a:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r0 = move-exception
            X.C20I.A00(r5, r1)     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
            throw r0     // Catch: java.io.FileNotFoundException -> L81 java.lang.Exception -> La4
        L81:
            r5 = move-exception
            java.lang.String r1 = "file_not_found_exception "
            java.lang.String r0 = r5.getMessage()
            if (r0 != 0) goto L8b
            r0 = r14
        L8b:
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            X.C14360o3.A0B(r0, r8)
            r7.markerPoint(r2, r4, r0)
            r0 = 3
            r7.markerEnd(r2, r4, r0)
            java.lang.String r4 = "autofill_contact_enhanced"
            r0 = 140(0x8c, float:1.96E-43)
            java.lang.String r2 = X.MSV.A00(r0)
            java.lang.String r1 = "file_not_found_exception"
            goto Lcb
        La4:
            r5 = move-exception
            java.lang.String r1 = "unknown error "
            java.lang.String r0 = r5.getMessage()
            if (r0 != 0) goto Laf
            r0 = r14
        Laf:
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            X.C14360o3.A0B(r0, r8)
            r7.markerPoint(r2, r4, r0)
            r0 = 3
            r7.markerEnd(r2, r4, r0)
            java.lang.String r4 = "autofill_contact_enhanced"
            r0 = 140(0x8c, float:1.96E-43)
            java.lang.String r2 = X.MSV.A00(r0)
            r0 = 54
            java.lang.String r1 = X.AbstractC43591JPw.A00(r0)
        Lcb:
            r0 = 646456808(0x268825e8, float:9.44717E-16)
            X.0f5 r1 = r6.AEp(r1, r0)
            r1.ERI(r5)
            java.lang.String r0 = "script_name"
            r1.ABW(r0, r4)
            java.lang.String r0 = "file_name"
            r1.ABW(r0, r2)
            r1.report()
            r9 = r14
        Le3:
            int r0 = r9.length()
            if (r0 == 0) goto Leb
            X.AbstractC53593Nn0.A00 = r9
        Leb:
            r3.A0G(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SL4.A00():void");
    }
}
