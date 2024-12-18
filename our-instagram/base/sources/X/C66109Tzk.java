package X;

import com.instagram.autoplay.models.AutoplayConfigRoot;
import com.instagram.autoplay.models.AutoplayConfiguration;
import com.instagram.autoplay.models.AutoplayCustomization;
import com.instagram.autoplay.models.AutoplayGlobalConfig;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Tzk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66109Tzk implements XCG {
    @Override // X.XCG
    public final AutoplayConfigRoot AuL() {
        AutoplayGlobalConfig autoplayGlobalConfig = new AutoplayGlobalConfig(0, 1, 2, true, 100, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, 15000, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
        AutoplayLayout autoplayLayout = AutoplayLayout.UNKNOWN;
        List singletonList = Collections.singletonList(new AutoplayCustomization("local_2", 2, 1, 0, (AutoplayWhichVideos) AutoplayWhichVideos.Companion.Focused$delegate.getValue()));
        C14360o3.A07(singletonList);
        List singletonList2 = Collections.singletonList(new AutoplayConfiguration(autoplayLayout, singletonList, 100, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION));
        C14360o3.A07(singletonList2);
        return new AutoplayConfigRoot(autoplayGlobalConfig, singletonList2);
    }

    @Override // X.XCG
    public final boolean BBP() {
        throw C00O.createAndThrow();
    }
}
