package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC167017dG;
import X.AbstractC58320PtC;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C2JS;
import X.C4OK;
import X.C4OU;
import com.instagram.api.schemas.ImmutablePandoTrackOrOriginalSoundSchema;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundAudioImpl extends C2JS implements CreatorInspirationSignalsPlaygroundAudio {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -883834309;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundAudioImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public final class Metadata extends C2JS implements CreatorInspirationSignalsPlaygroundAudio.Metadata {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -271941014;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Metadata.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio.Metadata
        public CreatorInspirationSignalsPlaygroundAudioMetadata asCreatorInspirationSignalsPlaygroundAudioMetadata() {
            return (CreatorInspirationSignalsPlaygroundAudioMetadata) A01(CreatorInspirationSignalsPlaygroundAudioMetadataImpl.class, CreatorInspirationSignalsPlaygroundAudioMetadataImpl.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0a(CreatorInspirationSignalsPlaygroundAudioMetadataImpl.class, "CreatorInspirationSignalsPlaygroundAudioMetadata", CreatorInspirationSignalsPlaygroundAudioMetadataImpl.TYPE_TAG);
        }

        public Metadata(int i) {
            super(i);
        }

        public Metadata() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class OriginalSound extends C2JS implements CreatorInspirationSignalsPlaygroundAudio.OriginalSound {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1109401295;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return OriginalSound.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio.OriginalSound
        public CreatorInspirationSignalsPlaygroundOriginalSoundData asCreatorInspirationSignalsPlaygroundOriginalSoundData() {
            return (CreatorInspirationSignalsPlaygroundOriginalSoundData) A01(CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.class, CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0a(CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.class, "CreatorInspirationSignalsPlaygroundOriginalSoundData", CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.TYPE_TAG);
        }

        public OriginalSound(int i) {
            super(i);
        }

        public OriginalSound() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class Track extends C2JS implements CreatorInspirationSignalsPlaygroundAudio.Track {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1339965688;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Track.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio.Track
        public CreatorInspirationSignalsPlaygroundTrackData asCreatorInspirationSignalsPlaygroundTrackData() {
            return (CreatorInspirationSignalsPlaygroundTrackData) A01(CreatorInspirationSignalsPlaygroundTrackDataImpl.class, CreatorInspirationSignalsPlaygroundTrackDataImpl.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0a(CreatorInspirationSignalsPlaygroundTrackDataImpl.class, "CreatorInspirationSignalsPlaygroundTrackData", CreatorInspirationSignalsPlaygroundTrackDataImpl.TYPE_TAG);
        }

        public Track(int i) {
            super(i);
        }

        public Track() {
            super(TYPE_TAG);
        }
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio
    public TrackOrOriginalSoundSchemaIntf asApiTypeModel(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        ImmutablePandoTrackOrOriginalSoundSchema immutablePandoTrackOrOriginalSoundSchema = (ImmutablePandoTrackOrOriginalSoundSchema) reinterpret(ImmutablePandoTrackOrOriginalSoundSchema.class);
        immutablePandoTrackOrOriginalSoundSchema.EB8(new C1DY(c1dv, 6, false));
        return immutablePandoTrackOrOriginalSoundSchema;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio
    public TrackOrOriginalSoundSchema asRestModel__DO_NOT_USE(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return ((ImmutablePandoTrackOrOriginalSoundSchema) reinterpret(ImmutablePandoTrackOrOriginalSoundSchema.class)).F3R(new C1DY(c1dv, 6, false));
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio
    public CreatorInspirationSignalsPlaygroundAudio.Metadata getMetadata() {
        return (CreatorInspirationSignalsPlaygroundAudio.Metadata) A03(Metadata.class, "metadata", Metadata.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio
    public CreatorInspirationSignalsPlaygroundAudio.OriginalSound getOriginalSound() {
        return (CreatorInspirationSignalsPlaygroundAudio.OriginalSound) A04(OriginalSound.class, "original_sound", OriginalSound.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudio
    public CreatorInspirationSignalsPlaygroundAudio.Track getTrack() {
        return (CreatorInspirationSignalsPlaygroundAudio.Track) A02(Track.class, "track", Track.TYPE_TAG);
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        return AbstractC58320PtC.A0V(new C4OK(Metadata.class, "metadata", Metadata.TYPE_TAG), new C4OK(Track.class, "track", Track.TYPE_TAG), OriginalSound.class, "original_sound", OriginalSound.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundAudioImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundAudioImpl() {
        super(TYPE_TAG);
    }
}
