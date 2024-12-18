package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40128Hqv;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoOriginalityFollowButtonInfo extends C17T implements OriginalityFollowButtonInfo {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(36);

    @Override // com.instagram.api.schemas.OriginalityFollowButtonInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40128Hqv.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.OriginalityFollowButtonInfo
    public final Boolean BwL() {
        return getOptionalBooleanValueByHashCode(715401370);
    }

    @Override // com.instagram.api.schemas.OriginalityFollowButtonInfo
    public final Boolean CZs() {
        return getOptionalBooleanValueByHashCode(961967720);
    }

    @Override // com.instagram.api.schemas.OriginalityFollowButtonInfo
    public final OriginalityFollowButtonInfoImpl Exk() {
        return new OriginalityFollowButtonInfoImpl(getOptionalBooleanValueByHashCode(961967720), getOptionalBooleanValueByHashCode(715401370));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
