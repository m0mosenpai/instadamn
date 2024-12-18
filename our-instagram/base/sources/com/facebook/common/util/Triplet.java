package com.facebook.common.util;

import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class Triplet extends ParcelablePair implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(84);
    public final Object A00;

    public Triplet(Object obj, Object obj2, Object obj3) {
        super(obj, obj2);
        this.A00 = obj3;
    }

    @Override // com.facebook.common.util.ParcelablePair, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(this.A00);
    }
}
