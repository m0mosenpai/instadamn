package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.C14360o3;
import X.C2JS;
import X.C4OK;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94774Oi;
import X.C94894Ou;
import X.C95124Py;
import X.VFC;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl extends C2JS implements CreatorInspirationSignalsPlaygroundOriginalSoundData {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1938538694;

    /* loaded from: classes11.dex */
    public final class AudioParts extends C2JS implements CreatorInspirationSignalsPlaygroundOriginalSoundData.AudioParts {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1157816568;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return AudioParts.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData.AudioParts
        public String getDisplayArtist() {
            return AbstractC65702TsY.A0a(this, "display_artist", 1);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData.AudioParts
        public String getDisplayTitle() {
            return AbstractC65702TsY.A0a(this, "display_title", 2);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData.AudioParts
        public String getThumbnailUri() {
            return AbstractC65702TsY.A0a(this, "thumbnail_uri", 3);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData.AudioParts
        public boolean hasIsExplicit() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData.AudioParts
        public boolean isExplicit() {
            return getRequiredBooleanField(0, "is_explicit");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C4OW A0G = AbstractC65703TsZ.A0G(C95124Py.A00);
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0U(new C94774Oi(c94754Oe), A0G, AbstractC65703TsZ.A0Z(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "display_title"), "thumbnail_uri");
        }

        public AudioParts(int i) {
            super(i);
        }

        public AudioParts() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public final class ConsumptionInfo extends C2JS implements CreatorInspirationSignalsPlaygroundOriginalSoundData.ConsumptionInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 769353394;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return ConsumptionInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData.ConsumptionInfo
        public boolean hasIsTrendingInClips() {
            return true;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData.ConsumptionInfo
        public boolean isTrendingInClips() {
            return getRequiredBooleanField(0, "is_trending_in_clips");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public ConsumptionInfo(int i) {
            super(i);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "is_trending_in_clips");
        }

        public ConsumptionInfo() {
            super(TYPE_TAG);
        }
    }

    /* loaded from: classes11.dex */
    public final class IgArtist extends C2JS implements CreatorInspirationSignalsPlaygroundOriginalSoundData.IgArtist {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -820409681;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return IgArtist.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData.IgArtist
        public CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser() {
            return (CreatorInspirationSignalsPlaygroundTestUser) A01(CreatorInspirationSignalsPlaygroundTestUserImpl.class, CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            return AbstractC167017dG.A0a(CreatorInspirationSignalsPlaygroundTestUserImpl.class, "CreatorInspirationSignalsPlaygroundTestUser", CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
        }

        public IgArtist(int i) {
            super(i);
        }

        public IgArtist() {
            super(TYPE_TAG);
        }
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public String getAudioAssetId() {
        return AbstractC65702TsY.A0a(this, "audio_asset_id", 0);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public String getFormattedClipsMediaCount() {
        return getOptionalStringField(6, "formatted_clips_media_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public String getOriginalAudioTitle() {
        return AbstractC65702TsY.A0a(this, "original_audio_title", 1);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public boolean hasIsExplicit() {
        return true;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public boolean hasShouldMuteAudio() {
        return true;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public boolean isExplicit() {
        return getRequiredBooleanField(5, "is_explicit");
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public ImmutableList getAudioParts() {
        return getRequiredCompactedTreeListField(4, "audio_parts", AudioParts.class, AudioParts.TYPE_TAG);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public CreatorInspirationSignalsPlaygroundOriginalSoundData.ConsumptionInfo getConsumptionInfo() {
        C2JS requiredTreeField = getRequiredTreeField(7, "consumption_info", ConsumptionInfo.class, ConsumptionInfo.TYPE_TAG);
        C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.ConsumptionInfo");
        return (ConsumptionInfo) requiredTreeField;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public String getDashManifest() {
        return AbstractC65702TsY.A0a(this, "dash_manifest", 9);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public int getDurationInMs() {
        return getCoercedIntField(12, "duration_in_ms");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public CreatorInspirationSignalsPlaygroundOriginalSoundData.IgArtist getIgArtist() {
        C2JS requiredTreeField = getRequiredTreeField(2, "ig_artist", IgArtist.class, IgArtist.TYPE_TAG);
        C14360o3.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl.IgArtist");
        return (IgArtist) requiredTreeField;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public VFC getOriginalAudioSubtype() {
        Enum requiredEnumField = getRequiredEnumField(3, "original_audio_subtype", VFC.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C14360o3.A07(requiredEnumField);
        return (VFC) requiredEnumField;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public String getProgressiveDownloadUrl() {
        return AbstractC65702TsY.A0a(this, "progressive_download_url", 8);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public boolean getShouldMuteAudio() {
        return getRequiredBooleanField(13, "should_mute_audio");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public int getTrendRank() {
        return getCoercedIntField(10, "trend_rank");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public boolean hasDurationInMs() {
        return hasFieldValue("duration_in_ms");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public boolean hasIsEligibleForAudioEffects() {
        return hasFieldValue("is_eligible_for_audio_effects");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public boolean hasTrendRank() {
        return hasFieldValue("trend_rank");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundOriginalSoundData
    public boolean isEligibleForAudioEffects() {
        return getCoercedBooleanField(11, "is_eligible_for_audio_effects");
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0X = AbstractC65703TsZ.A0X(c94754Oe);
        C4OW A0P = AbstractC65703TsZ.A0P(c94754Oe);
        C4OK c4ok = new C4OK(C4OO.A01(), IgArtist.class, "ig_artist", IgArtist.TYPE_TAG);
        C4OW A0f = AbstractC65703TsZ.A0f(c94754Oe);
        C4OK c4ok2 = new C4OK(C4OO.A02(), AudioParts.class, "audio_parts", AudioParts.TYPE_TAG);
        C95124Py c95124Py = C95124Py.A00;
        C4OW A0G = AbstractC65703TsZ.A0G(c95124Py);
        C4OW c4ow = new C4OW(c94754Oe, "formatted_clips_media_count");
        C4OK c4ok3 = new C4OK(C4OO.A01(), ConsumptionInfo.class, "consumption_info", ConsumptionInfo.TYPE_TAG);
        C4OW A0M = AbstractC65703TsZ.A0M(c94754Oe);
        C4OW A0g = AbstractC65703TsZ.A0g(c94754Oe);
        C94894Ou c94894Ou = C94894Ou.A00;
        return new C4OU(new C4OM[]{A0X, A0P, c4ok, A0f, c4ok2, A0G, c4ow, c4ok3, A0M, A0g, new C4OW(c94894Ou, "trend_rank"), new C4OW(c95124Py, "is_eligible_for_audio_effects"), new C4OW(c94894Ou, "duration_in_ms"), AbstractC65703TsZ.A0c(c95124Py)});
    }

    public CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundOriginalSoundDataImpl() {
        super(TYPE_TAG);
    }
}
