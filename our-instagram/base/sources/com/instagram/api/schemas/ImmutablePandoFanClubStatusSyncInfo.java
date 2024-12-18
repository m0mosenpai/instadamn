package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37378GdK;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoFanClubStatusSyncInfo extends C17T implements FanClubStatusSyncInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(69);

    @Override // com.instagram.api.schemas.FanClubStatusSyncInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37378GdK.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.FanClubStatusSyncInfo
    public final boolean B1B() {
        return getBooleanValueByHashCode(-352293394);
    }

    @Override // com.instagram.api.schemas.FanClubStatusSyncInfo
    public final boolean C3R() {
        return getBooleanValueByHashCode(-1219769254);
    }

    @Override // com.instagram.api.schemas.FanClubStatusSyncInfo
    public final Long C3S() {
        return A0L(518883585);
    }

    @Override // com.instagram.api.schemas.FanClubStatusSyncInfo
    public final FanClubStatusSyncInfoImpl EtR() {
        return new FanClubStatusSyncInfoImpl(A0L(518883585), getBooleanValueByHashCode(-352293394), getBooleanValueByHashCode(-1219769254));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
