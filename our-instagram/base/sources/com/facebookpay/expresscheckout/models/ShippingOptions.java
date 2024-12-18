package com.facebookpay.expresscheckout.models;

import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Deprecated;

@Deprecated(message = "To be replaced with FulfillmentOptions")
/* loaded from: classes11.dex */
public final class ShippingOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(64);

    @SerializedName("defaultSelection")
    public final String A00;

    @SerializedName("shippingOptionList")
    public final ArrayList<ShippingOption> A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        ArrayList<ShippingOption> arrayList = this.A01;
        parcel.writeInt(arrayList.size());
        Iterator<ShippingOption> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public ShippingOptions(String str, ArrayList arrayList) {
        this.A00 = str;
        this.A01 = arrayList;
    }
}
