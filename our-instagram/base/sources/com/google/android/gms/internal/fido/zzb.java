package com.google.android.gms.internal.fido;

import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0f9;
import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes10.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(670219340, C0f9.A03(1617277324));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        int A03 = C0f9.A03(319829779);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i4 = 2061915392;
                C0f9.A0A(i4, A03);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        zzq zzqVar = (zzq) this;
        int A032 = C0f9.A03(-381567941);
        z = true;
        if (i == 1) {
            Status status = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
            PendingIntent pendingIntent = (PendingIntent) AbstractC58320PtC.A0F(parcel, PendingIntent.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                zzqVar.FFx(pendingIntent, status);
                i3 = -1407774653;
            } else {
                throw AbstractC58320PtC.A0E(dataAvail);
            }
        } else {
            z = false;
            i3 = 1429328687;
        }
        C0f9.A0A(i3, A032);
        i4 = 2060134006;
        C0f9.A0A(i4, A03);
        return z;
    }
}
