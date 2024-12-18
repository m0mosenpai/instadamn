package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTextAttributionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUX extends C17T implements JL9 {
    @Override // X.JL9
    public final StoryTextAttributionType AdM() {
        return (StoryTextAttributionType) A0M(115027706, C43296JBp.A00);
    }

    @Override // X.JL9
    public final List Ah3() {
        return A0o(1975239120, HUW.class);
    }

    @Override // X.JL9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40338Hui.A00(this));
    }

    @Override // X.JL9
    public final H6C F2C() {
        StoryTextAttributionType AdM = AdM();
        List Ah3 = Ah3();
        ArrayList A0q = AbstractC167017dG.A0q(Ah3);
        Iterator it = Ah3.iterator();
        while (it.hasNext()) {
            A0q.add(((JKX) it.next()).F2D());
        }
        return new H6C(AdM, A0P(), A0q);
    }

    @Override // X.JL9
    public final String getText() {
        return A0P();
    }
}
