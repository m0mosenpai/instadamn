package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC31221Do4;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class ImmutablePandoFanClubFanConsiderationPageFeatureEligibilityResponse extends C17T implements FanClubFanConsiderationPageFeatureEligibilityResponse {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(67);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC31221Do4.A00(this));
    }

    @Override // com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse
    public final FanClubFanConsiderationPageFeatureEligibilityResponseImpl EtP() {
        return new FanClubFanConsiderationPageFeatureEligibilityResponseImpl(getBooleanValueByHashCode(-1816105012), getBooleanValueByHashCode(-1855218733));
    }

    @Override // com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse
    public final boolean getShouldShowContentPreview() {
        return getBooleanValueByHashCode(-1816105012);
    }

    @Override // com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponse
    public final boolean getShouldShowSocialContext() {
        return getBooleanValueByHashCode(-1855218733);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
