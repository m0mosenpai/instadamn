package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(61);
    public zzay A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public LocationSettingsRequest(zzay zzayVar, List list, boolean z, boolean z2) {
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = zzayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0E(parcel, Collections.unmodifiableList(this.A01), 1, false);
        AbstractC128825rw.A09(parcel, 2, this.A02);
        AbstractC128825rw.A09(parcel, 3, this.A03);
        AbstractC128825rw.A0A(parcel, this.A00, 5, i, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
