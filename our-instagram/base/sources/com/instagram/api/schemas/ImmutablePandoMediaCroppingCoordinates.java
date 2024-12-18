package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC65733Tt8;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoMediaCroppingCoordinates extends C17T implements MediaCroppingCoordinatesIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(16);

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC65733Tt8.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final float AtD() {
        return A02(1750260410);
    }

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final float AtG() {
        return A02(1293727830);
    }

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final float AtI() {
        return A02(1456518061);
    }

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final float AtJ() {
        return A02(2119951142);
    }

    @Override // com.instagram.api.schemas.MediaCroppingCoordinatesIntf
    public final MediaCroppingCoordinates EwF() {
        return new MediaCroppingCoordinates(A02(1750260410), A02(1293727830), A02(1456518061), A02(2119951142));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
