package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(64);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                zzbd zzbdVar = (zzbd) obj;
                if (this.A00 != zzbdVar.A00 || this.A01 != zzbdVar.A01 || this.A02 != zzbdVar.A02 || this.A03 != zzbdVar.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A03), Long.valueOf(this.A02));
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("NetworkLocationStatus:");
        A0s.append(" Wifi status: ");
        A0s.append(this.A00);
        A0s.append(" Cell status: ");
        A0s.append(this.A01);
        A0s.append(" elapsed time NS: ");
        A0s.append(this.A03);
        A0s.append(" system time ms: ");
        A0s.append(this.A02);
        return A0s.toString();
    }

    public zzbd(int i, int i2, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A07(parcel, 2, this.A01);
        AbstractC128825rw.A08(parcel, 3, this.A02);
        AbstractC128825rw.A08(parcel, 4, this.A03);
        AbstractC128825rw.A06(parcel, A04);
    }
}
