package com.google.android.gms.auth.blockstore;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class StoreBytesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(25);
    public final String A00;
    public final boolean A01;
    public final byte[] A02;

    public StoreBytesData(String str, byte[] bArr, boolean z) {
        this.A02 = bArr;
        this.A01 = z;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0F(parcel, this.A02, 1, false);
        AbstractC128825rw.A09(parcel, 2, this.A01);
        AbstractC58319PtB.A1D(parcel, this.A00, A04, false);
    }
}
