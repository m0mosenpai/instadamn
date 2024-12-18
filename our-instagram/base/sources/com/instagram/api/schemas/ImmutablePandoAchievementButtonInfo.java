package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class ImmutablePandoAchievementButtonInfo extends C17T implements AchievementButtonInfo {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(1);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AchievementButtonInfo
    public final String Aj7() {
        return A0h(-1759410662);
    }

    @Override // com.instagram.api.schemas.AchievementButtonInfo
    public final String Aw9() {
        return A0h(1169975446);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
