package com.google.android.gms.internal.flags;

import X.AbstractC37304Gc5;
import X.AbstractC58318PtA;
import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.flags.impl.FlagProviderImpl;

/* loaded from: classes10.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        C0f9.A0A(-752924833, C0f9.A03(829104579));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int A03 = C0f9.A03(2082162106);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i3 = -2144055115;
                C0f9.A0A(i3, A03);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        FlagProviderImpl flagProviderImpl = (FlagProviderImpl) this;
        int A032 = C0f9.A03(-1546929479);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            C0f9.A0A(-1291390846, A032);
                            z = false;
                            i3 = -1923412358;
                            C0f9.A0A(i3, A03);
                            return z;
                        }
                        String stringFlagValue = flagProviderImpl.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(stringFlagValue);
                    } else {
                        long longFlagValue = flagProviderImpl.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(longFlagValue);
                    }
                } else {
                    i4 = flagProviderImpl.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                }
            } else {
                i4 = flagProviderImpl.getBooleanFlagValue(parcel.readString(), AbstractC37304Gc5.A1V(parcel), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeInt(i4);
        } else {
            flagProviderImpl.init(IObjectWrapper.Stub.A01(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        C0f9.A0A(-1492930898, A032);
        z = true;
        i3 = -1923412358;
        C0f9.A0A(i3, A03);
        return z;
    }
}
