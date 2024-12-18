package com.instagram.user.model;

import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoUnavailableProduct extends C17T implements UnavailableProduct {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(96);

    @Override // com.instagram.user.model.UnavailableProduct
    public final User BSW() {
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'merchant' field.");
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.user.model.UnavailableProduct
    public final String getProductId() {
        return A0k(1753008747);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
