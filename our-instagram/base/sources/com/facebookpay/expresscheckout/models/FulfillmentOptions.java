package com.facebookpay.expresscheckout.models;

import X.AbstractC25229BEm;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class FulfillmentOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(53);

    @SerializedName("defaultSelection")
    public final String A00;

    @SerializedName("fulfillmentOptionList")
    public final ArrayList<FulfillmentOption> A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        ArrayList<FulfillmentOption> arrayList = this.A01;
        parcel.writeInt(arrayList.size());
        Iterator<FulfillmentOption> it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC25229BEm.A15(parcel, it, i);
        }
    }

    public FulfillmentOptions(String str, ArrayList arrayList) {
        this.A00 = str;
        this.A01 = arrayList;
    }
}
