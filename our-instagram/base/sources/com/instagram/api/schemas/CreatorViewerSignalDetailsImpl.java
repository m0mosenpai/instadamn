package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC39877HmQ;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class CreatorViewerSignalDetailsImpl extends C0T6 implements Parcelable, CreatorViewerSignalDetails {
    public static final Parcelable.Creator CREATOR = C41854Ig8.A00(50);
    public final CreatorViewerSignalAudioDetails A00;
    public final CreatorViewerSignalPlainDetails A01;
    public final CreatorViewerSignalReelsTextDetails A02;

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalDetailsImpl Est(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalDetailsImpl Esu(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreatorViewerSignalDetailsImpl) {
                CreatorViewerSignalDetailsImpl creatorViewerSignalDetailsImpl = (CreatorViewerSignalDetailsImpl) obj;
                if (!C14360o3.A0K(this.A00, creatorViewerSignalDetailsImpl.A00) || !C14360o3.A0K(this.A01, creatorViewerSignalDetailsImpl.A01) || !C14360o3.A0K(this.A02, creatorViewerSignalDetailsImpl.A02)) {
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
        parcel.writeParcelable(this.A02, i);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalAudioDetails Adm() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalPlainDetails Bdg() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalReelsTextDetails Bm4() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerSignalDetails", AbstractC39877HmQ.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public CreatorViewerSignalDetailsImpl(CreatorViewerSignalAudioDetails creatorViewerSignalAudioDetails, CreatorViewerSignalPlainDetails creatorViewerSignalPlainDetails, CreatorViewerSignalReelsTextDetails creatorViewerSignalReelsTextDetails) {
        this.A00 = creatorViewerSignalAudioDetails;
        this.A01 = creatorViewerSignalPlainDetails;
        this.A02 = creatorViewerSignalReelsTextDetails;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalDetails E8z(C1DY c1dy) {
        return this;
    }
}
