package com.meta.arfx.engine.interfaces;

import X.AbstractC167007dF;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes4.dex */
public final class IARExperimentUtilBinding$Stub$Proxy implements IARExperimentUtilBinding {
    public IBinder A00;

    @Override // com.meta.arfx.engine.interfaces.IARExperimentUtilBinding
    public final boolean Ah5(int i, boolean z) {
        int A03 = C0f9.A03(1224967196);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IARExperimentUtilBinding");
            obtain.writeInt(i);
            boolean z2 = true;
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1609580211, A03);
            return z2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1449092648, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-104302942);
        IBinder iBinder = this.A00;
        C0f9.A0A(-2033550756, A03);
        return iBinder;
    }
}
