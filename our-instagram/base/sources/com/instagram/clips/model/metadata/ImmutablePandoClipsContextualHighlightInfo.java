package com.instagram.clips.model.metadata;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37427Ge7;
import X.C17T;
import X.C39305HXw;
import X.JCD;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualHighlightType;

/* loaded from: classes7.dex */
public final class ImmutablePandoClipsContextualHighlightInfo extends C17T implements ClipsContextualHighlightInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(29);

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final ContextualHighlightType ArX() {
        return (ContextualHighlightType) A0M(-25701741, JCD.A00);
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37427Ge7.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final ClipsContextualHighlightInfo F4F() {
        return new ClipsContextualHighlightInfo(ArX(), A0i(1019042900), A0h(473715380), A0h(-797226465));
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final String getChainingMediaId() {
        return A0i(1019042900);
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final String getContextualHighlightId() {
        return A0h(473715380);
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final String getContextualHighlightTitle() {
        return A0h(-797226465);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
