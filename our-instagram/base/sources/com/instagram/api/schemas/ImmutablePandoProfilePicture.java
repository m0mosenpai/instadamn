package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoProfilePicture extends C17T implements ProfilePicture {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(67);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ProfilePicture
    public final ImageUrl CDO() {
        return A0A(116076);
    }

    @Override // com.instagram.api.schemas.ProfilePicture
    public final ProfilePictureImpl Eyg() {
        return new ProfilePictureImpl(A0A(116076));
    }

    @Override // com.instagram.api.schemas.ProfilePicture
    public final TreeUpdaterJNI F7o() {
        String str;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (CDO() != null) {
            ImageUrl CDO = CDO();
            if (CDO != null) {
                str = CDO.getUrl();
            } else {
                str = null;
            }
            A0X.put("uri", str);
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}