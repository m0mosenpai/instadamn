package com.instagram.model.shopping.sizechart;

import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class SizeChartMeasurement implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(66);
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            parcel.writeByte((byte) 1);
            parcel.writeInt(intValue);
        } else {
            parcel.writeByte((byte) 0);
        }
        Integer num2 = this.A01;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            parcel.writeByte((byte) 1);
            parcel.writeInt(intValue2);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeString(this.A03);
    }
}
