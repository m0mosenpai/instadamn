package com.instagram.autoplay.models;

import X.AbstractC001800i;
import X.C14360o3;
import X.MSY;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.util.List;

/* loaded from: classes11.dex */
public final class AutoplayWhichVideosLoopingTop implements AutoplayWhichVideos {
    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public AutoplayWhichVideoMetadata chooseNextVideoToPlay(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        C14360o3.A0B(list, 0);
        return (AutoplayWhichVideoMetadata) AbstractC001800i.A0I(AbstractC001800i.A0g(list, TopLeftComparator.instance));
    }

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public /* synthetic */ List chooseNextVideosToPause(List list) {
        return AutoplayWhichVideos.CC.$default$chooseNextVideosToPause(this, list);
    }

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public /* synthetic */ List combine(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        return AutoplayWhichVideos.CC.$default$combine(this, list, autoplayWhichVideoMetadata);
    }

    public String toString() {
        return "LoopingTop";
    }

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public /* synthetic */ boolean hasMinimumVisibility(float f) {
        return MSY.A1R((f > 0.2f ? 1 : (f == 0.2f ? 0 : -1)));
    }
}
