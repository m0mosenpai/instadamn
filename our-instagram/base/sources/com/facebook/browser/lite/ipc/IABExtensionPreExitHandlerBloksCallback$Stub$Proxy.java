package com.facebook.browser.lite.ipc;

import X.AbstractC58322PtE;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class IABExtensionPreExitHandlerBloksCallback$Stub$Proxy implements IABExtensionPreExitHandlerBloksCallback {
    public IBinder A00;

    @Override // com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback
    public final void D1D(String str, String str2, String str3) {
        int A03 = C0f9.A03(-1413791551);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            AbstractC58322PtE.A1A(this.A00, obtain);
            obtain.recycle();
            C0f9.A0A(2000395812, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(-866955650, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-1698125553);
        IBinder iBinder = this.A00;
        C0f9.A0A(-49936654, A03);
        return iBinder;
    }
}
