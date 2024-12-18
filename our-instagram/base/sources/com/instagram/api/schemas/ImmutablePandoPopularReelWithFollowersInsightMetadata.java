package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40151HrK;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoPopularReelWithFollowersInsightMetadata extends C17T implements PopularReelWithFollowersInsightMetadata {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(43);

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40151HrK.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final List BR1() {
        return A0n(2140775389);
    }

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final PopularReelWithFollowersInsightMetadataImpl Ey4() {
        return new PopularReelWithFollowersInsightMetadataImpl(A0n(2140775389), getIntValueByHashCode(-792455577), getIntValueByHashCode(1911031876), getIntValueByHashCode(1456374940));
    }

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final int getLikeCount() {
        return getIntValueByHashCode(-792455577);
    }

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final int getPlayCount() {
        return getIntValueByHashCode(1911031876);
    }

    @Override // com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata
    public final int getReshareCount() {
        return getIntValueByHashCode(1456374940);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
