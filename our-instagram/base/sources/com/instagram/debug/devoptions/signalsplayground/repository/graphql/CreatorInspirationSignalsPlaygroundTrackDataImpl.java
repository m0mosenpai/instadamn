package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.C2JS;
import X.C4OM;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94894Ou;
import X.C95124Py;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundTrackDataImpl extends C2JS implements CreatorInspirationSignalsPlaygroundTrackData {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1732907703;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundTrackDataImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public boolean getAllowsSaving() {
        return getRequiredBooleanField(0, "allows_saving");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getCoverArtworkUri() {
        return AbstractC65702TsY.A0a(this, "cover_artwork_uri", 4);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getDisplayArtist() {
        return getOptionalStringField(6, "display_artist");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public int getDurationInMs() {
        return getCoercedIntField(7, "duration_in_ms");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public boolean hasAllowsSaving() {
        return true;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public boolean hasIsExplicit() {
        return true;
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getAudioAssetId() {
        return A08("audio_asset_id");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getAudioClusterId() {
        return A09("audio_cluster_id");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getCoverArtworkThumbnailUri() {
        return A0A("cover_artwork_thumbnail_uri");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getDashManifest() {
        return A0C("dash_manifest");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getFastStartProgressiveDownloadUrl() {
        return A0D("fast_start_progressive_download_url");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public boolean getHasLyrics() {
        return getCoercedBooleanField(9, "has_lyrics");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public ImmutableList getHighlightStartTimesInMs() {
        return getCoercedCompactedIntListField(10, "highlight_start_times_in_ms");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getId() {
        return AbstractC65702TsY.A0a(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 11);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getProgressiveDownloadUrl() {
        return getOptionalStringField(14, "progressive_download_url");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getSubtitle() {
        return getOptionalStringField(15, "subtitle");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public String getTitle() {
        return getOptionalStringField(16, DialogModule.KEY_TITLE);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public boolean hasDurationInMs() {
        return hasFieldValue("duration_in_ms");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public boolean hasHasLyrics() {
        return hasFieldValue("has_lyrics");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public boolean hasIsEligibleForAudioEffects() {
        return hasFieldValue("is_eligible_for_audio_effects");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public boolean isEligibleForAudioEffects() {
        return getCoercedBooleanField(12, "is_eligible_for_audio_effects");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundTrackData
    public boolean isExplicit() {
        return getRequiredBooleanField(13, "is_explicit");
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        C95124Py c95124Py = C95124Py.A00;
        C4OW A0V = AbstractC65703TsZ.A0V(c95124Py);
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{A0V, new C4OW(c94754Oe, "audio_asset_id"), new C4OW(c94754Oe, "audio_cluster_id"), new C4OW(c94754Oe, "cover_artwork_thumbnail_uri"), AbstractC65703TsZ.A0W(c94754Oe), new C4OW(c94754Oe, "dash_manifest"), new C4OW(c94754Oe, "display_artist"), new C4OW(C94894Ou.A00, "duration_in_ms"), new C4OW(c94754Oe, "fast_start_progressive_download_url"), new C4OW(c95124Py, "has_lyrics"), new C4OW(C94894Ou.A00(), "highlight_start_times_in_ms"), AbstractC58320PtC.A0P(c94754Oe), new C4OW(c95124Py, "is_eligible_for_audio_effects"), AbstractC65703TsZ.A0G(c95124Py), new C4OW(c94754Oe, "progressive_download_url"), new C4OW(c94754Oe, "subtitle"), AbstractC58319PtB.A0L(c94754Oe)});
    }

    public CreatorInspirationSignalsPlaygroundTrackDataImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundTrackDataImpl() {
        super(TYPE_TAG);
    }
}
