package X;

/* renamed from: X.2Am, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46262Am {
    public String A00;
    public String A01;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005c, code lost:
    
        if (r4 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.util.List r6) {
        /*
            r5 = this;
            r4 = 0
            java.lang.String r2 = r5.A00     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            if (r0 != 0) goto L11
            r1.mkdirs()     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
        L11:
            java.lang.String r0 = r5.A01     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            if (r0 != 0) goto L21
            r1.createNewFile()     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
        L21:
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L50 java.lang.Throwable -> L5b
            java.util.Iterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4f
        L2f:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4f
            if (r0 == 0) goto L45
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4f
            java.lang.String r0 = "\n"
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4f
            r3.write(r0)     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4f
            goto L2f
        L45:
            r3.flush()     // Catch: java.lang.Throwable -> L4c java.lang.Throwable -> L4f
            r3.close()     // Catch: java.io.IOException -> L58
            return
        L4c:
            r1 = move-exception
            r4 = r3
            goto L5e
        L4f:
            r4 = r3
        L50:
            com.facebook.http.historical.NetworkInfoMap r0 = com.facebook.http.historical.NetworkInfoMap.A07     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L5a
            r4.close()     // Catch: java.io.IOException -> L58
            return
        L58:
            com.facebook.http.historical.NetworkInfoMap r0 = com.facebook.http.historical.NetworkInfoMap.A07
        L5a:
            return
        L5b:
            r1 = move-exception
            if (r4 == 0) goto L64
        L5e:
            r4.close()     // Catch: java.io.IOException -> L62
            throw r1
        L62:
            com.facebook.http.historical.NetworkInfoMap r0 = com.facebook.http.historical.NetworkInfoMap.A07
        L64:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46262Am.A00(java.util.List):void");
    }
}
