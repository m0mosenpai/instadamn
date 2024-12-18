package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;

/* loaded from: classes6.dex */
public final class ImmutablePandoRIXUTextLink extends C17T implements RIXUTextLink {
    public static final AbstractC136426Fv CREATOR = new C39307HXy(69);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.RIXUTextLink
    public final RIXUTextLinkImpl Eyx() {
        return new RIXUTextLinkImpl(getOptionalIntValueByHashCode(100571), getOptionalIntValueByHashCode(109757538), A0e(), A0i(3575610));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
