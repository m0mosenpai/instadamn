package com.instagram.autoplay.models;

import X.AbstractC001800i;
import X.C14360o3;
import X.MSY;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.util.List;

/* loaded from: classes11.dex */
public final class AutoplayWhichVideosSequentialToCenter implements AutoplayWhichVideos {
    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public AutoplayWhichVideoMetadata chooseNextVideoToPlay(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        int i;
        Object obj;
        C14360o3.A0B(list, 0);
        List combine = combine(list, autoplayWhichVideoMetadata);
        C14360o3.A0B(combine, 0);
        int indexOf = combine.indexOf(autoplayWhichVideoMetadata);
        int size = combine.size() - 1;
        if (indexOf == -1) {
            i = Math.max(size, 0) / 2;
        } else {
            if (indexOf == size) {
                obj = combine.get(0);
                return (AutoplayWhichVideoMetadata) obj;
            }
            i = indexOf + 1;
        }
        obj = combine.get(i);
        return (AutoplayWhichVideoMetadata) obj;
    }

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public List chooseNextVideosToPause(List list) {
        C14360o3.A0B(list, 0);
        return AbstractC001800i.A0S(AutoplayWhichVideosSequentialToNextKt.filterLoopedVideos(list), AutoplayWhichVideos.CC.$default$chooseNextVideosToPause(this, list));
    }

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public /* synthetic */ List combine(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        return AutoplayWhichVideos.CC.$default$combine(this, list, autoplayWhichVideoMetadata);
    }

    public String toString() {
        return "SequentialToCenter";
    }

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public /* synthetic */ boolean hasMinimumVisibility(float f) {
        return MSY.A1R((f > 0.2f ? 1 : (f == 0.2f ? 0 : -1)));
    }
}
