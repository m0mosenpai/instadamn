package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualLinkCtaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HOE extends C17T implements JMR {
    public InterfaceC84163p3 A00;
    public List A01;

    @Override // X.JMR
    public final InterfaceC84133oz Aqs() {
        return (InterfaceC84133oz) A05(835063916, C37972GnE.class);
    }

    @Override // X.JMR
    public final ContextualLinkCtaType Ara() {
        return (ContextualLinkCtaType) A0M(1025591537, J9P.A00);
    }

    @Override // X.JMR
    public final InterfaceC84163p3 BPh() {
        InterfaceC84163p3 interfaceC84163p3 = this.A00;
        if (interfaceC84163p3 == null) {
            return (InterfaceC84163p3) A05(-1255143223, C37966Gn8.class);
        }
        return interfaceC84163p3;
    }

    @Override // X.JMR
    public final List Bij() {
        List list = this.A01;
        if (list == null) {
            return A08(821870812, HTz.class);
        }
        return list;
    }

    @Override // X.JMR
    public final List Bp8() {
        return A08(452501036, C39292HVp.class);
    }

    @Override // X.JMR
    public final InterfaceC110214xq C5g() {
        return (InterfaceC110214xq) A05(-180351661, C39290HVn.class);
    }

    @Override // X.JMR
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39854Hm2.A00(this));
    }

    @Override // X.JMR
    public final JMR E8u(C1DY c1dy) {
        InterfaceC84163p3 BPh = BPh();
        ArrayList arrayList = null;
        if (BPh != null) {
            BPh.EBH(c1dy);
        } else {
            BPh = null;
        }
        this.A00 = BPh;
        List<InterfaceC109364wL> Bij = Bij();
        if (Bij != null) {
            arrayList = AbstractC167017dG.A0q(Bij);
            for (InterfaceC109364wL interfaceC109364wL : Bij) {
                interfaceC109364wL.EAZ(c1dy);
                arrayList.add(interfaceC109364wL);
            }
        }
        this.A01 = arrayList;
        return this;
    }

    @Override // X.JMR
    public final C38711H2x Esa(C1DY c1dy) {
        C84123oy c84123oy;
        C84153p2 c84153p2;
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC84133oz Aqs = Aqs();
        C110204xp c110204xp = null;
        if (Aqs != null) {
            c84123oy = Aqs.F4E();
        } else {
            c84123oy = null;
        }
        ContextualLinkCtaType Ara = Ara();
        InterfaceC84163p3 BPh = BPh();
        if (BPh != null) {
            c84153p2 = BPh.F4G(c1dy);
        } else {
            c84153p2 = null;
        }
        List Bij = Bij();
        if (Bij != null) {
            arrayList = AbstractC167007dF.A0i(Bij);
            Iterator it = Bij.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC109364wL) it.next()).F1N(c1dy));
            }
        } else {
            arrayList = null;
        }
        List Bp8 = Bp8();
        if (Bp8 != null) {
            arrayList2 = AbstractC167007dF.A0i(Bp8);
            Iterator it2 = Bp8.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InterfaceC93104Fm) it2.next()).F4O());
            }
        } else {
            arrayList2 = null;
        }
        InterfaceC110214xq C5g = C5g();
        if (C5g != null) {
            c110204xp = C5g.F4L();
        }
        return new C38711H2x(Ara, c84123oy, c84153p2, c110204xp, arrayList, arrayList2);
    }

    @Override // X.JMR
    public final C38711H2x Esb(C1DV c1dv) {
        return Esa(AbstractC25235BEs.A0b(c1dv));
    }
}
