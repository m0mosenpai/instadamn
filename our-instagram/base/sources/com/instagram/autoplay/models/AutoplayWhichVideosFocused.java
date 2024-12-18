package com.instagram.autoplay.models;

import X.AbstractC001800i;
import X.AbstractC166997dE;
import X.C14360o3;
import X.MSY;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AutoplayWhichVideosFocused implements AutoplayWhichVideos {
    public static final Companion Companion = new Object();
    public static final float FOCUSED_MINIMUM_VISIBILITY = 0.9f;

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public AutoplayWhichVideoMetadata chooseNextVideoToPlay(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        Object obj;
        C14360o3.A0B(list, 0);
        List combine = combine(list, autoplayWhichVideoMetadata);
        C14360o3.A0B(combine, 0);
        int indexOf = combine.indexOf(autoplayWhichVideoMetadata);
        if (indexOf != -1) {
            if (indexOf != 0) {
                obj = AbstractC001800i.A0I(combine);
            } else {
                obj = AbstractC001800i.A0K(combine);
            }
        } else {
            obj = combine.get((combine.size() - 1) / 2);
        }
        return (AutoplayWhichVideoMetadata) obj;
    }

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public List chooseNextVideosToPause(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        for (Object obj : list) {
            AutoplayOnScreenItemWithMetadata onScreenMetadata = ((AutoplayWhichVideoMetadata) obj).getOnScreenMetadata();
            if (onScreenMetadata != null && onScreenMetadata.percentageVisible <= 0.9f) {
                A12.add(obj);
            }
        }
        return A12;
    }

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public /* synthetic */ List combine(List list, AutoplayWhichVideoMetadata autoplayWhichVideoMetadata) {
        return AutoplayWhichVideos.CC.$default$combine(this, list, autoplayWhichVideoMetadata);
    }

    public String toString() {
        return "Focused";
    }

    /* loaded from: classes11.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // com.instagram.autoplay.models.AutoplayWhichVideos
    public boolean hasMinimumVisibility(float f) {
        return MSY.A1R((f > 0.9f ? 1 : (f == 0.9f ? 0 : -1)));
    }
}
