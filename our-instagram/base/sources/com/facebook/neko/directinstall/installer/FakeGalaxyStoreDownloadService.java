package com.facebook.neko.directinstall.installer;

import X.AbstractC167017dG;
import X.AbstractC46515KiE;
import X.AbstractC58323PtF;
import X.C0f9;
import X.QK6;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService;

/* loaded from: classes10.dex */
public final class FakeGalaxyStoreDownloadService extends Binder implements IGalaxyStoreDownloadService {
    public IGalaxyStoreDownloadCallback A00;
    public String A01;
    public final AbstractC46515KiE A02;

    public FakeGalaxyStoreDownloadService() {
        int A03 = C0f9.A03(-76534373);
        attachInterface(this, "com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
        C0f9.A0A(566013934, A03);
        int A032 = C0f9.A03(1270021089);
        this.A02 = new QK6(this);
        C0f9.A0A(310584470, A032);
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService
    public final void AGP(String str) {
        int A03 = C0f9.A03(-1829436563);
        int A032 = C0f9.A03(1965328464);
        this.A01 = null;
        this.A00 = null;
        C0f9.A0A(-1466418374, A032);
        C0f9.A0A(-222412958, A03);
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService
    public final void AQG(Bundle bundle, IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback) {
        int A03 = C0f9.A03(-937945433);
        AbstractC167017dG.A1N(bundle, iGalaxyStoreDownloadCallback);
        this.A01 = bundle.getString("packageName");
        this.A00 = iGalaxyStoreDownloadCallback;
        this.A02.A00();
        C0f9.A0A(1218973145, A03);
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService
    public final void CNA(Bundle bundle) {
        C0f9.A0A(-1050939114, C0f9.A03(1014484981));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(911817834, C0f9.A03(1129977348));
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback$Stub$Proxy, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback;
        int A03 = C0f9.A03(-316135644);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            CNA((Bundle) AbstractC58323PtF.A0j(parcel, Bundle.CREATOR));
                        }
                    } else {
                        AGP(parcel.readString());
                    }
                } else {
                    Bundle bundle = (Bundle) AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iGalaxyStoreDownloadCallback = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof IGalaxyStoreDownloadCallback)) {
                            iGalaxyStoreDownloadCallback = (IGalaxyStoreDownloadCallback) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            int A032 = C0f9.A03(486272370);
                            obj.A00 = readStrongBinder;
                            C0f9.A0A(606119398, A032);
                            iGalaxyStoreDownloadCallback = obj;
                        }
                    }
                    AQG(bundle, iGalaxyStoreDownloadCallback);
                }
                parcel2.writeNoException();
                i3 = -1060520117;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
                i3 = 1440508335;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(449848808, A03);
        return onTransact;
    }
}
