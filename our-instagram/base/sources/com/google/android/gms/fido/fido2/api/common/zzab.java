package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(66);
    public final long A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzab) || this.A00 != ((zzab) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(Long.valueOf(this.A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.A00;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A08(parcel, 1, j);
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzab(long j) {
        Long valueOf = Long.valueOf(j);
        C3U5.A02(valueOf);
        this.A00 = valueOf.longValue();
    }
}
