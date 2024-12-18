package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import X.C43228J8z;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoAdvantageAudienceData extends C17T implements AdvantageAudienceData {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(3);

    @Override // com.instagram.api.schemas.AdvantageAudienceData
    public final XFBTargetingAutomationAdvantageAudienceStatus AaJ() {
        return (XFBTargetingAutomationAdvantageAudienceStatus) A0N(-1413005703, C43228J8z.A00);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AdvantageAudienceData
    public final Integer BTn() {
        return getOptionalIntValueByHashCode(-683686230);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
