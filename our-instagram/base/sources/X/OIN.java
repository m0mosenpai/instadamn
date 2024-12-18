package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes9.dex */
public final class OIN {
    public final int A00;
    public final QuickPerformanceLogger A01;
    public final String A02;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r8.length() == 0) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.Boolean r6, java.lang.Boolean r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            if (r8 == 0) goto L9
            int r1 = r8.length()
            r0 = 0
            if (r1 != 0) goto La
        L9:
            r0 = 1
        La:
            r4 = 396363964(0x17a008bc, float:1.0341963E-24)
            if (r0 != 0) goto L18
            com.facebook.quicklog.QuickPerformanceLogger r2 = r5.A01
            int r1 = r5.A00
            java.lang.String r0 = "error"
            r2.markerAnnotate(r4, r1, r0, r8)
        L18:
            if (r9 == 0) goto L29
            int r0 = r9.length()
            if (r0 == 0) goto L29
            com.facebook.quicklog.QuickPerformanceLogger r2 = r5.A01
            int r1 = r5.A00
            java.lang.String r0 = "server_error_message"
            r2.markerAnnotate(r4, r1, r0, r9)
        L29:
            if (r6 == 0) goto L38
            com.facebook.quicklog.QuickPerformanceLogger r3 = r5.A01
            int r2 = r5.A00
            boolean r1 = r6.booleanValue()
            java.lang.String r0 = "is_retryable"
            r3.markerAnnotate(r4, r2, r0, r1)
        L38:
            if (r7 == 0) goto L47
            com.facebook.quicklog.QuickPerformanceLogger r3 = r5.A01
            int r2 = r5.A00
            boolean r1 = r7.booleanValue()
            java.lang.String r0 = "is_prohibited"
            r3.markerAnnotate(r4, r2, r0, r1)
        L47:
            com.facebook.quicklog.QuickPerformanceLogger r2 = r5.A01
            int r1 = r5.A00
            r0 = 3
            r2.markerEnd(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OIN.A00(java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    public /* synthetic */ OIN(String str) {
        int A01 = MSW.A01();
        C14360o3.A0B(str, 2);
        this.A02 = str;
        this.A00 = A01;
        this.A01 = AbstractC43592JPx.A0N();
    }
}
