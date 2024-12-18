package X;

/* loaded from: classes10.dex */
public final class TLP implements Runnable {
    public final /* synthetic */ C60692RMk A00;

    public TLP(C60692RMk c60692RMk) {
        this.A00 = c60692RMk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        if (r0 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            X.RMk r5 = r7.A00
            r5.A0I()
            X.SX6.A00()
            X.Shm r6 = r5.A00
            android.content.Context r4 = r6.A00
            boolean r0 = X.C63112SdG.A00(r4)
            if (r0 != 0) goto Lc8
            java.lang.String r1 = "AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions."
            r0 = 5
        L15:
            X.AbstractC63371Sic.A09(r5, r1, r0)
        L18:
            X.C3U5.A02(r4)
            java.lang.Boolean r0 = com.google.android.gms.analytics.CampaignTrackingReceiver.A00
            if (r0 == 0) goto La4
            boolean r1 = r0.booleanValue()
        L23:
            if (r1 != 0) goto L2b
            java.lang.String r1 = "CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions."
            r0 = 5
            X.AbstractC63371Sic.A09(r5, r1, r0)
        L2b:
            X.RMg r0 = r6.A0D
            X.C63335Shm.A02(r0)
            r0.A0J()
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            X.3U3 r0 = X.C3U2.A00(r4)
            android.content.Context r0 = r0.A00
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 == 0) goto L58
            java.lang.String r1 = "Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions"
            r0 = 6
            X.AbstractC63371Sic.A09(r5, r1, r0)
            r5.A0I()
            X.SX6.A00()
            r0 = 1
            r5.A02 = r0
            X.RMh r0 = r5.A03
            r0.A0J()
            r5.A0K()
        L58:
            java.lang.String r1 = "android.permission.INTERNET"
            X.3U3 r0 = X.C3U2.A00(r4)
            android.content.Context r0 = r0.A00
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 == 0) goto L7d
            java.lang.String r1 = "Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions"
            r0 = 6
            X.AbstractC63371Sic.A09(r5, r1, r0)
            r5.A0I()
            X.SX6.A00()
            r0 = 1
            r5.A02 = r0
            X.RMh r0 = r5.A03
            r0.A0J()
            r5.A0K()
        L7d:
            boolean r0 = X.SYW.A00(r4)
            if (r0 == 0) goto La0
            java.lang.String r1 = "AnalyticsService registered in the app manifest and enabled"
            r0 = 2
        L86:
            X.AbstractC63371Sic.A09(r5, r1, r0)
            boolean r0 = r5.A02
            if (r0 != 0) goto L9c
            X.RMl r0 = r5.A04
            long r3 = X.C60693RMl.A00(r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L9c
            X.C60692RMk.A03(r5)
        L9c:
            r5.A0K()
            return
        La0:
            java.lang.String r1 = "AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions."
            r0 = 5
            goto L86
        La4:
            java.lang.String r3 = "com.google.android.gms.analytics.CampaignTrackingReceiver"
            r2 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbf
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbf
            r0.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbf
            android.content.pm.ActivityInfo r1 = r1.getReceiverInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbf
            if (r1 == 0) goto Lbf
            boolean r0 = r1.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbf
            if (r0 == 0) goto Lbf
            boolean r0 = r1.exported     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbf
            r1 = 1
            if (r0 != 0) goto Lc0
        Lbf:
            r1 = 0
        Lc0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            com.google.android.gms.analytics.CampaignTrackingReceiver.A00 = r0
            goto L23
        Lc8:
            boolean r0 = X.SYW.A00(r4)
            if (r0 != 0) goto L18
            java.lang.String r1 = "AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions."
            r0 = 6
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TLP.run():void");
    }
}
