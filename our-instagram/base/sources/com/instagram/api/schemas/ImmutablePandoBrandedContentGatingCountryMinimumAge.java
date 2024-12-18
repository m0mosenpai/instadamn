package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39778Hko;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoBrandedContentGatingCountryMinimumAge extends C17T implements BrandedContentGatingCountryMinimumAge {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(20);

    @Override // com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39778Hko.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge
    public final String As9() {
        return A0i(1481071862);
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge
    public final Integer BU7() {
        return getOptionalIntValueByHashCode(1008566606);
    }

    @Override // com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge
    public final BrandedContentGatingCountryMinimumAgeImpl ErM() {
        return new BrandedContentGatingCountryMinimumAgeImpl(A0i(1481071862), getOptionalIntValueByHashCode(1008566606));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
