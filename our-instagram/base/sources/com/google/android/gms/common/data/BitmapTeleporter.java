package com.google.android.gms.common.data;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C00O;
import X.C3U5;
import X.C63474SlF;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(33);
    public ParcelFileDescriptor A00;
    public final int A01;
    public final int A02;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            C3U5.A02(null);
            throw C00O.createAndThrow();
        }
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A05(parcel, this.A01);
        AbstractC128825rw.A0A(parcel, this.A00, 2, i | 1, false);
        AbstractC128825rw.A07(parcel, 3, this.A02);
        AbstractC128825rw.A06(parcel, A04);
        this.A00 = null;
    }

    public BitmapTeleporter(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        this.A01 = i;
        this.A00 = parcelFileDescriptor;
        this.A02 = i2;
    }
}
