package com.google.android.gms.clearcut;

import X.AbstractC128825rw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(30);
    public final long A00;
    public final long A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzc) {
                zzc zzcVar = (zzc) obj;
                if (this.A02 != zzcVar.A02 || this.A00 != zzcVar.A00 || this.A01 != zzcVar.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58319PtB.A06(Boolean.valueOf(this.A02), Long.valueOf(this.A00), Long.valueOf(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("CollectForDebugParcelable[skipPersistentStorage: ");
        A0s.append(this.A02);
        A0s.append(",collectForDebugStartTimeMillis: ");
        A0s.append(this.A00);
        A0s.append(",collectForDebugExpiryTimeMillis: ");
        A0s.append(this.A01);
        return AbstractC58319PtB.A0w(A0s);
    }

    public zzc(long j, long j2, boolean z) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A09(parcel, 1, this.A02);
        AbstractC128825rw.A08(parcel, 2, this.A01);
        AbstractC128825rw.A08(parcel, 3, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }
}
