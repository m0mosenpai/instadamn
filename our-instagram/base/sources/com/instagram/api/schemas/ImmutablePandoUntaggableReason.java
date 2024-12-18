package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC33765Evr;
import X.C17T;
import X.C39305HXw;
import X.GVI;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class ImmutablePandoUntaggableReason extends C17T implements UntaggableReasonIntf {
    public static final AbstractC136426Fv CREATOR = new C39305HXw(16);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final LinkWithTextIntf AYM() {
        return (LinkWithTextIntf) A05(-1422950858, ImmutablePandoLinkWithText.class);
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final LinkWithTextIntf BDX() {
        return (LinkWithTextIntf) A05(1297152568, ImmutablePandoLinkWithText.class);
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final InstagramProductTaggabilityState C51() {
        return (InstagramProductTaggabilityState) A0N(180641359, GVI.A00);
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33765Evr.A00(this));
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final UntaggableReason F3T() {
        LinkWithText linkWithText;
        LinkWithTextIntf AYM = AYM();
        LinkWithText linkWithText2 = null;
        if (AYM != null) {
            linkWithText = AYM.Evt();
        } else {
            linkWithText = null;
        }
        String A0T = A0T();
        LinkWithTextIntf BDX = BDX();
        if (BDX != null) {
            linkWithText2 = BDX.Evt();
        }
        return new UntaggableReason(C51(), linkWithText, linkWithText2, A0T, A0Y());
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final String getDescription() {
        return A0T();
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final String getTitle() {
        return A0Y();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
