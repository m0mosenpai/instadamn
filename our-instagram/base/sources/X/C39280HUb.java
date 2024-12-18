package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HUb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39280HUb extends C17T implements JMD {
    public StoryPromptTappableDataIntf A00;
    public List A01;

    @Override // X.JMD
    public final JKY BOs() {
        return (JKY) A05(-894921330, C39281HUc.class);
    }

    @Override // X.JMD
    public final List BR6() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'mediaInfos' field.");
    }

    @Override // X.JMD
    public final StoryPromptTappableDataIntf Bii() {
        StoryPromptTappableDataIntf storyPromptTappableDataIntf = this.A00;
        if (storyPromptTappableDataIntf == null) {
            return (StoryPromptTappableDataIntf) A04(-305109662, ImmutablePandoStoryPromptTappableData.class);
        }
        return storyPromptTappableDataIntf;
    }

    @Override // X.JMD
    public final JMD EAq(C1DY c1dy) {
        List A0o = A0o(-3896982, ImmutablePandoMediaDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1E(c1dy, A0q, it);
        }
        this.A01 = A0q;
        StoryPromptTappableDataIntf Bii = Bii();
        Bii.EAY(c1dy);
        this.A00 = Bii;
        return this;
    }

    @Override // X.JMD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40344Huo.A00(this));
    }

    @Override // X.JMD
    public final List Bll() {
        List A0n = A0n(-745300429);
        if (A0n == null) {
            return C16930sl.A00;
        }
        return A0n;
    }

    @Override // X.JMD
    public final H6F F2I(C1DY c1dy) {
        H6G h6g;
        JKY BOs = BOs();
        if (BOs != null) {
            h6g = BOs.F2K();
        } else {
            h6g = null;
        }
        List A0o = A0o(-3896982, ImmutablePandoMediaDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1E(c1dy, A0q, it);
        }
        ArrayList A0q2 = AbstractC167017dG.A0q(A0q);
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            AbstractC37304Gc5.A1H(c1dy, A0q2, it2);
        }
        return new H6F(Bii().F1L(c1dy), h6g, A0q2, Bll());
    }

    @Override // X.JMD
    public final H6F F2J(C1DV c1dv) {
        return F2I(AbstractC37304Gc5.A09(c1dv));
    }
}
