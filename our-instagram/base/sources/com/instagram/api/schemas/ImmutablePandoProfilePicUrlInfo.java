package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC31218Do1;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class ImmutablePandoProfilePicUrlInfo extends C17T implements ProfilePicUrlInfo {
    public static final AbstractC136426Fv CREATOR = new C39307HXy(66);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProfilePicUrlInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC31218Do1.A00(this));
    }

    @Override // com.instagram.api.schemas.ProfilePicUrlInfo
    public final ProfilePicUrlInfoImpl Eyf() {
        return new ProfilePicUrlInfoImpl(getIntValueByHashCode(-1221029593), A0R(), getIntValueByHashCode(113126854));
    }

    @Override // com.instagram.api.schemas.ProfilePicUrlInfo
    public final int getHeight() {
        return getIntValueByHashCode(-1221029593);
    }

    @Override // com.instagram.api.schemas.ProfilePicUrlInfo
    public final String getUrl() {
        return A0R();
    }

    @Override // com.instagram.api.schemas.ProfilePicUrlInfo
    public final int getWidth() {
        return getIntValueByHashCode(113126854);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
