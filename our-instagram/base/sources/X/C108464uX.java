package X;

import android.os.Build;
import java.util.ArrayList;

/* renamed from: X.4uX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108464uX {
    public C103744ls A00;
    public final C108414uS A01;
    public final C108454uW A02;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (X.C108434uU.A00(r2) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.wifi.WifiInfo A00() {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L39
            boolean r0 = X.C0L6.A06()
        La:
            r5 = 0
            if (r0 == 0) goto L40
            X.4uW r4 = r6.A02
            boolean r0 = X.C108454uW.A00(r4)
            r3 = 0
            if (r0 == 0) goto L40
            X.4uU r2 = r4.A04
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            android.content.Context r0 = r2.A00
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 != 0) goto L29
            boolean r1 = X.C108434uU.A00(r2)
            r0 = 1
            if (r1 != 0) goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L40
            android.content.Context r1 = r4.A01
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            if (r0 == 0) goto L40
            goto L3b
        L39:
            r0 = 1
            goto La
        L3b:
            android.net.wifi.WifiInfo r3 = X.AbstractC09830fh.A00(r0)     // Catch: java.lang.Exception -> L3f
        L3f:
            return r3
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108464uX.A00():android.net.wifi.WifiInfo");
    }

    public final ArrayList A01() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29) {
            z = C0L6.A06();
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        try {
            return this.A02.A01(true);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public C108464uX(C103744ls c103744ls, C108454uW c108454uW, C108414uS c108414uS) {
        this.A01 = c108414uS;
        this.A02 = c108454uW;
        this.A00 = c103744ls;
    }
}
