package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;

/* loaded from: classes7.dex */
public final class ImmutablePandoMusicStatusStyleResponseInfo extends C17T implements MusicStatusStyleResponseInfo {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(23);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.MusicStatusStyleResponseInfo
    public final MusicStatusStyleResponseInfoImpl Ex3() {
        return new MusicStatusStyleResponseInfoImpl(A0h(1025801609), A0h(1258734948), A0h(1589871550));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
