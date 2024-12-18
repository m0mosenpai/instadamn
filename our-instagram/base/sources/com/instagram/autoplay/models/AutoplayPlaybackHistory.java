package com.instagram.autoplay.models;

import X.AbstractC25234BEr;
import X.C14360o3;
import X.C38321qM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AutoplayPlaybackHistory {
    public AutoplayPlaybackState currentState;
    public long currentStateStartTime;
    public List historicalPlaybackSegments;
    public final C38321qM media;

    public final void setCurrentState(AutoplayPlaybackState autoplayPlaybackState) {
        C14360o3.A0B(autoplayPlaybackState, 0);
        this.currentState = autoplayPlaybackState;
    }

    public final void setHistoricalPlaybackSegments(List list) {
        C14360o3.A0B(list, 0);
        this.historicalPlaybackSegments = list;
    }

    public final AutoplayPlaybackState getCurrentState() {
        return this.currentState;
    }

    public final long getCurrentStateStartTime() {
        return this.currentStateStartTime;
    }

    public final List getHistoricalPlaybackSegments() {
        return this.historicalPlaybackSegments;
    }

    public final C38321qM getMedia() {
        return this.media;
    }

    public AutoplayPlaybackHistory(C38321qM c38321qM, AutoplayPlaybackState autoplayPlaybackState, long j, List list) {
        AbstractC25234BEr.A1P(c38321qM, autoplayPlaybackState, list);
        this.media = c38321qM;
        this.currentState = autoplayPlaybackState;
        this.currentStateStartTime = j;
        this.historicalPlaybackSegments = list;
    }

    public final void setCurrentStateStartTime(long j) {
        this.currentStateStartTime = j;
    }

    public /* synthetic */ AutoplayPlaybackHistory(C38321qM c38321qM, AutoplayPlaybackState autoplayPlaybackState, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c38321qM, autoplayPlaybackState, j, (i & 8) != 0 ? new ArrayList() : list);
    }
}
