package X;

import java.io.File;

/* renamed from: X.SbR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63047SbR {
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        throw X.MSY.A0X("ZIP input flows into path traversal sink. The generated file doesn't start with ", r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(java.io.InputStream r11, java.lang.String r12) {
        /*
            r10 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> Lc5
            r3.<init>(r11)     // Catch: java.lang.Throwable -> Lc5
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lc8
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r0 = ""
            A01(r12, r0)     // Catch: java.lang.Throwable -> Lc2
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> Lc2
            r6 = 0
            r9 = 0
        L16:
            java.util.zip.ZipEntry r1 = r3.getNextEntry()     // Catch: java.lang.Throwable -> Lc2
            if (r1 == 0) goto Lbb
            java.lang.String r8 = r1.getName()     // Catch: java.lang.Throwable -> Lc2
            X.C14360o3.A0A(r8)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = ".."
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r2)     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = X.AbstractC001900j.A0a(r8, r0, r6)     // Catch: java.lang.Throwable -> Lc2
            if (r0 != 0) goto Lac
            boolean r0 = r1.isDirectory()     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L3b
            A01(r12, r8)     // Catch: java.lang.Throwable -> Lc2
            goto L16
        L3b:
            X.C14360o3.A08(r2)     // Catch: java.lang.Throwable -> Lc2
            X.C14360o3.A0B(r8, r6)     // Catch: java.lang.Throwable -> Lc2
            int r0 = r8.length()     // Catch: java.lang.Throwable -> Lc2
            int r0 = r0 + (-1)
            int r0 = X.AbstractC001900j.A07(r8, r2, r0)     // Catch: java.lang.Throwable -> Lc2
            r5 = -1
            if (r0 == r5) goto L5d
            java.lang.String r0 = X.AbstractC25227BEk.A0w(r8, r6, r0)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = X.AnonymousClass001.A0g(r12, r2, r0)     // Catch: java.lang.Throwable -> Lc2
            java.io.File r0 = X.AbstractC166987dD.A11(r0)     // Catch: java.lang.Throwable -> Lc2
            r0.mkdirs()     // Catch: java.lang.Throwable -> Lc2
        L5d:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lc2
            r0.<init>(r12, r8)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = X.MSX.A0i(r0)     // Catch: java.lang.Throwable -> Lc2
            java.io.File r0 = X.AbstractC166987dD.A11(r12)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = X.MSX.A0i(r0)     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto Lb4
            java.lang.String r0 = X.AnonymousClass001.A0g(r12, r2, r8)     // Catch: java.lang.Throwable -> La0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La0
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L9e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9e
        L82:
            int r0 = r4.read(r7)     // Catch: java.lang.Throwable -> L9b
            if (r0 == r5) goto L8d
            r1.write(r7, r6, r0)     // Catch: java.lang.Throwable -> L9b
            int r9 = r9 + r0
            goto L82
        L8d:
            r1.flush()     // Catch: java.lang.Throwable -> L9b
            r3.closeEntry()     // Catch: java.lang.Throwable -> Lc2
            X.AbstractC61744Rsz.A00(r1)     // Catch: java.lang.Throwable -> Lc2
            X.AbstractC61744Rsz.A00(r2)     // Catch: java.lang.Throwable -> Lc2
            goto L16
        L9b:
            r0 = move-exception
            r10 = r1
            goto La2
        L9e:
            r0 = move-exception
            goto La2
        La0:
            r0 = move-exception
            r2 = r10
        La2:
            r3.closeEntry()     // Catch: java.lang.Throwable -> Lc2
            X.AbstractC61744Rsz.A00(r10)     // Catch: java.lang.Throwable -> Lc2
            X.AbstractC61744Rsz.A00(r2)     // Catch: java.lang.Throwable -> Lc2
            goto Lba
        Lac:
            java.lang.String r0 = "zipEntryName contains ../"
            java.io.IOException r0 = X.MSW.A0y(r0)     // Catch: java.lang.Throwable -> Lc2
            goto Lba
        Lb4:
            java.lang.String r0 = "ZIP input flows into path traversal sink. The generated file doesn't start with "
            java.io.IOException r0 = X.MSY.A0X(r0, r12)     // Catch: java.lang.Throwable -> Lc2
        Lba:
            throw r0     // Catch: java.lang.Throwable -> Lc2
        Lbb:
            X.AbstractC61744Rsz.A00(r4)
            X.AbstractC61744Rsz.A00(r3)
            return r9
        Lc2:
            r0 = move-exception
            r10 = r4
            goto Lc9
        Lc5:
            r0 = move-exception
            r3 = r10
            goto Lc9
        Lc8:
            r0 = move-exception
        Lc9:
            X.AbstractC61744Rsz.A00(r10)
            X.AbstractC61744Rsz.A00(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63047SbR.A00(java.io.InputStream, java.lang.String):int");
    }

    public static final void A01(String str, String str2) {
        File A11 = AbstractC166987dD.A11(AnonymousClass001.A0g(str, File.separator, str2));
        if (!A11.isDirectory()) {
            A11.mkdirs();
        }
    }
}
