package X;

/* renamed from: X.Ssd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63723Ssd implements InterfaceC65319Thy {
    public final C63361SiK A00;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x003c, code lost:
    
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // X.InterfaceC65319Thy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean AS0(X.C63729Ssj r8, java.io.File r9, java.lang.Object r10) {
        /*
            r7 = this;
            java.io.InputStream r10 = (java.io.InputStream) r10
            java.lang.String r6 = "StreamEncoder"
            X.SiK r5 = r7.A00
            java.lang.Class<byte[]> r1 = byte[].class
            r0 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r4 = r5.A04(r0, r1)
            byte[] r4 = (byte[]) r4
            r3 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L3b
            r2.<init>(r9)     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L3b
        L17:
            int r1 = r10.read(r4)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2d
            r0 = -1
            if (r1 == r0) goto L22
            r2.write(r4, r3, r1)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2d
            goto L17
        L22:
            r2.close()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2d
            r3 = 1
            r2.close()     // Catch: java.io.IOException -> L37
            goto L37
        L2a:
            r0 = move-exception
            r1 = r2
            goto L3e
        L2d:
            r1 = r2
        L2e:
            r0 = 3
            android.util.Log.isLoggable(r6, r0)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L37
            r1.close()     // Catch: java.io.IOException -> L37
        L37:
            r5.A05(r4)
            return r3
        L3b:
            r0 = move-exception
            if (r1 == 0) goto L41
        L3e:
            r1.close()     // Catch: java.io.IOException -> L41
        L41:
            r5.A05(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63723Ssd.AS0(X.Ssj, java.io.File, java.lang.Object):boolean");
    }

    public C63723Ssd(C63361SiK c63361SiK) {
        this.A00 = c63361SiK;
    }
}
