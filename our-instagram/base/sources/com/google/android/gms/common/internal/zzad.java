package com.google.android.gms.common.internal;

import X.C0f9;
import android.os.IBinder;

/* loaded from: classes3.dex */
public final class zzad implements IGmsServiceBroker {
    public final IBinder A00;

    public zzad(IBinder iBinder) {
        int A03 = C0f9.A03(1056654617);
        this.A00 = iBinder;
        C0f9.A0A(-428114195, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-369549011);
        IBinder iBinder = this.A00;
        C0f9.A0A(-2009736343, A03);
        return iBinder;
    }
}
