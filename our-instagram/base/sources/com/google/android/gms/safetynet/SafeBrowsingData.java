package com.google.android.gms.safetynet;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(81);
    public String A03 = null;
    public DataHolder A02 = null;
    public ParcelFileDescriptor A01 = null;
    public long A00 = 0;
    public byte[] A04 = null;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A03);
        AbstractC128825rw.A0A(parcel, this.A02, 3, i, false);
        AbstractC128825rw.A0A(parcel, this.A01, 4, i, false);
        AbstractC128825rw.A08(parcel, 5, this.A00);
        AbstractC128825rw.A0F(parcel, this.A04, 6, false);
        AbstractC128825rw.A06(parcel, A04);
        this.A01 = null;
    }
}
