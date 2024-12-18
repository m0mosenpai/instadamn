package com.instagram.creation.photo.util;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31172DnG;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ExifImageData implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(76);
    public int A00;
    public Double A01;
    public Double A02;
    public final HashMap A03 = AbstractC166987dD.A1G();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        double d;
        C14360o3.A0B(parcel, 0);
        Double d2 = this.A01;
        double d3 = 200.0d;
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = 200.0d;
        }
        parcel.writeDouble(d);
        Double d4 = this.A02;
        if (d4 != null) {
            d3 = d4.doubleValue();
        }
        parcel.writeDouble(d3);
        parcel.writeInt(this.A00);
        HashMap hashMap = this.A03;
        parcel.writeInt(hashMap.size());
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            String A17 = AbstractC31172DnG.A17(A1K);
            String str = (String) A1K.getValue();
            parcel.writeString(A17);
            parcel.writeString(str);
        }
    }
}
