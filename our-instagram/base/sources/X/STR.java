package X;

import android.util.TypedValue;

/* loaded from: classes10.dex */
public abstract class STR {
    public static final TypedValue A00 = new TypedValue();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if (r2 > 31) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(android.content.res.TypedArray r4, int r5) {
        /*
            android.util.TypedValue r3 = X.STR.A00
            monitor-enter(r3)
            r4.getValue(r5, r3)     // Catch: java.lang.Throwable -> L14
            int r2 = r3.type     // Catch: java.lang.Throwable -> L14
            r0 = 28
            if (r2 < r0) goto L11
            r1 = 31
            r0 = 1
            if (r2 <= r1) goto L12
        L11:
            r0 = 0
        L12:
            monitor-exit(r3)
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STR.A00(android.content.res.TypedArray, int):boolean");
    }
}
