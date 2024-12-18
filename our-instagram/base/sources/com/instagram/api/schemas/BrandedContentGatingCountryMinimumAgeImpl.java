package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31181DnP;
import X.AbstractC37300Gc1;
import X.AbstractC39778Hko;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class BrandedContentGatingCountryMinimumAgeImpl extends C0T6 implements Parcelable, BrandedContentGatingCountryMinimumAge {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(78);
    public final Integer A00;
    public final String A01;

    @Override // com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge
    public final BrandedContentGatingCountryMinimumAgeImpl ErM() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrandedContentGatingCountryMinimumAgeImpl) {
                BrandedContentGatingCountryMinimumAgeImpl brandedContentGatingCountryMinimumAgeImpl = (BrandedContentGatingCountryMinimumAgeImpl) obj;
                if (!C14360o3.A0K(this.A01, brandedContentGatingCountryMinimumAgeImpl.A01) || !C14360o3.A0K(this.A00, brandedContentGatingCountryMinimumAgeImpl.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge
    public final String As9() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge
    public final Integer BU7() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTBrandedContentGatingCountryMinimumAge", AbstractC39778Hko.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public BrandedContentGatingCountryMinimumAgeImpl(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }
}
