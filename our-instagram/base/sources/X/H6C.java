package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTextAttributionType;
import java.util.List;

/* loaded from: classes7.dex */
public final class H6C extends C0T6 implements JL9 {
    public final StoryTextAttributionType A00;
    public final String A01;
    public final List A02;

    @Override // X.JL9
    public final H6C F2C() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6C) {
                H6C h6c = (H6C) obj;
                if (this.A00 != h6c.A00 || !C14360o3.A0K(this.A02, h6c.A02) || !C14360o3.A0K(this.A01, h6c.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JL9
    public final StoryTextAttributionType AdM() {
        return this.A00;
    }

    @Override // X.JL9
    public final List Ah3() {
        return this.A02;
    }

    @Override // X.JL9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryTextAttribution", AbstractC40338Hui.A00(this));
    }

    @Override // X.JL9
    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A00)));
    }

    public H6C(StoryTextAttributionType storyTextAttributionType, String str, List list) {
        AbstractC167027dH.A13(storyTextAttributionType, list, str);
        this.A00 = storyTextAttributionType;
        this.A02 = list;
        this.A01 = str;
    }
}
