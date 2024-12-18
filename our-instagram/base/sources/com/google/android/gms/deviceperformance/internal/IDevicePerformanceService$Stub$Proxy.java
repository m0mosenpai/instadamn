package com.google.android.gms.deviceperformance.internal;

import X.C0f9;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes10.dex */
public final class IDevicePerformanceService$Stub$Proxy implements IInterface, IDevicePerformanceService {
    public final IBinder A00;
    public final String A01;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-2075578470);
        IBinder iBinder = this.A00;
        C0f9.A0A(1300174803, A03);
        return iBinder;
    }

    public IDevicePerformanceService$Stub$Proxy(IBinder iBinder) {
        int A03 = C0f9.A03(-1124346945);
        this.A00 = iBinder;
        this.A01 = "com.google.android.gms.deviceperformance.internal.IDevicePerformanceService";
        C0f9.A0A(1776191508, A03);
        C0f9.A0A(1808543464, C0f9.A03(2008605656));
    }
}
