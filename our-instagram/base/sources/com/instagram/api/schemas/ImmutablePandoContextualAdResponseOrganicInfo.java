package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoContextualAdResponseOrganicInfo extends C17T implements ContextualAdResponseOrganicInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(44);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ContextualAdResponseOrganicInfo
    public final ContextualAdResponseOrganicInfoImpl EsY() {
        return new ContextualAdResponseOrganicInfoImpl(A0i(2040281362), A0i(680614244));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
