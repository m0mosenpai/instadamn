package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(72);
    public boolean A04 = true;
    public long A02 = 50;
    public float A00 = 0.0f;
    public long A03 = Long.MAX_VALUE;
    public int A01 = Integer.MAX_VALUE;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzo) {
                zzo zzoVar = (zzo) obj;
                if (this.A04 != zzoVar.A04 || this.A02 != zzoVar.A02 || Float.compare(this.A00, zzoVar.A00) != 0 || this.A03 != zzoVar.A03 || this.A01 != zzoVar.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(Boolean.valueOf(this.A04), Long.valueOf(this.A02), Float.valueOf(this.A00), Long.valueOf(this.A03), Integer.valueOf(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DeviceOrientationRequest[mShouldUseMag=");
        A1C.append(this.A04);
        A1C.append(" mMinimumSamplingPeriodMs=");
        A1C.append(this.A02);
        A1C.append(" mSmallestAngleChangeRadians=");
        A1C.append(this.A00);
        long j = this.A03;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = j - SystemClock.elapsedRealtime();
            A1C.append(" expireIn=");
            A1C.append(elapsedRealtime);
            A1C.append("ms");
        }
        int i = this.A01;
        if (i != Integer.MAX_VALUE) {
            A1C.append(" num=");
            A1C.append(i);
        }
        return AbstractC58320PtC.A14(A1C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A09(parcel, 1, this.A04);
        AbstractC128825rw.A08(parcel, 2, this.A02);
        AbstractC128825rw.A04(parcel, this.A00, 3);
        AbstractC128825rw.A08(parcel, 4, this.A03);
        AbstractC128825rw.A07(parcel, 5, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
