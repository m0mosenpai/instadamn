package com.facebookpay.expresscheckout.models;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C70221WIe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.intent.IntentModule;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes10.dex */
public final class CheckoutSetupKeyValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70221WIe(39);

    @SerializedName("key")
    public final String A00;

    @SerializedName(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public CheckoutSetupKeyValue(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
