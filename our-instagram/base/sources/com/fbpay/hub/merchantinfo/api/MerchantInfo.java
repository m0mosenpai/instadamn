package com.fbpay.hub.merchantinfo.api;

import X.AbstractC25235BEs;
import X.AbstractC58321PtD;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63470SlB;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class MerchantInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(30);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MerchantInfo) {
                MerchantInfo merchantInfo = (MerchantInfo) obj;
                if (!C14360o3.A0K(this.A00, merchantInfo.A00) || !C14360o3.A0K(this.A01, merchantInfo.A01) || !C14360o3.A0K(this.A02, merchantInfo.A02) || !C14360o3.A0K(this.A04, merchantInfo.A04) || !C14360o3.A0K(this.A03, merchantInfo.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A04)) * 31) + AbstractC25235BEs.A06(this.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }

    public MerchantInfo(Parcel parcel) {
        AbstractC58321PtD.A1O(this);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
    }
}
