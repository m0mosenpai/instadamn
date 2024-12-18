package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HQx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39241HQx extends C17T implements InterfaceC31134DmH {
    public List A00;

    @Override // X.InterfaceC31134DmH
    public final List B48() {
        return this.A00;
    }

    @Override // X.InterfaceC31134DmH
    public final InterfaceC31134DmH E9E(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-1167125638, ImmutablePandoUserDict.class);
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

    @Override // X.InterfaceC31134DmH
    public final H4C EwR(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-1167125638, ImmutablePandoUserDict.class);
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
                return new H4C(getIntValueByHashCode(1324364035), A0k(-798298666), A0P(), arrayList);
            }
        }
        arrayList = null;
        return new H4C(getIntValueByHashCode(1324364035), A0k(-798298666), A0P(), arrayList);
    }

    @Override // X.InterfaceC31134DmH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40067Hpt.A00(this));
    }

    @Override // X.InterfaceC31134DmH
    public final int BbW() {
        return getIntValueByHashCode(1324364035);
    }

    @Override // X.InterfaceC31134DmH
    public final String Big() {
        return A0k(-798298666);
    }

    @Override // X.InterfaceC31134DmH
    public final H4C EwS(C1DV c1dv) {
        return EwR(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC31134DmH
    public final String getText() {
        return A0P();
    }
}
