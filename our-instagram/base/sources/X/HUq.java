package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUq extends C17T implements InterfaceC43562JLw {
    public C38321qM A00;
    public List A01;

    @Override // X.InterfaceC43562JLw
    public final C38321qM Bhs() {
        return this.A00;
    }

    @Override // X.InterfaceC43562JLw
    public final List BjA() {
        return this.A01;
    }

    @Override // X.InterfaceC43562JLw
    public final InterfaceC43562JLw EAy(C1DY c1dy) {
        ArrayList arrayList;
        this.A00 = AbstractC37304Gc5.A0D(c1dy, this, 689310300);
        ImmutableList A08 = A08(370429585, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AbstractC167017dG.A0q(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A01 = arrayList;
        return this;
    }

    @Override // X.InterfaceC43562JLw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40363Hv9.A00(this));
    }

    @Override // X.InterfaceC43562JLw
    public final Long Avp() {
        return A0L(3076014);
    }

    @Override // X.InterfaceC43562JLw
    public final H6P F2c(C1DY c1dy) {
        C38321qM c38321qM;
        Long A0L = A0L(3076014);
        C38321qM A0D = AbstractC37304Gc5.A0D(c1dy, this, 689310300);
        ArrayList arrayList = null;
        if (A0D != null) {
            c38321qM = (C38321qM) c1dy.A00(A0D);
        } else {
            c38321qM = null;
        }
        ImmutableList A08 = A08(370429585, ImmutablePandoMediaDict.class);
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
            }
        }
        return new H6P(c38321qM, A0L, AbstractC37301Gc2.A0m(this), arrayList);
    }

    @Override // X.InterfaceC43562JLw
    public final String getUsername() {
        return AbstractC37301Gc2.A0m(this);
    }
}
