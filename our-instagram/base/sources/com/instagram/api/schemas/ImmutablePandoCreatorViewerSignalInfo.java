package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39879HmS;
import X.C17T;
import X.C39306HXx;
import X.J9Y;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorViewerSignalInfo extends C17T implements CreatorViewerSignalInfo {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(51);

    @Override // com.instagram.api.schemas.CreatorViewerSignalInfo
    public final CreatorViewerSignalType BxH() {
        return (CreatorViewerSignalType) A0M(673104497, J9Y.A00);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39879HmS.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalInfo
    public final CreatorViewerSignalInfoImpl Esv() {
        return new CreatorViewerSignalInfoImpl(BxH(), A0P());
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalInfo
    public final String getText() {
        return A0P();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
