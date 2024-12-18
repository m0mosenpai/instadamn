package com.google.android.gms.common.internal;

import X.AbstractC128825rw;
import X.C206149Aw;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes3.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(32);
    public int A00;
    public Bundle A01;
    public ConnectionTelemetryConfiguration A02;
    public Feature[] A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A01 = AbstractC128825rw.A01(parcel, 20293);
        AbstractC128825rw.A02(this.A01, parcel, 1);
        AbstractC128825rw.A0G(parcel, this.A03, 2, i);
        AbstractC128825rw.A07(parcel, 3, this.A00);
        AbstractC128825rw.A0A(parcel, this.A02, 4, i, false);
        AbstractC128825rw.A06(parcel, A01);
    }
}
