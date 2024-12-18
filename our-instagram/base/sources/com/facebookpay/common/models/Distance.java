package com.facebookpay.common.models;

import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.intent.IntentModule;
import com.fbpay.ptt.interfaces.SerializedName;

/* loaded from: classes11.dex */
public final class Distance implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(89);

    @SerializedName(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)
    public final double A00;

    @SerializedName("unit")
    public final Integer A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeDouble(this.A00);
        if (1 - this.A01.intValue() != 0) {
            str = "MILES";
        } else {
            str = "KILOMETERS";
        }
        parcel.writeString(str);
    }

    public Distance(Integer num, double d) {
        this.A00 = d;
        this.A01 = num;
    }
}
