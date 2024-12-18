package com.facebook.browser.lite.extensions.commercecheckout.constant;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class MetaCheckoutRequest extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(17);
    public final Integer A00;
    public final String A01;

    public MetaCheckoutRequest(Integer num, String str) {
        C14360o3.A0B(num, 1);
        this.A00 = num;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaCheckoutRequest) {
                MetaCheckoutRequest metaCheckoutRequest = (MetaCheckoutRequest) obj;
                if (this.A00 != metaCheckoutRequest.A00 || !C14360o3.A0K(this.A01, metaCheckoutRequest.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        if (1 - this.A00.intValue() != 0) {
            str = "LOAD_URL";
        } else {
            str = "IGNORE_META_CHECKOUT";
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "LOAD_URL";
        } else {
            str = "IGNORE_META_CHECKOUT";
        }
        return ((str.hashCode() + intValue) * 31) + AbstractC167017dG.A0O(this.A01);
    }
}
