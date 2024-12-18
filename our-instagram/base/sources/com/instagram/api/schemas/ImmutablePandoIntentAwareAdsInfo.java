package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40034HpL;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIntentAwareAdsInfo extends C17T implements IntentAwareAdsInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(9);

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final IntentAwareAdsFormatInfo B7z() {
        return (IntentAwareAdsFormatInfo) A05(1458276342, ImmutablePandoIntentAwareAdsFormatInfo.class);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40034HpL.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String BIG() {
        return A0i(2096152009);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String BVC() {
        return A0i(-146593709);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final Integer BVJ() {
        return getOptionalIntValueByHashCode(-346560081);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String BVL() {
        return A0i(1296666401);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String Brx() {
        return A0i(-1989826711);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final Integer Bry() {
        return getOptionalIntValueByHashCode(-201146121);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String Brz() {
        return A0i(221664491);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final String CB4() {
        return A0i(375833953);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final Boolean CcZ() {
        return getOptionalBooleanValueByHashCode(1692758042);
    }

    @Override // com.instagram.api.schemas.IntentAwareAdsInfoIntf
    public final IntentAwareAdsInfo Evj() {
        IntentAwareAdsFormatInfoImpl intentAwareAdsFormatInfoImpl;
        IntentAwareAdsFormatInfo B7z = B7z();
        if (B7z != null) {
            intentAwareAdsFormatInfoImpl = B7z.Evi();
        } else {
            intentAwareAdsFormatInfoImpl = null;
        }
        String A0i = A0i(2096152009);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1692758042);
        String A0i2 = A0i(-146593709);
        return new IntentAwareAdsInfo(intentAwareAdsFormatInfoImpl, optionalBooleanValueByHashCode, getOptionalIntValueByHashCode(-346560081), getOptionalIntValueByHashCode(-201146121), A0i, A0i2, A0i(1296666401), A0i(-1989826711), A0i(221664491), A0i(375833953));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
