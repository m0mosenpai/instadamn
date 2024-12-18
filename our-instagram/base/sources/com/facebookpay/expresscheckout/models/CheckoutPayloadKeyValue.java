package com.facebookpay.expresscheckout.models;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C70221WIe;
import X.EnumC68194VFm;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.intent.IntentModule;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public final class CheckoutPayloadKeyValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(37);

    @SerializedName("key")
    public final EnumC68194VFm A00;

    @SerializedName(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A00);
        parcel.writeString(this.A01);
    }

    public CheckoutPayloadKeyValue(EnumC68194VFm enumC68194VFm, String str) {
        AbstractC167017dG.A1P(enumC68194VFm, str);
        this.A00 = enumC68194VFm;
        this.A01 = str;
    }
}
