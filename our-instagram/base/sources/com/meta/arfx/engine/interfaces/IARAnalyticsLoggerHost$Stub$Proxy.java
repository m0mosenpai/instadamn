package com.meta.arfx.engine.interfaces;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes4.dex */
public final class IARAnalyticsLoggerHost$Stub$Proxy implements IARAnalyticsLoggerHost {
    public IBinder A00;

    @Override // com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost
    public final void CjE(List list) {
        int A03 = C0f9.A03(1643940163);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IARAnalyticsLoggerHost");
            int size = list.size();
            obtain.writeInt(size);
            for (int i = 0; i < size; i++) {
                AbstractC167027dH.A0p(obtain, list, i);
            }
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-885750295, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(485314144, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(-1324125389);
        IBinder iBinder = this.A00;
        C0f9.A0A(-662730282, A03);
        return iBinder;
    }
}
