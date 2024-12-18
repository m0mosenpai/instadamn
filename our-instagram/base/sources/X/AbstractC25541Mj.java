package X;

/* renamed from: X.1Mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25541Mj {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.File A00(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            r2 = 0
            if (r5 == 0) goto L20
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            java.io.File r0 = r3.getExternalCacheDir()     // Catch: java.lang.NullPointerException -> L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 != 0) goto L27
        L20:
            java.io.File r0 = r3.getCacheDir()
            if (r0 != 0) goto L27
            return r2
        L27:
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25541Mj.A00(android.content.Context, java.lang.String, boolean):java.io.File");
    }
}
