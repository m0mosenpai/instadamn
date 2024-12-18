package com.meta.arfx.engine.interfaces;

import X.AbstractC167027dH;
import X.C0f9;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
import java.util.List;

/* loaded from: classes4.dex */
public final class IAREngineServiceCallback$Stub$Proxy implements IAREngineServiceCallback {
    public IBinder A00;

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceCallback
    public final void Ct9(String str) {
        int A03 = C0f9.A03(1137807192);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
            obtain.writeString(str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 3);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1337623093, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(216794190, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceCallback
    public final void EWB(Surface surface, int i, int i2) {
        int A03 = C0f9.A03(707967262);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
            if (surface != null) {
                obtain.writeInt(1);
                surface.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(166155711, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1258104545, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IAREngineServiceCallback
    public final void Edk(List list) {
        int A03 = C0f9.A03(-1903919890);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
            if (list != null) {
                int size = list.size();
                obtain.writeInt(size);
                for (int i = 0; i < size; i++) {
                    AbstractC167027dH.A0p(obtain, list, i);
                }
            } else {
                obtain.writeInt(-1);
            }
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1394532970, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-990350110, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(1232516727);
        IBinder iBinder = this.A00;
        C0f9.A0A(726061391, A03);
        return iBinder;
    }
}
