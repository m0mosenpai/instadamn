package com.facebook.iabadscontext;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class IgPromoAdsPromoCode extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(14);
    public final String A00;
    public final String A01;

    public IgPromoAdsPromoCode(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgPromoAdsPromoCode) {
                IgPromoAdsPromoCode igPromoAdsPromoCode = (IgPromoAdsPromoCode) obj;
                if (!C14360o3.A0K(this.A01, igPromoAdsPromoCode.A01) || !C14360o3.A0K(this.A00, igPromoAdsPromoCode.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("IgPromoAdsPromoCode(promoCodeAutofillText=", this.A01, ", offerId=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A00);
    }
}
