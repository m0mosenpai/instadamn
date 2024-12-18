package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTrendingPromptMediaSubType;

/* loaded from: classes7.dex */
public final class H6H extends C0T6 implements JKZ {
    public final StoryTrendingPromptMediaSubType A00;
    public final String A01;

    @Override // X.JKZ
    public final H6H F2L() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6H) {
                H6H h6h = (H6H) obj;
                if (!C14360o3.A0K(this.A01, h6h.A01) || this.A00 != h6h.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKZ
    public final StoryTrendingPromptMediaSubType BRg() {
        return this.A00;
    }

    @Override // X.JKZ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryTrendingPromptMediaLoggingInfo", AbstractC40348Hus.A00(this));
    }

    @Override // X.JKZ
    public final String getMediaId() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public H6H(StoryTrendingPromptMediaSubType storyTrendingPromptMediaSubType, String str) {
        AbstractC167017dG.A1P(str, storyTrendingPromptMediaSubType);
        this.A01 = str;
        this.A00 = storyTrendingPromptMediaSubType;
    }
}
