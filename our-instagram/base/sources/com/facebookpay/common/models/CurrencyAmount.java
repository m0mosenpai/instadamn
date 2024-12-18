package com.facebookpay.common.models;

import X.AbstractC167017dG;
import X.AbstractC37301Gc2;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.intent.IntentModule;
import com.fbpay.ptt.interfaces.SerializedName;

/* loaded from: classes11.dex */
public final class CurrencyAmount implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(88);

    @SerializedName("currency")
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

    public final boolean equals(Object obj) {
        if (obj instanceof CurrencyAmount) {
            CurrencyAmount currencyAmount = (CurrencyAmount) obj;
            if (C14360o3.A0K(this.A00, currencyAmount.A00) && C14360o3.A0K(this.A01, currencyAmount.A01)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A00, this.A01);
    }

    public CurrencyAmount(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
