package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C2JT;
import X.VFC;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public interface CreatorInspirationSignalsPlaygroundOriginalSoundData extends C2JT {

    /* loaded from: classes11.dex */
    public interface AudioParts extends C2JT {
        String getDisplayArtist();

        String getDisplayTitle();

        String getThumbnailUri();

        boolean hasIsExplicit();

        boolean isExplicit();
    }

    /* loaded from: classes11.dex */
    public interface ConsumptionInfo extends C2JT {
        boolean hasIsTrendingInClips();

        boolean isTrendingInClips();
    }

    /* loaded from: classes11.dex */
    public interface IgArtist extends C2JT {
        CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser();
    }

    String getAudioAssetId();

    ImmutableList getAudioParts();

    ConsumptionInfo getConsumptionInfo();

    String getDashManifest();

    int getDurationInMs();

    String getFormattedClipsMediaCount();

    IgArtist getIgArtist();

    VFC getOriginalAudioSubtype();

    String getOriginalAudioTitle();

    String getProgressiveDownloadUrl();

    boolean getShouldMuteAudio();

    int getTrendRank();

    boolean hasDurationInMs();

    boolean hasIsEligibleForAudioEffects();

    boolean hasIsExplicit();

    boolean hasShouldMuteAudio();

    boolean hasTrendRank();

    boolean isEligibleForAudioEffects();

    boolean isExplicit();
}
