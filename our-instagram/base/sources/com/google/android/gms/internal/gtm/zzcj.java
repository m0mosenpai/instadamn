package com.google.android.gms.internal.gtm;

import X.C63335Shm;
import android.content.BroadcastReceiver;

/* loaded from: classes10.dex */
public final class zzcj extends BroadcastReceiver {
    public boolean A00;
    public boolean A01;
    public final C63335Shm A02;

    public zzcj(C63335Shm c63335Shm) {
        this.A02 = c63335Shm;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            r0 = 1213994756(0x485c1704, float:225372.06)
            int r3 = X.AbstractC58318PtA.A04(r6, r7, r8, r0)
            X.Shm r4 = r6.A02
            X.RMf r2 = r4.A0C
            X.C63335Shm.A02(r2)
            X.RMb r5 = r4.A06
            X.C63335Shm.A02(r5)
            java.lang.String r1 = r8.getAction()
            X.C63335Shm.A02(r2)
            java.lang.String r0 = "NetworkBroadcastReceiver received action"
            r2.A0D(r0, r1)
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3f
            android.content.Context r1 = r4.A00
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> La1
            if (r0 == 0) goto La1
            boolean r0 = r0.isConnected()     // Catch: java.lang.SecurityException -> La1
            r1 = 1
            if (r0 != 0) goto La2
            goto La1
        L3f:
            java.lang.String r0 = "com.google.analytics.RADIO_POWERED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            java.lang.String r0 = "com.google.android.gms.internal.gtm.zzcj"
            boolean r0 = r8.hasExtra(r0)
            if (r0 != 0) goto L7e
            X.C63335Shm.A02(r5)
            java.lang.String r1 = "Radio powered up"
            r0 = 2
            X.AbstractC63371Sic.A09(r5, r1, r0)
            r5.A0I()
            X.Shm r0 = r5.A00
            android.content.Context r4 = r0.A00
            boolean r0 = X.C63112SdG.A00(r4)
            if (r0 == 0) goto L82
            boolean r0 = X.SYW.A00(r4)
            if (r0 == 0) goto L82
            java.lang.String r0 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            android.content.Intent r2 = X.AbstractC58318PtA.A0E(r0)
            java.lang.String r1 = "com.google.android.gms.analytics.AnalyticsService"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r4, r1)
            r2.setComponent(r0)
            r4.startService(r2)
        L7e:
            r0 = 372240905(0x162ff209, float:1.421276E-25)
            goto Lc5
        L82:
            r2 = 0
            r5.A0I()
            X.SX6 r0 = X.C63335Shm.A00(r5)
            X.TOb r1 = new X.TOb
            r1.<init>(r5, r2)
            X.Ta3 r0 = r0.A02
            r0.submit(r1)
            goto L7e
        L95:
            X.C63335Shm.A02(r2)
            java.lang.String r0 = "NetworkBroadcastReceiver received unknown action"
            r2.A0F(r0, r1)
            r0 = -1171991538(0xffffffffba24d40e, float:-6.287702E-4)
            goto Lc5
        La1:
            r1 = 0
        La2:
            boolean r0 = r6.A01
            if (r0 == r1) goto Lc2
            r6.A01 = r1
            X.C63335Shm.A02(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "Network connectivity status changed"
            r5.A0D(r0, r1)
            X.SX6 r0 = X.C63335Shm.A00(r5)
            X.TLO r1 = new X.TLO
            r1.<init>(r5)
            X.Ta3 r0 = r0.A02
            r0.submit(r1)
        Lc2:
            r0 = -1058384818(0xffffffffc0ea544e, float:-7.322791)
        Lc5:
            X.C0f9.A0E(r0, r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcj.onReceive(android.content.Context, android.content.Intent):void");
    }
}
