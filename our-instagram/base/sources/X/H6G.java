package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTrendingPromptSubType;
import java.util.List;

/* loaded from: classes7.dex */
public final class H6G extends C0T6 implements JKY {
    public final StoryTrendingPromptSubType A00;
    public final List A01;

    public H6G(StoryTrendingPromptSubType storyTrendingPromptSubType, List list) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = storyTrendingPromptSubType;
    }

    @Override // X.JKY
    public final H6G F2K() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6G) {
                H6G h6g = (H6G) obj;
                if (!C14360o3.A0K(this.A01, h6g.A01) || this.A00 != h6g.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKY
    public final List BRF() {
        return this.A01;
    }

    @Override // X.JKY
    public final StoryTrendingPromptSubType Bil() {
        return this.A00;
    }

    @Override // X.JKY
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryTrendingPromptLoggingInfo", AbstractC40346Huq.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00);
    }
}
