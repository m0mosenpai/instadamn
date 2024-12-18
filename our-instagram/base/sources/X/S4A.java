package X;

/* loaded from: classes10.dex */
public abstract class S4A {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (X.AbstractC001900j.A0T(r13) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C6FQ r16, X.C6FW r17) {
        /*
            r3 = 1
            r0 = 0
            r1 = r17
            java.util.List r2 = r1.A00
            java.lang.Object r1 = r2.get(r0)
            X.C14360o3.A07(r1)
            X.4kP r1 = (X.C102884kP) r1
            X.4lE r8 = X.AbstractC25228BEl.A0t(r2, r3)
            r0 = 2
            X.4lE r9 = X.AbstractC25228BEl.A0t(r2, r0)
            r0 = 3
            X.4lE r10 = X.AbstractC25228BEl.A0t(r2, r0)
            java.lang.String r13 = r1.A0G()
            java.lang.String r12 = r1.A0E()
            if (r13 == 0) goto L2e
            boolean r1 = X.AbstractC001900j.A0T(r13)
            r0 = 0
            if (r1 == 0) goto L2f
        L2e:
            r0 = 1
        L2f:
            r1 = 0
            if (r0 != 0) goto Lb8
            if (r12 == 0) goto Lb8
            boolean r0 = X.AbstractC001900j.A0T(r12)
            if (r0 != 0) goto Lb8
            r7 = r16
            X.0ll r3 = X.C6BQ.A0B(r7)
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto Lb8
            if (r3 == 0) goto Lb8
            r0 = 32
            X.J8V r2 = new X.J8V
            r2.<init>(r3, r0)
            java.lang.Class<X.Sed> r0 = X.C63178Sed.class
            java.lang.Object r11 = r3.A01(r0, r2)
            X.Sed r11 = (X.C63178Sed) r11
            monitor-enter(r11)
            r0 = 1
            X.C14360o3.A0B(r13, r0)     // Catch: java.lang.Throwable -> Lb5
            X.6FG r0 = r7.A03     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto Lb3
            android.content.Context r0 = r0.A00     // Catch: java.lang.Throwable -> Lb5
            android.content.Context r5 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> Lb5
            if (r5 == 0) goto Lb3
            X.SJV r6 = new X.SJV     // Catch: java.lang.Throwable -> Lb5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lb5
            X.0JO r0 = r11.A01     // Catch: java.lang.Throwable -> Lb5
            long r2 = r0.now()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lb5
            java.util.Map r0 = r11.A03     // Catch: java.lang.Throwable -> Lb5
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> Lb5
            X.SJV r4 = (X.SJV) r4     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto Lb3
            com.facebook.secure.securewebview.SecureWebView r12 = new com.facebook.secure.securewebview.SecureWebView     // Catch: java.lang.Throwable -> Lb5
            r12.<init>(r5)     // Catch: java.lang.Throwable -> Lb5
            X.R7Q r0 = new X.R7Q     // Catch: java.lang.Throwable -> Lb5
            r0.<init>(r11, r2)     // Catch: java.lang.Throwable -> Lb5
            r12.A02(r0)     // Catch: java.lang.Throwable -> Lb5
            X.SaE r0 = new X.SaE     // Catch: java.lang.Throwable -> Lb5
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5
            r0.A02()     // Catch: java.lang.Throwable -> Lb5
            X.SNx r0 = r0.A01()     // Catch: java.lang.Throwable -> Lb5
            r12.A01 = r0     // Catch: java.lang.Throwable -> Lb5
            com.instagram.common.session.UserSession r0 = r11.A02     // Catch: java.lang.Throwable -> Lb5
            X.AbstractC62806SSa.A01(r12, r0, r1)     // Catch: java.lang.Throwable -> Lb5
            r4.A03 = r12     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r13 = r4.A0A     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r14 = r4.A0B     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r15 = "text/html"
            java.lang.String r16 = "utf-8"
            r17 = r1
            r12.loadDataWithBaseURL(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lb5
        Lb3:
            monitor-exit(r11)
            return r1
        Lb5:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S4A.A00(X.6FQ, X.6FW):java.lang.Object");
    }
}
