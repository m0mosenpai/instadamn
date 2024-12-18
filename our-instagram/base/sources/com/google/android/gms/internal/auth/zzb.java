package com.google.android.gms.internal.auth;

import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0f9;
import X.RGY;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes10.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-321684353, C0f9.A03(178570651));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        Object createFromParcel;
        int A03 = C0f9.A03(-2033467173);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i4 = 75942226;
                C0f9.A0A(i4, A03);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        zzw zzwVar = (zzw) this;
        int A032 = C0f9.A03(-2081466325);
        if (i == 2) {
            Status status = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(parcel);
            }
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                int A033 = C0f9.A03(826791745);
                RGY.A02(status, zzwVar.A00, createFromParcel);
                C0f9.A0A(2120761652, A033);
                z = true;
                i3 = 1991893942;
            } else {
                throw AbstractC58320PtC.A0E(dataAvail);
            }
        } else {
            z = false;
            i3 = 1803982827;
        }
        C0f9.A0A(i3, A032);
        i4 = -41829849;
        C0f9.A0A(i4, A03);
        return z;
    }
}
