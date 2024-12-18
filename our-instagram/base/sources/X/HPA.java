package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HPA extends C17T implements C54N {
    public List A00;

    @Override // X.C54N
    public final List B49() {
        return this.A00;
    }

    @Override // X.C54N
    public final C54N E97(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(549161688, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.C54N
    public final C54M Etr(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(549161688, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, A0q, it);
            }
            if (A0q != null) {
                arrayList = AbstractC167017dG.A0q(A0q);
                Iterator it2 = A0q.iterator();
                while (it2.hasNext()) {
                    AbstractC37303Gc4.A18(c1dy, arrayList, it2);
                }
                return new C54M(A0g(), A0h(1932263261), A0h(-2060497896), A0S(), A0h(3575610), arrayList);
            }
        }
        arrayList = null;
        return new C54M(A0g(), A0h(1932263261), A0h(-2060497896), A0S(), A0h(3575610), arrayList);
    }

    @Override // X.C54N
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39941HnW.A00(this));
    }

    @Override // X.C54N
    public final String BgJ() {
        return A0h(1932263261);
    }

    @Override // X.C54N
    public final String CBn() {
        return A0h(3575610);
    }

    @Override // X.C54N
    public final String getId() {
        return A0g();
    }

    @Override // X.C54N
    public final String getSubtitle() {
        return A0h(-2060497896);
    }

    @Override // X.C54N
    public final String getTitle() {
        return A0S();
    }
}
