package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C2JT;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public interface CreatorInspirationSignalsPlaygroundTrackData extends C2JT {
    boolean getAllowsSaving();

    String getAudioAssetId();

    String getAudioClusterId();

    String getCoverArtworkThumbnailUri();

    String getCoverArtworkUri();

    String getDashManifest();

    String getDisplayArtist();

    int getDurationInMs();

    String getFastStartProgressiveDownloadUrl();

    boolean getHasLyrics();

    ImmutableList getHighlightStartTimesInMs();

    String getId();

    String getProgressiveDownloadUrl();

    String getSubtitle();

    String getTitle();

    boolean hasAllowsSaving();

    boolean hasDurationInMs();

    boolean hasHasLyrics();

    boolean hasIsEligibleForAudioEffects();

    boolean hasIsExplicit();

    boolean isEligibleForAudioEffects();

    boolean isExplicit();
}
