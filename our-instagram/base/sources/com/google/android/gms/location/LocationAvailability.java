package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(57);

    @Deprecated
    public int A00;

    @Deprecated
    public int A01;
    public int A02;
    public long A03;
    public zzbd[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                LocationAvailability locationAvailability = (LocationAvailability) obj;
                if (this.A00 != locationAvailability.A00 || this.A01 != locationAvailability.A01 || this.A03 != locationAvailability.A03 || this.A02 != locationAvailability.A02 || !Arrays.equals(this.A04, locationAvailability.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(Integer.valueOf(this.A02), Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A03), this.A04);
    }

    public final String toString() {
        boolean A1Q = AbstractC167007dF.A1Q(this.A02, 1000);
        StringBuilder A0q = AbstractC58318PtA.A0q(48);
        A0q.append("LocationAvailability[isLocationAvailable: ");
        A0q.append(A1Q);
        return AbstractC58319PtB.A0w(A0q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A08(parcel, 3, this.A03);
        AbstractC128825rw.A07(parcel, 4, this.A02);
        AbstractC128825rw.A0G(parcel, this.A04, 5, i);
        AbstractC128825rw.A06(parcel, A04);
    }
}
