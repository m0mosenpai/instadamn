package com.google.android.gms.internal.gtm;

import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes10.dex */
public final class zzcf implements IInterface, zzce {
    public final IBinder A00;
    public final String A01;

    public zzcf(IBinder iBinder) {
        int A03 = C0f9.A03(728595681);
        this.A00 = iBinder;
        this.A01 = "com.google.android.gms.analytics.internal.IAnalyticsService";
        C0f9.A0A(-1729265600, A03);
        C0f9.A0A(301352018, C0f9.A03(-1913896335));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(749957443);
        IBinder iBinder = this.A00;
        C0f9.A0A(1293538116, A03);
        return iBinder;
    }
}
