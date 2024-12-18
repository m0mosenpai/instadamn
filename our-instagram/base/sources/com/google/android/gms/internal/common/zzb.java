package com.google.android.gms.internal.common;

import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1755128171, C0f9.A03(-877249015));
        return this;
    }

    public boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03;
        int i3;
        IBinder asBinder;
        if (this instanceof zzz) {
            zzz zzzVar = (zzz) this;
            A03 = C0f9.A03(131688968);
            if (i != 1) {
                if (i != 2) {
                    i3 = 896591828;
                } else {
                    int FFy = zzzVar.FFy();
                    parcel2.writeNoException();
                    parcel2.writeInt(FFy);
                }
            } else {
                IObjectWrapper FG4 = zzzVar.FG4();
                parcel2.writeNoException();
                if (FG4 == null) {
                    asBinder = null;
                } else {
                    asBinder = FG4.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
            }
            C0f9.A0A(232051545, A03);
            return true;
        }
        A03 = C0f9.A03(-589545027);
        i3 = 1990838751;
        C0f9.A0A(i3, A03);
        return false;
    }

    public zzb(String str) {
        int A03 = C0f9.A03(2129696633);
        attachInterface(this, str);
        C0f9.A0A(871699425, A03);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean A02;
        int i3;
        int A03 = C0f9.A03(-190635185);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                A02 = true;
                i3 = 1174896707;
                C0f9.A0A(i3, A03);
                return A02;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        A02 = A02(i, parcel, parcel2, i2);
        i3 = 484715494;
        C0f9.A0A(i3, A03);
        return A02;
    }
}
