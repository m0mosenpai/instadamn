package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC37377GdJ;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoAttributionUser extends C17T implements AttributionUser {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(7);

    @Override // com.instagram.api.schemas.AttributionUser
    public final ProfilePicture Bhx() {
        return (ProfilePicture) A05(1782764648, ImmutablePandoProfilePicture.class);
    }

    @Override // com.instagram.api.schemas.AttributionUser
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37377GdJ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AttributionUser
    public final Boolean CfY() {
        return getOptionalBooleanValueByHashCode(1565553213);
    }

    @Override // com.instagram.api.schemas.AttributionUser
    public final AttributionUserImpl Eqz() {
        ProfilePictureImpl profilePictureImpl;
        String A0j = A0j(-1289631102);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1565553213);
        ProfilePicture Bhx = Bhx();
        if (Bhx != null) {
            profilePictureImpl = Bhx.Eyg();
        } else {
            profilePictureImpl = null;
        }
        return new AttributionUserImpl(profilePictureImpl, optionalBooleanValueByHashCode, A0j, AbstractC37301Gc2.A0m(this));
    }

    @Override // com.instagram.api.schemas.AttributionUser
    public final String getInstagramUserId() {
        return A0j(-1289631102);
    }

    @Override // com.instagram.api.schemas.AttributionUser
    public final String getUsername() {
        return AbstractC37301Gc2.A0m(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
