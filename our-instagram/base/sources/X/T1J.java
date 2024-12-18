package X;

/* loaded from: classes10.dex */
public final class T1J implements InterfaceC65368Tj0 {
    public final C63006SaU A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0.isConnected() == false) goto L6;
     */
    @Override // X.InterfaceC65368Tj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean EiC(java.util.Map r7) {
        /*
            r6 = this;
            X.SaU r1 = r6.A00
            android.net.NetworkInfo r0 = r1.A01()
            if (r0 == 0) goto Lf
            boolean r0 = r0.isConnected()
            r5 = 1
            if (r0 != 0) goto L1d
        Lf:
            r5 = 0
            android.net.NetworkInfo r4 = r1.A01()
            java.lang.String r3 = "MqttNetworkManagerMonitor"
            if (r4 != 0) goto L1e
            java.lang.String r0 = "no_info"
        L1a:
            r7.put(r3, r0)
        L1d:
            return r5
        L1e:
            int r0 = r4.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r4.getSubtype()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.net.NetworkInfo$State r0 = r4.getState()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "%s_%s_%s"
            java.lang.String r0 = X.AbstractC58318PtA.A0k(r0, r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T1J.EiC(java.util.Map):boolean");
    }

    public T1J(C63006SaU c63006SaU) {
        this.A00 = c63006SaU;
    }
}
