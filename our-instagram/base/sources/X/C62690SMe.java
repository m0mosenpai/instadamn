package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.SMe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62690SMe {
    public Context A00;
    public SIH A01;
    public C1TT A02;
    public String A03;
    public HashMap A05 = AbstractC166987dD.A1G();
    public HashMap A04 = AbstractC166987dD.A1G();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r1 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r1.A00 < r8) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00(int r8) {
        /*
            r7 = this;
            java.lang.String r2 = r7.A03
            if (r2 != 0) goto L4e
            X.1TT r0 = r7.A02
            X.1SI r1 = r0.A00
            if (r1 == 0) goto L13
            boolean r0 = r1.A05
            if (r0 == 0) goto L13
            int r1 = r1.A00
            r0 = 1
            if (r1 >= r8) goto L14
        L13:
            r0 = 0
        L14:
            r2 = 0
            if (r0 == 0) goto L4e
            android.content.Context r0 = r7.A00
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r1 = X.S9L.A01     // Catch: java.lang.Throwable -> L40 java.lang.SecurityException -> L48
            r6 = 1273245501(0x4be42f3d, float:2.9908602E7)
            r3 = r2
            r4 = r2
            r5 = r2
            android.database.Cursor r1 = X.C0fI.A01(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L40 java.lang.SecurityException -> L48
            if (r1 == 0) goto L4e
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3e java.lang.SecurityException -> L49
            if (r0 == 0) goto L4b
            java.lang.String r0 = "attribution_json"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L3e java.lang.SecurityException -> L49
            if (r0 < 0) goto L4b
            java.lang.String r2 = r1.getString(r0)     // Catch: java.lang.Throwable -> L3e java.lang.SecurityException -> L49
            goto L4b
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = move-exception
            r1 = r2
        L42:
            if (r1 == 0) goto L47
            r1.close()
        L47:
            throw r0
        L48:
            r1 = r2
        L49:
            if (r1 == 0) goto L4e
        L4b:
            r1.close()
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62690SMe.A00(int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02fd, code lost:
    
        if (r0 != null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02c3, code lost:
    
        if (r7 != null) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C62690SMe(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62690SMe.<init>(android.content.Context):void");
    }
}
