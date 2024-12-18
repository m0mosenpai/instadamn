package com.instagram.model.shopping.incentives.igfunded;

import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class SellerIncentiveBannerButton extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(36);
    public final String A00;

    public SellerIncentiveBannerButton(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SellerIncentiveBannerButton) && C14360o3.A0K(this.A00, ((SellerIncentiveBannerButton) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }
}
