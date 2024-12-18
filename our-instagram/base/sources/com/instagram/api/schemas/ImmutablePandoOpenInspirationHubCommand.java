package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import X.JAO;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoOpenInspirationHubCommand extends C17T implements OpenInspirationHubCommand {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(32);

    @Override // com.instagram.api.schemas.OpenInspirationHubCommand
    public final XDTCreatorInspirationHubType C5X() {
        return (XDTCreatorInspirationHubType) A0N(486944743, JAO.A00);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.OpenInspirationHubCommand
    public final OpenInspirationHubCommandImpl Exd() {
        return new OpenInspirationHubCommandImpl(C5X());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
