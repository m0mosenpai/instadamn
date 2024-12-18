package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40461Hwq;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoXpostOriginalSoundFBCreatorInfo extends C17T implements XpostOriginalSoundFBCreatorInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(28);

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40461Hwq.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final String Asy() {
        return A0i(-1606095170);
    }

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final String At0() {
        return A0i(-857419179);
    }

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final String B4m() {
        return A0i(1447602198);
    }

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final String B4n() {
        return A0i(-318338504);
    }

    @Override // com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo
    public final XpostOriginalSoundFBCreatorInfoImpl F46() {
        return new XpostOriginalSoundFBCreatorInfoImpl(A0i(-1606095170), A0i(-857419179), A0i(1447602198), A0i(-318338504));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
