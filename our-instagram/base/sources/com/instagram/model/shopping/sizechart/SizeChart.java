package com.instagram.model.shopping.sizechart;

import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes7.dex */
public final class SizeChart implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(65);
    public String A00;
    public List A01;
    public List A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A01);
        parcel.writeTypedList(this.A02);
        parcel.writeString(this.A00);
    }
}
