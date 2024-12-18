package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoAudienceMessageEntityRange extends C17T implements AudienceMessageEntityRange {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(9);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AudienceMessageEntityRange
    public final Integer BN2() {
        return getOptionalIntValueByHashCode(-1106363674);
    }

    @Override // com.instagram.api.schemas.AudienceMessageEntityRange
    public final Integer BYa() {
        return getOptionalIntValueByHashCode(-1019779949);
    }

    @Override // com.instagram.api.schemas.AudienceMessageEntityRange
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
