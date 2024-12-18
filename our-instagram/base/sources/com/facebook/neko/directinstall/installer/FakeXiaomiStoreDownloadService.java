package com.facebook.neko.directinstall.installer;

import X.AbstractC46515KiE;
import X.AbstractC58323PtF;
import X.C0f9;
import X.QK7;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.xiaomi.market.IDownloadCallback;
import com.xiaomi.market.IMarketDownloadService;

/* loaded from: classes10.dex */
public final class FakeXiaomiStoreDownloadService extends Binder implements IMarketDownloadService {
    public IDownloadCallback A00;
    public String A01;
    public final AbstractC46515KiE A02;

    public FakeXiaomiStoreDownloadService() {
        int A03 = C0f9.A03(-2086013564);
        attachInterface(this, "com.xiaomi.market.IMarketDownloadService");
        C0f9.A0A(-923934261, A03);
        int A032 = C0f9.A03(303336049);
        this.A02 = new QK7(this);
        C0f9.A0A(698200755, A032);
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public final boolean AGI(String str) {
        int A03 = C0f9.A03(-766254722);
        int A032 = C0f9.A03(-1537892000);
        this.A01 = null;
        this.A00 = null;
        C0f9.A0A(-2048853029, A032);
        C0f9.A0A(-1028624088, A03);
        return true;
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public final boolean AQF(Bundle bundle) {
        boolean z;
        int i;
        int A03 = C0f9.A03(-1574708869);
        if (bundle == null) {
            z = false;
            i = -2099745228;
        } else {
            this.A01 = bundle.getString("packageName");
            this.A02.A00();
            z = true;
            i = -165940769;
        }
        C0f9.A0A(i, A03);
        return z;
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public final int AXk() {
        C0f9.A0A(38506948, C0f9.A03(-386961383));
        return 1;
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public final boolean CRo() {
        C0f9.A0A(-302789340, C0f9.A03(-1311441955));
        return true;
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public final boolean EDE(IDownloadCallback iDownloadCallback) {
        int A03 = C0f9.A03(984874151);
        this.A00 = iDownloadCallback;
        C0f9.A0A(-2068447587, A03);
        return true;
    }

    @Override // com.xiaomi.market.IMarketDownloadService
    public final boolean F8y(IDownloadCallback iDownloadCallback) {
        int A03 = C0f9.A03(96305412);
        this.A00 = null;
        C0f9.A0A(-1960604056, A03);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(1825130304, C0f9.A03(652559621));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int i4;
        int A03 = C0f9.A03(-811439349);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.market.IMarketDownloadService");
                switch (i) {
                    case 1:
                        i4 = AQF((Bundle) AbstractC58323PtF.A0j(parcel, Bundle.CREATOR));
                        break;
                    case 2:
                        parcel.readString();
                        C0f9.A0A(1416811659, C0f9.A03(1552795857));
                        i4 = 0;
                        break;
                    case 3:
                        parcel.readString();
                        C0f9.A0A(299937920, C0f9.A03(777418995));
                        i4 = 0;
                        break;
                    case 4:
                        i4 = AGI(parcel.readString());
                        break;
                    case 5:
                        i4 = EDE(XiaomiDirectInstallAgentManager$2.A00(parcel.readStrongBinder()));
                        break;
                    case 6:
                        i4 = F8y(XiaomiDirectInstallAgentManager$2.A00(parcel.readStrongBinder()));
                        break;
                    case 7:
                        i4 = CRo();
                        break;
                    case 8:
                        i4 = AXk();
                        break;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i4);
                i3 = -887205629;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.market.IMarketDownloadService");
                i3 = 1982259187;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-1604836022, A03);
        return onTransact;
    }
}
