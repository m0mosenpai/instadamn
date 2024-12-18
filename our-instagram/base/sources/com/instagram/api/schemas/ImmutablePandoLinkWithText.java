package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC33712Ev0;
import X.C17T;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class ImmutablePandoLinkWithText extends C17T implements LinkWithTextIntf {
    public static final AbstractC136426Fv CREATOR = new C39307HXy(10);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.LinkWithTextIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33712Ev0.A00(this));
    }

    @Override // com.instagram.api.schemas.LinkWithTextIntf
    public final LinkWithText Evt() {
        return new LinkWithText(A0P(), A0R());
    }

    @Override // com.instagram.api.schemas.LinkWithTextIntf
    public final String getText() {
        return A0P();
    }

    @Override // com.instagram.api.schemas.LinkWithTextIntf
    public final String getUrl() {
        return A0R();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
