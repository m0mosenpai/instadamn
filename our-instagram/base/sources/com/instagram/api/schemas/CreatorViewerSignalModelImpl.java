package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.AbstractC37300Gc1;
import X.AbstractC39881HmU;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CreatorViewerSignalModelImpl extends C0T6 implements CreatorViewerSignalModel, Parcelable {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(52);
    public final CreatorViewerSignalDetails A00;
    public final InspirationSignalType A01;
    public final String A02;

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final CreatorViewerSignalModelImpl Esw(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final CreatorViewerSignalModelImpl Esx(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalModelImpl) {
                CreatorViewerSignalModelImpl creatorViewerSignalModelImpl = (CreatorViewerSignalModelImpl) obj;
                if (!C14360o3.A0K(this.A00, creatorViewerSignalModelImpl.A00) || this.A01 != creatorViewerSignalModelImpl.A01 || !C14360o3.A0K(this.A02, creatorViewerSignalModelImpl.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final CreatorViewerSignalDetails AxA() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final InspirationSignalType BxI() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerSignalModel", AbstractC39881HmU.A00(this));
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public CreatorViewerSignalModelImpl(CreatorViewerSignalDetails creatorViewerSignalDetails, InspirationSignalType inspirationSignalType, String str) {
        AbstractC167027dH.A13(creatorViewerSignalDetails, inspirationSignalType, str);
        this.A00 = creatorViewerSignalDetails;
        this.A01 = inspirationSignalType;
        this.A02 = str;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalModel
    public final CreatorViewerSignalModel E90(C1DY c1dy) {
        return this;
    }
}
