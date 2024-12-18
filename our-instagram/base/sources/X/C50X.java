package X;

/* renamed from: X.50X, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C50X {
    public static final String A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r6.isConnected() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C50Y A00(android.net.ConnectivityManager r7) {
        /*
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            android.net.NetworkInfo r6 = r7.getActiveNetworkInfo()
            r5 = 1
            if (r6 == 0) goto L12
            boolean r0 = r6.isConnected()
            r4 = 1
            if (r0 != 0) goto L13
        L12:
            r4 = 0
        L13:
            r3 = 0
            android.net.Network r0 = r7.getActiveNetwork()     // Catch: java.lang.SecurityException -> L25
            android.net.NetworkCapabilities r1 = r7.getNetworkCapabilities(r0)     // Catch: java.lang.SecurityException -> L25
            if (r1 == 0) goto L30
            r0 = 16
            boolean r3 = r1.hasCapability(r0)     // Catch: java.lang.SecurityException -> L25
            goto L30
        L25:
            r2 = move-exception
            X.C48442Kl.A00()
            java.lang.String r1 = X.C50X.A00
            java.lang.String r0 = "Unable to validate active network"
            android.util.Log.e(r1, r0, r2)
        L30:
            boolean r1 = r7.isActiveNetworkMetered()
            if (r6 == 0) goto L42
            boolean r0 = r6.isRoaming()
            if (r0 != 0) goto L42
        L3c:
            X.50Y r0 = new X.50Y
            r0.<init>(r4, r3, r1, r5)
            return r0
        L42:
            r5 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50X.A00(android.net.ConnectivityManager):X.50Y");
    }

    static {
        String A01 = C48442Kl.A01("NetworkStateTracker");
        C14360o3.A07(A01);
        A00 = A01;
    }
}
