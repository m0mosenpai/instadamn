package com.facebook.browser.lite.ipc;

import X.AbstractC58319PtB;
import X.C0f9;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class OnShopsLiteCallback$Stub$Proxy implements OnShopsLiteCallback {
    public IBinder A00;

    @Override // com.facebook.browser.lite.ipc.OnShopsLiteCallback
    public final void DTV(Bundle bundle) {
        int A03 = C0f9.A03(-527650080);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            AbstractC58319PtB.A1B(this.A00, obtain, 2);
            obtain.recycle();
            C0f9.A0A(-634886924, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(-1858213395, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-628686181);
        IBinder iBinder = this.A00;
        C0f9.A0A(646421585, A03);
        return iBinder;
    }
}
