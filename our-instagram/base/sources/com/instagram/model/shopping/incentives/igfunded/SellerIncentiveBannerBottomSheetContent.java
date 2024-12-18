package com.instagram.model.shopping.incentives.igfunded;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class SellerIncentiveBannerBottomSheetContent extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(35);
    public final String A00;
    public final String A01;
    public final String A02;

    public SellerIncentiveBannerBottomSheetContent(String str, String str2, String str3) {
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerIncentiveBannerBottomSheetContent) {
                SellerIncentiveBannerBottomSheetContent sellerIncentiveBannerBottomSheetContent = (SellerIncentiveBannerBottomSheetContent) obj;
                if (!C14360o3.A0K(this.A00, sellerIncentiveBannerBottomSheetContent.A00) || !C14360o3.A0K(this.A01, sellerIncentiveBannerBottomSheetContent.A01) || !C14360o3.A0K(this.A02, sellerIncentiveBannerBottomSheetContent.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A02);
    }
}
