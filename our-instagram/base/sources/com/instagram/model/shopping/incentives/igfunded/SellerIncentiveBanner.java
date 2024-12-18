package com.instagram.model.shopping.incentives.igfunded;

import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class SellerIncentiveBanner extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C41856IgA.A00(34);
    public final String A00;
    public final List A01;
    public final long A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SellerIncentiveBanner) {
                SellerIncentiveBanner sellerIncentiveBanner = (SellerIncentiveBanner) obj;
                if (!C14360o3.A0K(this.A05, sellerIncentiveBanner.A05) || !C14360o3.A0K(this.A01, sellerIncentiveBanner.A01) || !C14360o3.A0K(this.A03, sellerIncentiveBanner.A03) || this.A02 != sellerIncentiveBanner.A02 || !C14360o3.A0K(this.A04, sellerIncentiveBanner.A04) || !C14360o3.A0K(this.A00, sellerIncentiveBanner.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                ((SellerIncentiveBannerBottomSheetContent) A0l.next()).writeToParcel(parcel, i);
            }
        }
        AbstractC167027dH.A0o(parcel, this.A03, 0, 1);
        parcel.writeLong(this.A02);
        AbstractC167027dH.A0o(parcel, this.A04, 0, 1);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return ((AbstractC25236BEt.A01(this.A02, ((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public SellerIncentiveBanner(Integer num, Integer num2, String str, String str2, List list, long j) {
        this.A05 = str;
        this.A01 = list;
        this.A03 = num;
        this.A02 = j;
        this.A04 = num2;
        this.A00 = str2;
    }
}
