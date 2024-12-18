package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C16930sl;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes11.dex */
public final class PromoCodeList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(62);

    @SerializedName("promoCodeList")
    public final List<String> A00;

    public PromoCodeList(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
    }

    public PromoCodeList() {
        this(C16930sl.A00);
    }
}
