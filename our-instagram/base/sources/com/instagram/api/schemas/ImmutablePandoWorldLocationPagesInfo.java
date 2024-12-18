package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40457Hwm;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoWorldLocationPagesInfo extends C17T implements WorldLocationPagesInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(25);

    @Override // com.instagram.api.schemas.WorldLocationPagesInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40457Hwm.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.WorldLocationPagesInfo
    public final Integer Ber() {
        return getOptionalIntValueByHashCode(1946899632);
    }

    @Override // com.instagram.api.schemas.WorldLocationPagesInfo
    public final WorldLocationPagesInfoImpl F40() {
        return new WorldLocationPagesInfoImpl(A0i(178851754), getOptionalIntValueByHashCode(1946899632), A0i(36230376));
    }

    @Override // com.instagram.api.schemas.WorldLocationPagesInfo
    public final String getCoverPhoto() {
        return A0i(178851754);
    }

    @Override // com.instagram.api.schemas.WorldLocationPagesInfo
    public final String getWorldId() {
        return A0i(36230376);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
