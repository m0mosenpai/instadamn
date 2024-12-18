package org.chromium;

import X.AbstractC167007dF;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes10.dex */
public final class IsReadyToPayServiceCallback$Stub$Proxy implements IsReadyToPayServiceCallback {
    public IBinder A00;

    @Override // org.chromium.IsReadyToPayServiceCallback
    public final void CJu(boolean z) {
        int A03 = C0f9.A03(-1745657688);
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("org.chromium.IsReadyToPayServiceCallback");
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            this.A00.transact(1, obtain, null, 1);
            obtain.recycle();
            C0f9.A0A(-486833554, A03);
        } catch (Throwable th) {
            obtain.recycle();
            C0f9.A0A(763459629, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-2022918848);
        IBinder iBinder = this.A00;
        C0f9.A0A(184839095, A03);
        return iBinder;
    }
}
