package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTrendingPromptSubType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HUc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39281HUc extends C17T implements JKY {
    @Override // X.JKY
    public final List BRF() {
        return A0o(-1910259830, C39282HUd.class);
    }

    @Override // X.JKY
    public final StoryTrendingPromptSubType Bil() {
        return (StoryTrendingPromptSubType) A0N(-282424929, C43298JBr.A00);
    }

    @Override // X.JKY
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40346Huq.A00(this));
    }

    @Override // X.JKY
    public final H6G F2K() {
        List BRF = BRF();
        ArrayList A0q = AbstractC167017dG.A0q(BRF);
        Iterator it = BRF.iterator();
        while (it.hasNext()) {
            A0q.add(((JKZ) it.next()).F2L());
        }
        return new H6G(Bil(), A0q);
    }
}
