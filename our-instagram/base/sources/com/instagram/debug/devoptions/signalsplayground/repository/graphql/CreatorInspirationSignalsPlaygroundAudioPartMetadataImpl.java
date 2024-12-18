package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.C14360o3;
import X.C2JS;
import X.C4OM;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94774Oi;
import X.C95124Py;
import X.VFB;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl extends C2JS implements CreatorInspirationSignalsPlaygroundAudioPartMetadata {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = 1712129853;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata
    public String getDisplayArtist() {
        return AbstractC65702TsY.A0a(this, "display_artist", 1);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata
    public String getDisplayTitle() {
        return AbstractC65702TsY.A0a(this, "display_title", 2);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata
    public String getMusicCanonicalId() {
        return AbstractC65702TsY.A0a(this, "music_canonical_id", 5);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata
    public String getThumbnailUri() {
        return AbstractC65702TsY.A0a(this, "thumbnail_uri", 6);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata
    public boolean hasIsBookmarked() {
        return true;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata
    public boolean hasIsExplicit() {
        return true;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata
    public boolean isBookmarked() {
        return getRequiredBooleanField(3, "is_bookmarked");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata
    public boolean isExplicit() {
        return getRequiredBooleanField(4, "is_explicit");
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata
    public VFB getAudioType() {
        Enum requiredEnumField = getRequiredEnumField(0, "audio_type", VFB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C14360o3.A07(requiredEnumField);
        return (VFB) requiredEnumField;
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0e = AbstractC65703TsZ.A0e(c94754Oe);
        C4OW A0Z = AbstractC65703TsZ.A0Z(c94754Oe);
        C4OW c4ow = new C4OW(new C94774Oi(c94754Oe), "display_title");
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{A0e, A0Z, c4ow, AbstractC65703TsZ.A0i(c95124Py), AbstractC65703TsZ.A0G(c95124Py), AbstractC65703TsZ.A0a(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "thumbnail_uri")});
    }

    public CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl() {
        super(TYPE_TAG);
    }
}
