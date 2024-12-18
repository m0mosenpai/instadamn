package com.sec.android.app.samsungapps.downloadservice.aidl;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class IGalaxyStoreDownloadService$Stub$Proxy implements IGalaxyStoreDownloadService {
    public IBinder A00;

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService
    public final void AGP(String str) {
        int A03 = C0f9.A03(1126411774);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
            obtain.writeString(str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 2);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1821696996, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-380424201, A03);
            throw th;
        }
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService
    public final void AQG(Bundle bundle, IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback) {
        int A03 = C0f9.A03(-1433854231);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongInterface(iGalaxyStoreDownloadCallback);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(47907361, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-733732898, A03);
            throw th;
        }
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService
    public final void CNA(Bundle bundle) {
        int A03 = C0f9.A03(-1804808989);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            this.A00.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1820646487, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1816901655, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(2113744178);
        IBinder iBinder = this.A00;
        C0f9.A0A(1009501896, A03);
        return iBinder;
    }
}
