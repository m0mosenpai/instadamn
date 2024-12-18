package com.google.android.gms.internal.location;

import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.C61j;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzac extends AbstractSafeParcelable implements C61j {
    public static final zzac A01 = new zzac(Status.A08);
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(29);
    public final Status A00;

    @Override // X.C61j
    public final Status C0F() {
        return this.A00;
    }

    public zzac(Status status) {
        this.A00 = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58320PtC.A1G(parcel, this.A00, i, AbstractC58319PtB.A04(parcel));
    }
}
