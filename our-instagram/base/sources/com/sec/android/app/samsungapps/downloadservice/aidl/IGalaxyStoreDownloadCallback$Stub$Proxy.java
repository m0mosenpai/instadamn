package com.sec.android.app.samsungapps.downloadservice.aidl;

import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class IGalaxyStoreDownloadCallback$Stub$Proxy implements IGalaxyStoreDownloadCallback {
    public IBinder A00;

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback
    public final void Dc0(String str, float f, long j) {
        int A03 = C0f9.A03(-1116893604);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            obtain.writeString(str);
            obtain.writeLong(100L);
            obtain.writeFloat(f);
            AbstractC58319PtB.A1B(this.A00, obtain, 3);
            obtain.recycle();
            C0f9.A0A(1385210236, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(609468397, A03);
            throw th;
        }
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback
    public final void DEH(String str, int i) {
        int A03 = C0f9.A03(1262266218);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            AbstractC58319PtB.A1B(this.A00, obtain, 2);
            obtain.recycle();
            C0f9.A0A(1958353276, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(1793551453, A03);
            throw th;
        }
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback
    public final void DoN(String str, int i, String str2) {
        int A03 = C0f9.A03(1513386760);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            AbstractC58322PtE.A1A(this.A00, obtain);
            obtain.recycle();
            C0f9.A0A(-247607057, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(-103999645, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-1284916534);
        IBinder iBinder = this.A00;
        C0f9.A0A(-1826486074, A03);
        return iBinder;
    }
}
