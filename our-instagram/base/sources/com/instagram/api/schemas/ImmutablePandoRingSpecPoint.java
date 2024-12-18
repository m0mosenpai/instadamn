package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40220Hsj;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.tigon.tigonhuc.HucClient;

/* loaded from: classes7.dex */
public final class ImmutablePandoRingSpecPoint extends C17T implements RingSpecPoint {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(73);

    @Override // com.instagram.api.schemas.RingSpecPoint
    public final float CI0() {
        return A02(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
    }

    @Override // com.instagram.api.schemas.RingSpecPoint
    public final float CIZ() {
        return A02(121);
    }

    @Override // com.instagram.api.schemas.RingSpecPoint
    public final RingSpecPointImpl EzG() {
        return new RingSpecPointImpl(A02(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), A02(121));
    }

    @Override // com.instagram.api.schemas.RingSpecPoint
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40220Hsj.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
