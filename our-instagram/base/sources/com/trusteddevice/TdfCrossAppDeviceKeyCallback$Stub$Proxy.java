package com.trusteddevice;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class TdfCrossAppDeviceKeyCallback$Stub$Proxy implements TdfCrossAppDeviceKeyCallback {
    public IBinder A00;

    @Override // com.trusteddevice.TdfCrossAppDeviceKeyCallback
    public final void D8l(String str) {
        int A03 = C0f9.A03(-2060704538);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TdfCrossAppDeviceKeyCallback");
            obtain.writeString(str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 2);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(2002177936, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(776700380, A03);
            throw th;
        }
    }

    @Override // com.trusteddevice.TdfCrossAppDeviceKeyCallback
    public final void D8m(String str, String str2) {
        int A03 = C0f9.A03(-2060008766);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.trusteddevice.TdfCrossAppDeviceKeyCallback");
            obtain.writeString(str);
            obtain.writeString(str2);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 1);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(113323990, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-929191204, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(399972138);
        IBinder iBinder = this.A00;
        C0f9.A0A(1525836972, A03);
        return iBinder;
    }
}
