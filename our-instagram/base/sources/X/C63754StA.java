package X;

/* renamed from: X.StA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63754StA implements InterfaceC65631Tps {
    public static final C62997SaL A01;
    public static final C62997SaL A02;
    public final C63361SiK A00;

    static {
        InterfaceC65320Thz interfaceC65320Thz = C62997SaL.A04;
        A02 = new C62997SaL(interfaceC65320Thz, 90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
        A01 = new C62997SaL(interfaceC65320Thz, null, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        if (r1 == null) goto L27;
     */
    @Override // X.InterfaceC65319Thy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean AS0(X.C63729Ssj r10, java.io.File r11, java.lang.Object r12) {
        /*
            r9 = this;
            X.Tme r12 = (X.InterfaceC65558Tme) r12
            java.lang.String r7 = "BitmapEncoder"
            java.lang.Object r6 = r12.get()
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            X.SaL r5 = X.C63754StA.A01
            java.lang.Object r8 = r10.A00(r5)
            android.graphics.Bitmap$CompressFormat r8 = (android.graphics.Bitmap.CompressFormat) r8
            if (r8 != 0) goto L1c
            boolean r0 = r6.hasAlpha()
            if (r0 == 0) goto L23
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.PNG
        L1c:
            r6.getWidth()
            r6.getHeight()
            goto L26
        L23:
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG
            goto L1c
        L26:
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L76
            X.SaL r0 = X.C63754StA.A02     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = r10.A00(r0)     // Catch: java.lang.Throwable -> L76
            int r4 = X.AbstractC58318PtA.A07(r0)     // Catch: java.lang.Throwable -> L76
            r3 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L51 java.lang.Throwable -> L56
            r2.<init>(r11)     // Catch: java.io.IOException -> L51 java.lang.Throwable -> L56
            X.SiK r0 = r9.A00     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            if (r0 == 0) goto L44
            X.ReN r1 = new X.ReN     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            goto L45
        L44:
            r1 = r2
        L45:
            X.C0fK.A02(r8, r6, r1, r4)     // Catch: java.io.IOException -> L51 java.lang.Throwable -> L56
            r1.close()     // Catch: java.io.IOException -> L51 java.lang.Throwable -> L56
            r3 = 1
            goto L5f
        L4d:
            r0 = move-exception
            r1 = r2
            goto L59
        L50:
            r1 = r2
        L51:
            r0 = 3
            android.util.Log.isLoggable(r7, r0)     // Catch: java.lang.Throwable -> L56
            goto L5d
        L56:
            r0 = move-exception
            if (r1 == 0) goto L5c
        L59:
            r1.close()     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L76
        L5c:
            throw r0     // Catch: java.lang.Throwable -> L76
        L5d:
            if (r1 == 0) goto L62
        L5f:
            r1.close()     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L76
        L62:
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r7, r0)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L75
            X.C63375Sim.A01(r6)     // Catch: java.lang.Throwable -> L76
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L76
            r10.A00(r5)     // Catch: java.lang.Throwable -> L76
            r6.hasAlpha()     // Catch: java.lang.Throwable -> L76
        L75:
            return r3
        L76:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63754StA.AS0(X.Ssj, java.io.File, java.lang.Object):boolean");
    }

    public C63754StA(C63361SiK c63361SiK) {
        this.A00 = c63361SiK;
    }

    @Override // X.InterfaceC65631Tps
    public final Integer B1o(C63729Ssj c63729Ssj) {
        return C05F.A01;
    }

    @Deprecated
    public C63754StA() {
        this.A00 = null;
    }
}
