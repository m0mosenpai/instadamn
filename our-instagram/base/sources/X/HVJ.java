package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HVJ extends C17T implements InterfaceC38711r3 {
    public List A00;

    @Override // X.InterfaceC38711r3
    public final List BQh() {
        return this.A00;
    }

    @Override // X.InterfaceC38711r3
    public final InterfaceC38711r3 EB7(C1DY c1dy) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-8666270, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.InterfaceC38711r3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40420HwB.A00(this));
    }

    @Override // X.InterfaceC38711r3
    public final String Atb() {
        return A0i(-816382095);
    }

    @Override // X.InterfaceC38711r3
    public final String BWb() {
        return A0i(-1594628439);
    }

    @Override // X.InterfaceC38711r3
    public final String Bjj() {
        return A0j(1174739785);
    }

    @Override // X.InterfaceC38711r3
    public final String C96() {
        return A0i(-434821051);
    }

    @Override // X.InterfaceC38711r3
    public final String CAR() {
        return AbstractC37304Gc5.A0f(this);
    }

    @Override // X.InterfaceC38711r3
    public final C38701r2 F3M(C1DY c1dy) {
        ArrayList arrayList;
        String A0i = A0i(-816382095);
        String A0h = AbstractC37304Gc5.A0h(this);
        String A0e = A0e();
        ImmutableList A08 = A08(-8666270, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, A0q, it);
            }
            if (A0q != null) {
                arrayList = AbstractC167017dG.A0q(A0q);
                Iterator it2 = A0q.iterator();
                while (it2.hasNext()) {
                    AbstractC37304Gc5.A1H(c1dy, arrayList, it2);
                }
                return new C38701r2(A0i, A0h, A0e, A0i(-1594628439), A0j(1174739785), A0i(-434821051), AbstractC37304Gc5.A0f(this), arrayList);
            }
        }
        arrayList = null;
        return new C38701r2(A0i, A0h, A0e, A0i(-1594628439), A0j(1174739785), A0i(-434821051), AbstractC37304Gc5.A0f(this), arrayList);
    }

    @Override // X.InterfaceC38711r3
    public final String getCtaText() {
        return AbstractC37304Gc5.A0h(this);
    }

    @Override // X.InterfaceC38711r3
    public final String getId() {
        return A0e();
    }
}
