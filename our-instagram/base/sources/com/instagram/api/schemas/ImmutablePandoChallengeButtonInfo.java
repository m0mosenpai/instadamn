package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import X.C71804X5i;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class ImmutablePandoChallengeButtonInfo extends C17T implements ChallengeButtonInfo {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(27);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ChallengeButtonInfo
    public final ChallengeButtonAction Aiw() {
        return (ChallengeButtonAction) A0M(877541347, C71804X5i.A00);
    }

    @Override // com.instagram.api.schemas.ChallengeButtonInfo
    public final String Aj7() {
        return A0h(-1759410662);
    }

    @Override // com.instagram.api.schemas.ChallengeButtonInfo
    public final String Aw9() {
        return A0h(1169975446);
    }

    @Override // com.instagram.api.schemas.ChallengeButtonInfo
    public final ChallengeButtonInfoImpl Eri() {
        return new ChallengeButtonInfoImpl(Aiw(), A0h(-1759410662), A0h(1169975446));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
