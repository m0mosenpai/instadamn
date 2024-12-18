package com.instagram.autoplay.models;

import X.AbstractC166997dE;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class AutoplayWhichVideosSequentialToNextKt {
    public static final List filterLoopedVideos(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        for (Object obj : list) {
            if (((AutoplayWhichVideoMetadata) obj).playbackHistory.currentState == AutoplayPlaybackState.PLAYING_AND_LOOPED_ONCE) {
                A12.add(obj);
            }
        }
        return A12;
    }
}
