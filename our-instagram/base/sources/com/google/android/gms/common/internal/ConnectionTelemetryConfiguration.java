package com.google.android.gms.common.internal;

import X.AbstractC128825rw;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes3.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C206149Aw(33);
    public final int A00;
    public final RootTelemetryConfiguration A01;
    public final boolean A02;
    public final boolean A03;
    public final int[] A04;
    public final int[] A05;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A01 = AbstractC128825rw.A01(parcel, 20293);
        AbstractC128825rw.A0A(parcel, this.A01, 1, i, false);
        AbstractC128825rw.A09(parcel, 2, this.A02);
        AbstractC128825rw.A09(parcel, 3, this.A03);
        int[] iArr = this.A04;
        if (iArr != null) {
            int A012 = AbstractC128825rw.A01(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC128825rw.A06(parcel, A012);
        }
        AbstractC128825rw.A07(parcel, 5, this.A00);
        int[] iArr2 = this.A05;
        if (iArr2 != null) {
            int A013 = AbstractC128825rw.A01(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC128825rw.A06(parcel, A013);
        }
        AbstractC128825rw.A06(parcel, A01);
    }

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, int[] iArr, int[] iArr2, int i, boolean z, boolean z2) {
        this.A01 = rootTelemetryConfiguration;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = iArr;
        this.A00 = i;
        this.A05 = iArr2;
    }
}
