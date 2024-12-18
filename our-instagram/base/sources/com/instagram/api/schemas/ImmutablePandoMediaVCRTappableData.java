package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC166987dD;
import X.AbstractC225489xD;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.AbstractC37303Gc4;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class ImmutablePandoMediaVCRTappableData extends C17T implements MediaVCRTappableDataIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(19);
    public User A00;

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final User BZm() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'originalCommentAuthor' field.");
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC225489xD.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final Float B29() {
        return A0E();
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String BZs() {
        return A0i(-930319210);
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final Float Bzq() {
        return A0D();
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final MediaVCRTappableDataIntf E9F(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0P(c1dy, this, 963379097);
        return this;
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final MediaVCRTappableData EwX(C1DY c1dy) {
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-2048029722);
        String A0i = A0i(-209971210);
        Float A0E = A0E();
        return new MediaVCRTappableData((User) AbstractC37303Gc4.A07(c1dy, this, 963379097), A0E, A0D(), A0i, A0k(-1970527703), A0h(403787451), A0i(-930319210), A0k(-1824429564), A0i(-132220081), AbstractC37301Gc2.A0l(this), booleanValueByHashCode);
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final MediaVCRTappableData EwY(C1DV c1dv) {
        return EwX(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final boolean getCanViewerLinkBackToOriginalMediaFromVcr() {
        return getBooleanValueByHashCode(-2048029722);
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getEndBackgroundColor() {
        return A0i(-209971210);
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getOriginalCommentId() {
        return A0k(-1970527703);
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getOriginalCommentText() {
        return A0h(403787451);
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getOriginalMediaId() {
        return A0k(-1824429564);
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getStartBackgroundColor() {
        return A0i(-132220081);
    }

    @Override // com.instagram.api.schemas.MediaVCRTappableDataIntf
    public final String getTextColor() {
        return AbstractC37301Gc2.A0l(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
