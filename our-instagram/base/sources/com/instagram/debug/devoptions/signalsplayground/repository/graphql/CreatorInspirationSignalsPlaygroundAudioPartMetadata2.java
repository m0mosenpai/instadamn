package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C2JT;
import X.VFB;

/* loaded from: classes11.dex */
public interface CreatorInspirationSignalsPlaygroundAudioPartMetadata2 extends C2JT {

    /* loaded from: classes11.dex */
    public interface IgArtist extends C2JT {
        String getId();

        String getProfilePicUrl();

        String getUsername();

        boolean hasIsVerified();

        boolean isVerified();
    }

    VFB getAudioType();

    String getDisplayArtist();

    String getDisplayTitle();

    IgArtist getIgArtist();

    String getMusicCanonicalId();

    String getThumbnailUri();

    boolean hasIsBookmarked();

    boolean hasIsExplicit();

    boolean isBookmarked();

    boolean isExplicit();
}
