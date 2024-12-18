package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class ImmutablePandoCloseToEarningAchievementMedia extends C17T implements CloseToEarningAchievementMediaIntf {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(32);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CloseToEarningAchievementMediaIntf
    public final String BQi() {
        return A0i(-1252854633);
    }

    @Override // com.instagram.api.schemas.CloseToEarningAchievementMediaIntf
    public final int BiJ() {
        return getIntValueByHashCode(-1001078227);
    }

    @Override // com.instagram.api.schemas.CloseToEarningAchievementMediaIntf
    public final String getMediaId() {
        return A0k(-900774058);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
