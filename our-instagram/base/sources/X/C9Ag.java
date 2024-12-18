package X;

/* renamed from: X.9Ag, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Ag {
    public static final C9Ag A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
    
        r5 = r2.getAttributeValue("http://ns.google.com/photos/1.0/camera/", "MotionPhoto");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(com.instagram.common.session.UserSession r11, java.lang.String r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            X.C14360o3.A0B(r12, r0)
            r7 = 2
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L35
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L35
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L35
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L35
            byte[] r8 = X.C9Ai.A00     // Catch: java.lang.Throwable -> L32
            r6 = 4
            byte[] r5 = new byte[r6]     // Catch: java.lang.Throwable -> L32
            r1 = 4
            long r3 = r9.skip(r1)     // Catch: java.lang.Throwable -> L32
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L32
            int r0 = r9.read(r5)     // Catch: java.lang.Throwable -> L32
            if (r0 != r6) goto L32
            boolean r0 = java.util.Arrays.equals(r8, r5)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L32
            r1 = 0
            return r1
        L32:
            r9.close()     // Catch: java.lang.Throwable -> L35
        L35:
            X.9Aj r6 = X.C206029Aj.A01
            monitor-enter(r6)
            android.util.LruCache r4 = X.C206029Aj.A00     // Catch: java.lang.Throwable -> L8a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r4.get(r3)     // Catch: java.lang.Throwable -> L8a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r6)
            if (r0 == 0) goto L4c
            boolean r1 = r0.booleanValue()
            return r1
        L4c:
            r5 = 0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L7a
            org.xmlpull.v1.XmlPullParser r2 = X.C9Ai.A00(r11, r0)     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L59
            goto L7a
        L59:
            int r1 = r2.next()     // Catch: java.lang.Throwable -> L7a
            r0 = 1
            if (r1 == r0) goto L7a
            int r0 = r2.getEventType()     // Catch: java.lang.Throwable -> L7a
            if (r0 != r7) goto L59
            java.lang.String r1 = "Description"
            java.lang.String r0 = r2.getName()     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L59
            java.lang.String r1 = "http://ns.google.com/photos/1.0/camera/"
            java.lang.String r0 = "MotionPhoto"
            java.lang.String r5 = r2.getAttributeValue(r1, r0)     // Catch: java.lang.Throwable -> L7a
        L7a:
            java.lang.String r0 = "1"
            boolean r1 = r0.equals(r5)
            monitor-enter(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L8a
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r6)
            return r1
        L8a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9Ag.A00(com.instagram.common.session.UserSession, java.lang.String, int):boolean");
    }
}
