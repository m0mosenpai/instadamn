package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.15a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC220015a {
    public static final FileFilter A00 = new FileFilter() { // from class: X.15b
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:44:0x003a, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.String r6) {
        /*
            android.os.StrictMode$ThreadPolicy r5 = android.os.StrictMode.allowThreadDiskReads()
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L4a
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L4a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L4d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L4d
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L4e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L4e
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            if (r1 == 0) goto L2e
            java.lang.String r0 = "0-[\\d]+$"
            boolean r0 = r1.matches(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            if (r0 == 0) goto L2e
            r0 = 2
            java.lang.String r0 = r1.substring(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            int r0 = r0 + 1
            goto L5c
        L2e:
            r0 = -1
            goto L5c
        L30:
            r0 = move-exception
            goto L3d
        L32:
            r1 = r2
            goto L4e
        L34:
            r0 = move-exception
            goto L40
        L36:
            r0 = move-exception
            goto L3a
        L38:
            r0 = move-exception
            r4 = r1
        L3a:
            if (r4 == 0) goto L46
            goto L43
        L3d:
            r2.close()     // Catch: java.io.IOException -> L46
        L40:
            r3.close()     // Catch: java.io.IOException -> L46
        L43:
            r4.close()     // Catch: java.io.IOException -> L46
        L46:
            android.os.StrictMode.setThreadPolicy(r5)
            throw r0
        L4a:
            r3 = r1
            r4 = r1
            goto L4e
        L4d:
            r3 = r1
        L4e:
            r0 = -1
            if (r1 == 0) goto L54
            r1.close()     // Catch: java.io.IOException -> L65
        L54:
            if (r3 == 0) goto L59
            r3.close()     // Catch: java.io.IOException -> L65
        L59:
            if (r4 == 0) goto L65
            goto L62
        L5c:
            r2.close()     // Catch: java.io.IOException -> L65
            r3.close()     // Catch: java.io.IOException -> L65
        L62:
            r4.close()     // Catch: java.io.IOException -> L65
        L65:
            android.os.StrictMode.setThreadPolicy(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC220015a.A00(java.lang.String):int");
    }
}
