package com.instagram.autoplay.models;

import X.AbstractC001800i;
import X.AbstractC167017dG;
import X.C14360o3;
import X.MSY;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class AutoplayWhichVideosSequentialToNext implements AutoplayWhichVideos {
    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public AutoplayWhichVideoMetadata chooseNextVideoToPlay(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        C14360o3.A0B(list, 0);
        List<AutoplayWhichVideoMetadata> combine = combine(list, autoplayWhichVideoMetadata);
        C14360o3.A0B(combine, 0);
        int indexOf = combine.indexOf(autoplayWhichVideoMetadata);
        ArrayList A0q = AbstractC167017dG.A0q(combine);
        for (AutoplayWhichVideoMetadata autoplayWhichVideoMetadata2 : combine) {
            AutoplayScreenItemWithoutMetadata autoplayScreenItemWithoutMetadata = autoplayWhichVideoMetadata2.screenItem;
            C14360o3.A0C(autoplayScreenItemWithoutMetadata, "null cannot be cast to non-null type com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata");
            AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata = (AutoplayOnScreenItemWithMetadata) autoplayScreenItemWithoutMetadata;
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(autoplayOnScreenItemWithMetadata.x);
            sb.append(", ");
            sb.append(autoplayOnScreenItemWithMetadata.y);
            sb.append("): ");
            sb.append(autoplayWhichVideoMetadata2.media.getId());
            A0q.add(sb.toString());
        }
        AbstractC001800i.A0P("\t", "", "", A0q, null);
        return (AutoplayWhichVideoMetadata) combine.get(indexOf != combine.size() + (-1) ? indexOf + 1 : 0);
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
        return "SequentialToNext";
    }

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public /* synthetic */ boolean hasMinimumVisibility(float f) {
        return MSY.A1R((f > 0.2f ? 1 : (f == 0.2f ? 0 : -1)));
    }
}
