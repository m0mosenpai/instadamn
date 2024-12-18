package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HWI extends C17T implements JMY {
    public C38321qM A00;
    public List A01;

    @Override // X.JMY
    public final List BHh() {
        List list = this.A01;
        if (list == null) {
            return A08(-1398380940, HWP.class);
        }
        return list;
    }

    @Override // X.JMY
    public final C38321qM BlZ() {
        return this.A00;
    }

    @Override // X.JMY
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40697I2d.A00(this));
    }

    @Override // X.JMY
    public final String BDG() {
        return A0i(1184148383);
    }

    @Override // X.JMY
    public final String BGQ() {
        return A0i(-257602966);
    }

    @Override // X.JMY
    public final String C3F() {
        return A0i(-1323727521);
    }

    @Override // X.JMY
    public final String C5f() {
        return A0h(1769642752);
    }

    @Override // X.JMY
    public final JMY EBb(C1DY c1dy) {
        ArrayList arrayList;
        List<C47N> BHh = BHh();
        if (BHh != null) {
            arrayList = AbstractC167017dG.A0q(BHh);
            for (C47N c47n : BHh) {
                c47n.EBf(c1dy);
                arrayList.add(c47n);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        this.A00 = AbstractC37304Gc5.A0D(c1dy, this, -1629677032);
        return this;
    }

    @Override // X.JMY
    public final C38810H7a F5L(C1DY c1dy) {
        ArrayList arrayList;
        String A0i = A0i(1184148383);
        String A0i2 = A0i(-257602966);
        List BHh = BHh();
        C38321qM c38321qM = null;
        if (BHh != null) {
            arrayList = AbstractC167017dG.A0q(BHh);
            Iterator it = BHh.iterator();
            while (it.hasNext()) {
                arrayList.add(((C47N) it.next()).F5V(c1dy));
            }
        } else {
            arrayList = null;
        }
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) A05(-1629677032, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            C38801rC c38801rC = C38321qM.A0h;
            C38321qM A00 = C38801rC.A00(c1dy, immutablePandoMediaDict);
            if (A00 != null) {
                c38321qM = (C38321qM) c1dy.A00(A00);
            }
        }
        return new C38810H7a(c38321qM, A0i, A0i2, A0i(-1323727521), A0h(1769642752), arrayList);
    }

    @Override // X.JMY
    public final C38810H7a F5M(C1DV c1dv) {
        return F5L(AbstractC37304Gc5.A09(c1dv));
    }
}
