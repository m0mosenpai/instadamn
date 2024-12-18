package com.facebook.common.payments.paymentmethods.model;

import X.AbstractC166987dD;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public class AdditionalFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(76);
    public final Map A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }

    public AdditionalFields(Parcel parcel) {
        HashMap A1G = AbstractC166987dD.A1G();
        parcel.readMap(A1G, Map.class.getClassLoader());
        this.A00 = A1G;
    }
}
