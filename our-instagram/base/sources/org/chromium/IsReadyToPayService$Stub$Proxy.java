package org.chromium;

import X.AbstractC58322PtE;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class IsReadyToPayService$Stub$Proxy implements IsReadyToPayService {
    public IBinder A00;

    @Override // org.chromium.IsReadyToPayService
    public final void Cba(IsReadyToPayServiceCallback isReadyToPayServiceCallback) {
        int A03 = C0f9.A03(-2082030202);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.IsReadyToPayService");
            obtain.writeStrongInterface(isReadyToPayServiceCallback);
            AbstractC58322PtE.A1A(this.A00, obtain);
            obtain.recycle();
            C0f9.A0A(554702302, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(1560862038, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-1198109200);
        IBinder iBinder = this.A00;
        C0f9.A0A(-274148220, A03);
        return iBinder;
    }
}
