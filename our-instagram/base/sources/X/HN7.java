package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HN7 extends C17T implements InterfaceC43551JLl {
    public User A00;
    public List A01;

    @Override // X.InterfaceC43551JLl
    public final User BzF() {
        return this.A00;
    }

    @Override // X.InterfaceC43551JLl
    public final List BzM() {
        return this.A01;
    }

    @Override // X.InterfaceC43551JLl
    public final InterfaceC43551JLl E8i(C1DY c1dy) {
        ArrayList arrayList;
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -1998892262);
        ImmutableList A08 = A08(-1836117863, ImmutablePandoUserDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC31179DnN.A1I(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        return this;
    }

    @Override // X.InterfaceC43551JLl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39766Hkc.A00(this));
    }

    @Override // X.InterfaceC43551JLl
    public final H2N ErB(C1DY c1dy) {
        User user;
        String A0h = A0h(-1938933922);
        User A0J = AbstractC37303Gc4.A0J(c1dy, this, -1998892262);
        ArrayList arrayList = null;
        if (A0J != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0J);
        } else {
            user = null;
        }
        ImmutableList A08 = A08(-1836117863, ImmutablePandoUserDict.class);
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
            }
        }
        return new H2N(user, A0h, arrayList);
    }

    @Override // X.InterfaceC43551JLl
    public final H2N ErC(C1DV c1dv) {
        return ErB(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC43551JLl
    public final String getAccessToken() {
        return A0h(-1938933922);
    }
}
