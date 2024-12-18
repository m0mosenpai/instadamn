package com.google.android.gms.auth.api.accounttransfer;

import X.AbstractC128825rw;
import X.AbstractC58322PtE;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(92);
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A06 = AbstractC58322PtE.A06(parcel, this.A00);
        AbstractC128825rw.A09(parcel, 2, this.A02);
        AbstractC128825rw.A08(parcel, 3, this.A01);
        AbstractC128825rw.A09(parcel, 4, this.A03);
        AbstractC128825rw.A06(parcel, A06);
    }

    public DeviceMetaData(int i, long j, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = j;
        this.A03 = z2;
    }
}
