package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC31215Dny;
import X.C17T;
import X.C34689FQa;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class ImmutablePandoFanClubInfoDict extends C17T implements FanClubInfoDict {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(68);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final /* synthetic */ C34689FQa AKK() {
        return new C34689FQa(this);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final FanClubFanConsiderationPageFeatureEligibilityResponse B4S() {
        return (FanClubFanConsiderationPageFeatureEligibilityResponse) A05(-1428488931, ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse.class);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC31215Dny.A00(this));
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Boolean AeJ() {
        return getOptionalBooleanValueByHashCode(-600279422);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Integer AqM() {
        return getOptionalIntValueByHashCode(-2056597344);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Boolean BBZ() {
        return getOptionalBooleanValueByHashCode(1479814607);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final String BLB() {
        return A0j(229563654);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Integer C3U() {
        return getOptionalIntValueByHashCode(1871614584);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Boolean CUI() {
        return getOptionalBooleanValueByHashCode(339805228);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final Boolean CUK() {
        return getOptionalBooleanValueByHashCode(-437875759);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final FanClubInfoDictImpl EtQ() {
        FanClubFanConsiderationPageFeatureEligibilityResponseImpl fanClubFanConsiderationPageFeatureEligibilityResponseImpl;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-600279422);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-2056597344);
        String A0j = A0j(1490909208);
        String A0i = A0i(-1755178424);
        FanClubFanConsiderationPageFeatureEligibilityResponse B4S = B4S();
        if (B4S != null) {
            fanClubFanConsiderationPageFeatureEligibilityResponseImpl = B4S.EtP();
        } else {
            fanClubFanConsiderationPageFeatureEligibilityResponseImpl = null;
        }
        return new FanClubInfoDictImpl(fanClubFanConsiderationPageFeatureEligibilityResponseImpl, optionalBooleanValueByHashCode, getOptionalBooleanValueByHashCode(1479814607), getOptionalBooleanValueByHashCode(339805228), getOptionalBooleanValueByHashCode(-437875759), optionalIntValueByHashCode, getOptionalIntValueByHashCode(1871614584), A0j, A0i, A0j(229563654));
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final String getFanClubId() {
        return A0j(1490909208);
    }

    @Override // com.instagram.api.schemas.FanClubInfoDict
    public final String getFanClubName() {
        return A0i(-1755178424);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
