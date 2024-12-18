package com.google.android.gms.vision.face.internal.client;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(99);
    public final int A00;
    public final PointF[] A01;

    public zza(PointF[] pointFArr, int i) {
        this.A01 = pointFArr;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0G(parcel, this.A01, 2, i);
        AbstractC128825rw.A07(parcel, 3, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }
}
