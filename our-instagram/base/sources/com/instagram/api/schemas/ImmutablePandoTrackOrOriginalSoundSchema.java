package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40425HwG;
import X.C17T;
import X.C1DY;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoTrackOrOriginalSoundSchema extends C17T implements TrackOrOriginalSoundSchemaIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(15);
    public OriginalSoundDataIntf A00;

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final TrackMetadata BTR() {
        return (TrackMetadata) A05(-450004177, ImmutablePandoTrackMetadata.class);
    }

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final OriginalSoundDataIntf BZv() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A00;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1929598241, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final TrackData CA8() {
        return (TrackData) A05(110621003, ImmutablePandoTrackData.class);
    }

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40425HwG.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final TrackOrOriginalSoundSchemaIntf EB8(C1DY c1dy) {
        OriginalSoundDataIntf BZv = BZv();
        if (BZv != null) {
            BZv.E9V(c1dy);
        } else {
            BZv = null;
        }
        this.A00 = BZv;
        return this;
    }

    @Override // com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf
    public final TrackOrOriginalSoundSchema F3R(C1DY c1dy) {
        TrackMetadataImpl trackMetadataImpl;
        OriginalSoundData originalSoundData;
        TrackMetadata BTR = BTR();
        TrackDataImpl trackDataImpl = null;
        if (BTR != null) {
            trackMetadataImpl = BTR.F3Q();
        } else {
            trackMetadataImpl = null;
        }
        OriginalSoundDataIntf BZv = BZv();
        if (BZv != null) {
            originalSoundData = BZv.Exi(c1dy);
        } else {
            originalSoundData = null;
        }
        TrackData CA8 = CA8();
        if (CA8 != null) {
            trackDataImpl = CA8.F3P();
        }
        return new TrackOrOriginalSoundSchema(originalSoundData, trackDataImpl, trackMetadataImpl);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
