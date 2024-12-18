package com.google.android.gms.common.moduleinstall;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(45);
    public final int A00;
    public final boolean A01;

    public ModuleAvailabilityResponse(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A09(parcel, 1, this.A01);
        AbstractC128825rw.A07(parcel, 2, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }
}
