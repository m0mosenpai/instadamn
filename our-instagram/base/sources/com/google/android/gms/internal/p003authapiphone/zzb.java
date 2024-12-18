package com.google.android.gms.internal.p003authapiphone;

import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0f9;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes10.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-688269044, C0f9.A03(-926332573));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int A03 = C0f9.A03(-1007757403);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i4 = 2087296780;
                C0f9.A0A(i4, A03);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        zzi zziVar = (zzi) this;
        int A032 = C0f9.A03(-277024361);
        z = true;
        if (i == 1) {
            zziVar.FFu((Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR));
            i3 = 1367700893;
        } else {
            z = false;
            i3 = -1307104644;
        }
        C0f9.A0A(i3, A032);
        i4 = -1137030019;
        C0f9.A0A(i4, A03);
        return z;
    }
}
