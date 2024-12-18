package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoRankingInfo extends C17T implements RankingInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(71);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.RankingInfoIntf
    public final String BlB() {
        return A0i(-1488714928);
    }

    @Override // com.instagram.api.schemas.RankingInfoIntf
    public final String BoG() {
        return A0i(1303313259);
    }

    @Override // com.instagram.api.schemas.RankingInfoIntf
    public final String CHt() {
        return A0j(127650833);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
