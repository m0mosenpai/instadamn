package X;

/* renamed from: X.0QN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QN extends AbstractC03210De {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r2 == null) goto L20;
     */
    @Override // X.AbstractC03210De
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(android.content.Context r4, byte[] r5) {
        /*
            r3 = this;
            java.io.File r0 = r3.A00
            X.AbstractC05810Sj.A00(r0)
            boolean r1 = r0.exists()
            r0 = 1
            if (r1 == 0) goto L4c
            android.content.res.AssetManager r2 = r4.getAssets()
            java.lang.String r1 = r3.A02
            r0 = 2
            java.io.InputStream r2 = r2.open(r1, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            byte[] r1 = X.C03220Df.A02(r2, r5, r0)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L23
            r2.close()
        L23:
            java.io.File r0 = r3.A00
            X.AbstractC05810Sj.A00(r0)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            int r0 = r1.length     // Catch: java.lang.Throwable -> L3e
            int r0 = r0 + 1
            byte[] r0 = X.C03220Df.A02(r2, r5, r0)     // Catch: java.lang.Throwable -> L3e
            r2.close()
            boolean r0 = java.util.Arrays.equals(r1, r0)
            r0 = r0 ^ 1
            return r0
        L3e:
            r1 = move-exception
            goto L43
        L40:
            r1 = move-exception
            if (r2 == 0) goto L4b
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L47
            throw r1
        L47:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)
        L4b:
            throw r1
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QN.A02(android.content.Context, byte[]):boolean");
    }
}
