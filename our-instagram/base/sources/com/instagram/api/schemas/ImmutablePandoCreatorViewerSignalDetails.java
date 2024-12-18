package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.AbstractC39877HmQ;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoCreatorViewerSignalDetails extends C17T implements CreatorViewerSignalDetails {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(50);
    public CreatorViewerSignalAudioDetails A00;

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalAudioDetails Adm() {
        CreatorViewerSignalAudioDetails creatorViewerSignalAudioDetails = this.A00;
        if (creatorViewerSignalAudioDetails == null) {
            return (CreatorViewerSignalAudioDetails) A05(1918893785, ImmutablePandoCreatorViewerSignalAudioDetails.class);
        }
        return creatorViewerSignalAudioDetails;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalPlainDetails Bdg() {
        return (CreatorViewerSignalPlainDetails) A05(-740554547, ImmutablePandoCreatorViewerSignalPlainDetails.class);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalReelsTextDetails Bm4() {
        return (CreatorViewerSignalReelsTextDetails) A05(300614166, ImmutablePandoCreatorViewerSignalReelsTextDetails.class);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39877HmQ.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalDetails E8z(C1DY c1dy) {
        CreatorViewerSignalAudioDetails Adm = Adm();
        if (Adm != null) {
            Adm.E8y(c1dy);
        } else {
            Adm = null;
        }
        this.A00 = Adm;
        return this;
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalDetailsImpl Est(C1DY c1dy) {
        CreatorViewerSignalAudioDetailsImpl creatorViewerSignalAudioDetailsImpl;
        CreatorViewerSignalPlainDetailsImpl creatorViewerSignalPlainDetailsImpl;
        CreatorViewerSignalAudioDetails Adm = Adm();
        CreatorViewerSignalReelsTextDetailsImpl creatorViewerSignalReelsTextDetailsImpl = null;
        if (Adm != null) {
            creatorViewerSignalAudioDetailsImpl = Adm.Esr(c1dy);
        } else {
            creatorViewerSignalAudioDetailsImpl = null;
        }
        CreatorViewerSignalPlainDetails Bdg = Bdg();
        if (Bdg != null) {
            creatorViewerSignalPlainDetailsImpl = Bdg.Esy();
        } else {
            creatorViewerSignalPlainDetailsImpl = null;
        }
        CreatorViewerSignalReelsTextDetails Bm4 = Bm4();
        if (Bm4 != null) {
            creatorViewerSignalReelsTextDetailsImpl = Bm4.Esz();
        }
        return new CreatorViewerSignalDetailsImpl(creatorViewerSignalAudioDetailsImpl, creatorViewerSignalPlainDetailsImpl, creatorViewerSignalReelsTextDetailsImpl);
    }

    @Override // com.instagram.api.schemas.CreatorViewerSignalDetails
    public final CreatorViewerSignalDetailsImpl Esu(C1DV c1dv) {
        return Est(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
