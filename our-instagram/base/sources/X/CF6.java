package X;

/* loaded from: classes5.dex */
public abstract class CF6 {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6FQ r18, X.C6FW r19) {
        /*
            r5 = r18
            X.6FG r0 = r5.A03
            if (r0 != 0) goto L11
            java.lang.ref.WeakReference r0 = r5.A0C
            r4 = 0
            java.lang.Object r0 = r0.get()
            X.6FG r0 = (X.C6FG) r0
            if (r0 == 0) goto L13
        L11:
            android.content.Context r4 = r0.A00
        L13:
            r10 = 0
            if (r4 != 0) goto L17
            return r10
        L17:
            X.6FG r0 = X.C6BQ.A09(r5)
            X.0ll r8 = X.C6BQ.A0A(r0)
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.AbstractC28057CYl.A01(r8)
            androidx.fragment.app.FragmentActivity r7 = X.C6BQ.A04(r5)
            r3 = 0
            r0 = r19
            java.util.List r0 = r0.A00
            java.lang.Object r6 = r0.get(r3)
            X.4kP r6 = (X.C102884kP) r6
            if (r6 == 0) goto L3f
            r6.A0P()
            java.lang.String r1 = r6.A0E()
            if (r1 == 0) goto L40
            goto L42
        L3f:
            r6 = r10
        L40:
            java.lang.String r1 = "memu_in_feed"
        L42:
            X.C14360o3.A0A(r1)     // Catch: java.lang.IllegalArgumentException -> L50
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.IllegalArgumentException -> L50
            java.lang.String r0 = X.AbstractC166997dE.A10(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L50
            X.C8k r9 = X.C8k.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L50
            goto L5a
        L50:
            r2 = move-exception
            java.lang.String r1 = "BKBloksActionMifuOpenMemuOnboardingImpl"
            java.lang.String r0 = "Invalid entry point passed. Defaulting to MEMU_IN_FEED."
            X.C0K8.A0F(r1, r0, r2)
            X.C8k r9 = X.C8k.MEMU_IN_FEED
        L5a:
            if (r6 == 0) goto L8d
            java.lang.String r2 = r6.A0I()
        L60:
            X.CUd r1 = new X.CUd
            r1.<init>(r7, r8)
            java.lang.String r12 = X.AbstractC25231BEo.A0p()
            if (r2 == 0) goto L8a
            java.lang.String r0 = "ig_mifu_ifysession_id"
            java.util.Map r16 = X.AbstractC167007dF.A0n(r0, r2)
        L71:
            java.lang.Integer r11 = X.C05F.A00
            X.CWL r8 = new X.CWL
            r13 = r10
            r14 = r10
            r15 = r10
            r18 = r3
            r19 = r3
            r17 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.PJz r0 = new X.PJz
            r0.<init>(r3, r4, r5)
            r1.A01(r8, r0)
            return r10
        L8a:
            r16 = r10
            goto L71
        L8d:
            r2 = r10
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CF6.A00(X.6FQ, X.6FW):java.lang.Object");
    }
}
