package X;

import java.io.File;

/* renamed from: X.0dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09310dg {
    public final String[] A01 = new String[5];
    public int A00 = 0;

    public final synchronized void A00(StringBuilder sb) {
        String str;
        sb.append("Previously recorded ");
        int i = this.A00;
        sb.append(i);
        sb.append(" base apk paths.");
        if (i > 0) {
            sb.append(" Most recent ones:");
        }
        int i2 = 0;
        while (true) {
            String[] strArr = this.A01;
            if (i2 < 5) {
                int i3 = (this.A00 - i2) - 1;
                if (i3 >= 0) {
                    String str2 = strArr[i3 % 5];
                    sb.append("\n");
                    sb.append(str2);
                    sb.append(" (");
                    if (new File(str2).exists()) {
                        str = "exists";
                    } else {
                        str = "does not exist";
                    }
                    sb.append(str);
                    sb.append(")");
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r2 = new java.lang.StringBuilder("Recording new base apk path: ");
        r2.append(r6);
        r2.append("\n");
        A00(r2);
        android.util.Log.w("SoLoader", r2.toString());
        r1 = r5.A00;
        r4[r1 % 5] = r6;
        r2 = true;
        r5.A00 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A01(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String[] r4 = r5.A01     // Catch: java.lang.Throwable -> L3a
            r3 = 5
            r2 = 0
            r1 = 0
        L6:
            r0 = r4[r1]     // Catch: java.lang.Throwable -> L3a
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L38
            int r1 = r1 + 1
            if (r1 < r3) goto L6
            java.lang.String r0 = "Recording new base apk path: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3a
            r2.append(r6)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch: java.lang.Throwable -> L3a
            r5.A00(r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = "SoLoader"
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3a
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L3a
            int r1 = r5.A00     // Catch: java.lang.Throwable -> L3a
            int r0 = r1 % r3
            r4[r0] = r6     // Catch: java.lang.Throwable -> L3a
            r2 = 1
            int r0 = r1 + 1
            r5.A00 = r0     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r5)
            return r2
        L3a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09310dg.A01(java.lang.String):boolean");
    }
}
