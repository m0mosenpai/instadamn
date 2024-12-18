package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C61j;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements C61j {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(62);
    public final Status A00;
    public final LocationSettingsStates A01;

    @Override // X.C61j
    public final Status C0F() {
        return this.A00;
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.A00 = status;
        this.A01 = locationSettingsStates;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0A(parcel, this.A00, 1, i, false);
        AbstractC128825rw.A0A(parcel, this.A01, 2, i, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
