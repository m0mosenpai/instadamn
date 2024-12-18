package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import java.util.List;

/* loaded from: classes7.dex */
public final class H6F extends C0T6 implements JMD {
    public final StoryPromptTappableData A00;
    public final H6G A01;
    public final List A02;
    public final List A03;

    public H6F(StoryPromptTappableData storyPromptTappableData, H6G h6g, List list, List list2) {
        AbstractC25233BEq.A0w(2, list, storyPromptTappableData, list2);
        this.A01 = h6g;
        this.A02 = list;
        this.A00 = storyPromptTappableData;
        this.A03 = list2;
    }

    @Override // X.JMD
    public final H6F F2I(C1DY c1dy) {
        return this;
    }

    @Override // X.JMD
    public final H6F F2J(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6F) {
                H6F h6f = (H6F) obj;
                if (!C14360o3.A0K(this.A01, h6f.A01) || !C14360o3.A0K(this.A02, h6f.A02) || !C14360o3.A0K(this.A00, h6f.A00) || !C14360o3.A0K(this.A03, h6f.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMD
    public final /* bridge */ /* synthetic */ JKY BOs() {
        return this.A01;
    }

    @Override // X.JMD
    public final List BR6() {
        return this.A02;
    }

    @Override // X.JMD
    public final /* bridge */ /* synthetic */ StoryPromptTappableDataIntf Bii() {
        return this.A00;
    }

    @Override // X.JMD
    public final List Bll() {
        return this.A03;
    }

    @Override // X.JMD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryTrendingPromptInfo", AbstractC40344Huo.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC167017dG.A0M(this.A01) * 31)));
    }

    @Override // X.JMD
    public final JMD EAq(C1DY c1dy) {
        return this;
    }
}
