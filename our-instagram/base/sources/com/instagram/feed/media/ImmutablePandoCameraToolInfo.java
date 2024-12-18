package com.instagram.feed.media;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39305HXw;
import X.C57637Phn;
import X.I02;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CameraTool;

/* loaded from: classes7.dex */
public final class ImmutablePandoCameraToolInfo extends C17T implements CameraToolInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(32);

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final CameraTool Ak6() {
        return (CameraTool) A0M(2059177586, C57637Phn.A00);
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I02.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final Float Azs() {
        return A0K(-1399061142);
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final Float Bz8() {
        return A0K(1348502743);
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final Float C8c() {
        return A0K(-328023079);
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final CameraToolInfo F4T() {
        return new CameraToolInfo(Ak6(), A0K(-1399061142), A0K(1348502743), A0K(-328023079));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
