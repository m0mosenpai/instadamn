package X;

/* loaded from: classes11.dex */
public abstract class VMD {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(android.content.Context r4, X.EnumC72397Xck r5, X.C6FH r6) {
        /*
            boolean r1 = r6.CSL()
            r0 = 2132017437(0x7f14011d, float:1.9673152E38)
            if (r1 == 0) goto Lc
            r0 = 2132017436(0x7f14011c, float:1.967315E38)
        Lc:
            android.view.ContextThemeWrapper r3 = new android.view.ContextThemeWrapper
            r3.<init>(r4, r0)
            r2 = 0
            int r0 = r5.A00     // Catch: android.content.res.Resources.NotFoundException -> L24 java.lang.Throwable -> L2c
            r1 = 0
            int[] r0 = new int[]{r0}     // Catch: android.content.res.Resources.NotFoundException -> L24 java.lang.Throwable -> L2c
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r0)     // Catch: android.content.res.Resources.NotFoundException -> L24 java.lang.Throwable -> L2c
            int r0 = r5.A01     // Catch: android.content.res.Resources.NotFoundException -> L24 java.lang.Throwable -> L2c
            int r0 = r2.getColor(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L24 java.lang.Throwable -> L2c
            goto L28
        L24:
            int r0 = r5.A01     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2b
        L28:
            r2.recycle()
        L2b:
            return r0
        L2c:
            r0 = move-exception
            if (r2 == 0) goto L32
            r2.recycle()
        L32:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VMD.A00(android.content.Context, X.Xck, X.6FH):int");
    }
}
