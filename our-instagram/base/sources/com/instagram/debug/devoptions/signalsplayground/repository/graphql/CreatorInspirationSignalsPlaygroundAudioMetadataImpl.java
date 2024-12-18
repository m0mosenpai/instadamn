package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC58319PtB;
import X.AbstractC65703TsZ;
import X.C2JS;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94774Oi;
import X.C94894Ou;
import X.C95124Py;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundAudioMetadataImpl extends C2JS implements CreatorInspirationSignalsPlaygroundAudioMetadata {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1789564771;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundAudioMetadataImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioMetadata
    public boolean getAllowMediaCreationWithMusic() {
        return getRequiredBooleanField(0, "allow_media_creation_with_music");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioMetadata
    public boolean hasAllowMediaCreationWithMusic() {
        return true;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioMetadata
    public boolean hasIsBookmarked() {
        return true;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioMetadata
    public boolean isBookmarked() {
        return getRequiredBooleanField(1, "is_bookmarked");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioMetadata
    public boolean isTrendingInClips() {
        return getCoercedBooleanField(4, "is_trending_in_clips");
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioMetadata
    public String getFormattedClipsMediaCount() {
        return A0A("formatted_clips_media_count");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioMetadata
    public int getTrendRank() {
        return A00("trend_rank");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioMetadata
    public boolean hasIsTrendingInClips() {
        return hasFieldValue("is_trending_in_clips");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioMetadata
    public boolean hasTrendRank() {
        return hasFieldValue("trend_rank");
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        C95124Py c95124Py = C95124Py.A00;
        return AbstractC58319PtB.A0U(new C4OW(new C94774Oi(c95124Py), "allow_media_creation_with_music"), AbstractC65703TsZ.A0i(c95124Py), new C4OW(C94894Ou.A00, "trend_rank"), new C4OW(C94754Oe.A00, "formatted_clips_media_count"), new C4OW(c95124Py, "is_trending_in_clips"));
    }

    public CreatorInspirationSignalsPlaygroundAudioMetadataImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundAudioMetadataImpl() {
        super(TYPE_TAG);
    }
}
