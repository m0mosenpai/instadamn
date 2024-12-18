package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39775Hkl;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoBoostUpsellBannerPayloadSchema extends C17T implements BoostUpsellBannerPayloadSchema {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(18);

    @Override // com.instagram.api.schemas.BoostUpsellBannerPayloadSchema
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39775Hkl.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.BoostUpsellBannerPayloadSchema
    public final String Ah2() {
        return A0i(1253013930);
    }

    @Override // com.instagram.api.schemas.BoostUpsellBannerPayloadSchema
    public final String Anr() {
        return A0i(-1005018006);
    }

    @Override // com.instagram.api.schemas.BoostUpsellBannerPayloadSchema
    public final BoostUpsellBannerPayloadSchemaImpl ErK() {
        return new BoostUpsellBannerPayloadSchemaImpl(A0i(1852205030), A0i(1253013930), A0i(-1005018006));
    }

    @Override // com.instagram.api.schemas.BoostUpsellBannerPayloadSchema
    public final String getActionUrl() {
        return A0i(1852205030);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
