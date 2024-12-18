package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.AbstractC39881HmU;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39306HXx;
import X.J9Z;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorViewerSignalModel extends C17T implements CreatorViewerSignalModel {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(52);
    public CreatorViewerSignalDetails A00;

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final CreatorViewerSignalDetails AxA() {
        CreatorViewerSignalDetails creatorViewerSignalDetails = this.A00;
        if (creatorViewerSignalDetails == null) {
            return (CreatorViewerSignalDetails) A04(1557721666, ImmutablePandoCreatorViewerSignalDetails.class);
        }
        return creatorViewerSignalDetails;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final InspirationSignalType BxI() {
        return (InspirationSignalType) A0M(673104497, J9Z.A00);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39881HmU.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final CreatorViewerSignalModel E90(C1DY c1dy) {
        CreatorViewerSignalDetails AxA = AxA();
        AxA.E8z(c1dy);
        this.A00 = AxA;
        return this;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final CreatorViewerSignalModelImpl Esw(C1DY c1dy) {
        return new CreatorViewerSignalModelImpl(AxA().Est(c1dy), BxI(), A0S());
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final CreatorViewerSignalModelImpl Esx(C1DV c1dv) {
        return Esw(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final String getTitle() {
        return A0S();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
