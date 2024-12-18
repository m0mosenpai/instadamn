package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoDevserverInfo extends C17T implements DevserverInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(57);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.DevserverInfo
    public final String getDescription() {
        return A0T();
    }

    @Override // com.instagram.api.schemas.DevserverInfo
    public final String getHostType() {
        return A0h(-717251727);
    }

    @Override // com.instagram.api.schemas.DevserverInfo
    public final String getUrl() {
        return A0R();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
