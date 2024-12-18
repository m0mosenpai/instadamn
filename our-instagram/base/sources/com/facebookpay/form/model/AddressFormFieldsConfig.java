package com.facebookpay.form.model;

import X.AbstractC25231BEo;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class AddressFormFieldsConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(99);

    @SerializedName("defaultCountry")
    public final Country A00;

    @SerializedName("countries")
    public final List<FormCountry> A01;

    public AddressFormFieldsConfig(Country country, List list) {
        C14360o3.A0B(country, 1);
        this.A00 = country;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A01);
        while (A0u.hasNext()) {
            ((FormCountry) A0u.next()).writeToParcel(parcel, i);
        }
    }
}
