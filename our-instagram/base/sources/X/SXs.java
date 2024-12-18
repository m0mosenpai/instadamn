package X;

import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes10.dex */
public final class SXs {
    public final ConcurrentHashMap A00 = AbstractC58318PtA.A14();
    public static final C62442SBv A02 = new C62442SBv("LibraryVersion", "");
    public static final SXs A01 = new SXs();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r8 = "Failed to get app version for libraryName: "
            java.lang.String r6 = "LibraryVersion"
            java.lang.String r0 = "Please provide a valid libraryName"
            X.C3U5.A06(r11, r0)
            java.util.concurrent.ConcurrentHashMap r5 = r10.A00
            boolean r0 = r5.containsKey(r11)
            if (r0 == 0) goto L16
            java.lang.String r0 = X.AbstractC31171DnF.A0h(r11, r5)
            return r0
        L16:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r4 = 0
            java.lang.String r1 = "/%s.properties"
            java.lang.Object[] r0 = new java.lang.Object[]{r11}     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L8a
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L8a
            java.lang.Class<X.SXs> r0 = X.SXs.class
            java.io.InputStream r7 = r0.getResourceAsStream(r1)     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L8a
            if (r7 == 0) goto L3d
            r2.load(r7)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            java.lang.String r0 = "version"
            java.lang.String r4 = r2.getProperty(r0, r4)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            r0 = 2
            android.util.Log.isLoggable(r6, r0)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            goto L79
        L3d:
            X.SBv r2 = X.SXs.A02     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            java.lang.String r1 = X.AnonymousClass001.A0R(r8, r11)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r6, r0)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            if (r0 == 0) goto L79
            java.lang.String r0 = r2.A00     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            if (r0 == 0) goto L52
            java.lang.String r1 = r0.concat(r1)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
        L52:
            android.util.Log.w(r6, r1)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L59
            goto L79
        L56:
            r0 = move-exception
            r4 = r7
            goto L8b
        L59:
            r3 = move-exception
            r9 = r4
            r4 = r7
            goto L5f
        L5d:
            r3 = move-exception
            r9 = r4
        L5f:
            X.SBv r2 = X.SXs.A02     // Catch: java.lang.Throwable -> L8a
            java.lang.String r1 = X.AnonymousClass001.A0R(r8, r11)     // Catch: java.lang.Throwable -> L8a
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r6, r0)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L77
            java.lang.String r0 = r2.A00     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L74
            java.lang.String r1 = r0.concat(r1)     // Catch: java.lang.Throwable -> L8a
        L74:
            android.util.Log.e(r6, r1, r3)     // Catch: java.lang.Throwable -> L8a
        L77:
            r7 = r4
            r4 = r9
        L79:
            if (r7 == 0) goto L7e
            r7.close()     // Catch: java.io.IOException -> L7e
        L7e:
            if (r4 != 0) goto L86
            r0 = 3
            android.util.Log.isLoggable(r6, r0)
            java.lang.String r4 = "UNKNOWN"
        L86:
            r5.put(r11, r4)
            return r4
        L8a:
            r0 = move-exception
        L8b:
            if (r4 == 0) goto L90
            r4.close()     // Catch: java.io.IOException -> L90
        L90:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SXs.A00(java.lang.String):java.lang.String");
    }
}
