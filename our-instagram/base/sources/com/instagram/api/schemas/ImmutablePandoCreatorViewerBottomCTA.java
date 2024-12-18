package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39866HmF;
import X.C17T;
import X.C39306HXx;
import X.J9S;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorViewerBottomCTA extends C17T implements CreatorViewerBottomCTA {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(46);

    @Override // com.instagram.api.schemas.CreatorViewerBottomCTA
    public final CreatorViewerBottomCTAType AhZ() {
        return (CreatorViewerBottomCTAType) A0M(1278830493, J9S.A00);
    }

    @Override // com.instagram.api.schemas.CreatorViewerBottomCTA
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39866HmF.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorViewerBottomCTA
    public final CreatorViewerBottomCTAImpl Esl() {
        return new CreatorViewerBottomCTAImpl(AhZ(), A0P());
    }

    @Override // com.instagram.api.schemas.CreatorViewerBottomCTA
    public final String getText() {
        return A0P();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
