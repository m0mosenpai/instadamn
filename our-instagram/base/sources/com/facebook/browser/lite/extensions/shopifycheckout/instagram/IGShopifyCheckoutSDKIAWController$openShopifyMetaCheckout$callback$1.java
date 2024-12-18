package com.facebook.browser.lite.extensions.shopifycheckout.instagram;

import X.AbstractC167017dG;
import X.AbstractC58323PtF;
import X.C0f9;
import X.QEV;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;

/* loaded from: classes10.dex */
public final class IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$callback$1 extends Binder implements OnShopsLiteCallback {
    public final /* synthetic */ QEV A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$callback$1(QEV qev) {
        this();
        this.A00 = qev;
        C0f9.A0A(332813676, C0f9.A03(-352445504));
    }

    @Override // com.facebook.browser.lite.ipc.OnShopsLiteCallback
    public final void DTV(Bundle bundle) {
        int A0N = AbstractC167017dG.A0N(bundle, -1927957737);
        this.A00.A00(bundle);
        C0f9.A0A(56071934, A0N);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(843513430, C0f9.A03(1248177477));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(-324329794);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
                if (i != 1) {
                    if (i == 2) {
                        DTV((Bundle) AbstractC58323PtF.A0j(parcel, Bundle.CREATOR));
                    }
                } else {
                    parcel.readInt();
                    C0f9.A0A(1598565589, C0f9.A03(3765467));
                }
                i3 = 298094374;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
                i3 = -940265504;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-1179578537, A03);
        return onTransact;
    }

    public IGShopifyCheckoutSDKIAWController$openShopifyMetaCheckout$callback$1() {
        int A03 = C0f9.A03(-181620933);
        attachInterface(this, "com.facebook.browser.lite.ipc.OnShopsLiteCallback");
        C0f9.A0A(-242922876, A03);
    }
}
