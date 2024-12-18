package com.instagram.autoplay.models;

import X.C14360o3;
import X.C38321qM;

/* loaded from: classes11.dex */
public class AutoplayScreenItemWithoutMetadata {
    public final C38321qM media;
    public final long timeAddedToScreen;
    public long timeSinceAddedToScreen;

    public AutoplayScreenItemWithoutMetadata(C38321qM c38321qM, long j) {
        C14360o3.A0B(c38321qM, 1);
        this.media = c38321qM;
        this.timeAddedToScreen = j;
    }

    public final C38321qM getMedia() {
        return this.media;
    }

    public final long getTimeAddedToScreen() {
        return this.timeAddedToScreen;
    }

    public final long getTimeSinceAddedToScreen() {
        return this.timeSinceAddedToScreen;
    }

    public final boolean isOnScreen() {
        return this instanceof AutoplayOnScreenItemWithMetadata;
    }

    public final void setTimeSinceAddedToScreen(long j) {
        this.timeSinceAddedToScreen = j;
    }
}
