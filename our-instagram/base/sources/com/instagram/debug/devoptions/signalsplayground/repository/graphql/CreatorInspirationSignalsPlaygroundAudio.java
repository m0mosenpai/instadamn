package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C1DV;
import X.C2JT;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;

/* loaded from: classes11.dex */
public interface CreatorInspirationSignalsPlaygroundAudio extends C2JT {

    /* loaded from: classes11.dex */
    public interface Metadata extends C2JT {
        CreatorInspirationSignalsPlaygroundAudioMetadata asCreatorInspirationSignalsPlaygroundAudioMetadata();
    }

    /* loaded from: classes11.dex */
    public interface OriginalSound extends C2JT {
        CreatorInspirationSignalsPlaygroundOriginalSoundData asCreatorInspirationSignalsPlaygroundOriginalSoundData();
    }

    /* loaded from: classes11.dex */
    public interface Track extends C2JT {
        CreatorInspirationSignalsPlaygroundTrackData asCreatorInspirationSignalsPlaygroundTrackData();
    }

    TrackOrOriginalSoundSchemaIntf asApiTypeModel(C1DV c1dv);

    TrackOrOriginalSoundSchema asRestModel__DO_NOT_USE(C1DV c1dv);

    Metadata getMetadata();

    OriginalSound getOriginalSound();

    Track getTrack();
}
