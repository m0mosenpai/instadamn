package com.google.android.gms.internal.device_performance;

import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C0f9;
import X.S2N;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.deviceperformance.MediaPerformanceClassResult;
import com.google.android.gms.deviceperformance.internal.zzc;

/* loaded from: classes10.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1959001936, C0f9.A03(-1572805081));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int i4;
        Integer num;
        int A03 = C0f9.A03(-1184030945);
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                z = true;
                i4 = -82483914;
                C0f9.A0A(i4, A03);
                return z;
            }
        } else {
            AbstractC58318PtA.A1E(this, parcel);
        }
        zzc zzcVar = (zzc) this;
        int A032 = C0f9.A03(-1611070412);
        z = true;
        if (i == 1) {
            Status status = (Status) AbstractC58320PtC.A0F(parcel, Status.CREATOR);
            MediaPerformanceClassResult mediaPerformanceClassResult = (MediaPerformanceClassResult) AbstractC58320PtC.A0F(parcel, MediaPerformanceClassResult.CREATOR);
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                int A033 = C0f9.A03(-1231792574);
                if (mediaPerformanceClassResult != null) {
                    num = Integer.valueOf(mediaPerformanceClassResult.A00);
                } else {
                    num = null;
                }
                S2N.A00(status, zzcVar.A00, num);
                C0f9.A0A(-1487025361, A033);
                i3 = 1221499478;
            } else {
                throw AbstractC58320PtC.A0E(dataAvail);
            }
        } else {
            z = false;
            i3 = 350385654;
        }
        C0f9.A0A(i3, A032);
        i4 = 1467249746;
        C0f9.A0A(i4, A03);
        return z;
    }
}
