package com.meta.arfx.engine.interfaces;

import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC58317Pt9;
import X.C0f9;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class IARNetworkClientWorkerHost$Stub$Proxy implements IARNetworkClientWorkerHost {
    public IBinder A00;

    @Override // com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost
    public final void AII(String str) {
        int A03 = C0f9.A03(188885147);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(AbstractC58317Pt9.A00(36));
            obtain.writeString(str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 3);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1716080089, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-277715726, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost
    public final Bundle Bof() {
        Object obj;
        int A03 = C0f9.A03(-952689277);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(AbstractC58317Pt9.A00(36));
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 2);
            Parcelable.Creator creator = Bundle.CREATOR;
            if (obtain2.readInt() != 0) {
                obj = creator.createFromParcel(obtain2);
            } else {
                obj = null;
            }
            Bundle bundle = (Bundle) obj;
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1655850825, A03);
            return bundle;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(692843032, A03);
            throw th;
        }
    }

    @Override // com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost
    public final void EOI(String str, String str2, String str3, String str4, String[] strArr, String[] strArr2, boolean z) {
        int A03 = C0f9.A03(2130548200);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(AbstractC58317Pt9.A00(36));
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeStringArray(strArr);
            obtain.writeStringArray(strArr2);
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1973889547, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-295749193, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(312878635);
        IBinder iBinder = this.A00;
        C0f9.A0A(-1300226794, A03);
        return iBinder;
    }
}
