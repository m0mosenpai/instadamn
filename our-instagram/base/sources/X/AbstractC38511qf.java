package X;

/* renamed from: X.1qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38511qf {
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        if (r2 != null) goto L39;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.Closeable, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(java.lang.String r6) {
        /*
            r3 = 0
            int r1 = r6.length()
            r2 = 1
            r0 = 0
            if (r1 <= 0) goto La
            r0 = 1
        La:
            if (r0 == 0) goto L29
            java.lang.String r0 = "falcob64gzj:"
            boolean r0 = r6.startsWith(r0)
            if (r0 == 0) goto L29
            r0 = 12
            java.lang.String r1 = r6.substring(r0)
            X.C14360o3.A07(r1)
            int r0 = r1.length()
            if (r0 == 0) goto L25
            r2 = 0
        L25:
            if (r2 == 0) goto L2a
            java.lang.String r6 = ""
        L29:
            return r6
        L2a:
            byte[] r3 = android.util.Base64.decode(r1, r3)
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> Lb6
            r4.<init>(r3)     // Catch: java.io.IOException -> Lb6
            int r5 = r4.read()     // Catch: java.lang.Throwable -> Laf
            int r1 = r4.read()     // Catch: java.lang.Throwable -> Laf
            r4.reset()     // Catch: java.lang.Throwable -> Laf
            r0 = -1
            if (r1 == r0) goto La5
            if (r5 == r0) goto La5
            int r2 = r1 << 8
            r2 = r2 | r5
            r1 = 35615(0x8b1f, float:4.9907E-41)
            r0 = 0
            if (r2 != r1) goto L4d
            r0 = 1
        L4d:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L71
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> Laf
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Laf
            java.nio.charset.Charset r0 = X.C15W.A05     // Catch: java.lang.Throwable -> La1
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La1
            r2.<init>(r5, r0)     // Catch: java.lang.Throwable -> La1
            boolean r0 = r2 instanceof java.io.BufferedReader     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L64
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch: java.lang.Throwable -> La1
            goto L6a
        L64:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La1
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> La1
            r2 = r0
        L6a:
            java.lang.String r6 = X.AbstractC38581qm.A00(r2)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L93
            goto L90
        L71:
            java.util.zip.InflaterInputStream r5 = new java.util.zip.InflaterInputStream     // Catch: java.lang.Throwable -> Laf
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Laf
            java.nio.charset.Charset r0 = X.C15W.A05     // Catch: java.lang.Throwable -> La1
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La1
            r2.<init>(r5, r0)     // Catch: java.lang.Throwable -> La1
            boolean r0 = r2 instanceof java.io.BufferedReader     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L84
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch: java.lang.Throwable -> La1
            goto L8a
        L84:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La1
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> La1
            r2 = r0
        L8a:
            java.lang.String r6 = X.AbstractC38581qm.A00(r2)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L93
        L90:
            r2.close()     // Catch: java.lang.Throwable -> La1
        L93:
            r5.close()     // Catch: java.lang.Throwable -> Laf
            r4.close()     // Catch: java.io.IOException -> Lb6
            return r6
        L9a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L9c
        L9c:
            r1 = move-exception
            X.C20I.A00(r2, r0)     // Catch: java.lang.Throwable -> La1
            throw r1     // Catch: java.lang.Throwable -> La1
        La1:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> La3
        La3:
            r0 = move-exception
            goto Lab
        La5:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.lang.Throwable -> Laf
            r0.<init>()     // Catch: java.lang.Throwable -> Laf
            goto Lae
        Lab:
            X.C20I.A00(r5, r1)     // Catch: java.lang.Throwable -> Laf
        Lae:
            throw r0     // Catch: java.lang.Throwable -> Laf
        Laf:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r0 = move-exception
            X.C20I.A00(r4, r1)     // Catch: java.io.IOException -> Lb6
            throw r0     // Catch: java.io.IOException -> Lb6
        Lb6:
            X.C14360o3.A0A(r3)
            java.nio.charset.Charset r1 = X.C15W.A05
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC38511qf.A00(java.lang.String):java.lang.String");
    }
}
