package com.facebook.msys.mci;

import X.C53882dS;

/* loaded from: classes.dex */
public class AppContainerDirectoryPath {
    public static native void setAppContainerDirectoryPath(String str);

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000a, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isMCPEnabledForTamStorageDirectoryPath() {
        /*
            java.lang.Class<X.1EJ> r2 = X.C1EJ.class
            monitor-enter(r2)
            X.1EI r0 = X.C1EJ.A00     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lc
            boolean r1 = r0.A00     // Catch: java.lang.Throwable -> Lf
            r0 = 1
            if (r1 != 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.AppContainerDirectoryPath.isMCPEnabledForTamStorageDirectoryPath():boolean");
    }

    static {
        C53882dS.A00();
    }
}
