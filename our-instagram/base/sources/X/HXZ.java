package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HXZ extends C17T implements InterfaceC43526JKm {
    public List A00;

    @Override // X.InterfaceC43526JKm
    public final List C5l() {
        List list = this.A00;
        if (list == null) {
            return A0o(1981727545, HXY.class);
        }
        return list;
    }

    @Override // X.InterfaceC43526JKm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40777I5f.A00(this));
    }

    @Override // X.InterfaceC43526JKm
    public final InterfaceC43526JKm ECC(C1DY c1dy) {
        List<JM1> C5l = C5l();
        ArrayList A0q = AbstractC167017dG.A0q(C5l);
        for (JM1 jm1 : C5l) {
            jm1.ECB(c1dy);
            A0q.add(jm1);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.InterfaceC43526JKm
    public final C38828H7z F77(C1DY c1dy) {
        List C5l = C5l();
        ArrayList A0q = AbstractC167017dG.A0q(C5l);
        Iterator it = C5l.iterator();
        while (it.hasNext()) {
            A0q.add(((JM1) it.next()).F78(c1dy));
        }
        return new C38828H7z(A0q);
    }
}
