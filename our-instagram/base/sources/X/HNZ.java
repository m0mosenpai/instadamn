package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HNZ extends C17T implements C3W0 {
    @Override // X.C3W0
    public final List BGh() {
        ImmutableList A08 = A08(-1787408664, C37926GmO.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                C37926GmO c37926GmO = (C37926GmO) it.next();
                C14360o3.A0A(c37926GmO);
                A0q.add(new ExtendedImageUrl(c37926GmO));
            }
            return A0q;
        }
        return null;
    }

    @Override // X.C3W0
    public final List CF9() {
        return null;
    }

    @Override // X.C3W0
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39807HlH.A00(this));
    }

    @Override // X.C3W0
    public final List BQP() {
        return A08(103772132, HQs.class);
    }

    @Override // X.C3W0
    public final Integer CEp() {
        return getOptionalIntValueByHashCode(351608024);
    }

    @Override // X.C3W0
    public final C74433Vz Ero(C1DY c1dy) {
        ArrayList arrayList;
        List BGh = BGh();
        List BQP = BQP();
        ArrayList arrayList2 = null;
        if (BQP != null) {
            arrayList = AbstractC167007dF.A0i(BQP);
            Iterator it = BQP.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC74423Vy) it.next()).EwH(c1dy));
            }
        } else {
            arrayList = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(351608024);
        ImmutableList A08 = A08(1375134216, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            ArrayList A0i = AbstractC167007dF.A0i(A08);
            Iterator<E> it2 = A08.iterator();
            while (it2.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, A0i, it2);
            }
            arrayList2 = AbstractC167007dF.A0i(A0i);
            Iterator it3 = A0i.iterator();
            while (it3.hasNext()) {
                AbstractC37304Gc5.A1H(c1dy, arrayList2, it3);
            }
        }
        return new C74433Vz(optionalIntValueByHashCode, BGh, arrayList, arrayList2);
    }
}
