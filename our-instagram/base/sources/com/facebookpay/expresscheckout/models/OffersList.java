package com.facebookpay.expresscheckout.models;

import X.AbstractC25231BEo;
import X.C14360o3;
import X.C16930sl;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class OffersList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(56);

    @SerializedName("offersList")
    public final List<ECPOffer> A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A00);
        while (A0u.hasNext()) {
            ((ECPOffer) A0u.next()).writeToParcel(parcel, i);
        }
    }

    public OffersList(List list) {
        this.A00 = list;
    }

    public OffersList() {
        this(C16930sl.A00);
    }
}
