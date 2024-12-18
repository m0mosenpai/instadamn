package com.facebookpay.expresscheckout.models;

import X.C05F;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class ItemDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(54);
    public String A00;
    public final Integer A01;

    public ItemDetails(Integer num, String str) {
        C14360o3.A0B(num, 1);
        this.A01 = num;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        if (this.A01.intValue() != 0) {
            str = "RESELLER";
        } else {
            str = "DEFAULT";
        }
        parcel.writeString(str);
        parcel.writeString(this.A00);
    }

    public ItemDetails() {
        this(C05F.A00, null);
    }
}
