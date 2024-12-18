package com.google.android.gms.common.internal;

import X.AbstractC128825rw;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes3.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(31);
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A01 = AbstractC128825rw.A01(parcel, 20293);
        AbstractC128825rw.A05(parcel, this.A00);
        AbstractC128825rw.A09(parcel, 2, this.A03);
        AbstractC128825rw.A09(parcel, 3, this.A04);
        AbstractC128825rw.A07(parcel, 4, this.A01);
        AbstractC128825rw.A07(parcel, 5, this.A02);
        AbstractC128825rw.A06(parcel, A01);
    }

    public RootTelemetryConfiguration(int i, int i2, int i3, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = i2;
        this.A02 = i3;
    }
}
