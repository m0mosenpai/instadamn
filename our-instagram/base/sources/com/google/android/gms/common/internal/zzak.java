package com.google.android.gms.common.internal;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes10.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(42);
    public final int A00;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC128825rw.A06(parcel, AbstractC58322PtE.A06(parcel, this.A00));
    }

    public zzak(int i) {
        this.A00 = i;
    }
}
