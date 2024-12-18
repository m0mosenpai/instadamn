package X;

/* renamed from: X.4PM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PM {
    public static C4PM A04;
    public String A00;
    public String A01;
    public Long A02;
    public Long A03;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0005, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Long A01(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L7
            java.lang.Long r0 = r2.A02     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L11
        L7:
            long r0 = X.C0HN.A00()     // Catch: java.lang.Throwable -> L13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L13
            r2.A02 = r0     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4PM.A01(boolean):java.lang.Long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0005, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Long A02(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L7
            java.lang.Long r0 = r2.A03     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L11
        L7:
            long r0 = X.C0HN.A00()     // Catch: java.lang.Throwable -> L13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L13
            r2.A03 = r0     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r2)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4PM.A02(boolean):java.lang.Long");
    }

    public final String A03(Boolean bool) {
        String str;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            synchronized (this) {
                if (booleanValue) {
                    str = this.A01;
                    if (str == null) {
                        str = C0HM.A00().toString();
                        this.A01 = str;
                    }
                } else {
                    str = this.A00;
                    if (str == null) {
                        str = C0HM.A00().toString();
                        this.A00 = str;
                    }
                }
            }
            return str;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.4PM, java.lang.Object] */
    public static synchronized C4PM A00() {
        C4PM c4pm;
        synchronized (C4PM.class) {
            C4PM c4pm2 = A04;
            c4pm = c4pm2;
            if (c4pm2 == null) {
                ?? obj = new Object();
                A04 = obj;
                c4pm = obj;
            }
        }
        return c4pm;
    }
}
