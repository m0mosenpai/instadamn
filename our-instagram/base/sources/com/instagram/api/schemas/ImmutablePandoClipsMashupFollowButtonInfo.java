package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37425Ge5;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoClipsMashupFollowButtonInfo extends C17T implements ClipsMashupFollowButtonInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(30);

    @Override // com.instagram.api.schemas.ClipsMashupFollowButtonInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37425Ge5.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.ClipsMashupFollowButtonInfo
    public final Boolean BwL() {
        return getOptionalBooleanValueByHashCode(715401370);
    }

    @Override // com.instagram.api.schemas.ClipsMashupFollowButtonInfo
    public final Boolean CZs() {
        return getOptionalBooleanValueByHashCode(961967720);
    }

    @Override // com.instagram.api.schemas.ClipsMashupFollowButtonInfo
    public final ClipsMashupFollowButtonInfoImpl Erz() {
        return new ClipsMashupFollowButtonInfoImpl(getOptionalBooleanValueByHashCode(961967720), getOptionalBooleanValueByHashCode(715401370));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
