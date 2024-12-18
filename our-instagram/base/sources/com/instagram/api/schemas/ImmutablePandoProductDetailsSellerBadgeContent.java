package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoProductDetailsSellerBadgeContent extends C17T implements ProductDetailsSellerBadgeContent {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(48);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProductDetailsSellerBadgeContent
    public final ProductDetailsSellerBadgeContentImpl EyL() {
        return new ProductDetailsSellerBadgeContentImpl(A0h(-1724546052), A0S());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
