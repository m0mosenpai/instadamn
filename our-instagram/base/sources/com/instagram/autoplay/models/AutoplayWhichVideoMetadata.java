package com.instagram.autoplay.models;

import X.AbstractC167027dH;
import X.C38321qM;

/* loaded from: classes11.dex */
public final class AutoplayWhichVideoMetadata {
    public final C38321qM media;
    public final AutoplayPlaybackHistory playbackHistory;
    public final AutoplayScreenItemWithoutMetadata screenItem;

    public final C38321qM getMedia() {
        return this.media;
    }

    public final AutoplayOnScreenItemWithMetadata getOnScreenMetadata() {
        AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata = this.screenItem;
        if (autoplayScreenItemWithoutMetadata instanceof AutoplayOnScreenItemWithMetadata) {
            return (AutoplayOnScreenItemWithMetadata) autoplayScreenItemWithoutMetadata;
        }
        return null;
    }

    public final AutoplayPlaybackHistory getPlaybackHistory() {
        return this.playbackHistory;
    }

    public final AutoplayScreenItemWithoutMetadata getScreenItem() {
        return this.screenItem;
    }

    public AutoplayWhichVideoMetadata(C38321qM c38321qM, AutoplayPlaybackHistory autoplayPlaybackHistory, AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata) {
        AbstractC167027dH.A13(c38321qM, autoplayPlaybackHistory, autoplayScreenItemWithoutMetadata);
        this.media = c38321qM;
        this.playbackHistory = autoplayPlaybackHistory;
        this.screenItem = autoplayScreenItemWithoutMetadata;
    }
}
