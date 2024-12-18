package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoContextualAdResponseExtras extends C17T implements ContextualAdResponseExtras {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(43);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ContextualAdResponseExtras
    public final ContextualAdResponseExtrasImpl EsX() {
        return new ContextualAdResponseExtrasImpl(A0i(1208718508), A0i(2096152009), A0i(-1989826711), A0i(375833953));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
