package X;

/* renamed from: X.8ma, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196448ma {
    public static final Object A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0039, code lost:
    
        r7 = r6.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(android.content.Context r9) {
        /*
            java.lang.Object r8 = X.AbstractC196448ma.A00
            monitor-enter(r8)
            java.lang.String r7 = ""
            java.lang.String r4 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r3 = r9.openFileInput(r4)     // Catch: java.io.FileNotFoundException -> L5f java.lang.Throwable -> L61
            org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L58
            java.lang.String r0 = "UTF-8"
            r6.setInput(r3, r0)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L58
            int r5 = r6.getDepth()     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L58
        L18:
            int r2 = r6.next()     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L58
            r0 = 1
            if (r2 == r0) goto L48
            r1 = 3
            if (r2 != r1) goto L28
            int r0 = r6.getDepth()     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L58
            if (r0 <= r5) goto L48
        L28:
            if (r2 == r1) goto L18
            r0 = 4
            if (r2 == r0) goto L18
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L58
            java.lang.String r0 = "locales"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L58
            if (r0 == 0) goto L18
            r1 = 0
            java.lang.String r0 = "application_locales"
            java.lang.String r7 = r6.getAttributeValue(r1, r0)     // Catch: java.lang.Throwable -> L41 java.lang.Throwable -> L58
            goto L48
        L41:
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r0 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L58
        L48:
            if (r3 == 0) goto L4d
            r3.close()     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L61
        L4d:
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L56
            r9.deleteFile(r4)     // Catch: java.lang.Throwable -> L61
        L56:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            return r7
        L58:
            r0 = move-exception
            if (r3 == 0) goto L5e
            r3.close()     // Catch: java.io.IOException -> L5e java.lang.Throwable -> L61
        L5e:
            throw r0     // Catch: java.lang.Throwable -> L61
        L5f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            return r7
        L61:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC196448ma.A00(android.content.Context):java.lang.String");
    }
}
