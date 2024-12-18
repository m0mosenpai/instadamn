package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HUr extends C17T implements InterfaceC38691r1 {
    public List A00;

    @Override // X.InterfaceC38691r1
    public final List C42() {
        List list = this.A00;
        if (list == null) {
            return A08(-1977568904, HUp.class);
        }
        return list;
    }

    @Override // X.InterfaceC38691r1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40364HvA.A00(this));
    }

    @Override // X.InterfaceC38691r1
    public final Integer BeB() {
        return getOptionalIntValueByHashCode(929798881);
    }

    @Override // X.InterfaceC38691r1
    public final String C44() {
        return A0j(-1835623808);
    }

    @Override // X.InterfaceC38691r1
    public final InterfaceC38691r1 EAz(C1DY c1dy) {
        ArrayList arrayList;
        List<JMO> C42 = C42();
        if (C42 != null) {
            arrayList = AbstractC167017dG.A0q(C42);
            for (JMO jmo : C42) {
                jmo.EAx(c1dy);
                arrayList.add(jmo);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.InterfaceC38691r1
    public final C38681qz F2d(C1DY c1dy) {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(929798881);
        List C42 = C42();
        if (C42 != null) {
            arrayList = AbstractC167017dG.A0q(C42);
            Iterator it = C42.iterator();
            while (it.hasNext()) {
                arrayList.add(((JMO) it.next()).F2b(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C38681qz(optionalIntValueByHashCode, A0j(-1835623808), arrayList);
    }
}
