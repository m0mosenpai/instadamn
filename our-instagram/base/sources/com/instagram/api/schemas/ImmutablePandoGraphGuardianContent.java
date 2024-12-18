package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;

/* loaded from: classes6.dex */
public final class ImmutablePandoGraphGuardianContent extends C17T implements GraphGuardianContent {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(78);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GraphGuardianContent
    public final String Agr() {
        return A0i(3029410);
    }

    @Override // com.instagram.api.schemas.GraphGuardianContent
    public final String Aj5() {
        return A0i(-1759645465);
    }

    @Override // com.instagram.api.schemas.GraphGuardianContent
    public final String AjA() {
        return A0i(1292959499);
    }

    @Override // com.instagram.api.schemas.GraphGuardianContent
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
