package X;

/* renamed from: X.RtT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61773RtT {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        if (r2 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(android.content.Context r3, X.EnumC72413Xd9 r4) {
        /*
            r2 = 0
            r1 = 0
            int r0 = r4.A00     // Catch: android.content.res.Resources.NotFoundException -> L13 java.lang.Throwable -> L1b
            int[] r0 = new int[]{r0}     // Catch: android.content.res.Resources.NotFoundException -> L13 java.lang.Throwable -> L1b
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r0)     // Catch: android.content.res.Resources.NotFoundException -> L13 java.lang.Throwable -> L1b
            int r0 = r4.A01     // Catch: android.content.res.Resources.NotFoundException -> L13 java.lang.Throwable -> L1b
            int r0 = r2.getColor(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L13 java.lang.Throwable -> L1b
            goto L17
        L13:
            int r0 = r4.A01     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1a
        L17:
            r2.recycle()
        L1a:
            return r0
        L1b:
            r0 = move-exception
            if (r2 == 0) goto L21
            r2.recycle()
        L21:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61773RtT.A00(android.content.Context, X.Xd9):int");
    }
}
