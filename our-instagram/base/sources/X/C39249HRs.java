package X;

import com.instagram.api.schemas.ImmutablePandoOriginalSoundData;
import com.instagram.api.schemas.ImmutablePandoTrackData;
import com.instagram.api.schemas.ImmutablePandoTrackMetadata;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackMetadataImpl;

/* renamed from: X.HRs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39249HRs extends C17T implements JL3 {
    public OriginalSoundDataIntf A00;

    @Override // X.JL3
    public final TrackMetadata BTR() {
        return (TrackMetadata) A05(-450004177, ImmutablePandoTrackMetadata.class);
    }

    @Override // X.JL3
    public final OriginalSoundDataIntf BZv() {
        OriginalSoundDataIntf originalSoundDataIntf = this.A00;
        if (originalSoundDataIntf == null) {
            return (OriginalSoundDataIntf) A05(1929598241, ImmutablePandoOriginalSoundData.class);
        }
        return originalSoundDataIntf;
    }

    @Override // X.JL3
    public final TrackData CA8() {
        return (TrackData) A05(110621003, ImmutablePandoTrackData.class);
    }

    @Override // X.JL3
    public final JL3 E9e(C1DY c1dy) {
        OriginalSoundDataIntf BZv = BZv();
        if (BZv != null) {
            BZv.E9V(c1dy);
        } else {
            BZv = null;
        }
        this.A00 = BZv;
        return this;
    }

    @Override // X.JL3
    public final C38738H4c EyB(C1DY c1dy) {
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
        return new C38738H4c(originalSoundData, trackDataImpl, trackMetadataImpl);
    }
}
