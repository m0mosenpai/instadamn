package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUH extends C17T implements JMC {
    public List A00;

    @Override // X.JMC
    public final List BSS() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'mentionedUsers' field.");
    }

    @Override // X.JMC
    public final JMC EAn(C1DY c1dy) {
        List A0o = A0o(1498308178, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0q, it);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.JMC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40328HuY.A00(this));
    }

    @Override // X.JMC
    public final Integer C0g() {
        return getOptionalIntValueByHashCode(1462626351);
    }

    @Override // X.JMC
    public final H68 F1v(C1DY c1dy) {
        String A0g = A0g();
        List A0o = A0o(1498308178, ImmutablePandoUserDict.class);
        ArrayList A0q = AbstractC167017dG.A0q(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            AbstractC37304Gc5.A1I(c1dy, A0q, it);
        }
        ArrayList A0q2 = AbstractC167017dG.A0q(A0q);
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            AbstractC37303Gc4.A18(c1dy, A0q2, it2);
        }
        return new H68(getOptionalIntValueByHashCode(1462626351), A0g, A0X(), A0q2);
    }

    @Override // X.JMC
    public final H68 F1w(C1DV c1dv) {
        return F1v(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.JMC
    public final String getId() {
        return A0g();
    }

    @Override // X.JMC
    public final String getText() {
        return A0X();
    }
}
