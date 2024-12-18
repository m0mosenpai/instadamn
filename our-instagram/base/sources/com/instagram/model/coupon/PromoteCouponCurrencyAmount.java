package com.instagram.model.coupon;

import X.C00O;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class PromoteCouponCurrencyAmount implements Parcelable {
    public static final C55343Oh9 CREATOR = new C55343Oh9(58);
    public int A00;
    public int A01;
    public String A02;
    public String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        String str = this.A02;
        if (str != null) {
            parcel.writeString(str);
            parcel.writeString(A00());
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01);
            return;
        }
        C14360o3.A0F("currencyCode");
        throw C00O.createAndThrow();
    }

    public final String A00() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("formattedAmount");
        throw C00O.createAndThrow();
    }
}
