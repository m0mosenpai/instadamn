package X;

import java.io.File;

/* renamed from: X.1Uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27411Uu extends File {
    public final C11N A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C27411Uu(X.C11N r4, java.io.File r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.getPath()     // Catch: java.io.IOException -> L66
            boolean r0 = r0.isEmpty()     // Catch: java.io.IOException -> L66
            if (r0 == 0) goto Lf
            java.lang.String r0 = r5.getPath()     // Catch: java.io.IOException -> L66
            goto L13
        Lf:
            java.lang.String r0 = r5.getCanonicalPath()     // Catch: java.io.IOException -> L66
        L13:
            r3.<init>(r0)
            r3.A00 = r4
            if (r6 == 0) goto L45
            java.lang.String r2 = r4.A00
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L39
            boolean r0 = r1.isDirectory()
            if (r0 != 0) goto L45
            java.lang.String r0 = "FileLocationScope should contain a directory path but its path \n%s\n is not."
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r2)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L39:
            java.lang.String r0 = "FileLocationScope's path \n%s\n does not exist."
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r2)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L45:
            X.11N r0 = r3.A00
            java.lang.String r1 = r0.A00     // Catch: java.io.IOException -> L54
            java.lang.String r0 = r3.getCanonicalPath()     // Catch: java.io.IOException -> L54
            boolean r0 = r0.startsWith(r1)     // Catch: java.io.IOException -> L54
            if (r0 == 0) goto L54
            return
        L54:
            java.lang.String r2 = r5.getAbsolutePath()
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "You are operating the StrictFile with the absolute path: \n%s\nHowever, the path does not locate inside the defined location scope: \n%s\n"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r2, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        L66:
            java.lang.String r1 = r5.getAbsolutePath()
            java.lang.String r0 = "StrictFile cannot resolve the file's canonical path. Please make sure the path is legit. The file's absolute path is: \n%s\n"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27411Uu.<init>(X.11N, java.io.File, boolean):void");
    }
}
