package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37386GdS;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCollabFollowButtonInfo extends C17T implements CollabFollowButtonInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(33);

    @Override // com.instagram.api.schemas.CollabFollowButtonInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37386GdS.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CollabFollowButtonInfo
    public final Boolean BwM() {
        return getOptionalBooleanValueByHashCode(-1754088002);
    }

    @Override // com.instagram.api.schemas.CollabFollowButtonInfo
    public final Boolean CZy() {
        return getOptionalBooleanValueByHashCode(-581624414);
    }

    @Override // com.instagram.api.schemas.CollabFollowButtonInfo
    public final CollabFollowButtonInfoImpl EsI() {
        return new CollabFollowButtonInfoImpl(getOptionalBooleanValueByHashCode(-581624414), getOptionalBooleanValueByHashCode(-1754088002));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
