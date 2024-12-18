package X;

import java.util.List;

/* renamed from: X.0mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13570mj {
    public static final List A00 = AbstractC16960so.A1N(".jpg", ".jpeg");

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r2 == 1296891946) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(java.io.File r5) {
        /*
            r4 = 0
            X.C14360o3.A0B(r5, r4)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L29
            r0.<init>(r5)     // Catch: java.io.IOException -> L29
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.io.IOException -> L29
            r3.<init>(r0)     // Catch: java.io.IOException -> L29
            int r2 = r3.readInt()     // Catch: java.lang.Throwable -> L22
            r0 = 1229531648(0x49492a00, float:823968.0)
            if (r2 == r0) goto L1d
            r1 = 1296891946(0x4d4d002a, float:2.1495875E8)
            r0 = 0
            if (r2 != r1) goto L1e
        L1d:
            r0 = 1
        L1e:
            r3.close()     // Catch: java.io.IOException -> L29
            return r0
        L22:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L24
        L24:
            r0 = move-exception
            X.C20I.A00(r3, r1)     // Catch: java.io.IOException -> L29
            throw r0     // Catch: java.io.IOException -> L29
        L29:
            r5.getPath()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC13570mj.A01(java.io.File):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r1 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(java.lang.String r4) {
        /*
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.lang.String r3 = r0.getName()
            r2 = 46
            int r1 = r3.lastIndexOf(r2)
            r0 = -1
            if (r1 != r0) goto L2b
            java.lang.String r1 = ""
        L18:
            int r0 = r1.length()
            if (r0 == 0) goto L22
            java.lang.String r4 = X.AnonymousClass001.A0D(r1, r2)
        L22:
            java.net.FileNameMap r0 = java.net.URLConnection.getFileNameMap()
            java.lang.String r0 = r0.getContentTypeFor(r4)
            return r0
        L2b:
            int r0 = r1 + 1
            java.lang.String r1 = r3.substring(r0)
            if (r1 == 0) goto L22
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC13570mj.A00(java.lang.String):java.lang.String");
    }
}
