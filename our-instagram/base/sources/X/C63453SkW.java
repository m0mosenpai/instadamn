package X;

import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: X.SkW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63453SkW implements LocationListener {
    public final /* synthetic */ SJI A00;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C63453SkW(SJI sji) {
        this.A00 = sji;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r1 >= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r12.getProvider() == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r1 = r12.getProvider();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r8.getProvider() == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        r2 = r8.getProvider();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        r0 = X.AbstractC25229BEm.A1Z(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r4 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r7 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r5 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r3 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r0 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r0 = r1.equals(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0047, code lost:
    
        if (r1 <= 200) goto L18;
     */
    @Override // android.location.LocationListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLocationChanged(android.location.Location r12) {
        /*
            r11 = this;
            X.SJI r6 = r11.A00
            monitor-enter(r6)
            boolean r0 = r6.A01     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L97
            android.location.Location r8 = r6.A00     // Catch: java.lang.Throwable -> L9b
            if (r8 == 0) goto L79
            long r9 = r12.getTime()     // Catch: java.lang.Throwable -> L9b
            long r0 = r8.getTime()     // Catch: java.lang.Throwable -> L9b
            long r9 = r9 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r4 = X.AbstractC167007dF.A1O(r0)
            r1 = -120000(0xfffffffffffe2b40, double:NaN)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r3 = X.AbstractC25230BEn.A1P(r0)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r7 = X.AbstractC167007dF.A1O(r0)
            if (r4 != 0) goto L79
            if (r3 != 0) goto L97
            float r1 = r12.getAccuracy()     // Catch: java.lang.Throwable -> L9b
            float r0 = r8.getAccuracy()     // Catch: java.lang.Throwable -> L9b
            float r1 = r1 - r0
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L9b
            r5 = 1
            if (r1 > 0) goto L43
            r5 = 0
            r4 = 1
            if (r1 < 0) goto L49
        L43:
            r4 = 0
            r0 = 200(0xc8, float:2.8E-43)
            r3 = 1
            if (r1 > r0) goto L4a
        L49:
            r3 = 0
        L4a:
            java.lang.String r0 = r12.getProvider()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = ""
            if (r0 == 0) goto L61
            java.lang.String r1 = r12.getProvider()     // Catch: java.lang.Throwable -> L9b
        L56:
            java.lang.String r0 = r8.getProvider()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L63
            java.lang.String r2 = r8.getProvider()     // Catch: java.lang.Throwable -> L9b
            goto L63
        L61:
            r1 = r2
            goto L56
        L63:
            if (r1 != 0) goto L74
            boolean r0 = X.AbstractC25229BEm.A1Z(r2)
        L69:
            if (r4 != 0) goto L79
            if (r7 == 0) goto L97
            if (r5 == 0) goto L79
            if (r3 != 0) goto L97
            if (r0 == 0) goto L97
            goto L79
        L74:
            boolean r0 = r1.equals(r2)     // Catch: java.lang.Throwable -> L9b
            goto L69
        L79:
            com.facebook.react.bridge.Callback r1 = r6.A07     // Catch: java.lang.Throwable -> L9b
            r2 = 1
            X.Tqj r0 = com.facebook.react.modules.location.LocationModule.locationToMap(r12)     // Catch: java.lang.Throwable -> L9b
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L9b
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L9b
            android.os.Handler r1 = r6.A05     // Catch: java.lang.Throwable -> L9b
            java.lang.Runnable r0 = r6.A08     // Catch: java.lang.Throwable -> L9b
            r1.removeCallbacks(r0)     // Catch: java.lang.Throwable -> L9b
            r6.A01 = r2     // Catch: java.lang.Throwable -> L9b
            android.location.LocationManager r1 = r6.A04     // Catch: java.lang.Throwable -> L9b
            android.location.LocationListener r0 = r6.A03     // Catch: java.lang.Throwable -> L9b
            X.C0fS.A01(r0, r1)     // Catch: java.lang.Throwable -> L9b
        L97:
            r6.A00 = r12     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9b
            return
        L9b:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63453SkW.onLocationChanged(android.location.Location):void");
    }
}
